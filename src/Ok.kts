print(List(3) { readLine()!!.toInt() }.let { (a, b, c) ->
    if (a + b > c && a + c > b && b + c > a) "YES" else "NO"
})
