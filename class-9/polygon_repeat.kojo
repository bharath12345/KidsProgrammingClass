clear()
setSpeed(fast)

val sides = 9
val length = 100
val odd = (sides % 2) == 1
val angle = (180 * sides) - 360 / sides

println(s"drawing a shape with $sides of $length with interior angle = $angle")

def shape() = {
    repeat(sides) {
        forward(length)
        if(odd) left(180)
        left(angle)
    }
}

val number_shapes = 100
val displacement_angle = 12

repeat(number_shapes) {
    shape()
    left(displacement_angle)
}
