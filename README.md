# Environment variables in spring boot

## Specify a variable in application properties

```properties
app.api.key=${MY_API_KEY}
```

### Specify a default value for variable if not exists

```properties
app.database.url=${DB_URL:jdbc:postgresql://localhost:5432/mydb}
```

## export a shell variable

```bash
export MY_API_KEY=12345432
```

## pass variable at runtime

```bash
java -jar target/ev-0.0.1-SNAPSHOT.jar --MY_API_KEY=63456456
```
