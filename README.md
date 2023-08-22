# Mr West's Investigation Case
## Problem

US law says it is illegal to sell weapons to a hostile nation.
Cuba has some missiles, and all of them were sold by Capt.
West, who is American.
Is West a criminal or not?
How to automatically solve this sorting problem?

## Resolution attempts

This is a Java console application that simulates interactions related to arms possession and communication with certain countries. The program prompts the user to input their name, weapons they possess, and the country they communicated with during a specific period. Based on these inputs, the program determines if the user is an American, if they possess weapons, and if they had communication with specific countries, labeling them as potentially criminal or not.

## Getting Started

1. Clone this repository to your local machine.
2. Make sure you have Java JDK installed on your computer.
3. Open a terminal or command prompt and navigate to the project directory.

## Usage

1. Compile the Java code:
   ```
   javac Main.java
   ```

2. Run the compiled code:
   ```
   java Main
   ```

3. Follow the prompts to input your name, weapons possessed, and the country you communicated with.

## Program Logic

1. The program starts by asking for your name. If the name is "West," you are considered American; otherwise, you are not.
   
2. If you are an American:
   - The program asks you about the weapons you possess.
   - If you have either a "BOMBA" or "MISSIL," you are considered to possess a weapon.
   - The program then asks you about the country you communicated with.
   - If you communicated with "CUBA" or "IRAO," you are labeled as a criminal and the details are displayed.

3. If you are not an American:
   - The program concludes that you are not a criminal and have no relation to any of the specified enemy countries.

## Enumerations

- `InimigoPolitico`: Represents the countries that are considered enemies ("CUBA" and "IRAO").
- `Arma`: Represents the types of weapons ("BOMBA" and "MISSIL").

## Notes

- This application is a simple simulation and does not have any real-world implications.
- The logic and scenarios presented are fictional and for educational purposes.


