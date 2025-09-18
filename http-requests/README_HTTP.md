# HTTP Requests for Car Rental API

This folder contains ready-to-use HTTP requests to test the API endpoints without changing the project code.

## How to use

### Option A: VS Code (REST Client)
1. Install the **REST Client** extension by Huachao Mao.
2. Open `api.http` in this folder.
3. Click **Send Request** above any request.

### Option B: IntelliJ/IDEA HTTP Client
1. Open `api.http` and use the built-in HTTP client to run requests.

### Option C: Postman
1. Import `postman_collection.json` into Postman.
2. Set the `baseUrl` variable to your server URL (default `http://localhost:8080`).
3. Login first, copy the returned JWT token, and set it as `authToken` variable in Postman or in the `.http` file.

## Notes
- Endpoints discovered from the source:
  - `POST /api/v1/auth/register`
  - `POST /api/v1/auth/login`
  - `GET /api/v1/auth` (profile/me; if implemented in your project)
  - `GET/POST/PUT/DELETE /api/v1/cars` and `/api/v1/cars/{id}` (typical CRUD)
  - `GET/POST/PUT/DELETE /api/v1/bookings` and `/api/v1/bookings/{id}` (some operations may not be implemented; requests are provided for completeness)
- For protected endpoints, set `Authorization: Bearer <token>` after logging in.
- Adjust request bodies to match your DTOs if they differ.
