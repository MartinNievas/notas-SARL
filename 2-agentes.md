# Agentes

Para definir un agente se debe utilizar la palabra reservada `agent`:
```
package broker.example

import io.sarl.core.Logging
import io.sarl.core.Initialize
import io.sarl.core.Destroy
import io.sarl.core.DefaultContextInteractions

// Los comentarios con doble barra (C99 like)
agent UserAgent {

  uses Logging, DefaultContextInteractions

  // Decalaración de variables
  var contador : int

  // Decalaración de constantes
  val myconstant = "abc"

  on Initialize {
    info("Hola!")
  }

  on Destroy {
    info("Adiós!")
  }

}
```

Yo lo pienso como una clase, en la cual se implementan métodos `Initialize` y `Destroy`.
La notación utilizada es UpperCamelCase.

Algunas funciones tienen que ser importadas de sus correspondientes (bibliotecas?). Para utilizar `info`, se debe hacer:
```
import io.sarl.core.Logging
```
Y en el cuerpo del agente:
```
uses Logging, DefaultContextInteractions
```

Los "métodos" `Initialize` y `Destroy` vienen predefinidos en el lenguaje, se puede pensar como "Callbacks" para los eventos de inicialización y destrucción del agente respectivamente.
```
on Initialize {
  info("Hola!")
}
```
## Capacidades y Habilidades

### Capacidades
Se puede pensar como los servicios que ofrece el agente a la comunidad. Básicamente: "Yo puedo hacer esto".

### Habilidades
Es la implementación de las capacidades. Estas pueden ser implementadas de formas diferentes para un mismo problema. Es: "Lo puedo hacer de estas formas".

En código:

```
TODO
```
## Eventos
Son las percepciones del agente. Se declaran fuera del cuerpo del agente. En código:

```
// Como una clase
event QueryEvent {

  // Variable propio de la clase, atributo
  var id : long

  // Constante propia de la clase, atributo
  val value : String

  // Método new.
  // Esto es importante, porque no encontré ejemplos con
  // eventos que utilicen múltiples argumentos en el llamado
  // emit(new QueryEvent("Producto",23))

  new (string : String, id : long) {
    this.value = string
    this.id = id
  }
}
```


