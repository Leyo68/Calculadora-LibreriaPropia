# Calculadora con Libreria Propia

Explicación de código fuente

El código fuente se trata de una aplicación de calculadora, la cual dentro de ella se importará una librería que se ha creado anteriormente, para este ejercicio, el programa fue hecho en el entorno de desarrollo (IDE) de NetBeans, asimismo para su compilación y ejecución se utilizó la interfaz que ya trae incorporado este programa.

Para tener claro de lo que se trata lo que viene, empezamos explicando la librería, para ello fue necesario crear un nuevo paquete y dentro de ella se creó una nueva clase para poder programar los métodos necesarios de cada operación matemática.
Dentro de esta se creó un método para cada una de las cuatro operaciones básicas de matemáticas que son suma, resta, multiplicación y división. Asimismo, estos métodos recibieron dos parámetros de tipo entero, estos son los números que el usuario ingrese para su operación

Por otra parte, los métodos devuelven información de tipo entero, que ya fue calculado en la línea anterior y con ello termina la explicación del código fuente de la librería.

![imagen](https://user-images.githubusercontent.com/71055467/109420055-1a67d600-7996-11eb-9797-bd9a7fd4407b.png)

Una vez que ya se haya guardado la librería procedemos a seleccionar el proyecto y le daremos en “Build”, con ello lo que hace es crear un archivo de tipo.jar, que será utilizado en el proyecto.

Como ya hemos creado este programa importamos la librería lo que sigue es agregarlo al proyecto, después, para ello programamos la siguiente parte de código;

![imagen](https://user-images.githubusercontent.com/71055467/109420061-23f13e00-7996-11eb-894d-da06aa2aa35e.png)

Y es ahí donde se importan las librerías necesarias para la creación del ejercicio.
Ahora se procede a programar la clase principal en donde contiene la mayor parte del programa.

En esta parte también es donde se encuentra la función main o el método principal, que es de donde parte su ejecución cualquier programa de java.

En el interior de este método se encuentra la declaración de variable que serán usados durante su ejecución, viendo su código de la siguiente forma;

![imagen](https://user-images.githubusercontent.com/71055467/109420070-2d7aa600-7996-11eb-823d-6fb3538a9417.png)

La siguiente línea de código se refiere a crear una nueva instancia de la clase LibreriaCalculadora, es decir, se crea un nuevo objeto que será usado en líneas siguientes;

![imagen](https://user-images.githubusercontent.com/71055467/109420081-3e2b1c00-7996-11eb-89e7-9df73bb36542.png)

Una vez que el usuario haya tecleado los números y realizado las operaciones matemáticas, el programa le pedirá que responda si quiere seguir calculando o desea salir, en caso de que decida seguir el programa inicia desde el principio su ejecución es por ello que vemos el ciclo do while.

![imagen](https://user-images.githubusercontent.com/71055467/109420089-46835700-7996-11eb-8d6a-ada155078e03.png)

En la captura anterior podemos observar de manera clara que el programa está pidiendo datos al usuario para su cálculo.
Una vez introducidos los dos valores se presenta en pantalla un menú de las opciones disponibles gracias a la siguiente línea;

![imagen](https://user-images.githubusercontent.com/71055467/109420095-500cbf00-7996-11eb-91f0-fef2513c8443.png)

Y dependiendo del usuario lo que selecciona, se realizará una u otra acción matemática, para cumplir esto fue necesario de la implementación de un switch como se puede apreciar en la captura siguiente;

![imagen](https://user-images.githubusercontent.com/71055467/109420101-57cc6380-7996-11eb-87b4-b52a541ad256.png)

El punto importante se encuentra en la parte de arriba porque es aquí donde manda a llamar a cada uno de los métodos que se encuentra en la librería dependiendo de lo que se desea ejecutar, como el método recibe por parámetro dos tipos de valores esos son los que el usuario ya ha tecleado y dependiendo de la opción se va a realizar la operación matemática, como son suma, resta multiplicación o división, una vez terminado, el valor se almacena en la variable resultado de la clase principal y se pasa a la impresión en pantalla por medio de un cuadro de dialogo.

Una vez realizado lo anterior, lo que sigue es preguntar al usuario si desea seguir haciendo otros cálculos, en caso de que sí, el programa vuelve a pedir dos números para su operación, en caso contrario el programa finaliza son un mensaje. 

![imagen](https://user-images.githubusercontent.com/71055467/109420107-6286f880-7996-11eb-81b7-2375549c7e80.png)



Ejecución del programa

En la primera parte del programa nos pide el primer número para su cálculo, apareciendo de la siguiente forma;

![imagen](https://user-images.githubusercontent.com/71055467/109420116-6ca8f700-7996-11eb-8c15-a73ddb5ed651.png)

Insertamos un dígito y hacemos click en aceptar para que nos pide el siguiente número;

![imagen](https://user-images.githubusercontent.com/71055467/109420118-72064180-7996-11eb-9af4-fcdbd4e3122f.png)

Agregamos el número y seguimos con la ejecución, en donde ya nos muestra un menú de las opciones que tenemos disponible, seleccionamos una de ellas, en este caso seleccionaremos la suma;

![imagen](https://user-images.githubusercontent.com/71055467/109420128-7af71300-7996-11eb-80d1-b7eefe764dd8.png)

Ahora si sumamos por nuestra cuentra propia los dos números que hemos digitado tenemos que el resultado tiene que ser 13, y vemos que efectivamente es el resultado que nos proporciona el programa; 

![imagen](https://user-images.githubusercontent.com/71055467/109420136-83e7e480-7996-11eb-9b33-a891b1a1d940.png)

Ahora lo que se nos presenta es una ventana en donde nos pregunta si deseamos seguir calculando, le decimos que sí y volverá al principio;

![imagen](https://user-images.githubusercontent.com/71055467/109420144-8cd8b600-7996-11eb-91da-d70c840eba5d.png)

Continuamos con otro ejemplo pero esta vez seleccionaremos la multplicación y veremos el resultado;

![imagen](https://user-images.githubusercontent.com/71055467/109420151-93672d80-7996-11eb-9f6b-86e74fc40982.png)

![imagen](https://user-images.githubusercontent.com/71055467/109420154-96621e00-7996-11eb-9e8d-ed73e8dcb5d3.png)

![imagen](https://user-images.githubusercontent.com/71055467/109420157-982be180-7996-11eb-940b-d480acf1fc17.png)

![imagen](https://user-images.githubusercontent.com/71055467/109420159-99f5a500-7996-11eb-8510-4d44ded88236.png)

Como podemos observar, el programa funciona correctamente, por ello pasaremos a la finalización del programa;

![imagen](https://user-images.githubusercontent.com/71055467/109420170-a4b03a00-7996-11eb-98b0-918f529021ac.png)

![imagen](https://user-images.githubusercontent.com/71055467/109420172-a679fd80-7996-11eb-9f04-7e64cc2029fc.png)

Con ello damos por terminado la ejecución del programa.


Conclusión

En conclusión, durante la realización del programa fue algo complicado ya que a este nivel sabemos crear lo que se llama un panel, una lámina y asimismo crear componentes en el marco, pero lo que no habíamos visto antes es como crear una librería y a su vez que fuera importada en un proyecto creado también por nosotros mismos

Es por ello que en esta ocasión lo que pudimos hacer fue crear ventanas del tipo JOptionPane, y en esta se fueron agregando los datos, para su posterior llamado de sus correspondientes métodos.

Por último, podemos decir que al realizar este trabajo fue de gran enseñanza ya que todo lo que no sabíamos lo fuimos buscando en la web e íbamos implementando cada conocimiento en el programa.

