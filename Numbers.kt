fun main() {
    val panjang = 15
    val lebar = 10
    val tinggi = 7
    val volume = Double
    hitungVolume(15.0, 10.0, 7.0)
}
fun hitungVolume(p : Double, l : Double, t : Double) {
    val v = p * l * t
    println("Volume dari balok yang mempunyai panjang $p, lebar $l, dan tinggi $t, ini adalah $v")
}