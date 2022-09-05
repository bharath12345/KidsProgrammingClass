def square() {
  repeat(4) {
    forward(50)
    right(90)
  }
}

clear()
setSpeed(medium)
repeat(3) {
  square()
  right(30)
}