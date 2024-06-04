# Recursos importantes:

**FreeCodeCamp** https://www.youtube.com/watch?v=WnMQ8HlmeXc&t=403s

Claro, aquí tienes un resumen en Markdown de los conceptos que hemos visto:

### Resumen de Conceptos de UML y POO

#### 1. Asociación
**Concepto**: Representa una relación entre dos clases. Una clase conoce a otra.
- **Ejemplo en Java**:
  ```java
  class Profesor {
      private List<Alumno> alumnos;
  }

  class Alumno {
      private Profesor profesor;
  }
  ```

#### 2. Herencia
**Concepto**: Una clase (subclase) hereda de otra clase (superclase).
- **Ejemplo en Java**:
  ```java
  class Animal {
      void hacerSonido() {
          System.out.println("El animal hace un sonido.");
      }
  }

  class Perro extends Animal {
      void hacerSonido() {
          System.out.println("El perro ladra.");
      }
  }
  ```

#### 3. Realization/Implementation (Realización/Implementación)
**Concepto**: Una clase implementa una interfaz.
- **Ejemplo en Java**:
  ```java
  interface Vehiculo {
      void conducir();
  }

  class Coche implements Vehiculo {
      public void conducir() {
          System.out.println("El coche está en movimiento.");
      }
  }
  ```

#### 4. Dependencia
**Concepto**: Una clase usa a otra clase como parte de su funcionamiento.
- **Ejemplo en Java**:
  ```java
  class Producto {
      private String nombre;
  }

  class Pedido {
      public void procesar(Producto producto) {
          System.out.println("Procesando el producto: " + producto.getNombre());
      }
  }
  ```

#### 5. Agregación
**Concepto**: Representa una relación de "todo/parte" donde la parte puede existir independientemente del todo.
- **Ejemplo en Java**:
  ```java
  class Empleado {
      private String nombre;
  }

  class Departamento {
      private List<Empleado> empleados;
  }
  ```

#### 6. Composición
**Concepto**: Una forma fuerte de agregación donde la parte no puede existir sin el todo.
- **Ejemplo en Java**:
  ```java
  class Habitacion {
      private String nombre;
  }

  class Casa {
      private List<Habitacion> habitaciones;
  }
  ```

### Tabla Resumen

| Relación                  | Descripción                                                                 | Ejemplo en Java |
|---------------------------|-----------------------------------------------------------------------------|-----------------|
| **Asociación**            | Relación entre dos clases. Una clase conoce a otra.                         | `Profesor` y `Alumno` |
| **Herencia**              | Una clase (subclase) hereda de otra clase (superclase).                     | `Animal` y `Perro` |
| **Realization/Implementation** | Una clase implementa una interfaz.                                        | `Vehiculo` y `Coche` |
| **Dependencia**           | Una clase usa a otra clase como parte de su funcionamiento.                 | `Pedido` y `Producto` |
| **Agregación**            | Relación de "todo/parte" donde la parte puede existir independientemente.   | `Departamento` y `Empleado` |
| **Composición**           | Relación "todo/parte" fuerte donde la parte no puede existir sin el todo.   | `Casa` y `Habitacion` |

### Descripción de Cada Punto

#### Asociación
La asociación representa una relación en la que una clase conoce a otra clase. Es una relación flexible y común en la mayoría de los modelos de datos.

#### Herencia
La herencia permite que una clase (subclase) herede propiedades y comportamientos de otra clase (superclase). Facilita la reutilización de código y la creación de jerarquías de clases.

#### Realization/Implementation (Realización/Implementación)
En UML, la realización muestra que una clase implementa una interfaz. La interfaz define un contrato que la clase debe cumplir.

#### Dependencia
La dependencia indica que una clase utiliza otra clase como parte de su método o funcionalidad. Es una relación temporal y débil.

#### Agregación
La agregación es una forma de asociación que indica una relación "todo/parte" en la que las partes pueden existir independientemente del todo.

#### Composición
La composición es una forma fuerte de agregación donde las partes no pueden existir sin el todo. Cuando el todo se destruye, también lo hacen las partes.

---

Estos conceptos son fundamentales para entender las relaciones entre clases en la programación orientada a objetos y son esenciales para diseñar sistemas robustos y mantenibles.