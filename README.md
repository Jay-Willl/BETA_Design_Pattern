# Design Pattern

---
## A. Iterator

### Character
1. Aggregator (interface)
2. Iterator (interface)
3. ConcreteAggregator (class)
4. ConcreteIterator (class)

### Usage
1. 使元素对遍历与本身的数据结构脱钩，避免类之间的强耦合

### Remainder
1. 先"填充元素"再"index++"
2. hasNext() —— "确认是否可以使用next()"
---

---
## B. Adapter

### Character
1. Adapter
2. Client (Main class)
3. Target (defines the performing function)
4. Adaptee (defines the "requirements")

### Two Pattern
1. Adapter extends Target implements Adaptee
2. Adapter (containing Adaptee) extends Target

### Usage
1. 更好地使用现有的类，让现有的类更好适配新的接口
2. 使得新旧版本兼容
---

---
## C. Template_Method

### Character
1. Template Class
2. Concreate Class

### Remainder
1. 组成模版的方法被定义在父类中，唯一被确定的是父类如何定义这些方法的处理流程。即，在父类中定义处理流程的框架，在子类中定义处理流程的方法
2. 在子类中实现父类中声明的抽象方法时，必须要理解这些抽象方法被调用的时机。在看不到父类的源代码的情况下，想要编写出子类是非常困难的。
3. 使用父类类型的变量保存子类实例的优点是，即使没有用instanceof等指定子类的种类，程序也能正常工作。这被称为里式替换原则(The Liskov SubstitutionPrinciple, LSP)
---

---
## D. Factory_Method

### Character
1. Creator
2. Product
3. ConcreteCreator
4. ConcreteProduct

### Remainder
1. 父类决定实例的生成方式，但并不决定所要生成的具体的类，具体的处理全部交给子类负责
2. 不用new关键字来生成实例，而是调用生成实例的专用方法来生成实例，这样就可以防止父类与其他具体类耦合
---



