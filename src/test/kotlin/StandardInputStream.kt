import java.io.InputStream

class StandardInputStream : InputStream() {
    private val sb = StringBuilder()
    private val lf = System.getProperty("line.separator")

    /**
     * 文字列を入力する。改行は自動的に行う
     * @param str 入力文字列
     */
    fun inputln(str: String?) {
        sb.append(str).append(lf)
    }

    override fun read(): Int {
        if (sb.length == 0) return -1
        val result = sb[0].toInt()
        sb.deleteCharAt(0)
        return result
    }
}