package edu.byu.cs.tweeter.server.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import edu.byu.cs.tweeter.model.net.request.LogoutRequest;
import edu.byu.cs.tweeter.model.net.response.LogoutResponse;
import edu.byu.cs.tweeter.server.dao.dynamoDB.DAOFactory;
import edu.byu.cs.tweeter.server.dao.dynamoDB.DAOFactoryInterface;
import edu.byu.cs.tweeter.server.service.UserService;

public class LogoutHandler implements RequestHandler<LogoutRequest, LogoutResponse> {
  @Override
  public LogoutResponse handleRequest(LogoutRequest request, Context context) {
      DAOFactoryInterface daoFactory = new DAOFactory();
      UserService userService = new UserService(daoFactory);
      return userService.logout(request);
  }
}
