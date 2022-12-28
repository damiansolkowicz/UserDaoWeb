package pl.coderslab.users;

public class test {
    public static void main(String[] args) {
    User user=new User();
    UserDao userDao=new UserDao();
    user.setPassword("khf");
    user.setUserName("kf@khssf.pl");
    user.setEmail("k@k.pl");
    userDao.create(user);
    }

}