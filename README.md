# poc-method-references

## Structure

````terminaloutput
poc-java8-method-reference
│
├── model
│   └── Person.java
│
├── examples
│   ├── Example01LambdaToMethodReference.java
│   ├── Example02StaticMethod.java
│   ├── Example03BoundInstanceMethod.java
│   ├── Example04UnboundInstanceMethod.java
│   ├── Example05Constructor.java
│   ├── Example06Comparator.java
│   ├── Example07MethodReferenceParameters.java
│   ├── Example08MethodReferenceOverload.java
│   └── Example09RealWorld.java
│
└── MethodReferenceApplication.java
````


### Os quatro tipos de Method Reference

Essa é a parte mais importante para memorizar.

Java possui quatro formas principais:

Tipo	Sintaxe	Exemplo
Método estático	ClassName::staticMethod	Integer::parseInt
Método de instância de objeto específico	object::instanceMethod	System.out::println
Método de instância de objeto arbitrário	ClassName::instanceMethod	String::toUpperCase
Construtor	ClassName::new	Person::new