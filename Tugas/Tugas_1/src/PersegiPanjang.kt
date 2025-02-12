fun main() {
    print("Panjang : ")
    val panjang = readLine()?.toIntOrNull() ?: return println("Input Tidak Valid")

    print("Lebar : ")
    val lebar = readLine()?.toIntOrNull() ?: return println("Input Tidak Valid")

    val persegiPanjang = PersegiPanjang(panjang, lebar)

    println("Luas : ${persegiPanjang.hitungLuas()}")
    println("Keliling : ${persegiPanjang.hitungKeliling()}")
}

class PersegiPanjang(private val panjang: Int, private val lebar: Int) {

    fun hitungLuas(): Int {
        return panjang * lebar
    }

    fun hitungKeliling(): Int {
        return 2 * (panjang + lebar)
    }
}