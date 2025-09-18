
- Endpoints discovered from the source:
  - `POST /api/v1/auth/register`
  - `POST /api/v1/auth/login`
  - `GET /api/v1/auth` (profile/me; if implemented in your project)
  - `GET/POST/PUT/DELETE /api/v1/cars` and `/api/v1/cars/{id}` (typical CRUD)
  - `GET/POST/PUT/DELETE /api/v1/bookings` and `/api/v1/bookings/{id}` 
- For protected endpoints, set `Authorization: Bearer <token>` after logging in.

