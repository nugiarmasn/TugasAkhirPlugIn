package Soal1.nomor_5
import Soal1.nomor_5.generic

fun main() {
    val welcome = generic.Nomor5("My Boutique", "Barang-Barang Fashion", 180000f)
    val sambutan = welcome.welcome()
    println(sambutan)
}