# Documentación oficial

Esta son solo notas personales, la documentación oficial se puede encontrar [aquí](http://www.sarl.io/docs/official/index.html).


# Instalación

Probablemente la instalación sea la primera complicación. Estoy utilizando `Ubuntu 18.04`:
```bash
$ uname --kernel-release
5.4.0-53-generic
```
Al momento de escribir este documento, la última versión de `SARL Development Environment Version 0.11.0 (stable)` no está funcionando con JAVA 11 en Linux.
Como alternativa se puede descargar una versión anterior desde la página.
La versión `0.8.6` funciona con java-8:
```bash
$ java -version
openjdk version "1.8.0_275"
OpenJDK Runtime Environment (build 1.8.0_275-8u275-b01-0ubuntu1~18.04-b01)
OpenJDK 64-Bit Server VM (build 25.275-b01, mixed mode)
```

En linux para cambiar esto se puede utilizar:
```bash
# update-alternatives --config java
Existen 2 opciones para la alternativa java (que provee /usr/bin/java).

  Selección   Ruta                                            Prioridad  Estado
------------------------------------------------------------
  0            /usr/lib/jvm/java-11-openjdk-amd64/bin/java      1111      modo automático
  1            /usr/lib/jvm/java-11-openjdk-amd64/bin/java      1111      modo manual
* 2            /usr/lib/jvm/java-8-openjdk-amd64/jre/bin/java   1081      modo manual

Pulse <Intro> para mantener el valor por omisión [*] o pulse un número de selección:
```

# Ejecutar SARL
Luego de descomprimir la carpeta zip descargada, dentro se pueden encontrar el ejecutable de sarl para las diferentes plataformas:
```bash
$ ls
io.sarl.lang.product-linux.gtk.x86_64.zip
io.sarl.lang.product-linux.gtk.x86.zip
io.sarl.lang.product-macosx.cocoa.x86_64.zip
io.sarl.lang.product-win32.win32.x86_64.zip
io.sarl.lang.product-win32.win32.x86.zip
```
En este caso la versión a utilizar es `io.sarl.lang.product-linux.gtk.x86_64.zip` luego de descomprimir nos genera varios archivos, entre los cuales se encuentra el ejecutable:

```bash
$ ./eclipse-sarl
```

