# Prueba escrita de la unidad 1 · pregunta 14

Completa los dos métodos de `src/main/java/prueba/Prueba.java`. Cada método recibe los datos en sus
parámetros y devuelve el resultado con `return`: no uses `Scanner` ni muestres nada en pantalla.

Solo modificas `Prueba.java`, y de cada método **solo su contenido**: no modifiques la firma (nombre,
parámetros y tipo de retorno) ni las pruebas. Con otra firma, las pruebas ocultas no compilan.

## Cómo se califica

- **De forma automática, con pruebas ocultas.** Incluyen las pruebas visibles de este proyecto (los
  ejemplos del enunciado) y agregan valores límite y casos extremos. Cada prueba que pasa suma su
  puntaje: que pasen las visibles no asegura los 5 puntos.
- **De ese resultado se resta 0.25, 0.5, 0.75 o 1 punto por cada falencia de calidad básica del
  código**, según su gravedad. Cuenta todo lo conversado en clase: valores fijos en constantes con nombre, nombres que dicen qué guardan, primero las constantes, luego las variables y al final el proceso, llaves e indentación, condiciones simples y nada de código repetido.
- **El proyecto debe compilar.** Si no compila, la nota de toda la pregunta 14 es 0, aunque uno de
  los métodos esté bien resuelto: un error de compilación en un método impide ejecutar las pruebas de
  todo el proyecto. Si no terminas un método, déjalo como vino en la plantilla (con su `return` y su
  `// TODO`) para que el proyecto siga compilando, y comprueba que compila antes de enviarlo.

## a. `categoriaVenta(monto)` (2 puntos)

Devuelve la categoría de una venta según su monto en dólares:

| Si `monto`… | Devuelve |
|---|---|
| no está entre 0.01 y 1000 | `"Monto inválido"` |
| es menor que 200 | `"Baja"` |
| es menor que 800 | `"Normal"` |
| en otro caso | `"Excelente"` |

## b. `promedioNoMultiplos(limite, divisor)` (3 puntos)

Devuelve el promedio de los números de 1 a `limite` que **no** son múltiplos de `divisor`. Si no hay
ninguno, devuelve 0. Supón que `divisor` es mayor que 0.

| Llamada | Devuelve | Por qué |
|---|---|---|
| `promedioNoMultiplos(5, 2)` | `3.0` | (1 + 3 + 5) / 3 |
| `promedioNoMultiplos(6, 4)` | `3.4` | (1 + 2 + 3 + 5 + 6) / 5 |
| `promedioNoMultiplos(3, 1)` | `0.0` | todos son múltiplos de 1 |

## Entrega

Envía el proyecto completo comprimido (zip o rar, sin la carpeta `target/`) al correo
**uce.backup.dx@gmail.com**, a la hora indicada por el docente: no se calificará después de esa hora.
El asunto del correo debe ser `Nombre Apellido - Prueba 2026-11-12`, con tu nombre y tu apellido.

Es tu responsabilidad enviar bien el archivo: si no se puede descomprimir o abrir, no se calificará.
Antes de enviarlo, comprueba que el proyecto compila y que el comprimido se abre.

## Cómo trabajar

1. Abre el proyecto desde el `pom.xml` y ejecuta las pruebas (`mvn test` o desde el IDE): al inicio
   fallan todas.
2. Completa un método y vuelve a ejecutar sus pruebas.
3. Antes de entregar, revisa la calidad del código: es lo que se descuenta del puntaje de las pruebas.
