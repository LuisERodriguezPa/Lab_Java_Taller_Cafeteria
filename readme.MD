Luis Eduardo Rodriguez<br>
Handry Moran<br>
Julian Valderrama



**Preguntas:** 

1\)

**¿Por qué usas double para el precio y no int?** 

\-Se usa double por el precisión de la variables y también porque puede haber un precio que sea 22.5 y si la guardamos en un entero no guarda la parte decimal



**¿Qué pasaría si declaras el precio como int y le asignas 3.50?**

\-Da un error porque no puede guardar la parte decimal en un entero, no puede guardar un contenedor mas grande en uno mas pequeño.



2\) **¿Qué operador usaste para determinar si aplica el descuento? ¿Qué tipo de dato devuelve ese**

**operador?**

utilize el operador >  si es verdadero devuelve true(boleano)



3\) 

**¿En qué situación preferirías usar switch en lugar de una cadena de if-else?**

cuando hay muchas opciones y uno no quiere anidar if-else porque seria muy difícil de hacer cambios

¿Hay algún caso en

&#x20;**¿Hay algún caso en este ejercicio donde el switch no sería la mejor opción?**

En este ejercicio nose pero en el caso que toque hacer una comprobación como mayor que o menor switch no seria la mejor opción.



4\)

**¿Qué ocurre si la condición del while nunca se vuelve falsa?**

Se volvería un ciclo infinito nunca saldría del ciclo

**¿Cómo lo prevendrías en este caso?**

Agregaria una codiccion con if que si la condición se cumple ejecute la intruccion **break;** para romper el ciclo y salir.



**5)¿Por qué do-while es más apropiado que while aquí?** 

Porque necesito que las instrucciones se ejecuten al menos una vez

**Describe con tus palabras la diferencia en el orden de ejecución**.

While primero pregunta y si la condiccion es verdadera se ejecuta las instrucciones.

En cambio do-while primero ejecuta las instrucciones y luego pregunta.



**6) ¿Por qué usas for aquí y no while?** 

porque de antemano conozco cuantas veces se va a ejecutar el ciclo porque conozco el numero de elementos de los arreglos

**¿Qué tiene el for que lo hace más conveniente cuando conoces el número de elementos?**

sabemos cuantas veces se va a ejecutar el ciclo y podemos operar en el elemento en que va el ciclo actualmente.



**7) ¿Cuántos errores encontraste?**

**3** 

**Clasifica cada uno: ¿es un error de compilación o un error lógico?**

El primero error de compilación a una variable entera le estaba asignando un string

El segundo es un error de compilación le faltaba el punto y coma al final de la expresión

El tercero es un error lógico dentro del if estaba asignando el valor true a aplicaDescuento

&#x20;**¿Cómo los distingues?**

cuando es un error de compilación el programa no compila y bota un error. pero cuando es un error lógico el programa si compila pero cuando se ejecuta bota u error.



