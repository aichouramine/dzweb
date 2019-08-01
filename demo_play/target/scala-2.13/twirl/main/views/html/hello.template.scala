
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object hello extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(name: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.16*/("""
"""),_display_(/*2.2*/main("Hello")/*2.15*/ {_display_(Seq[Any](format.raw/*2.17*/("""
  """),format.raw/*3.3*/("""<section id="top">
  <div class="wrapper">
      <h1>Hello """),_display_(/*5.18*/name),format.raw/*5.22*/("""!</h1>
  </div>
  </section>
""")))}),format.raw/*8.2*/("""
"""),format.raw/*9.24*/("""
"""))
      }
    }
  }

  def render(name:String): play.twirl.api.HtmlFormat.Appendable = apply(name)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (name) => apply(name)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-07-31T00:39:03.840
                  SOURCE: C:/Users/ADMIN/Documents/NetBeansProjects/PLAY_PROJECTS/demo_play/app/views/hello.scala.html
                  HASH: 87ec2f69e580abf72b7aa9745d57ea55bbdba633
                  MATRIX: 948->1|1057->15|1085->18|1106->31|1145->33|1175->37|1263->99|1287->103|1349->136|1378->161
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|37->5|37->5|40->8|41->9
                  -- GENERATED --
              */
          