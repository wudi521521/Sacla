package scala.basic.chapter1

/**
 * @author Dillon Wu
 * @Description: $description
 * @date 2021/8/21 23:52
 */
class Student(name:String,age:Int){
  def printInfo(): Unit={
    println(name+" "+age+" "+Student.school)
  }
}
//引入伴生对象
object Student{
  val school: String ="学校"

  def main(args: Array[String]): Unit = {
      val alice =new Student("alice",1)
      val tom =new Student("alice",1)
    alice.printInfo()
    tom.printInfo()
  }
}
