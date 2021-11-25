package object Writin_Reading_IO


//Writing Output


// Impresion por pantalla básica

object Hello_World extends App {
  println("Hello World")
}

// Impresion por pantalla de un Standar Error

object AvisoError extends App {
  System.err.println("ups, an error happened")
}




//Reading Input

//Existen diferentes metodos pero el mas facil de usar es el metodo "readline" del paquete "scala.io.Stdln", se debe importar antes de usar el metodo.

import scala.io.StdIn.readLine

//Ejemplo

object HelloInteractive extends App {

  println("Enter your first name: ")
  val firstName = readLine( )

  println("Enter your last name: ")
  val lastName = readLine( )

  println(s"Your name is $firstName $lastName")

}

