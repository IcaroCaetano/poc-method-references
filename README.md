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

| Tipo      | Sintaxe	 | Exemplo	 | 
|-----------|------------|-----------|
| `Método estático` |ClassName::staticMethod| Integer::parseInt|
| `Método de instância de objeto específico`|object::instanceMethod|System.out::println|
| `Método de instância de objeto arbitrário`|ClassName::instanceMethod|String::toUpperCase|
| `Construtor`|ClassName::new|Person::new|


### Example 1

#### Example01LambdaToMethodReference

Nesse exemplo é estabelecida uma forma bem simples de comparação entre lambda e method 
reference.

No exemplo foi usado a interface funcional Consumer, o qual recebe apenas uma entrada e no retorna nada.

Saida:

````terminaloutput
Hello Lambda
Hello Method Reference
````

### Example 2

#### Example02StaticMethod

No exemplo dois é realizada uma referência para método estático usando lambda e method reference.
Nesse  outro exemplo foi usado outra interface funcional a Function, a qual representa uma função. 
Ela recebe um argumento e produz um resultado.

Saida:

````terminaloutput
100
200
````

### Example 3

#### Example03BoundInstanceMethod

Nesse exemplo a refêrencia ao método está ligada a uma instância específica.
É criada uma função que obtém o nome da pessoa. 
É usado a interface funcional Supplier a qual não recebe argumento e produz um valor. 
Representa uma instrução;

````terminaloutput
Lambda: Joao
Method Reference: Joao
````

#### Comparação entre um exemplo 2 e o exemplo 3

````terminaloutput

┌────────────────────────────────────┐
│ Static Method                      │
│                                    │
│ Integer::parseInt                  │
│       │                            │
│       └── classe                   │
└────────────────────────────────────┘

┌────────────────────────────────────┐
│ Bound Instance Method              │
│                                    │
│ person::getName                    │
│    │                               │
│    └── objeto específico           │
└────────────────────────────────────┘
````

### Example 4

````terminaloutput
Lambda: Joao
Method Reference: Joao
````

#### 

References:

- https://www.baeldung.com/java-method-references

- https://docs.oracle.com/javase/tutorial/java/javaOO/methodreferences.html