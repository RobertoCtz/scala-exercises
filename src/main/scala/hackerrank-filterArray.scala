/*
Filter a given array of integers and output only those values that are less than a specified value X. The output integers should be in the same sequence as they were in the input. You need to write a function with the recommended method signature for the languages mentioned below. For the rest of the languages, you have to write a complete code.

Input Format

The first line contains the delimiter X.
The next B lines each contain an integer, which represents the elements of the list/array. You have to read the input to the End-Of-File.

Output Format

Print all the integers from the array that are less than the given upper limit X in value on separate lines. The sequence should be the same as it was in the original array.


*/

object filterArray {
  def main(args: Array[String]): Unit = {

    def f(delim:Int,arr:List[Int]):List[AnyVal] =
         arr.filter(delim > _)
     println(f(3, 1::2::3::4::5::6::7::8::Nil))
  }
}
