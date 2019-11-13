
/**
 * This is scala script and can be run in scala REPL mode
 * using command :-
 * :load <file path with name>
 *   for example for this class :
 *   scala> :load /Users/vikas/GitRepo/scala/src/main/scala/Upper.scala
 */
class Upper {

  def upper(strings: String*):Seq[String]= {
    strings.map((s: String) => s.toUpperCase())

  }
}

val up = new Upper
println(up.upper("Vikas"))