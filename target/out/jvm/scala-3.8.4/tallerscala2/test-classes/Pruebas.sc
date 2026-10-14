import Derivacion._

val cte= (x:Double) => 2.0
val f= (x:Double) => x*x
val g= (x:Double) => x*x*x
val h= (x:Double) => f(x)/g(x)
val j= (x:Double) => g(x)/f(x)

val h1= derivadaDiv(f,g)
val h2= derivadaDiv(g,f)


h1(2.0)
h2(2.0)

// CASOS DE PRUEBA PARA derivada
val fLineal = (x: Double) => 6.0 * x - 2.0
//1
val derivadalineal_1 = derivada(fLineal)(10.0) // Esperado: ~ 6.0

val fCuadratica = (x: Double) => 3.0 * x * x + 2.0 * x
//2
val derivadacuadratica_1 = derivada(fCuadratica)(4.0) // Esperado: ~ 26.0
//3
val fCubica1= derivada(g)(3.0) // Esperado: ~ 27.0
//4
val fCubica2= derivada(g)(5.0) // Esperado: ~ 75.0
//5
val constante_1=derivada(cte)(20.0) // Esperado: ~ 0.0


// CASOS DE PRUEBA PARA derivadaSuma

// Suma de dos funciones lineales
val flineal1 = (x: Double) => 2.0 * x
val glineal1 = (x: Double) => 3.0 * x
//1
val pruebaSuma1 = derivadaSuma(flineal1, glineal1)(4.0) // Esperado: ~ 5.0

// Suma de una cuadrática y una constante
val fcuadratica1 = (x: Double) => 3.0 * x * x
val gconstante = (x: Double) => 8.0
//2
val pruebaSuma2 = derivadaSuma(fcuadratica1, gconstante)(4.0) // Esperado: ~ 24.0

// Suma de una cuadrática y una lineal
val fcuadratica2 = (x: Double) => x * x
val glineal2 = (x: Double) => 4.0 * x
//3
val pruebaSuma3 = derivadaSuma(fcuadratica2, glineal2)(12.0) // Esperado: ~ 28.0

// Suma de una cúbica y una cuadrática
val fcubica = (x: Double) => 3* x * x * x
val gcuadratica = (x: Double) => 2.0 * x * x
//4
val pruebaSuma4 = derivadaSuma(fcubica, gcuadratica)(2.0) // Esperado: ~ 44.0

//  Suma de dos constantes
val fconstante = (x: Double) => 20.0
val gconstante1 = (x: Double) => 3.0
//5
val pruebaSuma5 = derivadaSuma(fconstante, gconstante1)(10.0) // Esperado: ~ 0.0

// CASOS DE PRUEBA PARA derivadaResta

// Resta de dos funciones lineales
val f1 = (x: Double) => 5.0 * x
val g1 = (x: Double) => 2.0 * x
//1
val pruebaResta1 = derivadaResta(f1, g1)(5.0) // Esperado: ~ 3.0

// Resta de una cuadrática y una lineal
val f2 = (x: Double) => x * x
val g2 = (x: Double) => 2.0 * x
//2
val pruebaResta2 = derivadaResta(f2, g2)(15.0) // Esperado: ~ 28.0

// Resta de una cúbica y una cuadrática ---
val f3 = (x: Double) => x * x * x
val g3 = (x: Double) => x * x
//3
val pruebaResta3 = derivadaResta(f3, g3)(12.0) // Esperado: ~ 408


// Resta de una constante a una cuadrática ---
val f4 = (x: Double) => x * x
val g4 = (x: Double) => 5.0
//4
val pruebaResta4 = derivadaResta(f4, g4)(11.0) // Esperado: ~ 22.0


// Resta de funciones similares
val f5 = (x: Double) => x * x
val g5 = (x: Double) => x * x
//5
val pruebaResta5 = derivadaResta(f5, g5)(7.0) // Esperado: 0.0

// CASOS DE PRUEBA PARA derivadaMult

// Producto de dos funciones lineales
val flineal = (x: Double) => 2.0 * x
val glineal = (x: Double) => 3.0 * x
//1
val pruebaMult1 = derivadaMult(flineal, glineal)(2.0) // Esperado: ~ 24.0

// Producto de una constante y una cuadrática
val constante1 = (x: Double) => 5.0
val gcuadratica1 = (x: Double) => x * x
//2
val pruebaMult2 = derivadaMult(constante1, gcuadratica1)(3.0) // Esperado: ~ 30.0


// Producto de una lineal y una cuadrática
val fcuadratica3 = (x: Double) => x
val gcuadratica3 = (x: Double) => x * x
//3
val pruebaMult3 = derivadaMult(fcuadratica3, gcuadratica3)(4.0) // Esperado: ~ 48.0

// Producto de dos cuadráticas
val fcuadratica4 = (x: Double) => 3.0 * x * x
val gcuadratica4 = (x: Double) => 2.0 * x * x
//4
val pruebaMult4 = derivadaMult(fcuadratica4, gcuadratica4)(3.0) // Esperado: ~ 648


// --- Caso 5: Producto por cero
val fcuadratica5 = (x: Double) => x * x
val gconstante5 = (x: Double) => 0.0
//5
val pruebaMult5 = derivadaMult(fcuadratica5, gconstante5)(6.0) // Esperado: 0.0

// CASOS DE PRUEBA PARA derivadaDiv

// División de cuadrática entre lineal (ejemplo del taller)
//1
val pruebaDiv1 = derivadaDiv(f, g)(2.0) // Esperado: ~ -0.25


// Inversa de la prueba 1
//2
val pruebaDiv2 = derivadaDiv(g, f)(2.0) // Esperado: ~ 1.0

// Caso 3: División de constante entre lineal
val constante3 = (x: Double) => 4.0
val glineal3 = (x: Double) => x
//3
val pruebaDiv3 = derivadaDiv(constante3, glineal3)(2.0) // Esperado: ~ -1.0

// División de cúbica entre cuadrática
val fcubica4 = (x: Double) => 2.0 * x * x * x
val gcuadratica_4 = (x: Double) => x * x
//4
val pruebaDiv4 = derivadaDiv(fcubica4, gcuadratica_4)(5.0) // Esperado: ~ 2.0

// Caso 5: División de funciones idénticas
val fcuadratica_5 = (x: Double) => x * x
val gcuadratica_5 = (x: Double) => x * x
//5
val pruebaDiv5 = derivadaDiv(fcuadratica_5, gcuadratica_5)(3.0) // Esperado: 0.0


