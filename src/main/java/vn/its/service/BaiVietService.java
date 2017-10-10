package vn.its.service;

import java.util.List;

import vn.its.model.BaiViet;

public interface BaiVietService {

	public boolean addBaiViet(BaiViet baiViet);

	public List<BaiViet> getAllBaiViets();

	public void deleteBaiViet(Integer maBV);

	public BaiViet updateBaiViet(BaiViet baiViet);

	public BaiViet getBaiViet(int maBV);
	
}
