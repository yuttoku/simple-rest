# simple-rest
This project is simple Restful API using Spring Boot 

## Resource
#### List Issues For a Repository

```GET /api/repos/:owner/:repo/issues```  

Request to Github API [List Issues For a Repository](https://developer.github.com/v3/issues/#list-issues-for-a-repository) and format the response.  
"key" values ​​are formatted to 10 characters or less, "body" values ​​to 30 characters or less.  
ex. http://localhost:8080/api/repos/spring-projects/spring-boot/issues?page=1&per_page=10
```
[
    {
        "title":"Update Jso",
        "body":"typo"
    },
    {
        "title":"Improve de",
        "body":"The [devtools documentation](h"
    },
    {
        "title":"Fix log in",
        "body":""
    },
    {
        "title":"Loggers en",
        "body":""
    },
    {
        "title":"Switch imp",
        "body":"See also #7557.\r\nThe artifact "
    },
    {
        "title":"CassandraH",
        "body":"My team has recently decided t"
    },
    {
        "title":"mvn sprinpg",
        "body":"Hi there, we use Spring Boot V"
    },
    {
        "title":"Deadlock i",
        "body":"Hello everyone,\r\n\r\nWe came acr"
    },
    {
        "title":"@TestPrope",
        "body":"If the following test is run a"
    },
    {
        "title":"Run a Smok",
        "body":"Seems like there should be a w"
    }
]
```

### Installation and Building
```
$ git clone https://github.com/yuttoku/simple-rest.git
$ cd simple-rest
$ ./mvnw package
$ java -jar target/simple-rest-0.0.1-SNAPSHOT.jar
```

### Log
Communication between this API and other API is recorded in simple-rest/spring.log as follows
```
Signature: List com.example.simple-rest.persistence.rest.github.IssuesRestClientImpl.requestListIssuesForaRepository(String)
Request: [http://localhost:8080/api/repos/spring-projects/spring-boot/issues?page=1&per_page=10]
Response: [{"id":476455370,"node_id":"MDExOlB1bGxSZXF1ZXN0MzA0MDAyNzkz", ...
```
