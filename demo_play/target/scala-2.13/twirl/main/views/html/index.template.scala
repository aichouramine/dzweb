
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),format.raw/*3.1*/("""<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet" href=""""),_display_(/*12.31*/routes/*12.37*/.Assets.versioned("bower_components/bootstrap/dist/css/bootstrap.min.css")),format.raw/*12.111*/("""">

<title>Play Framework</title>

</head>
<body>
	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="collapsed navbar-toggle"
					data-toggle="collapse" data-target="#bs-example-navbar-collapse-9"
					aria-expanded="false">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a href="#" class="navbar-brand">Play</a>
			</div>
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-9">
				<ul class="nav navbar-nav">
					<li class="active"><a href="#">Accueil</a></li>
					<li><a href="#">About</a></li>
					<li><a href="#">Contact</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<div class="container">
		<h3>Play Framework</h3>
		<p>RATP-INGIMA-ALGOPTIS.</p>
	</div>

	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src=""""),_display_(/*48.16*/routes/*48.22*/.Assets.versioned("bower_components/jquery/dist/jquery.slim.min.js")),format.raw/*48.90*/(""""></script>
	<script src=""""),_display_(/*49.16*/routes/*49.22*/.Assets.versioned("bower_components/bootstrap/dist/js/bootstrap.min.js")),format.raw/*49.94*/(""""></script>
</body>
</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-07-31T16:32:52.360
                  SOURCE: C:/Users/ADMIN/Documents/NetBeansProjects/PLAY_PROJECTS/demo_play/app/views/index.scala.html
                  HASH: 74ff75d29382e37b16f3490ca1c1a4d39f37d35e
                  MATRIX: 941->1|1037->3|1067->7|1336->249|1351->255|1447->329|2516->1371|2531->1377|2620->1445|2675->1473|2690->1479|2783->1551
                  LINES: 28->1|33->1|35->3|44->12|44->12|44->12|80->48|80->48|80->48|81->49|81->49|81->49
                  -- GENERATED --
              */
          