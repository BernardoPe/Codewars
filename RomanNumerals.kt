/*

Create a function that takes a Roman numeral as its argument and returns its value as a numeric decimal integer. You don't need to validate the form of the Roman numeral.

Modern Roman numerals are written by expressing each decimal digit of the number to be encoded separately, starting with the leftmost digit and skipping any 0s. So 1990 is rendered "MCMXC" (1000 = M, 900 = CM, 90 = XC) and 2008 is rendered "MMVIII" (2000 = MM, 8 = VIII). The Roman numeral for 1666, "MDCLXVI", uses each letter in descending order.

Example: decode("XXI") // should return 21
*/

fun decode(str: String): Int {
    var value = 0
    for (i in 0 until str.length) {
        val char = str[i].romantoInt()
        if (i < str.length - 1) {
            val nextchar = str[i + 1].romantoInt()
            if (nextchar > char) value -= char else value += char
        } else value += char
    }
    return value
}

fun Char.romantoInt(): Int {
    return when (this) {
        'M' -> 1000
        'D' -> 500
        'C' -> 100
        'L' -> 50
        'X' -> 10
        'V' -> 5
        'I' -> 1
        else -> 0
    }
}