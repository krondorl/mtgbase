# Mtgbase Frontend

This is the frontend of Mtgbase, the Magic the Gathering card database.

System requirements

* Node.js 18.13.0
* Angular CLI 15.2.4

## Usage

### Docker

1. Run: `docker buildx build -t mtgbase-frontend:v01 .`
1. Execute: `docker run -p 4200:80 mtgbase-frontend:v01`
1. Open in browser http://localhost:4200/

### Npm

1. To install, run: `npm install`
1. To run the server, use: `npm start`
1. Open your browser on http://localhost:4200/
