# Assignment 1 - Principles of Programming Languages

## Overview

This project is the first assignment for the Principles of Programming Languages course. It focuses on implementing a lexer and parser for a programming language, developing the foundation for a complete language processor/compiler.

## Project Structure

```
PPL_1/
├── src/                # Source code
│   ├── main/           # Main implementation
│   │   ├── mt22/       # MT22 language implementation
│   │   │   ├── astgen/ # Abstract syntax tree generation
│   │   │   ├── parser/ # Parser implementation
│   │   │   ├── checker/# Type checking and semantic analysis
│   │   │   └── utils/  # Utility functions and helpers
│   └── test/           # Test cases and test runner
├── target/             # Compiled output
└── README.md           # This file
```

## Features

- Lexical analysis (tokenization)
- Syntax analysis (parsing)
- Abstract syntax tree generation
- Semantic analysis (type checking)

## Technologies Used

- ANTLR4 for grammar definition and parser generation
- Python for implementation
- Visitor pattern for tree traversal

## Setup and Installation

### Prerequisites

- Python 3.8 or higher
- ANTLR4 runtime for Python
- Java Runtime Environment (JRE)

### Installation Steps

1. Clone this repository
2. Install required dependencies:
   ```
   pip install antlr4-python3-runtime
   ```

## Usage

### Running the Lexer and Parser

```
python run.py <input_file>
```

### Running Tests

```
python run.py test
```

## Assignment Requirements

The assignment implements the following components:

1. **Lexical Analysis**: Converting source code into tokens
2. **Syntax Analysis**: Creating a parse tree according to the language grammar
3. **Abstract Syntax Tree**: Building an AST from the parse tree
4. **Type Checking**: Validating type consistency throughout the program

## Examples

Input file example:

```
var x: integer = 10;
var y: float = 20.5;

function sum(a: integer, b: integer): integer {
    return a + b;
}

function main(): void {
    var result: integer;
    result = sum(x, 5);
    printInt(result);
}
```

## Implementation Notes

- The lexer and parser are implemented using ANTLR4
- AST generation is done by visiting the parse tree nodes
- Type checking is implemented using symbol tables and scope management

## Author

[Your Name] - [Your Student ID]

## Acknowledgements

- Course instructor and teaching assistants
- HCMUT Faculty of Computer Science and Engineering
