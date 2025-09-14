🍴 Food Delivery Software

A full-stack food delivery platform that allows customers to browse restaurants, place orders, and track deliveries, while admins manage products, orders, and users.
Built with React + Vite (Client & Admin) and Spring Boot + MongoDB (Backend).

📂 Project Structure
Food_Delivery_Software-master/ <br>
│── foodclient-netlify-master   # Customer-facing web app (React + Vite)<br>
│── foodAdmin-netlify-master    # Admin dashboard (React + Vite)<br>
│── foodrestapi-master          # Backend REST API (Spring Boot + MongoDB)<br>

🛠️ Tech Stack

Frontend (Client & Admin): React, Vite, JavaScript, TailwindCSS
Backend: Spring Boot, Java, Maven
Database: MongoDB

✨ Features
Customer (Client App)
Browse restaurants and menus
Add items to cart & place orders
Track order status
User authentication
Admin (Admin App)
Manage restaurants, products, and categories
View and process orders
Monitor users and delivery status<br>
Backend

RESTful APIs for authentication, orders, and product management
MongoDB integration for data persistence<br>

⚙️ Installation & Setup
1. Clone Repository
git clone https://github.com/your-username/Food_Delivery_Software-master.git
cd Food_Delivery_Software-master

2. Backend Setup (Spring Boot + MongoDB)
cd foodrestapi-master


Make sure MongoDB is installed and running locally on default port 27017.
Update application.properties (if needed) with your MongoDB connection string:
spring.data.mongodb.uri=mongodb://localhost:27017/fooddelivery
spring.data.mongodb.database=fooddelivery


Run the backend:
mvn spring-boot:run
Backend will start at: http://localhost:8080

3. Client App Setup (Customer Frontend)
cd ../foodclient-netlify-master
npm install
npm run dev


Frontend runs at: http://localhost:5173

4. Admin App Setup (Admin Dashboard)
cd ../foodAdmin-netlify-master
npm install
npm run dev


Admin dashboard runs at: http://localhost:5174
 (or next available port)

🔗 API Overview (Sample)

POST /auth/register → Register new user
POST /auth/login → Login & get JWT token
GET /products → Get list of food items
POST /orders → Place new order
GET /orders/{id} → Get order status

👨‍💻 Author

Kunal Pardeshi
