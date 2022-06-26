# Assignment - Inheritance & Polymorphism

Please work out these tasks and upload them to your assignments space.

**Happy coding!**

1. Create a super class called **Car**. The **Car** class has the following fields and methods:
    1. `int speed`
    2. `double regularPrice`
    3. `String color`
    4. Method double `getSalePrice()` which returns `regularPrice`
2. Create a subclass of **Car** class and name it as **Truck**. The **Truck** class has the following fields and methods:
    1. `int weight`
    2. Method double `getSalePrice()` which returns `regularPrice` with 10% discount if the `weight` is more, then 2000, otherwise returns `regularPrice`.
3. Create a subclass of **Car** class and name it as **Ford**. The **Ford** class has the following fields and methods:
    1. `int year`
    2. `int manufacturerDiscount`
    3. Method double `getSalePrice()` which returns the sale price computed from **Car** class minus `manufacturerDiscount`.
4. Create a subclass of **Car** class and name it as **Sedan**. The **Sedan** class has the following fields and methods:
    1. `int length`
    2. Method double `getSalePrice()` which returns `regularPrice` with 5% discount if the length of car is more than 20, otherwise returns `regularPrice` with 10% discount.
5. Create **MyOwnAutoShop** class which contains the `main()` method. Perform the following within the `main()` method.
    1. Create an instance of **Sedan** class and initialize all the fields with appropriate values. Use `super(...)` method in the constructor for initializing the fields of the super class.
    2. Create two instances of the **Ford** class and initialize all the fields with appropriate values. Use `super(...)` method in the constructor for initializing the fields of the super class.
    3. Create an instance of **Car** class and initialize all the fields with appropriate values. Display sale prices of all instances.   