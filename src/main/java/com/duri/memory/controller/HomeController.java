package com.duri.memory.controller;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.duri.memory.domain.Board;
import com.duri.memory.service.NoticeService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	@Inject
	private NoticeService nservice;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "home";
	}

	@RequestMapping(value = "/notice", method = RequestMethod.GET)
	public String notice() {
		return "notice";
	}
	@RequestMapping(value = "/noticeList", method = {RequestMethod.GET, RequestMethod.POST})
	@ResponseBody
	public List<Map<String, Object>> noticeList() {
		List<Map<String, Object>> list = nservice.selectList();
		return list;
	}

}
