import React, { useState } from "react";
import axios from "axios";

function LoginForm({ onLoginSuccess }) {
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");

  const handleLogin = async (e) => {
    e.preventDefault();
    try {
      const response = await axios.post("http://localhost:8080/api/v1/faculty/login", {
        email,
        password,
      });
      if (response.data) {
        const token = response.data; // The token is directly the response data (string)
        onLoginSuccess(email, token); // Pass the token to onLoginSuccess
      } else {
        alert("Login failed! No token received.");
      }
    } catch (error) {
      alert("Error logging in: " + error.message);
    }
  };

  return (
    <form onSubmit={handleLogin}>
      <h2>Faculty Login</h2>
      <input
        type="email"
        placeholder="Email"
        value={email}
        onChange={(e) => setEmail(e.target.value)}
        required
      />
      <br />
      <input
        type="password"
        placeholder="Password"
        value={password}
        onChange={(e) => setPassword(e.target.value)}
        required
      />
      <br />
      <button type="submit">Login</button>
    </form>
  );
}

export default LoginForm;