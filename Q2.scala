/*Implement a method hasSubsequence for checking whether a List contains another List as a

subsequence. For instance, List(1,2,3,4) would have List(1,2), List(2,3), and List(4) as

subsequences. The signature of the method should be:

def hasSubsequence[A](list:List[A],sub:List[A]):Boolean
*/
class SubSequence {

  type A = Boolean
  def hasSubSequence[A](list:List[A],sub:List[A]):Boolean = list.containsSlice(sub) // check for Slice if exist 
		
  }

  object Q2 extends App{

    val list: List[Int] = List(1,2,3,4,5)
    val subList : List[Int] = List(1,2,3)
    val subsequenceObj = new SubSequence
    println("Result = "+subsequenceObj.hasSubSequence(list, subList)) // invocation

  }
