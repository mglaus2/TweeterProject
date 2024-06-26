package edu.byu.cs.tweeter.model.net.response;

public class IsFollowerResponse extends Response {
    public boolean isFollower;

    public IsFollowerResponse(String message) {
    super(false, message);
  }

    public IsFollowerResponse(boolean isFollower) {
        super(true, null);
        this.isFollower = isFollower;
    }

  public boolean isFollower() {
    return isFollower;
  }
}
