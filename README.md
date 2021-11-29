# Demo interpreter

Demo is a didactic language for showcasing an interperter using the ANTLR 4 parser generator 
at the [2021/2022 Linguaggi di Programmazione](https://www.unibo.it/it/didattica/insegnamenti/insegnamento/2021/320579)
 (term 1) course @ [UniBo](https://www.unibo.it/en/). 

### Build and run

In this directory, run the following command to generate an `app.jar` file containing the interpreter:
```
$ gradle jar
```
The file is found in the `app/build/libs` directory.
To run the interpreter on a file, do:
```
$ java -jar app.jar "/path/to/the/input.demo"
```

### Some useful commands

Run the following command in this directory to compile the project:
```
$ gradle build
```

Run the following command into `app/build/classes/java/main/` to try out the grammar on user-supplied input:
```
$ grun com.demo.Demo equation -tokens -gui
<input>
^D
```

Run the following command to use the interpreter on a test file:
```
$ gradle run --args="/path/to/the/input.demo"
```
