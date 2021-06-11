// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/tsubasa/may_day_/conf/routes
// @DATE:Mon Jan 27 16:52:02 JST 2020

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseDefault Default = new controllers.ReverseDefault(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseMotherListController MotherListController = new controllers.ReverseMotherListController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseUserController UserController = new controllers.ReverseUserController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseTaskController TaskController = new controllers.ReverseTaskController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseDefault Default = new controllers.javascript.ReverseDefault(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseMotherListController MotherListController = new controllers.javascript.ReverseMotherListController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseUserController UserController = new controllers.javascript.ReverseUserController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseTaskController TaskController = new controllers.javascript.ReverseTaskController(RoutesPrefix.byNamePrefix());
  }

}
