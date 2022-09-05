cleari()

val t1 = newTurtle(0, 0)
val t2 = newTurtle(0, 0)
val t3 = newTurtle(0, 0)
val t4 = newTurtle(0, 0)
val t5 = newTurtle(0, 0)
val t6 = newTurtle(0, 0)
val t7 = newTurtle(0, 0)
val t8 = newTurtle(0, 0)

t1.act { self =>
    self.setPenColor(Color(10, 20, 30))
    self.forward(100)
    self.right(135)
    self.forward(140)
}

t2.act { self =>
    self.setPenColor(Color(30, 40, 50))
    self.right(45)
    self.forward(100)
    self.right(135)
    self.forward(140)
}

t3.act { self =>
    self.setPenColor(Color(60, 70, 80))
    self.right(90)
    self.forward(100)
    self.right(135)
    self.forward(140)
}

t4.act { self =>
    self.setPenColor(Color(90, 100, 110))
    self.right(135)
    self.forward(100)
    self.right(135)
    self.forward(140)
}

t5.act { self =>
    self.setPenColor(Color(120, 130, 140))
    self.right(180)
    self.forward(100)
    self.right(135)
    self.forward(140)
}

t6.act { self =>
    self.setPenColor(Color(150, 160, 170))
    self.right(225)
    self.forward(100)
    self.right(135)
    self.forward(140)
}

t7.act { self =>
    self.setPenColor(Color(180, 190, 200))
    self.right(270)
    self.forward(100)
    self.right(135)
    self.forward(140)
}

t8.act { self =>
    self.setPenColor(Color(210, 220, 230))
    self.right(315)
    self.forward(100)
    self.right(135)
    self.forward(140)
}
