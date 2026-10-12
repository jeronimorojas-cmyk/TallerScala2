import Derivacion._

val cte= (x:Double) => 2.0
val f= (x:Double) => x*x
val g= (x:Double) => x*x*x
val h= (x:Double) => f(x)/g(x)
val j= (x:Double) => g(x)/f(x)

val fLineal = (x: Double) => 5.0 * x - 3.0
val d_lineal_1 = derivada(fLineal)(0.0)
val d_lineal_2 = derivada(fLineal)(10.0)

val cons=derivada(cte)(20.0)
val f1= derivada(f)(9.0)

// CASOS DE PRUEBA PARA derivadaSuma
// Regla matemática: (f + g)'(x) = f'(x) + g'(x)
// ===========================================================================

// --- Caso 1: Suma de dos funciones lineales ---
// f1(x) = 2x, g1(x) = 3x  => (f1 + g1)(x) = 5x  => Derivada esperada = 5.0
val flineal = (x: Double) => 2.0 * x
val g1 = (x: Double) => 3.0 * x

val pruebaSuma1 = derivadaSuma(flineal, g1)(4.0) // Esperado: ~ 5.0
// --- Caso 2: Suma de una cuadrática y una constante ---
// f2(x) = x^2, g2(x) = 10  => (f2 + g2)'(x) = 2x + 0 = 2x
// En x = 3.0 => Derivada esperada = 2*(3) = 6.0
val f2 = (x: Double) => x * x
val g2 = (x: Double) => 10.0

val pruebaSuma2 = derivadaSuma(f2, g2)(3.0) // Esperado: ~ 6.0

// --- Caso 3: Suma de una cuadrática y una lineal ---
// f3(x) = x^2, g3(x) = 4x  => (f3 + g3)'(x) = 2x + 4
// En x = 5.0 => Derivada esperada = 2*(5) + 4 = 14.0
val f3 = (x: Double) => x * x
val g3 = (x: Double) => 4.0 * x

val pruebaSuma3 = derivadaSuma(f3, g3)(5.0) // Esperado: ~ 14.0

// --- Caso 4: Suma de una cúbica y una cuadrática ---
// f4(x) = x^3, g4(x) = 2x^2  => (f4 + g4)'(x) = 3x^2 + 4x
// En x = 2.0 => Derivada esperada = 3*(4) + 4*(2) = 12 + 8 = 20.0
val f4 = (x: Double) => x * x * x
val g4 = (x: Double) => 2.0 * x * x

val pruebaSuma4 = derivadaSuma(f4, g4)(2.0) // Esperado: ~ 20.0

// --- Caso 5: Suma de dos constantes ---
// f5(x) = 7, g5(x) = 3  => (f5 + g5)(x) = 10  => Derivada esperada = 0.0
val f5 = (x: Double) => 7.0
val g5 = (x: Double) => 3.0

val pruebaSuma5 = derivadaSuma(f5, g5)(10.0)

val h1= derivadaDiv(f,g)
val h2= derivadaDiv(g,f)
val h3= derivadaDiv(g,f)
val h4= derivadaDiv(g,f)

h1(2.0)
h2(2.0)
h3(2.0)
h4(2.0)

derivada (cte)(2.0)
derivada (cte)(3.0)
