# Demo interpreter

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