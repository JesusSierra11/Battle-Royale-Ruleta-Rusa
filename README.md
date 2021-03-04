# Battle Royale Ruleta Rusa.
<div>
<p align="center">
<img src="https://laesferaquenogiramas.files.wordpress.com/2018/04/67.gif">
</p>
</div>

**Bienvenidos al battle royale de la ruleta rusa, en el que 6 jugadores intentaran sobrevir, solo puede quedar 1 en pie, emoción, tensión y mucha adrenalina vivirás en este nuevo juego.**
**Para empezar a jugar voy a dar una explicación paso a paso de todos los pasos que hay que seguir para poder empezar a jugar, desde como descargar el proyecto hasta como empezar a jugar.**
1. Descargar los ficheros fuente.
2. Abrir la consola de Windows (CMD).
3. Comprobar si Java está instalado.
3.1 Añadir variables de entorno.
5. Compilar y ejecutar la aplicación por consola.
6. Uso de la aplicación.
## 1. Descarga de los ficheros fuente.
![Texto alternativo](/Imagenes/imagen8.png)
* Para descargar los ficheros, simplemente arriba a la derecha en el símbolo que pone Code, aparecerá un desplegable y le damos a Download ZIP, se nos descargará y simplemente tendremos que descomprimir el archivo en la ubicación que queramos en nuestro pc. Ya tendríamos los archivos necesarios para poder jugar.
## 2. Abrir la consola de Windows(CMD).
Este es un proceso sencillo y muy importante a la vez, ya que vamos a jugar al videojuego desde la CMD.
* Lo primero que tenemos que hacer es ir al buscador de windows y escribir cmd. Nos aparecerá el símbolo del sistema (cmd) y pulsamos enter.

	![Texto alternativo](/Imagenes/imagen.png)

* Otra forma de abrir la terminal sería usando la combinación de teclas Windows + R, nos aparecerá esta ventana y tendremos que escribir: cmd.

	![Texto alternativo](/Imagenes/imagen2.png)
	
	Le damos a enter y se nos abrirá la cmd.
## 3. Comprobar si Java está instalado.
En este paso vamos a comprobar que tenemos Java instalado en nuestro ordenador ya que sin Java no podremos ejecutar el videojuego.
* Para comprobar si tenemos instalado Java en nuestro equipo, debemos abrir nuestra terminal y poner el comando java --version y nos aparecerá la versión de nuestro Java.

	![Texto alternativo](/Imagenes/imagen3.png)
* Si no tienes descargado Java puedes descargarlo desde este enlace: [Descargar Java](https://www.java.com/es/download/ie_manual.jsp?locale=es)

	![Texto alternativo](/Imagenes/imagen4.png)

Para descargar Java simplemente entramos en la página y le damos a Aceptar e iniciar descarga gratuita, se nos descargara el .exe y simplemente le pinchamos y empezamos a instalarlo.
## 3.1 Añadir variables de entorno.
Las variables de entorno son cadenas que contienen información acerca del entorno para el sistema y el usuario que ha iniciado sesión en ese momento. Algunos programas de software usan la información para determinar dónde se colocan los archivos (Como los archivos temporales.)
1. **Configurar JAVA_HOME:**
 **Primero:** Para poder agregar variables de entorno escribimos "Este equipo" en el buscador de windows, hacemos clic derecho y seleccionamos la opción de **Propiedades**.
 
	 **Segundo**: En esta ventana seleccionamos la opción de **Configuración avanzada del sistema.**
 
	 **Tercero:** Ahora hacemos clic en el botón **Variables de entorno.**
 
	 **Cuarto:** En la nueva ventana que se nos abre, le damos a nueva (en variables de usuario), en el **Nombre de la variable ponemos:** JAVA_HOME y en **Valor de la variable:** ponemos el path o ruta donde hemos instalado el JDK de Java (le damos a examinar directorio y buscamos donde tenemos instalado nuestro JDK), le damos a aceptar. Tras esto hay que reiniciar el equipo.
 2. **Configurar PATH:**
 Hacemos los mismos pasos que anteriormente, con la diferencia que ahora nos iremos a variables de sistema, de **Nombre de la variable pondremos:** PATH y en **Valor de la variable:** %JAVA_HOME%\bin y le daremos a aceptar.
 Una vez después de configurar el JAVA_HOME y el PATH, le damos a aceptar y se guardarían los cambios.
 Con estos pasos ya tendríamos configuradas nuestras variables de entorno.
## 4. Compilar y ejecutar la aplicación por 		          		consola.
Llegamos al paso de compilar los archivos descargados anteriormente para poder jugar al videojuego.
* Primero hay que abrir la terminal.
* Con la terminal abierta, tendremos que irnos donde tengamos descargados los archivos, utilizando el comando cd para movernos a través de la terminal. Con el comando DIR mostramos un listado de archivos y directorios, hay vemos si están nuestros archivos en la ubicación donde nos encontramos.

	![Texto alternativo](/Imagenes/imagen5.png)
* Cuando tengamos nuestros archivos.java visualizados, utilizaremos el comando javac y el nombre de nuestro archivo.java para crear el .class, debemos generar el .class (compilar) de los 3 archivos que descargamos al inicio. Por ejemplo: 

	![Texto alternativo](/Imagenes/imagen6.png)

Una vez generado los 3 .class, toca ejecutar la aplicación, utilizando el comando java nombredelarchivo.java. Por ejemplo:
		![Texto alternativo](/Imagenes/imagen7.png)
	
¡Ya estamos preparados para empezar a jugar!
## 5. Manual de uso de la aplicación.
Voy a explicar todas las partes del videojuego para que entendáis el funcionamiento de el, parte por parte voy a explicar que hace cada elemento del menú. El videojuego consiste en que hay 6 personajes, tu eliges que personaje quieres manejar, puedes cambiar de personaje en cualquier momento, el objetivo del juego al ser un battleroyal es que solamente quede uno vivo, es un juego de azar así que no puedes saber quien es el personaje que va a sobrevivir.
	![Texto alternativo](/Imagenes/imagen7.png)
1. **Seleccione a un jugador o jugadora.**
En esta parte simplemente tendrás que elegir un jugador, el jugador/a que selecciones es el que utilizaras para realizar cada acción, puedes cambiar de jugador en cualquier momento de la partida. Te saldrá un listado con los nombres de los jugadores. Hay 6 disponibles para elegir.
2.  **Disparar revolver**
Aquí simplemente disparas con el revolver al jugador que tengas seleccionado, si no esta la bala,  puedes seguir disparando o elegir otra opción. Si la bala estaba en la posición cuando has disparado, ese personaje muere.
3. **Girar cilindro**
Aquí giras el cilindro del revolver para cambiar la posición de la bala, tu eliges cuantas posiciones quieres girar el cilindro.
4. **Comprobar quien esta vivo**
Aquí puedes comprobar que jugadores son los que están vivos.
5. **Salir**
Esta opción simplemente sirve para abandonar el juego.
