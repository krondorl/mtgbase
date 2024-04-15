FROM node:18-alpine
WORKDIR /app
COPY package*.json ./
RUN npm install -g @angular/cli@15.2.4
RUN npm install
COPY . .

# Run docker script using proper proxy config
CMD ["npm","run","start"]
#
# Build and run
# docker buildx build -t mtgbase-frontend:v01 .
# docker run -p 4200:4200 mtgbase-frontend:v01
# Open in browser localhost:4200
