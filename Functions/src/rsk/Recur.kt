package rsk

tailrec fun fib(n: Int, a: Int, b: Int) : Int {
    return if(n == 0) b else fib(n-1, a + b , a)
}