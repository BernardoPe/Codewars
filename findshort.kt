//Find shortest word's length in string


fun findShort(s: String): Int {
    var minword = ""
    var word = ""
    for(char in s) {
        if(char != ' ') word += char
        else {
            if(minword.length == 0) minword = word
            else if(word.length < minword.length) minword = word
            word = ""
        }
    }
    if(word.length < minword.length) minword = word //end of string might not contain spaces so check one more time for the last word
    return minword.length
}

