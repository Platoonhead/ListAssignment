/*
Write a function that concatenates a list of lists into a single list. Its runtime should be

linear in the total length of all lists. The signature of the method should be:

def concateList[A](l1:List[A],l2:List[A]):List[A]
 
any provided methods as solutions)
*/
class ListConcatenate{
       
        type A = Int
	def concateList[A](l1:List[A],l2:List[A]):List[A]={

          if(!l2.isEmpty)
          concateList(l1 :+ l2.head , l2.tail)      //recursive call with fetching heading everytime

	} 

}

object Q3 extends App{
	val list1 = List(1,2,3)
	val list2 = List(4,5,6)
	val listobj = new ListConcatenate
	println(listobj.concateList(list1, list2))	//invocation

}
