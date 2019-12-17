// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/tsubasa/IdeaProjects/may_day_/conf/routes
// @DATE:Tue Dec 17 11:48:45 JST 2019

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseTodoListController TodoListController = new controllers.ReverseTodoListController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseUserController UserController = new controllers.ReverseUserController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseDefault Default = new controllers.ReverseDefault(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseTodoListController TodoListController = new controllers.javascript.ReverseTodoListController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseUserController UserController = new controllers.javascript.ReverseUserController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseDefault Default = new controllers.javascript.ReverseDefault(RoutesPrefix.byNamePrefix());
  }

}
