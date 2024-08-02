// List of characters: a, b, c, d
// Printed output on a specific characters 
// a

public string Print(string  str){
    // Define the list of character 
    List<char> list = new List<char>();
    // Add the character to the list
    list.Add('a', 'b', 'c', 'd');
    // Print the output of the list
    Console.WriteLine(list);
    return list;
}

Console.WriteLine(Print("a")); // a
Console.WriteLine(Print("b")); // b