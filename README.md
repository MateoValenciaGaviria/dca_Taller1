# Taller 1 Mateo Valencia Gaviria 
## Clase Main
Es la clase principal del proyecto, la cual llama a la clase logica para
ejecutar los metodos principales de PApplet.

**METODOS**

- settings():void </p>
En este m�todo se asignan caracteristicas al lienzo, en este caso el tama�o.

- setup():void </p>
En este m�todo se inicializa la relaci�n con la clase logica.

- draw():void </p>
En este m�todo se pintan todos los elementos en el lienzo.

- keyPressed():void </p>
En este m�todo se detecta un evento del teclado, (cuando una tecla 
es presionada).

- mousePressed():void </p>
En este m�todo se detecta un evento del mouse, (cuando un bot�n del mouse 
es presionado).

## Clase Logica 
Esta clase se encarga de relacionar todos los objetos e interacciones y carga
el archivo de texto para que pueda funcionar la aplicaci�n.


**ATRIBUTOS**
- StringBuilder frase </p>
Variable donde se cargar� la frase extraida del archivo de texto.

**METODOS**

- pintar():void </p>
M�todo que pinta los elementos de cada clase.

- cargarElementosLaboratorio():void </p>
M�todo que extrae el texto del archivo de texto.

- mouse():void </p>
M�todo que contiene las acciones que pueden ocurrir por un evento del mouse.

- keyBoard():void </p>
M�todo que contiene las acciones que pueden ocurrir por un evento del teclado.

## Clase CadenaAdn

Esta clase es la representaci�n de una cadena de adn en el laboratorio.

**ATRIBUTOS**

- boolean mover </p>
Boolean que determina si la cadena de adn esta activa.

- int posX </p>
Variable entera que representa la posicion de los componentes de la cadena en el eje x.

- int cantEspacios </p>
Variable entera que representa la cantidad de espacios que hay en el documento de texto.

**METODOS**

pintar():void </p>
M�todo que pinta los elementos que representan la cadena de adn.

mover(boolean):void </p>
M�todo que hace mover los componentes de la cadena de adn. Recibe un booleano que determina si la cadena se mueve o no.

## Clase Pasta
Esta clase es la representaci�n de la pasta (cura) que se encontr� despues de la investigaci�n.

**ATRIBUTOS**

- int cantCombinaciones </p>
Variable entera que representa la cantidad de combinaciones (dos letras, que no sean vocales) que hayan en el archivo de texto.

- ArrayList<String> combinaciones </p>
ArrayList que contiene las combinaciones encontradas.

**METODOS**

- pintar():void </p>
M�todo que pinta los elementos que representan la Pasta.

- agregarNuevaCombinacion(String):void </p>
M�todo que agrega las combinaciones de letras al arraList. Recibe un string que
es la combinaci�n de letras

- pintarCombinacion():void </p>
M�todo que pinta una de las combinaciones encontradas.

## Clase Bacteria
Esta clase es la representaci�n de una bacteria
que puede da�ar la cura que se quiere encontrar.

**ATRIBUTOS**

- int posX </p>
Variable entera que representa la posicion de la bacteria en el eje x.

- int posY </p>
Variable entera que representa la posicion de la bacteria en el eje Y.

- int cantPuntos </p> 
variable entera que representa la cantidad de puntos en contrada en el archivo
de texto.

**METODOS**

- pintar():void </p> 
M�todo que pinta los elementos de la bacteria.

## Clase CadenaCarbonada

Esta clase es la representaci�n de una cadena carbonada utilizada en la investigaci�n.

**ATRIBUTOS**
- int color </p> 
variable entera que representa el color de la cadena carbonada.

- int cantCA </p> 
variable entera que representa la cantidad de combinaciones "ca" que haya en el archivo de texto.

**METODOS**

- pintar(int):void </p>
M�todo que pinta los elementos de la cadena carbonada. Recibe un entero para saber cuantos carbonos debe pintar.
 
- cambiarColor():void </p> 
M�todo que cambia el color de la cadena carbonada. 

## Clase Iman
Esta clase es la representaci�n de un iman que fue utilizado para poder encontrar
cierto elementos necesarios en la investigaci�n.

**ATRIBUTOS**

- int cifra </p> 
variable entera que representa la cantidad de palabras encontradas en el archivo de texto.

- int sumaNumerosCifra </p> 
variable entera que representa la suma de los numeros que hay en la cifra.

**METODOS**

- sumarNumeroCifra():void </p> 
M�todo que suma los numeros de la cifra.

- pintar():void </p> 
M�todo que pinta los elementos del iman.

- moverEsferas():void </p> 
M�todo que mueve las esferas de metal hacia el iman.

## Clase PlataformaDeMuestras
Esta clase es la representaci�n de una plataforma donde se pueden observar 
unas muestras recolectadas, para utilizarlas en la investigaci�n.

**ATRIBUTOS**

- int numero </p>
variable entera que representa la cantidad de muestras encontradas.

- int [] posicionesX </p>
Arreglo de enteros que guarda las posiciones en el eje x de las muestras.

- int [] posicionesY </p>
Arreglo de enteros que guarda las posiciones en el eje y de las muestras.

**METODOS**

- pintar():void </p>
M�todo que pinta los elementos de la plataforma de muestras.

- girar(boolean):void </p>
M�todo que hace girar las muestras en la plataforma. Recibe un boolean para saber si las muestras se meuven o no.

## Clase TuboDeMuestras
Esta clase es la representaci�n de unos tubos donde se almacenan muestras para la investigaci�n.

**ATRIBUTOS**

- int vocalA </p>
variable entera que representa la cantidad de vocales "a" encontradas en el archivo de texto.
- int vocalE </p>

variable entera que representa la cantidad de vocales "e" encontradas en el archivo de texto.
- int vocalI </p>

variable entera que representa la cantidad de vocales "i" encontradas en el archivo de texto.
- int vocalO </p>

variable entera que representa la cantidad de vocales "o" encontradas en el archivo de texto.
- int vocalU </p>

variable entera que representa la cantidad de vocales "u" encontradas en el archivo de texto.
	
- int posYa </p>
variable entera que representa la posicion en el eje y del tubo a.

- int posYe </p>
variable entera que representa la posicion en el eje y del tubo e.

- int posYi </p>
variable entera que representa la posicion en el eje y del tubo i.

- int posYo </p>
variable entera que representa la posicion en el eje y del tubo o.

- int posYu </p>
variable entera que representa la posicion en el eje y del tubo u.

**METODOS**

- pintar(int, int, int, int, int):void </p>
M�todo que pinta los elementos de los tubos de muestras.

- subirTubo(char):void </p>
M�todo que hace subir los tubos de muestras.

## Clase AlarmaDeRadioactividad
Clase que representa una alarma de radioactividad del laboratorio

**ATRIBUTOS**

- int color </p>
variable entera que representa el color de la alarma.

- int cantMayus </p>
variable entera que representa la cantidad de mayusculas encontradas en el documento de texto.

**METODOS**

- pintar(int):void </p>
M�todo que pinta los elementos de la alarma.

- pintarSigno():void </p>
M�todo que pinta un signo cualquiera.


