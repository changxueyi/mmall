package com.mmall.test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

/**
 * @ClassName TestBase
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/3/1 14:34
 */
@RunWith(SpringJUnit4ClassRunner.class)
@TransactionConfiguration(transactionManager = "transactionManager")
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public abstract class TestBase {
//public abstract class TestBase extends AbstractTransactionalJUnit4SpringContextTests {

}