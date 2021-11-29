# Demo interpreter
Demo is a didactic language for showcasing an interperter at the [2021/2022 Linguaggi di Programmazione](https://www.unibo.it/it/didattica/insegnamenti/insegnamento/2021/320579) (term 1) course @ [UniBo](https://www.unibo.it/en/). 


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

Run the following command to use the interpreter:
```
$ gradle run --args="/path/to/the/input.demo"
```
