# **Pushpak Courier Registration**

A full-stack application for registering **customers**, **vendors**, and **vehicles** for a courier service. It integrates **Spring Boot** for the backend, **React** for the frontend, and **Supabase** for authentication and database management.

## **Features**
- **Customer Registration**: Customers can register their details.
- **Vendor Registration**: Vendors can register to offer delivery services.
- **Vehicle Registration**: Vendors can register their vehicles.
- **Admin Dashboard**: Admins can verify and approve registrations.
- **Authentication**: Uses **Supabase Auth** for secure user login.

---

## **Tech Stack**
- **Backend**:
  - Java 17
  - Spring Boot
  - Spring Data JPA (PostgreSQL)
  - Supabase (Authentication & Database)
  
- **Frontend**:
  - React
  - Tailwind CSS
  - React Router
  - Supabase JS for authentication
  
- **Database**:
  - Supabase PostgreSQL

---

## **Getting Started**

### **1. Clone the Repository**
Clone this repository to your local machine:
```sh
git clone https://github.com/yourusername/pushpak-courier-registration.git
```

### **2. Backend Setup (Spring Boot)**

#### **Install Java & Maven**
Make sure **Java 17+** and **Maven** are installed on your machine.

#### **Configure `application.yml`**
- Go to `src/main/resources/application.yml` and configure your **Supabase** credentials (database URL and authentication API key).

#### **Run the Backend**
Navigate to the backend folder and run the following:
```sh
cd pushpak-courier-registration
mvn clean install
mvn spring-boot:run
```

The backend will be available at `http://localhost:8080`.

---

### **3. Frontend Setup (React)**

#### **Install Node.js & npm**
Ensure that **Node.js** and **npm** are installed on your machine.

#### **Configure Tailwind CSS**
- Install Tailwind CSS by running:
  ```sh
  npm install -D tailwindcss postcss autoprefixer
  npx tailwindcss init -p
  ```

- Add Tailwind configuration to `tailwind.config.js`:
  ```js
  content: [
    "./src/**/*.{html,js,jsx,ts,tsx}",
  ],
  ```

#### **Install Dependencies**
Navigate to the `frontend` folder and run:
```sh
cd frontend
npm install
```

#### **Start the Frontend**
Start the React development server:
```sh
npm run dev
```

The frontend will be available at `http://localhost:5173`.

---

## **4. Docker Setup (Optional)**
If you prefer using Docker to run the application, you can use the following `docker-compose.yml` file.

#### **docker-compose.yml**
```yaml
version: '3.8'
services:
  backend:
    image: openjdk:17-jdk
    container_name: backend
    ports:
      - "8080:8080"
    volumes:
      - ./backend:/app
    working_dir: /app
    command: mvn spring-boot:run

  frontend:
    image: node:16
    container_name: frontend
    ports:
      - "5173:5173"
    volumes:
      - ./frontend:/app
    working_dir: /app
    command: npm run dev
```

To start everything with Docker:
```sh
docker-compose up --build
```

---

## **5. Testing the Application**

### **Backend Testing**:
- Open **Swagger UI** at `http://localhost:8080/swagger-ui.html` to test all API endpoints.

### **Frontend Testing**:
- You can access the frontend at `http://localhost:5173`.
- Ensure **authentication** is working by logging in with valid credentials.

---

## **Contributing**

1. Fork the repository.
2. Create a new branch (`git checkout -b feature-name`).
3. Make your changes and commit them (`git commit -am 'Add new feature'`).
4. Push to the branch (`git push origin feature-name`).
5. Create a new **Pull Request**.

---

## **License**

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

### **Troubleshooting**

- **Issue**: `mvn spring-boot:run` not working?
  - Ensure you have **Java 17+** installed and configured correctly.
  - Make sure your **PostgreSQL credentials** are correct in `application.yml`.

- **Issue**: Tailwind CSS not working?
  - Verify that **`tailwind.config.js`** is correctly set up and that **`index.css`** imports Tailwind's styles.

---

### **🚀 Summary**
This is a full-stack **Pushpak Courier Registration** app built with **Spring Boot**, **React**, and **Supabase** for user management. You can register customers, vendors, and vehicles, as well as administer registrations from a backend dashboard.

