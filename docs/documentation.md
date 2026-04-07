# Software Processing - Team 6

## Team Members
- Muhammed Güzel
- Tarik Pasalic
- (weitere Teammitglieder)

## Project Description
A Spring Boot REST API application developed as part of the
Software Processes course at FH Vorarlberg.

## Architecture
The application provides REST endpoints and is packaged
as a Docker container. It is deployed to a production
server at 10.0.40.169 and accessible on port 8086.

## Branching Strategy
- main — stable production code
- release/x.x.x — release candidate branches
- develop/name — individual developer branches,
  merged via Pull Requests

## CI/CD Pipeline
- Build: Builds the application and Docker image,
  runs tests and generates JaCoCo coverage report
- Deploy: Pulls the image and runs it on the production server