import React, { useState } from "react";
import LoginForm from "./LoginForm";
import Timetable from "./Timetable";
import './App.css';

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);
  const [email, setEmail] = useState("");
  const [token, setToken] = useState("");

  return (
    <div className="app-container">
      {!isLoggedIn ? (
        <LoginForm
          onLoginSuccess={(email, token) => {
            setIsLoggedIn(true);
            setEmail(email);
            setToken(token);
          }}
        />
      ) : (
        <Timetable email={email} token={token} />
      )}
    </div>
  );
}

export default App;
