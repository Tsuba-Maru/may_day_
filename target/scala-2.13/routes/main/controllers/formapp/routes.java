// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/tsubasa/IdeaProjects/may_day_/conf/routes
// @DATE:Tue Dec 17 11:48:45 JST 2019

package controllers.formapp;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.formapp.ReverseFormappController FormappController = new controllers.formapp.ReverseFormappController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.formapp.javascript.ReverseFormappController FormappController = new controllers.formapp.javascript.ReverseFormappController(RoutesPrefix.byNamePrefix());
  }

}
