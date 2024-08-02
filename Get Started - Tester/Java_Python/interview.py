import collections

# Have a list of number, need to list to filter out the number that is divide by 3

# User enter the list of number that range from 0 to 100
def input_number():
    number = []
    while True:
        try:
            n = int(input("Enter a number: "))
            if n < 0 or n > 100:
                print("Please enter a number between 0 and 100")
                continue
            number.append(n)
            print("Number added")
            if len(number) == 10:
                break
        except ValueError:
            print("Please enter a valid number")
    return number

# Filter out the number that is divide by 3, if number is divide by 3, return in a list of number, else return None
def filter_number(number):
    divide_by_3 = []
    for i in number:
        if i % 3 == 0:
            divide_by_3.append(i)
    return divide_by_3
# Print out the number that is divide by 3
def print_number(divide_by_3):
    for i in divide_by_3:
        print(i)

