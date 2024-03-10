<h1 align="center">
  Spring Boot with JWT
</h1>

<p>
PT-BR | Este projeto tem como objetivo principal aprofundar o entendimento sobre jwt no spring boot.
</p>

<p>
ENGLISH-USA | The main goal of this project is to deepen the understanding about jwt with spring boot.
</p>


## Technologies

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring Data JDBC](https://spring.io/projects/spring-data-jdbc)
- [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
- [Spring Security](https://spring.io/projects/spring-security)
- [H2 Database](https://www.h2database.com/html/main.html)


A API poderá ser acessada em [localhost:8081](http://localhost:8081).

## API Endpoints


```
http POST :8081/authenticate

http -a username:password POST :8080/authenticate
JWT = <token>
http :8080/private -A bearer -a ${JWT}
```