# codeguide
## Encapsulate What Changes
Encapsulate What Changes
## LSP(Liskov Substitution Principle)
LSP or Liskov Substitution Principle is a principle in OOP. It explains that **"functions that use references to the base classes must be able to use objects of derived class without knowing it"**. In a easy word, ```subclasses``` must be replace ```parent class``` perfectly. For example, Student class extends Person class the Student class must do everything that Student class can do.

  ```Person person = new Person("foo");
     Person student = new Student("foo");
     // Result must be true!
     person.getName().equal(student.getName);```
