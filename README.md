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
##### Run a test case with everything but some number of specific methods:
- Add body to class tag to exclude a certain method:
```xml
<class name="com.testng.tutorial.TestNgPriority2">
    <methods>
        <exclude name="ApiLoginBreck" />
    </methods>
</class>
```
- Or include only a certain method:
```xml
<class name="com.testng.tutorial.TestNGBasics">
    <methods>
        <include name="Demo" />
    </methods>
</class>
```

## Executing test cases at package level with regex

- What if you want to exclue (or include) all test methods that include "Mobile" in its name?
```xml
<class name="com.testng.tutorial.TestNgPriority2">
    <methods>
        <exclude name="Api.*" />
    </methods>
</class>
```
- What is regex?
    - A regular expression, regex or regexp is a sequence of characters that define a search pattern. Usually such patterns are used by string searching algorithms for "find" or "find and replace" operations on strings, or for input validation.
- Run by package (in my case, com.testng.tutorial)
    - Remove all classes, replace with:
    ```xml
    <package name="com.testng.tutorial" />
    ```
    - This will run every test in the package
    - Useful for running a regression test


