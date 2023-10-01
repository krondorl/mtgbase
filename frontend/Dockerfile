# Based on this tutorial, visited on 22/09/2023.
# https://serengetitech.com/tech/how-to-dockerize-your-angular-14-application/
#
# Multi stage build
FROM node:18-alpine AS build
WORKDIR /app
COPY . .
RUN npm install
RUN npm run build
FROM nginx:alpine
COPY --from=build /app/dist/mtgbase-frontend/ /usr/share/nginx/html
EXPOSE 4200
#
# Build and run
# docker buildx build -t mtgbase-frontend:v01 .
# docker run -p 4200:4200 mtgbase-frontend:v01
# Open in browser localhost:4200
