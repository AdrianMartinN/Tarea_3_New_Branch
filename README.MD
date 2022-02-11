Para iniciar el repositorio utilizamos el comando [ git init “Nombre del repositorio”] en mi caso sera git init Tarea_3_New_Branch.
[![git-init7.png](https://i.postimg.cc/RVphY60M/git-init7.png)](https://postimg.cc/0bm9MNm3)
Nos direccionamos mediante el comando cd “Nombre del repositorio” al repositorio que acabamos de crear en mi caso cd Tarea_3_New_Branch.
[![cd.png](https://i.postimg.cc/XJ6pgRYd/cd.png)](https://postimg.cc/kVwJJh8g)
Una vez dentro de nuestro repositorio podemos proceder a crear los archivos pertinentes mediante el comando touch “nombre del archivo.extension” en mi caso seran 3 que serán Buscaminas.java, Mipagina.html y un README.MD.
[![touch.png](https://i.postimg.cc/3NS8zVYL/touch.png)](https://postimg.cc/7Jzr2BC7)
Una vez creados estos archivos para poder editarlos e incluir nuestro codigo dentro utilizaremos el comando nano “Nombre del archivo” y introducimos lo que queramos dentro de ellos, una vez que hayamos acabado presionamos ctrl+o para guardar y ctrl+x para salir.
[![nano.png](https://i.postimg.cc/Ss4x9cgG/nano.png)](https://postimg.cc/3yLh505y)
 Una vez tengamos acabado el archivo que queremos subir utilizaremos el comando git add “nombre del archivo” en mi caso git add Buscaminas.java y asi con todos los archivos que deseemos.
[![git-add.png](https://i.postimg.cc/d343wDmj/git-add.png)](https://postimg.cc/n99p1FWX)
Ahora mediante el comando git commit -m “Lo que quieras” les pondremos un comentario.
[![git-commit.png](https://i.postimg.cc/G3QHkSwT/git-commit.png)](https://postimg.cc/qgNJrw7p)
Luego pondremos el comando git branch -M main.
[![git-branch.png](https://i.postimg.cc/wTj3Fcgf/git-branch.png)](https://postimg.cc/NLZgjXym)
Ahora para poder subir el repositorio a github tendremos que establecer la Url establecida en tu propio repositorio de github mediante el siguiente comando git remote add origin “Tu URL” en mi caso sera git remote add origin https://github.com/AdrianMartinN/Tarea_3_New_Branch.git
[![git-remote-add.png](https://i.postimg.cc/g080rgHJ/git-remote-add.png)](https://postimg.cc/SXQ4v75F)
Y una vez establecida la url para subirlo utilizaremos git push -u origin main.
[![git-push-origin-main.png](https://i.postimg.cc/wjtMYqtD/git-push-origin-main.png)](https://postimg.cc/TK6frXJP)
 Una vez hayamos hecho eso si todo ha salido correctamente refrescamos nuestro repositorio de github y estaran ahí subidos nuestros archivos.
[![github.png](https://i.postimg.cc/nrcVRpbj/github.png)](https://postimg.cc/G8V190pd)
# Creación de Nueva rama
Creamos la nueva rama
[![creacion-nueva-rama.png](https://i.postimg.cc/SsLj1gn5/creacion-nueva-rama.png)](https://postimg.cc/gXJYnqqq)
Seleccionamos el archivo que queremos modificar y le damos al lápiz situado en el archivo para poder editarlo y ponemos lo que queramos.
[![edit-file.png](https://i.postimg.cc/jSG5spNm/edit-file.png)](https://postimg.cc/FYVmpnTV)
Una vez acabamos le hacemos un nuevo commit hacia la rama main.
[![comit-nuevo.png](https://i.postimg.cc/T1R1znmP/comit-nuevo.png)](https://postimg.cc/7GWq7GKv)
Una vez comitado le damos a la pestaña pull request y new pull request
[![Pull-rquest.png](https://i.postimg.cc/HWBkJcXQ/Pull-rquest.png)](https://postimg.cc/JtHLvhTn)
Seleccionamos la rama deseada y le damos a create new pull request
[![create-pull-request.png](https://i.postimg.cc/vBvHtDjw/create-pull-request.png)](https://postimg.cc/N95cgGBd)
Haga clic en Merge pull request para fusionar los cambios en main.

Haz clic en Confirm merge.

Continúe y elimine la sucursal, ya que sus cambios se han incorporado, haciendo clic en Delete branch.
