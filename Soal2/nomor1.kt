package Soal2

fun main() {
    val mataPelajaran = listOf("Bahasa Indonesia", "Bahasa Inggris", "Matematika", "IPA")
    val nilai = mutableListOf<Int>()

    fun inputNilai(mataPelajaran: String): Int {
        while (true) {
            println("$mataPelajaran : ")
            val input = readLine()
            val nilai = input?.toIntOrNull()

            if (nilai != null && nilai in 0..100) {
                return nilai
            } else {
                println("Input tidak valid")
            }
        }
    }

    for (pelajaran in mataPelajaran) {
        val nilaiPelajaran = inputNilai(pelajaran)
        nilai.add(nilaiPelajaran)
    }

    val rataRata = nilai.sum() / nilai.size

    val grade = when (rataRata) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        in 60..69 -> "D"
        else -> "E"
    }
    println("Nilai rata-rata: $rataRata")
    println("Index: $grade")
}