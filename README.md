PUNTO 6 y 9 DOCKER.

a) Inicialmente es necesario al lado de la carpeta del proyecto tener un archivo docker file sin extensión 

![image](https://user-images.githubusercontent.com/78450705/232920584-cd09a1fd-5d62-4195-97a2-74241573df4b.png)

Con las siguientes propiedades dentro de el:

FROM centos:centos7.9.2009

RUN yum install httpd -y

WORKDIR /var/www/html

COPY parcial2-arquitectura-master .

CMD apachectl -D FOREGROUND

![image](https://user-images.githubusercontent.com/78450705/232920619-ea1d1f64-115c-4f9f-966e-77083239e016.png)

Posterior a ello debemos abrir la terminal en la carpeta del dockerfile:

![image](https://user-images.githubusercontent.com/78450705/232920779-5a9181a0-2263-44ff-9acf-d61efe27b1d5.png)

En la consola ponemos el comando para crear un volumen: (OPCIONAL)

docker volume create parcial

![image](https://user-images.githubusercontent.com/78450705/232921107-be5cc68f-afa7-408d-bcab-4e5f5b6ae16e.png)

Y también un network: (OPCIONAL)

PS D:\Universidad y Tareas\Software\PARCIAL2> docker network create parcial

![image](https://user-images.githubusercontent.com/78450705/232921233-2161dddb-4739-4001-8b95-754cd233d707.png)

Una vez se tiene esto se puede crear y correr la instancia del aplicativo como imagen:
Corremos el siguiente comando para crearlo y correrlo:

docker run -d -p 3306:3306 -e MYSQL_ROOT_PASSWORD=clave -e MYSQL_DATABASE=parcialDB -v parcialDB:/var/lib/mysql --network parcial mysql

![image](https://user-images.githubusercontent.com/78450705/232921593-74355ec5-7721-466e-8041-9ed31e05a7f3.png)

Tomamos la instancio local en Mysql workbench:

![image](https://user-images.githubusercontent.com/78450705/232921691-0b7ff53d-88ab-4a1e-814a-5e4ff1ba5d87.png)

Ponemos la clave definida:

![image](https://user-images.githubusercontent.com/78450705/232921757-769635f9-1f2c-4843-83fb-bacabb6df7c7.png)

Y ahora tenemos la instancia local de la base de datos:

![image](https://user-images.githubusercontent.com/78450705/232921830-21e42c23-10ff-4a02-b0b7-cf9a0ad9f4a0.png)
