cleari()

val pic = Picture {
    repeat(4) {
        forward(200)
        right(90)
    }
}


draw(pic)

animate {
    pic.rotate(2)
}
