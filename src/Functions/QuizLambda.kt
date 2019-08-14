package Functions

/*What is the difference between

val random1 = random()
val random2 = {random()}

Try it out in REPL or a file:

Correct: The second will generate a random number every time random2 is accessed.

random1 has a value assigned at compile time, and the value never changes when the variable is accessed.

random2 has a lambda assigned at compile time, and the lambda is executed every time the variable is referenced, returning a different value.

*/

/*
Practice Time: Lambdas

    Create a lambda and assign it to rollDice, which returns a dice roll (number between 1 and 12).
    Extend the lambda to take an argument indicating the number of sides of the dice used for the roll.
    If you haven't done so, fix the lambda to return 0 if the number of sides passed in is 0.
    Create a new variable, rollDice2, for this same lambda using the function type notation.

val rollDice = { Random().nextInt(12) + 1}

val rollDice = { sides: Int ->
    Random().nextInt(sides) + 1
}

val rollDice0 = { sides: Int ->
    if (sides == 0) 0
    else Random().nextInt(sides) + 1
}

val rollDice2: (Int) -> Int = { sides ->
    if (sides == 0) 0
    else Random().nextInt(sides) + 1
}

*/

/*
Practice Time: Extra Questions

    Why would you want to use the function type notation instead of just the lambda?
    Create a function gamePlay() that takes a roll of the dice as an argument and prints it out.
    Pass your rollDice2 function as an argument to gamePlay() to generate a dice roll every time gamePlay() is called.

Obs:. Function type notation is more readable, which reduces errors, clearly showing the what type is passed in and what type is returned.

gamePlay(rollDice2(4))
fun gamePlay(diceRoll: Int){
   // do something with the dice roll
   println(diceRoll)
}
*/

/*
* Practice Time

Write the beginnings of your own AMS - Animal Management System. Or maybe you would like to organize the goods in your refrigerator? Pick a topic that is fun for you, write a main function and at least two functions that manage an aspect of your care-taking routine.

Use default parameters, at least one lambda, and pass a function as a parameter.

* */