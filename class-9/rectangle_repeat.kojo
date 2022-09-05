clear()
setSpeed(fast)

val number_of_rectangles = 80
val angle = 360/number_of_rectangles

val length = 100
val bredth = 10

def rectangle() = {
    repeat(2) {
        forward(length)
        right(90)
        forward(bredth)
        right(90)
    }
}

repeat(number_of_rectangles + 10) {
    rectangle()
    right(90)
    hop(bredth)
    left(90)
    right(angle)
}

