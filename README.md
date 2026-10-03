# Bridge Pattern — Shape × Renderer (Java 17)

Assignment #3, ShP-2216 Software Design Patterns.

## Structure
```
src/bridge/
├── Main.java                      # Client
├── abstraction/  Shape, Circle, Square
└── implementor/  Renderer, VectorRenderer, RasterRenderer
```

## Run
```
javac -d out $(find src -name "*.java")
java -cp out bridge.Main
```
Or open the folder in IntelliJ IDEA and run `bridge.Main`.

## Idea
`Shape` (abstraction) holds a `Renderer` (implementor) by composition.
Shapes and renderers vary independently: 2 shapes + 2 renderers = 4 combinations with 4 classes, not 4 subclasses.
