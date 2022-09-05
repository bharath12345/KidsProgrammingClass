clear()
setSpeed(fast)

val sides = 12
val length = 100
val reminder = sides % 2 

// sides = 8, reminder = 0
// sides = 9, reminder = 1
// sides = 10, reminder = 0
//...

val odd = reminder == 1

// sides = 8, reminder = 0, odd = false
// sides = 9, reminder = 1, odd = true
// sides = 10, reminder = 0, odd = falses
//...

val angle = (180 * sides) - 360 / sides

// sides = 3, angle = (540 - 360) / 3 = 180 / 3 = 60
// sides = 4, angle = (720 - 360) / 4 = 360 / 4 = 90
// sides = 5, angle = (900 - 360) / 5 = 540 / 5 = 108
// sides = 6, angle = (1080 - 360) / 6 = 720 / 6 = 120
// sides = 7, angle = (1260 - 360) / 7 = 900 / 7 = 128.5

println(s"drawing a shape with $sides sides of $length with interior angle = $angle")

repeat(sides) {
    forward(length)
    if(odd) left(180)
    left(angle)
}
