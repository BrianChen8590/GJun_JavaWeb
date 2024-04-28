package dao;

import model.Member;

/**
 * 會員管理
 */
public interface MemberDao {

	/**
	 * 新增會員
	 * 
	 * @param m
	 */
	void add(Member m);

	/**
	 * 讀取會員資料
	 * 
	 * @param username
	 * @param password
	 * @return
	 */
	Member selectMember(String username, String password);

	/**
	 * 會員是否存在
	 * 
	 * @param username
	 * @return
	 */
	boolean selectByUsername(String username);

	// update

	// delete

}
