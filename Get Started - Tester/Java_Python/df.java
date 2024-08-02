// Write a function with example which is to check if a given string is a palindrome.
// A palindrome is a word, phrase, or sequence of character that reads the same backward as forward, e.g., madam, racecar
//Give an explain for your solution
// https://www.programiz.com/cpp-programming/examples/palindrome-number

// Overal we can use the same logic to check if a string is a palindrome or not. We can use the same logic as we use to check if a number is a palindrome or not.
static boolean isPalindrome(String str) { // static method to check palindrome, boolean return type
// We use static method because we don't need to create an object to call this method. We can call this method directly using the class name. 
    int i = 0, j = str.length() - 1; // i is the first index of the string, j is the last index of the string, str.length() is the length of the string. We subtract 1 from the length of the string because the index of the string starts from 0. So, the last index of the string is str.length() - 1
    while (i < j) { // while loop to check if the string is a palindrome or not. i< j because we need to check the string from the first index to the last index, so we need to check until i is less than j because when i is equal to j, we have checked all the characters of the string
        if (str.charAt(i) != str.charAt(j)) { // if the first index of the string is not equal to the last index of the string
            // str.charAt(i) is the character at the ith index of the string
            // str.charAt(j) is the character at the jth index of the string. It's the last character of the string because j is the last index of the string
            // != is the not equal to operator. 
            return false; 
        }
        i++; // increment i by 1 because we need to check the next character of the string
        j--; // decrement j by 1 because we need to check the previous character of the string
    }
    return true;
}
Console.WriteLine(isPalindrome("madam")); // true. Console is used to print the output to the console. We call the isPalindrome method and pass the string "madam" as an argument.
// The method returns true because "madam" is a palindrome
Console.WriteLine(isPalindrome("racecar")); // true
Console.WriteLine(isPalindrome("hello")); // false