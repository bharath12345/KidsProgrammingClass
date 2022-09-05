clear()
//setSpeed(fast)
setAnimationDelay(100)

val sides = 8
val length = 100
val angle = (180 * sides) - 360 / sides

def polygon() = {
    repeat(sides) {
        setPenColor(cm.green)
        forward(length)
        left(angle)
    }
}

def comb() = {
    repeat(10) {
        polygon()
    
        repeat(sides / 2) {
            hop(length)
            left(angle)
        }
            
        hop(length)
        left(180)
    }
}

val reset = 
    if(sides == 4) 100 
    else if (sides == 6) 200
    else 240

for(i <- 1 to 10) {
    setPosition(-300, 200 - (i * reset))
    comb()
}