package com.service.hellowordprovider.test;

import org.junit.BeforeClass;
import org.junit.Test;
import com.huawei.facedetect.test.dao.TestPeopleDao;
import com.huawei.facedetect.test.iml.*;
import com.huawei.facedetect.test.domian.TestPeopleModule;

public class TestPeople {

	static TestPeopleDao TestPeopleDao;

	@BeforeClass
	public static void beforeClass() {
		TestPeopleDao = new TestPeopleIml();
	}

	@Test
	public void tesPeople() {
		/*
		 * List<TestPeopleModule> people = TestPeopleDao.getAllPeople(); for
		 * (TestPeopleModule peoples : people) { System.out.println(peoples.getName());
		 * }
		 */
		TestPeopleDao.deleteSomePeople(6);
		TestPeopleModule testPeopleModule = new TestPeopleModule();
		testPeopleModule.setId(7);
		testPeopleModule.setName("haha");
		testPeopleModule.setSex('f');
		TestPeopleDao.insertSomePeople(testPeopleModule);
	}
}
