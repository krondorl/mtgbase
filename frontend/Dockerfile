FROM node:18-alpine
WORKDIR /app
COPY package*.json ./
RUN npm install -g @angular/cli@15.2.4
RUN npm install
COPY . .

# This is needed for proper running of Angular
# https://stackoverflow.com/questions/46778868/ng-serve-not-working-in-docker-container
CMD ["ng","serve","--host", "0.0.0.0"]
#
# Build and run
# docker buildx build -t mtgbase-frontend:v01 .
# docker run -p 4200:4200 mtgbase-frontend:v01
# Open in browser localhost:4200
