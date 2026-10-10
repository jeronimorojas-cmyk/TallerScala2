import Derivacion._

// 2. Definir funciones matemáticas base para las pruebas
val f: Double => Double = x => x * x      // f(x) = x^2
val g: Double => Double = x => 3 * x      // g(x) = 3x
val constante: Double => Double = _ => 5.0 // c(x) = 5

// 3. Casos de prueba para derivada simple
// f'(x) = 2x. Evaluando en x = 2, el resultado debe ser cercano a 4.0
val fPrima = derivada(f)
fPrima(2.0)

// Derivada de una constante siempre es 0
val constPrima = derivada(constante)
constPrima(10.0)

// 4. Casos de prueba para derivadaSuma
// (f + g)'(x) = 2x + 3. Evaluando en x = 2, el resultado debe ser 7.0
val sumaPrima = derivadaSuma(f, g)
sumaPrima(2.0)

// 5. Casos de prueba para derivadaMult
// (f * g)'(x) = f'(x)g(x) + f(x)g'(x) = (2x)(3x) + (x^2)(3) = 6x^2 + 3x^2 = 9x^2
// Evaluando en x = 2, el resultado debe ser 9*(2^2) = 36.0
val multPrima = derivadaMult(f, g)
multPrima(2.0)