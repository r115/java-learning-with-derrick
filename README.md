Introduction to Java: Static Variables and Scoping
---
Static variables are always available when the class is initialized.

If the static variable is not declared as final, the values can be reassigned.

`public static int exchangeRate = 116;`

Like any other Java variable, the `final` modifier prevents alteration once class is instantiated.

`public final static int commissionAsPercentage = 2;`

Variable scopes goes is affected in 2 main ways;
 - access modifier `protected`, `public`, `private`
 - class variables: accessible directly to all class members
 - local variables: usually defined within a method and are restricted there.

Recommended reading
----
- https://www.geeksforgeeks.org/variable-scope-in-java/?ref=lbp
- https://www.baeldung.com/java-variable-scope

Codewars
---