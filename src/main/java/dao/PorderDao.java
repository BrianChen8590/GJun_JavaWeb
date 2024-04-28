package dao;

import java.util.List;

import model.Porder;

/**
 * 訂單管理
 */
public interface PorderDao {

	/**
	 * 新增訂單
	 * 
	 * @param p
	 */
	void add(Porder p);

	/**
	 * 查詢所有訂單
	 * 
	 * @return
	 */
	List<Porder> selectAll();

	/**
	 * 查詢訂單
	 * 
	 * @param id
	 * @return
	 */
	Porder selectById(int id);

	/**
	 * 更新訂單
	 * 
	 * @param p
	 */
	void update(Porder p);

	/**
	 * 刪除訂單
	 * 
	 * @param id
	 */
	void deleteById(int id);

}
