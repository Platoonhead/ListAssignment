/*
Write a function that splits a list elements into a pair of lists on the basis of given boolean

function. The signature of the method should be:

def splitList[A](l:List[A],f:A=>Boolean):(List[A],List[B])

(Note: Do not use method filter provided in the library)
*/
class ListPart{
       
        type A = Int
        type B = Any
        def splitList[A](l:List[A],f:A=>Boolean):(List[A],List[B]) = {

	   val l1 = for {
                         iterator <- l
                         if(f(iterator) == true)       //list of multipals of 5
                        }yield iterator
	   val l2  = for {
                         iterator <- l
                         if(f(iterator) == false)        //list of NON multipals of 5     
                        }yield iterator
     	(l1,l2)	 
        }       

}

object Q4 extends App{
	val list1= List(20,1,2,4,6,10,30,25,92)
	val listobj = new ListPart
        println(listobj.splitList(list1, (x:Int)=> (x%5 == 0)))  // calculate mutiple of 5
	
}
