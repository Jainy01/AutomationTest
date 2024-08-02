import streamlit as st
from fractorial import fact
def main():
    st.title("Factorial Calculator")
    number = st.number_input("Enter a number", min_value=0, max_value=10000)
    if st.button("Calculate"):
        result = fact(number)
        st.write(f"The factorial of {number} is {result}")
if __name__ == "__main__":
    main()

# streamlit run app.py