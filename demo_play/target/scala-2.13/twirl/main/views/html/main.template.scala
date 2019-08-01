
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.32*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">

<head>
    <title>"""),_display_(/*13.13*/title),format.raw/*13.18*/("""</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" media="screen" href='"""),_display_(/*15.50*/routes/*15.56*/.Assets.versioned("stylesheets/main.css")),format.raw/*15.97*/("""'>
    <link rel="shortcut icon" type="image/png" href='"""),_display_(/*16.55*/routes/*16.61*/.Assets.versioned("images/favicon.png")),format.raw/*16.100*/("""'>
	"""),format.raw/*17.21*/("""
	"""),format.raw/*18.2*/("""<link rel="stylesheet" href=""""),_display_(/*18.32*/routes/*18.38*/.Assets.versioned("bower_components/bootstrap/dist/css/bootstrap.min.css")),format.raw/*18.112*/("""">

</head>

<body>
    """),_display_(/*23.6*/content),format.raw/*23.13*/("""
    
    """),format.raw/*25.30*/("""
	"""),format.raw/*26.55*/("""
	"""),format.raw/*27.2*/("""<script src=""""),_display_(/*27.16*/routes/*27.22*/.Assets.versioned("bower_components/jquery/dist/jquery.slim.min.js")),format.raw/*27.90*/(""""></script>
	<script src=""""),_display_(/*28.16*/routes/*28.22*/.Assets.versioned("bower_components/popper/popper.min.js")),format.raw/*28.80*/(""""></script>
	<script src=""""),_display_(/*29.16*/routes/*29.22*/.Assets.versioned("bower_components/bootstrap/dist/js/bootstrap.min.js")),format.raw/*29.94*/(""""></script>
    
</body>

</html>"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-08-01T14:45:48.919
                  SOURCE: C:/Users/ADMIN/git/dzweb/demo_play/app/views/main.scala.html
                  HASH: 0e27bc057234f4cb6f88da17c27d9fee997555b8
                  MATRIX: 1211->266|1336->296|1366->300|1450->357|1476->362|1638->497|1653->503|1715->544|1800->602|1815->608|1876->647|1909->671|1939->674|1996->704|2011->710|2107->784|2163->814|2191->821|2231->858|2262->914|2292->917|2333->931|2348->937|2437->1005|2492->1033|2507->1039|2586->1097|2641->1125|2656->1131|2749->1203
                  LINES: 33->7|38->7|40->9|44->13|44->13|46->15|46->15|46->15|47->16|47->16|47->16|48->17|49->18|49->18|49->18|49->18|54->23|54->23|56->25|57->26|58->27|58->27|58->27|58->27|59->28|59->28|59->28|60->29|60->29|60->29
                  -- GENERATED --
              */
          