//You are going to be given a word. Your job is to return the middle character of the word. If the word's length is odd, return the middle character. If the word's length is even, return the middle 2 characters.


fun getmiddle2(word : String) : String = if(word.length % 2 == 0) "${word[word.length/2 - 1]}${word[word.length/2]}" else "${word[word.length/2]}"

