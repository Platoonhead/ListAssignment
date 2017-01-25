/*
Compute the length of a list using method foldRight. The signature of the method should

be:

def length[A](l: List[A]): Int

(Note: Do not use length method provided in the scala library)
*/

class ListLength{                                
  type A = Int
  def length[A](newList: List[A]): Int = {
    newList.foldRight(0) ( (_, c) => 1 + c ) // folding and counting

  }

}
object Q1 extends App{                          
  val nums : List[Int] = List(1,2,3,4,5,6,7,8)

   val x = new ListLength
 println("The length of the list is: " +x.length(nums))

}
