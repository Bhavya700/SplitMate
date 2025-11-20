# SplitMate 💸

**SplitMate** is a full-stack expense splitting platform designed to simplify group expense tracking and balance reconciliation. Built with a modern tech stack, it ensures transactional consistency and a responsive user experience.

## 🚀 Features

- **Group Management**: Create and join groups seamlessly with invite-based logic.
- **Expense Tracking**: Add shared expenses, split costs equitably, and track spending history.
- **Live Balance Reconciliation**: Real-time calculation of "who owes who" to simplify settlements.
- **Secure Authentication**: JWT-based stateless authentication for secure user sessions.
- **Responsive UI**: A polished, mobile-friendly interface built with React and Tailwind CSS.
- **Production Ready**: Containerized with Docker for consistent deployment across environments.

---

## 🛠️ Tech Stack

| Component | Technology |
| :--- | :--- |
| **Frontend** | React, Tailwind CSS, Vite |
| **Backend** | Java 21, Spring Boot 3 |
| **Database** | PostgreSQL |
| **Auth** | JWT (JSON Web Tokens) |
| **DevOps** | Docker, Docker Compose |

---

## 📦 Getting Started

### Prerequisites

- **Docker** & **Docker Compose** (Recommended)
- **Java 21** (For local backend dev)
- **Node.js 20+** (For local frontend dev)

### Quick Start (Docker)

The easiest way to run SplitMate is using Docker Compose. This will spin up the Database, Backend, and Frontend services.

```bash
# Clone the repository
git clone https://github.com/Bhavya700/SplitMate.git
cd SplitMate

# Start the application
docker-compose up --build
```

- **Frontend**: [http://localhost:5173](http://localhost:5173)
- **API Docs**: [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)

---

## 🔧 Local Development

### Backend (Spring Boot)

```bash
cd .
./gradlew bootRun
```

### Frontend (React)

```bash
cd frontend
npm install
npm run dev
```

---

## 📄 License

This project is licensed under the MIT License.
