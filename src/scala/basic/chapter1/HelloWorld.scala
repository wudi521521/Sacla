package scala.basic.chapter1

/**
 * @author Dillon Wu
 * @Description: Object：关键字，声明全局一个实例
 * @date 2021/8/21 23:10
 */
object HelloWorld {
  /**
   * main 方法:从外部可以直接调用执行的方法(伴生对象)
   * def 方法名称(参数名称：参数类型)：返回值类型={方法体}
   * @param args
   */
  def main(args: Array[String]): Unit = {
    //scala代码
    println("Hello World")
    //java 代码
    System.out.println("Hello World")
  }
}
