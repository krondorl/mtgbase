FROM node:22.12.0-bookworm-slim
WORKDIR /app
COPY package*.json ./
RUN npm install -g @angular/cli@21.2.11 && npm ci
COPY . .

# Run docker script using proper proxy config
CMD ["npm","run","start"]
#
# Build and run
# docker buildx build -t mtgbase-frontend:v01 .
# docker run -p 3000:3000 mtgbase-frontend:v01
# Open in browser localhost:3000
