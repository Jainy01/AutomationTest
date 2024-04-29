# Write a function with example which is to check if a given string is a palindrome.
# A palindrome is a word, phrase, or
 sequence of character that reads the same backward as forward, e.g., madam, racecar

// using Javascript
function isPalindrome(str) {
  str = str.toLowerCase(); // convert the string to lowercase
  var len = str.length; // get the length of the string
  for (var i = 0; i < len/2; i++) { // iterate through the string
    if (str[i] !== str[len - 1 - i]) { // compare the first and last characters
      return false; // return false if they are not equal
    }
  }
  return true; // return true if the string is a palindrome
}