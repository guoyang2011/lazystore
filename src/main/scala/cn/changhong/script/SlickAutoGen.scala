package cn.changhong.script

import scala.slick.codegen.SourceCodeGenerator

/**
 * Created by yangguo on 15-1-20.
 */
object SlickAutoGen {
  def main(args:Array[String]): Unit ={
    SourceCodeGenerator.main(Array(
      "scala.slick.driver.MySQLDriver",
      "com.mysql.jdbc.Driver",
      "jdbc:mysql://10.9.52.31:13306/appstore",
      "src/main/scala/",
      "cn.changhong.lazystore.persistent.Tables",
      "appdev",
      "appdev"
    ))
  }
}
