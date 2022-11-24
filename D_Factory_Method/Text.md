## Factory_Method

### Character
1. Creator
2. Product
3. ConcreteCreator
4. ConcreteProduct

### Remainder
1. 父类决定实例的生成方式，但并不决定所要生成的具体的类，具体的处理全部交给子类负责
2. 不用new关键字来生成实例，而是调用生成实例的专用方法来生成实例，这样就可以防止父类与其他具体类耦合
3. 