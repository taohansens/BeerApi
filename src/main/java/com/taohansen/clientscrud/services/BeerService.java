package com.taohansen.clientscrud.services;

import com.taohansen.clientscrud.dto.BeerDTO;
import com.taohansen.clientscrud.entities.Beer;
import com.taohansen.clientscrud.repositories.BeerRepository;
import com.taohansen.clientscrud.services.exceptions.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class BeerService {

    @Autowired
    private BeerRepository repository;

    @Transactional(readOnly = true)
    public List<BeerDTO> findAll() {
        List<Beer> list = repository.findAll();
        return list.stream().map(x -> new BeerDTO(x)).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public Page<BeerDTO> findAllPaged(PageRequest pageRequest) {
        Page<Beer> list = repository.findAll(pageRequest);
        return list.map(BeerDTO::new);
    }

    @Transactional(readOnly = true)
    public BeerDTO findById(Long id) {
        Optional<Beer> obj = repository.findById(id);
        Beer entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found"));
        return new BeerDTO(entity);
    }

    @Transactional
    public BeerDTO insert(BeerDTO dto) {
        Beer entity = new Beer();
        return fromEntity(dto, entity);
    }

    @Transactional
    public BeerDTO update(Long id, BeerDTO dto) {
        try {
            Beer entity = repository.getOne(id);
            return fromEntity(dto, entity);
        } catch (EntityNotFoundException e) {
            throw new ResourceNotFoundException("Id not found to update");
        }
    }

    private BeerDTO fromEntity(BeerDTO dto, Beer entity) {
        entity.setName(dto.getName());
        entity.setDescription(dto.getDescription());
        entity.setFermentation(dto.getFermentation());
        entity.setIbu(dto.getIbu());
        entity.setCalories(dto.getCalories());
        entity.setCarbs(dto.getCarbs());
        entity = repository.save(entity);
        return new BeerDTO(entity);
    }

    public void delete(Long id) {
        try {
            repository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            throw new ResourceNotFoundException("Id not found to delete");
        } catch (DataIntegrityViolationException e) {
            throw new DatabaseException("Integrity database violation");
        }
    }
}