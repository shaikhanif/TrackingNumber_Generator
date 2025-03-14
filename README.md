# Tracking Number Generator API

A RESTful API that generates unique tracking numbers for parcels. This application is scalable, efficient, and designed to handle high concurrency for tracking number generation. The API is built using **Spring Boot**.

## Features

- Generate unique tracking numbers based on query parameters like `origin_country_id`, `destination_country_id`, `weight`, `created_at`, etc.
- The generated tracking number matches the regex pattern: `^[A-Z0-9]{1,16}$`.
- Supports high concurrency and is optimized for performance.
- Scalable and designed to work efficiently in a horizontally scalable architecture.

## API Endpoints

### `GET /next-tracking-number`

#### Query Parameters:

- **origin_country_id**: (Required) The origin country code in ISO 3166-1 alpha-2 format (e.g., `"MY"`).
- **destination_country_id**: (Required) The destination country code in ISO 3166-1 alpha-2 format (e.g., `"ID"`).
- **weight**: (Required) The weight of the order in kilograms (up to three decimal places, e.g., `"1.234"`).
- **created_at**: (Required) The timestamp when the order was created in RFC 3339 format (e.g., `"2018-11-20T19:29:32+08:00"`).
- **customer_id**: (Required) The customer’s UUID (e.g., `"de619854-b59b-425e-9db4-943979e1bd49"`).
- **customer_name**: (Required) The customer’s name (e.g., `"RedBox Logistics"`).
- **customer_slug**: (Required) The customer's name in slug-case (e.g., `"redbox-logistics"`).

#### Response:

- **tracking_number**: The generated tracking number.
- **created_at**: The timestamp when the tracking number was generated.

Example Response:
```json
{
  "tracking_number": "ABC123456789XYZ",
  "created_at": "2025-03-14T10:30:00+00:00"
}
