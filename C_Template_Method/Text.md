## Template_Method

### Character
1. Template Class
2. Concreate Class

### Remainder
1. 组成模版的方法被定义在父类中，唯一被确定的是父类如何定义这些方法的处理流程。即，在父类中定义处理流程的框架，在子类中定义处理流程的方法
2. 在子类中实现父类中声明的抽象方法时，必须要理解这些抽象方法被调用的时机。在看不到父类的源代码的情况下，想要编写出子类是非常困难的。
3. 使用父类类型的变量保存子类实例的优点是，即使没有用instanceof等指定子类的种类，程序也能正常工作。这被称为里式替换原则(The Liskov SubstitutionPrinciple, LSP)