🍴 Food Delivery Software

A full-stack food delivery platform that allows customers to browse restaurants, place orders, and track deliveries, while admins manage products, orders, and users.
Built with React + Vite (Client & Admin) and Spring Boot + MongoDB (Backend).

📂 Project Structure
Food_Delivery_Software-master/ <br>
│── foodclient-netlify-master   # Customer-facing web app (React + Vite)<br>
│── foodAdmin-netlify-master    # Admin dashboard (React + Vite)<br>
│── foodrestapi-master          # Backend REST API (Spring Boot + MongoDB)<br>

🛠️ Tech Stack

Frontend (Client & Admin): React, Vite, JavaScript, TailwindCSS<br>
Backend: Spring Boot, Java, Maven<br>
Database: MongoDB<br>

✨ Features<br>
Customer (Client App)<br>
Browse restaurants and menus<br>
Add items to cart & place orders<br>
Track order status<br>
User authentication<br>
Admin (Admin App)<br>
Manage restaurants, products, and categories<br>
View and process orders<br>
Monitor users and delivery status<br>
Backend

RESTful APIs for authentication, orders, and product management<br>
MongoDB integration for data persistence<br>

⚙️ Installation & Setup<br>
1. Clone Repository<br>
git clone https://github.com/your-username/Food_Delivery_Software-master.git<br>
cd Food_Delivery_Software-master<br>

2. Backend Setup (Spring Boot + MongoDB)<br>
cd foodrestapi-master<br>


Make sure MongoDB is installed and running locally on default port 27017.<br>
Update application.properties (if needed) with your MongoDB connection string:
spring.data.mongodb.uri=mongodb://localhost:27017/fooddelivery<br>
spring.data.mongodb.database=fooddelivery<br>


Run the backend:
mvn spring-boot:run
Backend will start at: http://localhost:8080<br>

3. Client App Setup (Customer Frontend)<br>
cd ../foodclient-netlify-master
npm install<br>
npm run dev<br>


Frontend runs at: http://localhost:5173<br>

4. Admin App Setup (Admin Dashboard)<br>
cd ../foodAdmin-netlify-master<br>
npm install<br>
npm run dev<br>


Admin dashboard runs at: http://localhost:5174
 (or next available port)<br>

🔗 API Overview (Sample)<br>

POST /auth/register → Register new user<br>
POST /auth/login → Login & get JWT token<br>
GET /products → Get list of food items<br>
POST /orders → Place new order<br>
GET /orders/{id} → Get order status<br>

👨‍💻 Author

Kunal Pardeshi
