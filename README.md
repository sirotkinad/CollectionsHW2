# CollectionsHW2

a. ArrayList/LinkedList.

Если необходимо вставлять/удалять в середину коллекции много элементов, то эффективнее использовать LinkedList. 
Но он требует больше памяти, так как вместе с элементами хранится указатель(и) на следующий(предыдущий) элемент(ы). 
Взятие элемента быстрее в ArrayList. 

b. HashSet, LinkedHashSet, TreeSet

Все три коллекции не позволяют хранить дубликаты. 
LinkedHashSet можно использовать, если необходимо контролировать порядок вставки элементов(в HashSet он не контролируется). 
TreeSet будет полезен в случаях, когда элементы должны быть упорядочены. Также в TreeSet нельзя хранить null элементы. 
По памяти выигрывает HashSet. Его можно использовать, когда не нужно поддерживать порядок элементов. 
С операциями "добавление, поиск" лучше всего справился HashSet, с удалением - LinkedHashSet. 
TreeSet проигрывает по производительности во всех операциях. 


с. HashMap, LinkedHashMap, TreeMap

Ситация с упорядоченностью аналогична пункту b. В HashMap порядок случайный. В LinkedHashSet порядок согласно добавлению. 
В TreeMap по умолчанию по возрастанию, либо можно задать компаратором. 
Таким образом, если не нужна упорядоченность подойдет HashMap, 
а если нужно упорядочить элементы согласно какому-либо правилу - использовать TreeMap.
Но производительность TreeMap проигрывает HashMap и LinkedHashMap. 
