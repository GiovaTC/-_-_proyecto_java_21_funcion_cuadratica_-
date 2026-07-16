# -_-_proyecto_java_21_funcion_cuadratica_- :.
# 📘 Proyecto Java 21 - Función Cuadrática:

<img width="1024" height="1024" alt="16 jul 2026, 10_26_46 a m" src="https://github.com/user-attachments/assets/d10f2619-70de-40de-9acd-37cb3ce08576" />  

<img width="1274" height="1078" alt="image" src="https://github.com/user-attachments/assets/d05e2ce2-1af3-4107-bf9b-bfe8f426d54d" />  

```

## 📋 Descripción

Proyecto muy básico en **Java 21**, ejecutándose desde la **consola**, que calcula las raíces de una ecuación cuadrática de la forma:

\[
ax^2 + bx + c = 0
\]

El programa permite:

- ✅ Solicitar los valores de **a**, **b** y **c**.
- ✅ Calcular el discriminante.
- ✅ Determinar si existen:
  - Dos raíces reales.
  - Una única raíz real.
  - Dos raíces complejas.
- ✅ Mostrar el procedimiento y los resultados en la consola.

---

# 📁 Estructura del proyecto

```text
FuncionCuadratica
│
└── src
    └── Main.java
```

---

# 💻 Código Java

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println(" CALCULADORA DE ECUACION CUADRATICA ");
        System.out.println("====================================");

        System.out.print("Ingrese el valor de a: ");
        double a = teclado.nextDouble();

        System.out.print("Ingrese el valor de b: ");
        double b = teclado.nextDouble();

        System.out.print("Ingrese el valor de c: ");
        double c = teclado.nextDouble();

        if (a == 0) {
            System.out.println();
            System.out.println("El valor de 'a' no puede ser cero.");
            System.out.println("No es una ecuacion cuadratica.");
            return;
        }

        double discriminante = (b * b) - (4 * a * c);

        System.out.println();
        System.out.println("Discriminante = " + discriminante);

        if (discriminante > 0) {

            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);

            System.out.println();
            System.out.println("La ecuacion tiene dos soluciones reales:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);

        } else if (discriminante == 0) {

            double x = (-b) / (2 * a);

            System.out.println();
            System.out.println("La ecuacion tiene una unica solucion real:");
            System.out.println("x = " + x);

        } else {

            double parteReal = (-b) / (2 * a);
            double parteImaginaria = Math.sqrt(-discriminante) / (2 * a);

            System.out.println();
            System.out.println("La ecuacion tiene dos soluciones complejas:");
            System.out.println("x1 = " + parteReal + " + " + parteImaginaria + "i");
            System.out.println("x2 = " + parteReal + " - " + parteImaginaria + "i");
        }

        teclado.close();
    }
}
```

---

# 📐 Fórmula utilizada

El programa aplica la **fórmula general** para resolver ecuaciones cuadráticas:

```text
           -b ± √(b² - 4ac)
x = ----------------------------
               2a
```

Donde:

| Símbolo | Descripción |
|----------|-------------|
| **a** | Coeficiente de x² |
| **b** | Coeficiente de x |
| **c** | Término independiente |

---

# 🧮 Cálculo del discriminante

El discriminante se calcula mediante:

```text
Δ = b² - 4ac
```

Dependiendo de su valor:

| Discriminante | Resultado |
|---------------|-----------|
| Δ > 0 | Dos raíces reales diferentes |
| Δ = 0 | Una única raíz real (raíz doble) |
| Δ < 0 | Dos raíces complejas conjugadas |

---

# ▶️ Ejemplo 1

## Ecuación

```text
x² - 5x + 6 = 0
```

### Entrada

```text
Ingrese el valor de a: 1
Ingrese el valor de b: -5
Ingrese el valor de c: 6
```

### Salida

```text
Discriminante = 1.0

La ecuacion tiene dos soluciones reales:

x1 = 3.0
x2 = 2.0
```

---

# ▶️ Ejemplo 2

### Entrada

```text
Ingrese el valor de a: 1
Ingrese el valor de b: 2
Ingrese el valor de c: 1
```

### Salida

```text
Discriminante = 0.0

La ecuacion tiene una unica solucion real:

x = -1.0
```

---

# ▶️ Ejemplo 3

### Entrada

```text
Ingrese el valor de a: 1
Ingrese el valor de b: 2
Ingrese el valor de c: 5
```

### Salida

```text
Discriminante = -16.0

La ecuacion tiene dos soluciones complejas:

x1 = -1.0 + 2.0i
x2 = -1.0 - 2.0i
```

---

# 🔎 Explicación del algoritmo

El programa realiza los siguientes pasos:

1. Solicita los coeficientes **a**, **b** y **c**.
2. Verifica que **a** sea diferente de cero.
3. Calcula el discriminante:

```text
Δ = b² - 4ac
```

4. Evalúa el valor del discriminante:
   - Si **Δ > 0**, calcula dos raíces reales.
   - Si **Δ = 0**, calcula una única raíz real.
   - Si **Δ < 0**, calcula dos raíces complejas conjugadas.

5. Muestra el resultado en pantalla.

---

# 🛠️ Conceptos aplicados

Este proyecto permite practicar:

- ✅ Java 21
- ✅ Entrada de datos con `Scanner`
- ✅ Variables de tipo `double`
- ✅ Operadores matemáticos
- ✅ Cálculo del discriminante
- ✅ Uso de `Math.sqrt()`
- ✅ Estructuras condicionales `if`, `else if` y `else`
- ✅ Manejo de ecuaciones cuadráticas
- ✅ Cálculo de raíces reales y complejas
- ✅ Salida de información por consola

---

# 🚀 Resultado esperado

Al ejecutar el programa, el usuario podrá ingresar los coeficientes de cualquier ecuación cuadrática y obtener automáticamente:

- El valor del discriminante.
- El tipo de solución de la ecuación.
- Las raíces correspondientes (reales o complejas).

---

# 📚 Tecnologías utilizadas

- **Java 21**
- **IntelliJ IDEA**
- **Consola**
- **Clase `Scanner`**
- **Clase `Math`**

---

# 👨‍💻 Autor

Proyecto educativo desarrollado en **Java 21** para practicar el uso de estructuras condicionales, 
operaciones matemáticas y la implementación de la fórmula general para resolver ecuaciones cuadráticas .
:. . / .
