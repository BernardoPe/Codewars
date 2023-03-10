// Count the number of Duplicates
// Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric digits that occur more than once in the input string. The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.
// Example
// "abcde" -> 0 # no characters repeats more than once
// "aabbcde" -> 2 # 'a' and 'b'
// "aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
// "indivisibility" -> 1 # 'i' occurs six times
// "Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
// "aA11" -> 2 # 'a' and '1'
// "ABBA" -> 2 # 'A' and 'B' each occur twice


fun duplicateCount2(text: String): Int {
    val seen = mutableSetOf<Char>()
    val duplicates = mutableSetOf<Char>()
    for (char in text.lowercase()) { //Initial string to lowercase so upper case == lower case (A == a)
        if (!seen.add(char)) duplicates.add(char) //If current character isn't added to seen, then it is already on the list, and is a duplicate.
    }
    return duplicates.size
}
