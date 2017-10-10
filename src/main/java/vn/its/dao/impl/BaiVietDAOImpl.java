package vn.its.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import vn.its.dao.BaiVietDAO;
import vn.its.model.BaiViet;

@Repository
public class BaiVietDAOImpl implements BaiVietDAO{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addBaiViet(BaiViet baiViet) {
		sessionFactory.getCurrentSession().saveOrUpdate(baiViet);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<BaiViet> getAllBaiViets() {
		return sessionFactory.getCurrentSession().createQuery("from BaiViet").list();
	}

	@Override
	public void deleteBaiViet(Integer maBV) {
		BaiViet baiViet = (BaiViet) sessionFactory.getCurrentSession().load(BaiViet.class, maBV);
		if (null != baiViet) {
			this.sessionFactory.getCurrentSession().delete(baiViet);
		}
	}

	@Override
	public BaiViet updateBaiViet(BaiViet baiViet) {
		sessionFactory.getCurrentSession().update(baiViet);
		return baiViet;
	}

	@Override
	public BaiViet getBaiViet(int maBV) {
		return sessionFactory.getCurrentSession().get(BaiViet.class, maBV);
	}

}
