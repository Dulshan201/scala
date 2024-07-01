object Reverse{

    def reverseString(str: String): String = {
    if (str.isEmpty) ""
    else reverseString(str.tail) + str.head
    }

    def main(args: Array[String]): Unit={
        val input="Hello world";
        val reversed = reverseString(input)
        reverseString(input);
        println(s"Original: $input")
        println(s"Reversed: $reversed")
    }
}