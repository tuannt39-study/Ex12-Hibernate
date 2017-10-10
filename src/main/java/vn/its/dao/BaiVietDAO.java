package vn.its.dao;

import java.util.List;

import vn.its.model.BaiViet;

public interface BaiVietDAO {

	public void addBaiViet(BaiViet baiViet);

	public List<BaiViet> getAllBaiViets();

	public void deleteBaiViet(Integer maBV);

	public BaiViet updateBaiViet(BaiViet baiViet);

	public BaiViet getBaiViet(int maBV);

}
