# Memento Pattern Documentation

The Memento Pattern is a behavioral design pattern that allows an object to save and restore its state without exposing its internal details. It is particularly useful for implementing undo/redo functionality in applications.

## Key Components:
1. **Originator**: The object whose state needs to be saved and restored.
2. **Memento**: A representation of the saved state of the Originator.
3. **Caretaker**: Manages the mementos and ensures the Originator's state can be restored when needed.

## Example Use Case:
Imagine a text editor where users can undo and redo their actions. The Memento Pattern can be used to save the state of the document at various points, allowing users to revert to a previous state.

## Advantages:
- Encapsulates the state of an object, maintaining encapsulation principles.
- Simplifies the implementation of undo/redo functionality.

## Disadvantages:
- Can consume significant memory if the state is large or if many mementos are created.
- Increases the complexity of the codebase.

## UML Diagram:
```
+-------------+       +-------------+       +-------------+
| Originator  |<----->|  Memento    |<----->|  Caretaker  |
+-------------+       +-------------+       +-------------+
| - state     |       | - state     |       | - mementos  |
| + save()    |       |             |       | + add()     |
| + restore() |       |             |       | + get()     |
+-------------+       +-------------+       +-------------+
```

## Implementation Steps:
1. Define the `Memento` class to store the state.
2. Implement the `Originator` class with methods to save and restore its state.
3. Create a `Caretaker` class to manage the mementos.

## Code Example:
Refer to the corresponding Java implementation in the project for a detailed example.