// Flow control

// If / else:
if (1 > 3) println("Impossible!") else println("The world makes sense.")

if (1 > 3) {
  println("Impossible!")
  println("Really?")
} else {
  println("The world makes sense.")
  println("still.")
}

// Matching
val number = 2
number match {
  case 1 => println("One")
  case 2 => println("Two")
  case 3 => println("Three")
  case _ => println("Something else")
}

for (x <- 1 to 4) {
  val squared = x * x
  println(squared)
}

var x = 10
while (x >= 0) {
  println(x)
  x -= 1
}


do {
  println(x); x += 1
} while (x <= 10)

// Expressions

{
  val x = 10; x + 20
}

println({
  val x = 10; x + 20
})

// EXERCISE
// Write some code that prints out the first 10 values of the Fibonacci sequence.
// This is the sequence where every number is the sum of the two numbers before it.
// So, the result should be 0, 1, 1, 2, 3, 5, 8, 13, 21, 34


//just a simple code basic
val n : Int = 10
var first: Int = 0
var second: Int = 1
var amount: Int = 0
var index: Int = 0

while (index < n) {
  println(first)
  amount = first + second
  first = second
  second = amount
  index = index + 1
}