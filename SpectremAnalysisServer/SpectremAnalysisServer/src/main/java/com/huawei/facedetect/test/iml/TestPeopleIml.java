package com.huawei.facedetect.test.iml;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;
import com.huawei.facedetect.test.dao.TestPeopleDao;
import com.huawei.facedetect.test.domian.TestPeopleModule;

public class TestPeopleIml implements TestPeopleDao {

	private ApplicationContext context = new ClassPathXmlApplicationContext(
			"classpath:META-INF/spring/cse.hellowordprovider.bean.xml");
	private SqlSessionFactory sqlSessionFactory = (SqlSessionFactory) context.getBean("sqlSessionFactory");
	private SqlSession session = sqlSessionFactory.openSession();
	TestPeopleDao peopleDao = session.getMapper(TestPeopleDao.class);

	@Override
	public List<TestPeopleModule> getAllPeople() {
		try {
			return peopleDao.getAllPeople();
		} finally {
			session.close();
		}
	}

	@Override
	public void deleteSomePeople(int id) {
		peopleDao.deleteSomePeople(id);
	}

	@Override
	@Transactional
	public void insertSomePeople(TestPeopleModule testPeopleModule) {
		peopleDao.insertSomePeople(testPeopleModule);
		// 抛出unchecked异常，触发事物，回滚
		throw new RuntimeException("1234");
	}

}
