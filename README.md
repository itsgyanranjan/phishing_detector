# 🛡️ Phishing URL Detector (Java)

Hey! 👋  
This is a simple Java-based project I built to detect phishing websites. It checks URLs and tells you if they look suspicious or safe. I made it as part of my cybersecurity learning in 3rd year BTech (CSE).

---

## 🔍 What it Does

- Checks if the URL contains an IP address (common in phishing)
- Checks if it uses HTTPS (secure sites usually do)
- Checks if the URL is too long (phishers try to hide bad stuff in long links)

Based on this, it gives a warning if the link might be phishing.

---

## 🛠️ Tech Stack

- Java (Core)
- Regex
- Command Line

---

## 🚀 How to Run

1. Clone or download this repo.
2. Open terminal or CMD in the project folder.
3. Compile the Java file:

   ```bash
   javac PhishingDetector.java
