import com.example.coo.ui.MainActivity

class Controller(private val callback: MainActivity) {

    fun banding(kita: String, lawan: String){
        val gunting1 = "gunting"
        val gunting2 = "gunting"
        val kertas = "kertas"
        val batu = "batu"
        when (kita + lawan) {
            gunting1 + gunting2, kertas + kertas, batu + batu -> { "Draw" }
        }

        when (kita + lawan) {
            gunting1 + kertas, kertas + batu, batu + gunting1 -> {"Player 1 MENANG" }
        }

        when (kita + lawan) {
            gunting1 + batu, kertas + gunting1, batu + kertas -> {"Pemain 2 MENANG"}
        }
    }
}