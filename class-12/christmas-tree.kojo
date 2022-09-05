clear()

def curve1(angle: Float, fwd: Int, rep: Int) = {
  repeat(rep) {
    back(fwd)
    right(angle)
  }    
}

def curve2(angle: Float, fwd: Int, rep: Int) = {
  repeat(rep) {
    forward(fwd)
    left(angle)
  }    
}

curve1(10, 20, 8)
curve2(5, 20, 4)

setPo

