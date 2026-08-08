# Design Patterns

Java implementations of classic Gang-of-Four design patterns, organized by category. Each pattern lives in its own package under `src/main/java/com/javalang` with a runnable `main` class that demonstrates it.

Design patterns are common responses to frequent issues that arise in software design. Every pattern is like a blueprint that you can adapt to solve a specific problem in your own code.

## Prerequisites

- Java 7+ (project targets `1.7` via Maven compiler plugin)
- Maven

## Building & Running

```bash
mvn clean install
```

Run any pattern's demo class directly, e.g.:

```bash
mvn compile exec:java -Dexec.mainClass="com.javalang.creational.builder.BuilderPattern"
```

(or run the `main` class from your IDE).

## Patterns Covered

### Creational — how objects get created

- **Abstract Factory** (`creational/abstractfactory`) — `FactoryCreator` hands out either a `BankFactory` or `LoanFactory` depending on what's requested. `AbstractFactoryPattern` prompts for a bank (CBA, NAB, MAC) and a loan type (Home, Personal, Business), then computes an EMI — families of related objects (banks and loans) created without hardcoding their concrete classes.
- **Builder** (`creational/builder`) — `CustomerBuilder` lets you chain `.firstName().lastName().email().mobile().build()` to construct a `Customer` step by step, avoiding a telescoping constructor.
- **Factory Method** (`creational/factory`) — `LoanFactory.getLoan(type)` returns an `Owner`, `Invest`, or `Fixed` loan based on user input; each subclass defines its own interest rate and EMI calculation.
- **Object Pool** (`creational/objectpool`) — `ObjectPool` maintains a bounded pool of reusable `ExportingProcess` objects (min 4, max 10, idle timeout 5s), and `ObjectPoolPattern` hands them out to 8 concurrent `ExportingTask`s via an `ExecutorService` instead of creating a new expensive object per task.
- **Prototype** (`creational/prototype`) — `ShapePrototype`/`Circle` implement `clone()`; `ShapeClient` holds a prototype instance and produces new shapes by copying it rather than constructing from scratch.
- **Singleton** (`creational/singleton`) — `Singleton.getInstance(value)` uses double-checked locking (`synchronized` on a null check inside another null check) to lazily create exactly one instance, safe under concurrent access. `SingleThread`/`MultiThread` demonstrate the difference between an unsynchronized and thread-safe version.

### Structural — how objects and classes are composed

- **Adapter** (`structural/adapter`) — `PhonePeToPayTMAdapter` wraps a `PhonePe` object and exposes it through the incompatible `IPayTM` interface, translating field names/methods so PayTM-facing code can consume PhonePe data.
- **Bridge** (`structural/bridge`) — `Vehicle` (abstraction: `Car`, `Bike`) is decoupled from `Workshop` (implementation: `Produce`, `Assemble`), so vehicle type and manufacturing step can vary independently.
- **Composite** (`structural/composite`) — `Employee` holds a list of subordinate `Employee`s, letting you treat an individual employee and a whole reporting tree (CEO → heads → staff) uniformly.
- **Decorator** (`structural/decorator`) — `RedShapeDecorator` wraps a `Shape` (`Circle`/`Rectangle`) to add a red border at runtime without modifying the original shape classes or subclassing per combination.
- **Facade** (`structural/facade`) — `ShapeMaker` exposes simple `drawCircle()/drawRectangle()/drawSquare()` methods that hide the underlying shape object creation.
- **Flyweight** (`structural/flyweight`) — `CoffeeFactory` caches and reuses `CoffeeOrder` instances per flavor (Cappuccino, Chocolate, Espresso) so shared/intrinsic state isn't duplicated per order; per-order context (table number) is passed in separately.
- **Proxy** (`structural/proxy`) — `ProxyInternetAccess` checks an access list before delegating to `RealInternetAccess`, controlling access to the real object.

> Note: this project currently covers the Creational and Structural pattern families only — no Behavioral patterns (Strategy, Observer, etc.) yet.

## Project Structure

```
src/main/java/com/javalang/
├── creational/
│   ├── abstractfactory/
│   ├── builder/
│   ├── factory/
│   ├── objectpool/
│   ├── prototype/
│   └── singleton/
└── structural/
    ├── adapter/
    ├── bridge/
    ├── composite/
    ├── decorator/
    ├── facade/
    ├── flyweight/
    └── proxy/
```
