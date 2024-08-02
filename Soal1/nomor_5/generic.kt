package Soal1.nomor_5

class generic {
    class Nomor5<T, U, V> (val warung: T, val menu: U, val Harga: V) {
        fun welcome (sapaan: String = "Halo, selamat datang "): String {
            return "$sapaan di $warung, Warung kami menjual menu yang anda inginkan yaitu $menu yang dijual dengan harga Rp %.2f".format(Harga)
        }
    }
}