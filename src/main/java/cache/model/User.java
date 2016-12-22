package cache.model;

/**
 * Created by scott on 2016/12/21.
 */
public class User {
  private Long userId;
  private String userNo;
  private String userName;
  private String password;
  private String remark;

  public User() {

  }

  public User(String userNo, String remark) {
    this.userNo = userNo;
    this.remark = remark;
  }

  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public String getUserNo() {
    return userNo;
  }

  public void setUserNo(String userNo) {
    this.userNo = userNo;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }
}
