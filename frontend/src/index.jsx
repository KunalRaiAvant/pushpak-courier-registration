// React Index 
import React from "react";
import ReactDOM from "react-dom/client";
import "./index.css";  // ✅ Ensure Tailwind is imported

import App from "./App";
import { BrowserRouter } from "react-router-dom";

ReactDOM.createRoot(document.getElementById("root")).render(
  <BrowserRouter>
    <App />
  </BrowserRouter>
);
