<h4 align="center">
  :bookmark_tabs: BootCamp DevSuperior | Lesson - Chapter 1
</h4>

<p align="center">
  <a href="#lesson">Project</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#endpoints">Endpoints</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#tecnologies">Tecnologies</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="./README-en.md">Traduzir para o Português</a>&nbsp;&nbsp;&nbsp;
</p>
<br>

## 💻 <a name="lesson"> Project</a>

Project containing a complete CRUD of REST web services to access client resources, with the five basic operations:
- Client page search
- Client search by id
- Insert new Client
- Update Client
- Delete Client

## :link: <a name="endpoints">Endpoints</a>
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

## :beginner: <a name="tecnologies">Tecnologies</a>

This project was developed with the following tools/technologies:
<h1 align="center">
    <img alt="SpringLogo" title="#spring" src="https://spring.io/images/spring-logo-9146a4d3298760c2e7e49595184e1975.svg" width="200px" href="https://spring.io/why-spring" />
</h1>


- [Spring v2.6.4](https://spring.io/why-spring)
- [Java JDK 17](https://jdk.java.net/17/)
- [IntelliJ IDEA](https://www.jetbrains.com/idea/)   
- [Postman](https://www.postman.com/company/about-postman/)
