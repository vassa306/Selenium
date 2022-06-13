# Assignment - Design Patterns

Please work out these tasks and upload them to your assignments space.

**Happy coding!**

Your task is to create a virtual car factory using some basic design patterns (singleton, factory, builder, decorator).

1. Using proper Java class type, create a list of car brands and types that the Factory class will be able to produce. The cars and types will be:
    1. Ford - Mustang, GT, Mondeo
    2. Ferrari - F40, Enzo
    3. Porsche - Carrera, 911
2. Using proper Java class type, create a list of colors that cars can have. The colors will be following:
    1. Yellow
    2. Red
    3. Blue
    4. Gray
3. Implement the **Factory** class in a way that it uses a _singleton pattern_ and is able to build cars of particular brand, type and color.
4. Implement the **Car** class in a way that it uses a _builder pattern_.
5. Implement the **Warehouse** class in a way that it uses a _singleton pattern_ and is able to store built cars.
6. Using the _decorator pattern_, implement the **TuningCompany** class so that it can tune any of the built cars with a **Sports** or **Offroad** package. 
7. Using the **Start** class, use instances of all classes so that there are two cars of each brand and type built and stored in the warehouse. Print configurations (brand, type, color, package) of the cars stored in the warehouse into the console.
