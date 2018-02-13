package com.huawei.facedetect.test.dao;

import java.util.List;
import com.huawei.facedetect.test.domian.TestPeopleModule;

public interface TestPeopleDao {

	/* 获取所有people的信息 */
	public List<TestPeopleModule> getAllPeople();

	/* 根据条件删除某条people数据 */
	public void deleteSomePeople(int id);

	/* 增加一条people()数据 */
	public void insertSomePeople(TestPeopleModule testPeopleModule);
}
