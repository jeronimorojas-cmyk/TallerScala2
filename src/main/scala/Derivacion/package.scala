package object Derivacion {


  def derivada(f: Double => Double): Double => Double = {
    val h = 0.1

    // Retornamos una función anónima que recibe un 'x' y calcula la derivada
    x => (f(x - 2*h) - 8*f(x-h)+ 8*f(x + h)-f(x + 2*h)) / (12*h)
  }
  def derivadaSuma(f :Double=>Double , g:Double=>Double):Double => Double = {
     x=>derivada(f)(x) + derivada(g)(x)

  }
  def derivadaMult(f :Double=>Double , g:Double=>Double):Double => Double = {
    x=> derivada(f)(x) * g(x) + f(x)*derivada(g)(x)
  }


}