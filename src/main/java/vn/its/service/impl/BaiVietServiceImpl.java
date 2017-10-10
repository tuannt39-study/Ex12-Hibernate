package vn.its.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import vn.its.dao.BaiVietDAO;
import vn.its.model.BaiViet;
import vn.its.service.BaiVietService;

@Service
@Transactional
public class BaiVietServiceImpl implements BaiVietService{
	
	@Autowired
	private BaiVietDAO baiVietDAO;

	@Override
	@Transactional
	public boolean addBaiViet(BaiViet baiViet) {
		baiVietDAO.addBaiViet(baiViet);
		return true;
	}

	@Override
	@Transactional
	public List<BaiViet> getAllBaiViets() {
		return baiVietDAO.getAllBaiViets();
	}

	@Override
	@Transactional
	public void deleteBaiViet(Integer maBV) {
		baiVietDAO.deleteBaiViet(maBV);;
	}

	@Override
	@Transactional
	public BaiViet updateBaiViet(BaiViet baiViet) {
		return baiVietDAO.updateBaiViet(baiViet);
	}

	@Override
	public BaiViet getBaiViet(int maBV) {
		return baiVietDAO.getBaiViet(maBV);
	}

	public void setBaiVietDAO(BaiVietDAO baiVietDAO) {
		this.baiVietDAO = baiVietDAO;
	}

}
