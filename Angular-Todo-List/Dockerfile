# Stage 1: Build the Angular application
FROM node:18 as build

WORKDIR /app

# Copy the package.json and package-lock.json files
COPY package*.json ./

# Install the dependencies
RUN npm install

# Copy the rest of the application code
COPY . .

# Build the Angular application
RUN npm run build --prod

# Stage 2: Serve the Angular application using Nginx
FROM nginx:alpine

# Copy the build output to the Nginx HTML directory
COPY --from=build /app/dist/angular-todo-list/browser /usr/share/nginx/html

# Expose port 80
EXPOSE 80

# Start the Nginx server
CMD ["nginx", "-g", "daemon off;"]