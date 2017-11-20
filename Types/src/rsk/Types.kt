package rsk

interface Time {
    fun setTime(hours: Int, mins: Int = 0, secs: Int = 0)
}

class YetiTime : Time {
    override fun setTime(hours: Int, mins: Int, secs: Int) {

    }
}