/*
println("hello world")

// Ints and Doubles
val x: Int = 202
var y: Double = 32.1293

// Strinsg
val name = "Jose"
val greet = s"Hello, $name"

// Tuples
val z = (1, 2.3, "hey", (2, 3.1, "hi"));

// Lists (immutable)
val evens = List(2, 4, 6, 8, 10)
val lists = List(List(2, 4, 6, 8, 10), List(1, 3, 5, 7, 9))

// Arrays (mutable)
val arr = Range(0, 10, 2)

// Sets (all unique elements)
val empty_set = Set("1", 2, "c") // immutable Set
val s = collection.mutable.Set(1, 2, 3) // mutable Set
List(1, 2, 3, 1, 2, 3, 2).toSet

// Maps
val new_map = Map(("a", x), ("c", y), ("b", 2)) // immutable by default
new_map("a")
// new_map("d") // throws error
new_map get "d" // returns None

val mut_map = collection.mutable.Map(("a", 1), ("c", 2), ("b", 3))
mut_map += ("d" -> 4) // must use -> operator here, otherwise throws error

new_map.keys
mut_map.values


import util.control.Breaks._

// For Loops
for (i <- Range(1, 21)) {
  if (i % 2 == 0) {
    println(i * 2)
  } else {
    println(i)
  }
}

var x: Int = 0

while (x < 5) {
  println(x)
  if (x == 4) break // must be imported! - see above
  x += 1
}

*/

// Functions
import util.control.Breaks._

def simple() : Unit = {
  println("a simple output")
}

def addInts(num1: Int, num2: Int): Int = {
  return num1 + num2
}

def sayHiTo(name: String): String = {
  return s"Hi, $name!"
}

def isEven(num: Int): Boolean = (num % 2 == 0)

def hasAnEven(nums: List[Int]): Boolean = nums.filter(isEven).length > 0

def sumLuckySeven(nums: List[Int]): Int = {
  var sum = 0
  for (num <- nums) {
    if (num == 7) sum += 14
    else sum += num
  }
  return sum
}

def isBalanced(nums: List[Int]): Boolean = {
  var isBalanced = false
  for (i <- Range(1, nums.length + 1)) {
    isBalanced = isBalanced || (nums.slice(0, i).sum == nums.slice(i, nums.length + 1).sum)
  }
  return isBalanced
}
