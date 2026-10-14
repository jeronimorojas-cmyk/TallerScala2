package object Derivacion {


  def derivada(f: Double => Double): Double => Double = {
    // Definimos h como 0,1 como se plantea en la ecuacion del taller
    val h = 0.1
    (x0:Double) => (f(x0 - 2*h) - 8*f(x0-h)+ 8*f(x0 + h)-f(x0 + 2*h)) / (12*h)
    // Retornamos una función anónima que recibe un 'x0' y calcula la derivada
  }
  def derivadaSuma(f :Double=>Double , g:Double=>Double):Double => Double = {
    /* Aplicamos la regla de la suma: (f + g)'(x) = f'(x) + g'(x) por medio de una
    función anónima que recibe 'x0' y calcula la derivada  en este caso de la suma*/
     (x0:Double) =>derivada(f)(x0) + derivada(g)(x0)

  }

  def derivadaResta(f :Double=>Double , g:Double=>Double):Double => Double = {
    /* Aplicamos la regla de la resta: (f - g)'(x) = f'(x) - g'(x) por medio de una
     función anónima tambien que recibe 'x0' y calcula la derivada  en este caso de la resta*/
    (x0:Double) =>derivada(f)(x0) - derivada(g)(x0)
  }
  def derivadaMult(f :Double=>Double , g:Double=>Double):Double => Double = {
    /* Aplicamos la regla del producto: (f * g)'(x) = f'(x) * g(x) + f(x) * g'(x)
     por medio de una función anónima*/
    (x0:Double) => derivada(f)(x0) * g(x0) + f(x0)*derivada(g)(x0)
  }

  def derivadaDiv(f :Double=>Double , g:Double=>Double):Double => Double = {
    /* Aplicamos la regla del cociente bajo la formula : (f / g)'(x) = (f'(x) * g(x) - f(x) * g'(x)) / (g(x)^2)
     por medio de una función anónima*/
    (x0:Double) => (derivada(f)(x0) * g(x0) - f(x0)*derivada(g)(x0)) / (g(x0)*g(x0))
  }


}