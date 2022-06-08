Introduction to Java: Methods with Parameters
---
A java method has 6 components.

- modifier (`public`,`private`, `protected`, `default`)
- return type
- method name
- parameter list
- exception list
- method body

```java
public float payCarBalance(float currentBalance, float monthlyRate, User currentUser, float amount){
    // Reduce current blance
        float updatedBalance = currentBalance - amount;
        
        return updatedBalance;
}
```

A method parameter must always have a type. 

Preferred naming is in camelcase.

Recommended reading
----
- https://www.geeksforgeeks.org/methods-in-java/?ref=lbp
- https://www.cs.toronto.edu/~reid/web/javaparams.html
- https://www.geeksforgeeks.org/argument-vs-parameter-in-java/

Practise
---
- Attempt to apply a commission to the exchanged funds. A commission is calaculated as a percentage of the converted amount. The commission is then deducted from the converted amount. Allow the `convert` method to use a flexible commission rate.

Previous Classes
---
- [Day 1](https://github.com/r115/java-learning-with-derrick/tree/day-1-hello-world)
- [Day 2](https://github.com/r115/java-learning-with-derrick/tree/day-2-variables)
- [Day 3](https://github.com/r115/java-learning-with-derrick/tree/day-3-static-variables-and-scope)
- [Day 4](https://github.com/r115/java-learning-with-derrick/tree/day-4-oop-class-methods)

To access the code;

```
git fetch

git checkout day-3-static-variables-and-scope
```