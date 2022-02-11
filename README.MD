Para iniciar el repositorio utilizamos el comando [ git init “Nombre del repositorio”] en mi caso sera git init Tarea_3_New_Branch.

Nos direccionamos mediante el comando cd “Nombre del repositorio” al repositorio que acabamos de crear en mi caso cd Tarea_3_New_Branch.
.
Una vez dentro de nuestro repositorio podemos proceder a crear los archivos pertinentes mediante el comando touch “nombre del archivo.extension” en mi caso seran 3 que serán Buscaminas.java, Mipagina.html y un README.MD.

Una vez creados estos archivos para poder editarlos e incluir nuestro codigo dentro utilizaremos el comando nano “Nombre del archivo” y introducimos lo que queramos dentro de ellos, una vez que hayamos acabado presionamos ctrl+o para guardar y ctrl+x para salir.

 Una vez tengamos acabado el archivo que queremos subir utilizaremos el comando git add “nombre del archivo” en mi caso git add Buscaminas.java y asi con todos los archivos que deseemos.

Ahora mediante el comando git commit -m “Lo que quieras” les pondremos un comentario.

Luego pondremos el comando git branch -M main.

Ahora para poder subir el repositorio a github tendremos que establecer la Url establecida en tu propio repositorio de github mediante el siguiente comando git remote add origin “Tu URL” en mi caso sera git remote add origin https://github.com/AdrianMartinN/Tarea_3_New_Branch.git

Y una vez establecida la url para subirlo utilizaremos git push -u origin main.

 Una vez hayamos hecho eso si todo ha salido correctamente refrescamos nuestro repositorio de github y estaran ahí subidos nuestros archivos.

















#Creación de Nueva rama
Creamos la nueva rama

Seleccionamos el archivo que queremos modificar y le damos al lápiz situado en el archivo para poder editarlo y ponemos lo que queramos.

Una vez acabamos le hacemos un nuevo commit hacia la rama main.



