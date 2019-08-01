// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/ADMIN/git/dzweb/demo_play/conf/routes
// @DATE:Thu Aug 01 14:51:57 CEST 2019

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseJSONController JSONController = new controllers.ReverseJSONController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseStudentController StudentController = new controllers.ReverseStudentController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseJSONController JSONController = new controllers.javascript.ReverseJSONController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseStudentController StudentController = new controllers.javascript.ReverseStudentController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
  }

}
