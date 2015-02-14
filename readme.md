# L-Systems in Scala and Processing

![acacia](https://github.com/hawkw/l-systems/blob/master/doc/acacia.png)

`sbt ~run` makes it happen. 

Clicking goes to the next iteration of the L-system. I advise you not iterate too deep into an L-system as it will probably make your computer melt.

I've included a number of L-system grammars, including some axial trees, a Pythagoras tree, a Sierpinski triangle, et cetera. Right now, which grammar it displays is hardcoded in `main.scala`. Eventually there will be a nicer way to select which grammar to draw, but for now you can modify that file. There's a comment explaining which line to modify.

Do note that while any grammar can theoretically be iterated infinitely, some of them (the ones that involve pushing or popping on the matrix stack) will eventually break Procelling. Part of me wants to move to a better graphics library eventually, especially since this would probably allow us to go deeper into many of the grammars.

![sierpinski](https://github.com/hawkw/l-systems/blob/master/doc/sierpinski-1.png)
![also sierpinski](https://github.com/hawkw/l-systems/blob/master/doc/sierpinski-2.png)
![still sierpinski](https://github.com/hawkw/l-systems/blob/master/doc/sierpinski-3.png)
![axial-tree-a](https://github.com/hawkw/l-systems/blob/master/doc/axial-a.png)
![axial-tree-b](https://github.com/hawkw/l-systems/blob/master/doc/axial-b.png)
![axial-tree-b](https://github.com/hawkw/l-systems/blob/master/doc/axial-b-2.png)