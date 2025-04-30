## 🎙️ Audio to Text Transcriber
-A simple web application built with React (Vite) and Spring Boot that allows users to upload audio files and get the transcribed text in return.

## 📦 Tech Stack
Frontend: React (with Vite)
Backend: Spring Boot
HTTP Client: Axios
Environment Config: Vite environment variables

## 🚀 Features
-Upload audio files (any format supported by browser)
-Backend processes the audio and returns transcribed text
-Transcription result displayed on the frontend

## 🔧 Prerequisites:
- Node.js  
- Java 17+  
- Maven  
- OpenAI API Key or any other AI service setup

## 🛠️ Setup Instructions
-1️⃣ Clone the Repository
      git clone https://github.com/divyarana988/audio-transcriber.git
      cd audio-transcriber

-2️⃣ Install Frontend Dependencies
      npm install

-3️⃣ Create a .env File
      VITE_TRANSCRIBE_API_URL=http://localhost:8080/api/transcribe
      Replace the URL for different environments like staging or production.

-4️⃣ Run the Frontend
      npm run dev


📡 Backend Setup
-The backend is built in Spring Boot.
-Add OpenAI API_KEY in application properties using this key = 'spring.ai.openai.api-key'

To run it:

```./mvnw spring-boot:run


