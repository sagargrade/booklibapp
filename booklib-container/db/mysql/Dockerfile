FROM mysql:8.0

COPY scripts /docker-entrypoint-initdb.d/

ENV MYSQL_ROOT_PASSWORD=mainpass

ENV MYSQL_USER=booklibapp
ENV MYSQL_PASSWORD=booklibapp
ENV MYSQL_DATABASE=BOOKLIB

ENV PORT 3306
EXPOSE 3306

# docker build -t booklibapp-mysql:1.0 .
# docker run --name booklibapp-mysql -d -p 3306:3306 booklibapp-mysql:1.0