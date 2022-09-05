cleari()

val t1 = newTurtle(50, 0)
val t2 = newTurtle(100, 0)
val t3 = newTurtle(150, 0)
val t4 = newTurtle(200, 0)

def goForward(t: Turtle, distance: Int) = t.act { self => 
    self.forward(distance)
}

goForward(t1, 50)
goForward(t2, 100)
goForward(t3, 150)
goForward(t4, 200)
