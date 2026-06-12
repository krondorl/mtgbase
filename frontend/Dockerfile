FROM node:24.15.0-bookworm-slim
WORKDIR /app
COPY package*.json ./
RUN npm install -g @angular/cli@22.0.1 && npm ci
COPY . .

# Run docker script using proper proxy config
CMD ["npm","run","start"]
#
# Build and run
# docker buildx build -t mtgbase-frontend:v01 .
# docker run -p 3000:3000 mtgbase-frontend:v01
# Open in browser localhost:3000
