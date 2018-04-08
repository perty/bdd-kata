# BDD kata
A BDD Kata using Cucumber. BDD is sometimes referred to as Specification by Example.

Cucumber is an implementation of the Gherkin language for specification. It also known as "given-when-then" as this
makes the structure of a specification element. See [Resources](#Resources) below for more information on the language.

Cucumber executes the specification and with the help of your glue code, it can interface with the system under test.
Glue code is here referred to as "step definitions". Your IDE should understand this and help you with navigation 
from specification to step definitions. Also, it will help you write new step definitions when you add to the 
specification. 

# Instructions

1. Read the [Requirements document](Requirements.md).
1. Build using Maven. The build should be successful.
1. Read the first specification in [general.feature](src/test/resources/specification/general.feature).
Control-click on a line to find the steps definition, the glue code.
1. Add scenarios for all requirements.
1. Run the [RunCucumberTest](src/test/java/RunCucumberTest.java) with coverage and see if you cover all code.
1. Throw away the legacy implementation and rewrite it from scratch. All specifications should stay the same.
1. Add scenarios for the new requirement, "Conjured". 
1. Implement the new requirement.

# Resources

1. [Cucumber documentation](https://cucumber.io/docs)
1. [Gherkin reference](https://cucumber.io/docs/reference) 
1. [Specification by Example, the book](https://gojko.net/books/specification-by-example/)

# Credit

This kata is based on the GildedRose kata by Terry Hughes. 
See end of the [Requirements document](Requirements.md) for more info.
