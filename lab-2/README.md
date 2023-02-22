Context-Free Grammar
------------------

E -> E | Xor <br>
E -> Xor <br>

Xor -> Xor ^ And <br>
Xor -> And <br>

And -> And & Factor <br>
And -> Factor <br>

Factor -> Item <br>
Factor -> ! Item <br>

Item -> x <br>
Item -> (E) <br>


LL(1) Context-Free grammar
---------------

E -> Xor E' <br>
E' -> | Xor E' <br>
E' -> eps <br>

Xor -> And Xor' <br>
Xor' -> ^ And Xor' <br>
Xor' -> eps <br>

And -> Factor And' <br>
And' -> & Factor And' <br>
And' -> eps <br>

Factor -> Item <br>
Factor -> ! Item <br>

Item -> x <br>
Item -> (E) <br>


| Non-terminal | First     | Follow       |
| ------------ |:---------:|:------------:|
| E            | ! x (     | $ \)         |
| E'           | eps &#124; | $ \)       |
| Xor          | ! x (     | &#124; $ )   |
| Xor'         | eps ^     | &#124; $ )   |
| And          | ! x (     | ^ &#124; $ \)  |
| And'         | eps &     | ^ &#124; $ \)  |
| Factor       | ! x (     | & ^ &#124; $ \) |
| Item         | x (       | & ^ &#124; $ \) |