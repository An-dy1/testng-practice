# Notes

- When Rahul runs his @Test, it shows PASSED: [method name], but I don't get that in mine
- TestNG is incorporated in IntelliJ and doesn't require download - just have to include in pom.xml if Maven project
- One class can incorporate several test classes using @Test annotation

## Required to run tests with TestNG?

- Must have @Test annotation
- Followed by method(s)
- Can have several @Test annotations in one class

## TestNG.xml file

- Triggers run
- Whereas Eclipse can auto-generate a TestNG.xml file, IntelliJ doesn't have that feature, so I added a template in my IntelliJ setup
- Read about it in the documentation: https://testng.org/doc/documentation-main.html#testng-xml
- XML hierarcy:
    - Test Suite <suite> > Test Folder <test> (shell/module) > Test Cases <classes> <class>
    - <class /> is self-closing
- To run all test cases in a module/package: run testng.xml file

## Prioritizing test cases

- TestNgPriority1 and 2 classes
- Could potentially just comment out the test cases in your testng.xml file


