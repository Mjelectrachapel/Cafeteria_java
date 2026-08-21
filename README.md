# Cafetería Java

Programa en Java para gestionar los tickets de una cafetería.

Proyecto hecho para los módulos de Programación y Entornos de Desarrollo del
ciclo de Desarrollo de Aplicaciones Web (DAW).

## Qué hace el programa

El programa registra las ventas de una cafetería. Cada venta se guarda en un ticket, y en
cada ticket hay un cliente, un camarero y varios productos.

Estas son sus funciones principales:

- Guardar productos de distintos tipos. `Producto` es la clase principal, y `Bebida` y
  `Comida` heredan de ella. Cada una añade sus propios datos: las bebidas tienen tamaño,
  y las comidas tienen ración y si se sirven calientes o no.
- Aplicar descuentos con la interfaz `Descontable`. El descuento solo se aplica si el
  porcentaje está entre 0 y 100. Si no, avisa y deja el precio como estaba.
- Crear tickets con hasta diez productos, calcular el total y aplicar un descuento a un
  producto concreto de la venta. El descuento se guarda en el ticket y no en el producto.
  Así, si se rebaja un café en una venta, el precio del café en la carta no cambia.

### Ejemplo de lo que sale por pantalla

```
----- CAFETERÍA JAVA -----
Cliente: Ana López -- Teléfono: 652345678
Camarero: Carlos -- Código de empleado: C01
Consumición:
1. Café (calientes) -- 1,80 € -- Tamaño: grande -- Descuento 10% -> 1,62 €
2. Zumo (frías) -- 2,20 € -- Tamaño: mediano
3. Bocadillo jamón (bocadillos) -- 3,50 € -- Tamaño: montadito -- Caliente: No
Total: 7,32 €

Te has ahorrado 0,18 € en el Café.
```

## Qué hace falta para usarlo

- JDK 25 o superior
- Maven 3.9 o superior. IntelliJ IDEA ya lo trae incluido.

## Cómo compilarlo y ejecutarlo

Para compilar:

```bash
mvn clean compile
```

Para ejecutar:

```bash
java -cp target/classes Main
```

También se puede ejecutar desde IntelliJ IDEA. Solo hay que abrir `Main.java` y pulsar el
botón verde del margen izquierdo.

## Pruebas

El proyecto tiene pruebas hechas con JUnit 5. Comprueban el cálculo de los descuentos y el
cálculo del total de un ticket, con casos positivos, negativos y límite.

Para ejecutarlas:

```bash
mvn test
```

## Documentación

La documentación del código está en la carpeta `docs/`. Para verla hay que abrir el archivo
`docs/index.html` con un navegador.

## Cómo está organizado el proyecto

```
Cafeteria_Java/
├── src/
│   ├── main/java/     Código del programa
│   └── test/java/     Pruebas con JUnit 5
├── docs/              Documentación generada con Javadoc
├── pom.xml            Configuración de Maven
└── README.md
```

## Autora

María Jesús Ruiz Redondo

DAW Febrero Barcelona Curso 2025/2026.

## Licencia

Este proyecto está bajo licencia MIT. Recogida en el archivo LICENSE.