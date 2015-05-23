# selenium-tinafw-archetype
Maven Archetype for creating [selenium-tinafw](https://alb-i986.github.io/selenium-tinafw) projects.


## Usage

```
mvn archetype:generate -Dfilter=me.alb-i986.selenium:selenium-tinafw-archetype
```

Please see also [Maven Archetype Plugin Usage](http://maven.apache.org/archetype/maven-archetype-plugin/usage.html).


## Content provided

### Package layout
The directory structure, aka package layout, is as follows:

- config
- tests
- tasks
- ui

### Page objects
Some simple page objects are provided as example, modeling a web app which offers a `HomePage` and a `LoginPage`.

`MyBaseWebPage` is supposed to be the ancestor of all of the page classes, so that common behaviors, if any, can be shared, e.g. accessing the top nav bar.

### Tasks
One task is provided: `ImLoggedIn`.

### Tests
`MyTest` shows how a test class in `selenium-tinafw` should look like.

### Config
`MyConfig` shows how it is possible to add user-defined properties.

### Command-line mode
It is provided a command-line mode for running `RunnableTask`s. For example:

```
mvn clean compile exec:java -Dexec.args=runnableTaskMethodName
```

For more info please see the [javadoc of TaskRunner](https://github.com/alb-i986/selenium-tinafw-archetype/blob/master/src/main/resources/archetype-resources/src/main/java/TaskRunner.java).
