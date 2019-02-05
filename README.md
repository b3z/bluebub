# bluebub library
A library for creating chat bubbles in JavaFX

### Requirements

+ JavaFX 11 or higher
+ Oracle JDK SE 8 or higher (in version 11 Oracle removed JavaFX from the JDK so get it manually)

### What can I do with it?

Create nice chatbubbles is all colors and styles.
![example picture](https://github.com/zeppelsoftware/bluebub/blob/master/bubble_example/bubble_example.png "chat example picture")

### How to use

Import the bluebub library to your JavaFX project.
The bubble object is from the type Group so it can be added as a node.

```Java
 Bubble bubble = new Bubble(int x, int y, String text, String meta);
```


A bubble is creted as an object with the following parameters.

`x` and `y` are the coordinates where the bubble is supposed to go on the screen.

`text` is the actual text in the bubble.

`meta` is the gray small text in the lower left corner which can be used to display either a time, a name or checks ...





