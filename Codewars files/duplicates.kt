fun duplicateCount(text: String): Int {
    var count = 0
    var countlist = listOf<Int>()
    var string = text.lowercase().toMutableList()
    while (string.isNotEmpty()) {
        count = string.count{it == string[0]}
        string.removeAll(listOf(string[0]))
        countlist += count
    }
    val duplicatecount = countlist.count{it > 1}
    return duplicatecount
}