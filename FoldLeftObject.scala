object FoldLeftObject extends App {

	// Get a list with random values from 1 to 5.
	// Add all values in the collection along with a given value and provide final response object. Traverse from left to right.
	val numbersList = List.range(1,5)

	// Option:1
	val responseValue = numbersList.foldLeft(5)(_+_)
	// Option:2
	val responseValue = numbersList.foldLeft(5)((result: Int, head: Int) => result + head)
	// Option:3
	// Use Function to add the values
	val addFunc = (a: Int, b:Int) => a + b
	val responseValue = numbersList.foldLeft(5)((result: Int, head: Int) => addFunc(result, head)

}
