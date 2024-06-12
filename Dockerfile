# Usa la imagen base de PostgreSQL
FROM postgres:latest

# Variables de entorno
ENV POSTGRES_USER=root
ENV POSTGRES_PASSWORD=root

# Puerto expuesto
EXPOSE 5432

# Volumen para los datos de PostgreSQL
VOLUME /var/lib/postgresql/data