# Project Documentation

## Team Members
- Muhammed Guezel
- Tarik Pasalic
- Team 6

## Project Description
A Spring Boot REST API application developed as part of the Software Processes course at FH Vorarlberg.

## Architecture
The application provides REST endpoints and is packaged as a Docker container.
It is deployed to a production server at 10.0.40.169 and accessible on port 8086.

## Branching Strategy
- `main` — stable production code
- `release/0.0.1` — release candidate branch
- `develop/<name>` — individual developer branches, merged via Pull Requests

## CI/CD Pipeline
The pipeline has two stages:
- **Build:** Compiles the application, runs tests, generates a coverage report, builds and pushes the Docker image to the local registry.
- **Deploy:** Pulls the image on the production server and runs it as a container.

## How to Run Locally
```bash
./gradlew bootJar
docker build -t demo .
docker run -p 8080:8080 demo
```
