# Kitchen helpers

## Story

Gordon Ramsay made up his mind, he wants to digitize his kitchen.
So he's trusted you with the task of modeling Hell’s kitchen.
Restaurants have cooks, one chef, and kitchen helpers.

!> This is a **guided project**, a regular project with a step-by-step guide
   (see the Background materials). To learn the most, try and implement a solution
   on your own first, and check the solution in the guide only when you feel
   your version is ready. However, if you feel completely stuck, feel free
   to check the guide for hints.

## What are you going to learn?

- Design a library.
- Use UMLs to communicate your design.
- Use `Optional<E>` to specify alternate values to return or alternate code.


## Tasks

1. Store the name, birth date, and salary of every employee.
    - Each of the listed attributes can be retrieved using getters.
    - Whenever an employee is printed, at least their name is displayed.
    - Every employee can print their own tax, which is the 99% of the salary.
    - There are three employee types, *chefs*, *cooks* and *kitchen helpers*.

2. *Chefs* and *cooks* can cook.
    - Chefs are either shouting or requesting ingredients.
    - Cooks always shout back that they are cooking. (So that the chef will leave them be.)

3. Kitchen helpers have ingredients.
    - The ingredients are the following.
- meat
- potato
- carrot
    - Helpers have a random number (0-3) of each ingredient at all times.

4. When the chef requests an ingredient, the kitchen helpers must provide it.
    - The first kitchen helper who has that ingredient gives the chef one piece.
    - If no kitchen helper has any, they yell "We're all out".

5. The restaurant provides good quality knife sets for cooks and chefs.
    - The knives are received some time after the employee is hired.
    - Cooks and chefs cannot cook without a knife.

6. Implement the role of the chef.
    - A kitchen has only one chef.
    - A kitchen cannot produce meals without a chef.

7. As an extra task, write unit tests for the different classes.
    - The cook class is covered with unit tests.
    - The chef class is covered with unit tests.
    - The kitchen helper class is covered with unit tests.
    - The kitchen class is covered with unit tests.

## General requirements

- There is a class UML representing the assignment. The UML is implemented. The code compiles. The UML contains the important parts. Containing every detail is not necessary. The implementation may diverge slightly from the original plan.

## Hints

- Take lots of notes. Even when something seems trivial at first, it can turn out to be more complex.
- Use diagrams (such as sequence diagrams and flow charts) to plan out scenarios.
- Handle exceptional cases with exceptions.
- Keep in mind that you can skip testing for exact numbers in the unit tests.
  For example, for KitchenHelper, you can test if the ingredients they have is less than four.

## Background materials

- [Creating objects](project/curriculum/materials/pages/java/creating-objects.md)
- [Methods](project/curriculum/materials/pages/java/methods.md)
- [OOP basics](project/curriculum/materials/pages/java/basics-of-object-oriented-programming.md)
- [OOP basics 2](project/curriculum/materials/pages/java/basics-of-object-oriented-programming-with-java-part-2.md)
- [Collections](project/curriculum/materials/competencies/java-data-structures/java-collections.md.html)
- [Abstraction, abstract classes and interfaces](project/curriculum/materials/pages/java/abstraction.md)
- [UML class diagrams](project/curriculum/materials/pages/general/uml-unified-modeling-language.md)
- [Other kind of UMLs](project/curriculum/materials/pages/general/uml-beyond-class-diagram.md)
- [Functional elements in Java](project/curriculum/materials/pages/java/functional-elements-in-java.md)
- [Exception handling](project/curriculum/materials/pages/java/exception-handling.md)
- [A step-by-step solution guide](project/curriculum/materials/pages/java/kitchen-helpers-step-by-step.md)

