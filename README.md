# Loan API

This project is a RESTful API that determines which loan modalities a person has access to based on their age, income, and location.

## Technologies Used

- Java
- Spring Boot
- Maven
- JUnit 5

## Endpoints

- **[POST]** `/api/v1/loans`: This endpoint is used to determine which loan modalities a person has access to. It requires a JSON body with the customer's age, CPF, name, income, and location.

## Example Request

```json
{
  "age": 26,
  "cpf": "275.484.389-23",
  "name": "Vuxaywua Zukiagou",
  "income": 7000.00,
  "location": "SP"
}
```

## Example Response

```json
{
  "customer": "Vuxaywua Zukiagou",
  "loans": [
    {
      "type": "PERSONAL",
      "interest_rate": 4
    },
    {
      "type": "GUARANTEED",
      "interest_rate": 3
    },
    {
      "type": "CONSIGNMENT",
      "interest_rate": 2
    }
  ]
}
```

## Running the Project

To run the project, you can use the Spring Boot Maven plugin:

```bash
mvn spring-boot:run
```

## Testing

To run the tests, you can use the Maven test command:

```bash
mvn test
```

## Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

## License

[MIT](https://choosealicense.com/licenses/mit/)
