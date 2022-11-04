## Iterator

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