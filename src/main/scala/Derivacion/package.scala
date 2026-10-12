package object Derivacion {


  def derivada(f: Double => Double): Double => Double = {
    val h = 0.1
    (x0:Double) => (f(x0 - 2*h) - 8*f(x0-h)+ 8*f(x0 + h)-f(x0 + 2*h)) / (12*h)
    // Retornamos una función anónima que recibe un 'x0' y calcula la derivada
  }
  def derivadaSuma(f :Double=>Double , g:Double=>Double):Double => Double = {
     (x0:Double) =>derivada(f)(x0) + derivada(g)(x0)

  }

  def derivadaResta(f :Double=>Double , g:Double=>Double):Double => Double = {
    (x0:Double) =>derivada(f)(x0) - derivada(g)(x0)
  }
  def derivadaMult(f :Double=>Double , g:Double=>Double):Double => Double = {
    (x0:Double) => derivada(f)(x0) * g(x0) + f(x0)*derivada(g)(x0)
  }

  def derivadaDiv(f :Double=>Double , g:Double=>Double):Double => Double = {
    (x0:Double) => (derivada(f)(x0) * g(x0) - f(x0)*derivada(g)(x0)) / (g(x0)*g(x0))
  }


}