<h4 align="center">
  :bookmark_tabs: BootCamp DevSuperior | Atividade - Capítulo 1
</h4>

<p align="center">
  <a href="#atividade">Atividade</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#endpoints">Endpoints</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#tecnologias">Tecnologias</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="./README-en.md">Translate to English</a>&nbsp;&nbsp;&nbsp;
</p>
<br>

## 💻 <a name="atividade"> Atividade</a>

Projeto contendo um CRUD completo de web services REST para acessar recursos de clientes, contendo as cinco operações básicas:
- Busca paginada de clientes
- Busca de clientes por id
- Inserir novo cliente
- Atualizar cliente
- Deletar cliente


## :link: <a name="endpoints"> Endpoints</a>
- POST - /clients
#### Create a client.
```
{
    "name": "Name",
    "cpf": "12345678901",
    "income": 6500.0,
    "birthDate": "1990-01-20T10:30:00Z",
    "children": 2
}
```

- GET - /clients
#### List all clients (Paged)
```
Params:
?page= (int)
?direction= (DESC or ASC)
?linesPerPage= (int)
?orderBy= (string : id, name, cpf, children, income...)

Example: /clients?page=0?direction=ASC?linesPerPage=5?OrderBy=name
```
- GET - /clients/{id}

- PUT - /clients/{id}
- DELETE - /clients/{id}

---

<br>

## :beginner: <a name="tecnologias"> Tecnologias</a>

Esse projeto foi desenvolvido com as seguintes ferramentas/tecnologias:
<h1 align="center">
    <img alt="SpringLogo" title="#spring" src="https://spring.io/images/spring-logo-9146a4d3298760c2e7e49595184e1975.svg" width="200px" href="https://spring.io/why-spring" />
</h1>


- [Spring v2.6.4](https://spring.io/why-spring)
- [Java JDK 17](https://jdk.java.net/17/)
- [IntelliJ IDEA](https://www.jetbrains.com/pt-br/idea/)   
- [Postman](https://www.postman.com/company/about-postman/)
