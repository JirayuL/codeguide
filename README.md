# codeguide
## Encapsulate What Changes
**Encapsulation is used to hide the values or state of a structured data object inside a class, preventing unauthorized parties' direct access to them.** For example, in the `coinpurse` lab we try to encapsulate the `Purse class` and it related class so that when we modify we don't have to make many collection in input and output logic(`ConsoleDialog`).

```Java
//In ConsoleDialog class
Valuable[] valuable = purse.withdraw(amount);
```

From the example above, `ConsoleDialog` doesn't know how `Purse class` work. And even if we modify how we perform the withdrawal inside the `Purse class` (such as the withdrawal algorithm), we don't have to make any changes in the `ConsoleDialog`.

Exercise : [Click Here](https://github.com/JirayuL/codeguide/blob/master/src/codeguide/EncapsulateWhatChanges.java)

References : http://principles-wiki.net/principles:encapsulate_the_concept_that_varies
## LSP (Liskov Substitution Principle)
LSP or Liskov Substitution Principle is a principle in OOP. It explains that **"functions that use references to the base classes must be able to use objects of derived class without knowing it".** In simple words, any `subclass` must be able to substitute its `parent class` perfectly. For example, `Student`, inheriting from `Person`, must be able to do everything that `Student` can do.

```Java
Person person = new Person("foo");
Person student = new Student("foo");

// Result must be true!
person.getName().equals(student.getName());
```

From the example above, when `Student` is being known as a `Person` (substituting), `Person` it must be able to do whatever `Person` can do too.

Exercise : [Click Here](https://github.com/JirayuL/codeguide/blob/master/src/codeguide/LSP.java)

References : http://vitalflux.com/liskov-substitution-principle-with-java-code-examples/
