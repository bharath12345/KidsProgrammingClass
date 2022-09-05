cleari()

def curve(angle: Int, t: Turtle) = {
  repeat(20) {
    t.forward(10)
    t.right(angle)
  }    
}

val t1 = newTurtle(-200, 0)
val t2 = newTurtle(-100, 0)
val t3 = newTurtle(0, 0)
val t4 = newTurtle(100, 0)
val t5 = newTurtle(200, 0)

curve(1, t1)
curve(2, t2)
curve(3, t3)
curve(4, t4)
curve(5, t5)
