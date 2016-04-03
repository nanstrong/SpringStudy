package spring.user.run;

import java.sql.SQLException;

import spring.user.dao.UserDao;
import spring.user.domain.User;

public class DaoTest  {
	
	public static void main(String [] args) throws ClassNotFoundException, SQLException{
		UserDao dao = new UserDao();
		
		User user = new User();
		user.setId("testId");
		user.setName("ȫ�浿");
		user.setPassword("test1234");
		
		dao.add(user);
		
		System.out.println(user.getId() + " ��� ����");
		
		User user2 = dao.get(user.getId());
		
		System.out.println(user2.getName());
		System.out.println(user2.getPassword());
		
		System.out.println(user2.getId() + " ��ȸ ����");
	}
}
