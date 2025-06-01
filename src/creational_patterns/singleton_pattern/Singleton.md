# Singleton Design Pattern Documentation

The **Singleton Pattern** ensures that a class has only one instance and provides a global point of access to it. This is useful when exactly one object is needed to coordinate actions across a system.

## General Overview

- **Intent:** Restrict instantiation of a class to a single object.
- **Use Cases:** Logging, configuration, thread pools, caches, or any shared resource.
- **Key Features:**
    - Single instance per application.
    - Global access point.
    - Controlled instantiation.

## Singleton in Java

Java provides several ways to implement the Singleton pattern. The most common approaches are:

### 1. Eager Initialization

- Instance is created at class loading time.
- Simple and thread-safe.
- May lead to resource wastage if the instance is never used.

### 2. Static Block Initialization

- Similar to eager initialization but allows exception handling during instance creation.
- Thread-safe.

### 3. Lazy Initialization

- Instance is created only when requested.
- Not thread-safe by default; requires synchronization for thread safety.

### 4. Bill Pugh Singleton (Inner Static Helper Class)

- Uses a static inner class for lazy-loaded, thread-safe instantiation.

### 5. Enum Singleton

- Uses Java enums to guarantee a single instance.
- Handles serialization and reflection attacks automatically.

## Pros and Cons

**Pros:**
- Controlled access to sole instance.
- Reduced memory footprint for shared resources.
- Can be extended to support lazy initialization and thread safety.

**Cons:**
- Can introduce global state into an application.
- Difficult to unit test due to global access.
- May hinder scalability in some scenarios.

## Example Usage

```java
EagerInitializationSingleton singleton = EagerInitializationSingleton.getInstance();
```

## When to Use

- When exactly one instance of a class is needed.
- When a single point of access is required for a shared resource.

---

For code examples, refer to the existing Java implementations in your project.