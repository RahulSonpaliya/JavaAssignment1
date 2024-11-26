
# **Customer Management Application**

This is a simple Spring Boot application designed to demonstrate basic CRUD-like operations using a customer data file. The application processes customer records stored in a text file and applies various filters to display relevant data.

---

## **Features**

1. **Read Customer Data:**
   - The application reads customer data from a text file (`customers_data.txt`) located in the `resources` folder. Each customer record is stored in a delimited format (`~` as the separator).

2. **Filter Customers Based on Criteria:**
   - **Visa Card Customers:** Filters and displays customers whose card numbers start with `3`.
   - **High Balance Customers:** Filters and displays customers with a balance greater than 9,000.

3. **Separation of Concerns:**
   - The application uses a layered architecture:
     - **Model Layer:** Represents the `Customer` entity.
     - **Repository Layer:** Handles data access logic.
     - **Service Layer:** Contains business logic.
     - **Application Layer:** Acts as the entry point for the application.

---

## **Technologies Used**

- **Java** (JDK 8 or higher)
- **Spring Boot** (Framework for Dependency Injection and application management)
- **Maven** (Dependency Management)
- **Java Streams API** (For filtering and processing data)

---

## **Code Structure**

1. **`Customer` Class:**
   - Represents a customer entity with fields such as ID, name, email, DOB, mobile number, card number, balance, and address.

2. **`CustomerRepositoryImpl`:**
   - Reads the customer data from a file.
   - Parses the data and converts each line into a `Customer` object.

3. **`CustomerServiceImpl`:**
   - Implements business logic to filter customers based on specific criteria.

4. **`Assignment1Application`:**
   - The main entry point for the Spring Boot application.
   - Invokes service methods to process and display the filtered data.

---

## **How to Run the Application**

1. Clone the repository to your local machine.
2. Ensure that `customers_data.txt` is present in the `src/main/resources` folder.
3. Build the project using Maven:
   ```bash
   mvn clean install
   ```
4. Run the application:
   ```bash
   mvn spring-boot:run
   ```
5. View the output in the console, which will display:
   - Customers with Visa cards.
   - Customers with a balance greater than 9,000.

---

## **Sample Data File Format**

Ensure that the `customers_data.txt` file follows this format (each record is a single line):

```
1~John Doe~john.doe@example.com~1990-01-01~1234567890~378282246310005~12000.50~123 Elm Street
2~Jane Smith~jane.smith@example.com~1985-05-10~0987654321~4111111111111111~8000.75~456 Oak Avenue
```

- Fields are separated by `~`.
- Field order: `id~name~email~dob~mobileNumber~cardNumber~balance~address`.

---

## **Future Enhancements**

- Add support for updating and deleting customer data.
- Replace the file-based repository with a database (e.g., MySQL, PostgreSQL).
- Add a REST API layer for customer operations.
- Include unit and integration tests for better reliability.

---
