package com.zhilyou100.service.impl;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zhiyou100.model.Tea;
import com.zhiyou100.service.TeaService;
import com.zhiyou100.vo.SimilarityVO;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-service.xml", "classpath:spring/spring-dao.xml"})
public class TeaServiceImplTest {

	@Autowired
	private TeaService service;
	@Test
	public void testListTea() {
		fail("尚未实现");
	}

	@Test
	public void testSaveTea() {
		Tea tea = new Tea();
		tea.setColour(0.8f);
		tea.setFragrance(0.6f);
		tea.setLeaf(0.8f);
		tea.setMatching(0.7f);
		tea.setNeatness(0.5f);
		tea.setShape(0.4f);
		tea.setTaste(0.7f);
		SimilarityVO similarityVO = service.saveTea(tea);
		System.out.println(similarityVO);
		System.out.println(tea);
	}

}
