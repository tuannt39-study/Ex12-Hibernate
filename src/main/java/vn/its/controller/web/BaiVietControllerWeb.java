package vn.its.controller.web;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import vn.its.model.BaiViet;
import vn.its.service.BaiVietService;

@Controller
public class BaiVietControllerWeb {
	
	public BaiVietControllerWeb() {
		System.out.println("BaiVietControllerWeb()");
	}
	
	@Autowired
	private BaiVietService baiVietService;
	
	@GetMapping("/baiviet")
	public ModelAndView listBaiViet(ModelAndView model) {
		List<BaiViet> listBaiViet = baiVietService.getAllBaiViets();
		model.addObject("listBaiViet", listBaiViet);
		model.setViewName("baiviet");
		return model;
	}
	
	@GetMapping("/baiviet/create")
	public ModelAndView createBaiViet(ModelAndView model) {
		BaiViet baiViet = new BaiViet();
		model.addObject("baiviet", baiViet);
		model.setViewName("baivietform");
		return model;
	}
	
	@PostMapping("/baiviet/save")
	public ModelAndView saveBaiViet(@ModelAttribute BaiViet baiViet) {
		if (baiViet.getMaBV() == 0) {
			baiVietService.addBaiViet(baiViet);
		} else {
			baiVietService.updateBaiViet(baiViet);
		}
		return new ModelAndView("redirect:/baiviet");
	}
	
	@GetMapping("/baiviet/delete")
	public ModelAndView deleteBaiViet(HttpServletRequest request) {
		int maBV = Integer.parseInt(request.getParameter("maBV"));
		baiVietService.deleteBaiViet(maBV);
		return new ModelAndView("redirect:/baiviet");
	}
	
	@GetMapping("/baiviet/update")
	public ModelAndView updateBaiViet(HttpServletRequest request) {
		int maBV = Integer.parseInt(request.getParameter("maBV"));
		BaiViet baiViet = baiVietService.getBaiViet(maBV);
		ModelAndView model = new ModelAndView("baivietform");
		model.addObject("baiviet", baiViet);
		return model;
	}
	
	@InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }

}
