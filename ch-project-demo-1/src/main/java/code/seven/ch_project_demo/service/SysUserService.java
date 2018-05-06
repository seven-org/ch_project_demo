/**
 * Copyright (c) 2015-2017 <a href="">caishigou</a> All rights reserved.
 */package code.seven.ch_project_demo.service;

import com.github.pagehelper.Page;

import code.seven.ch_project_demo.component.Pagenation;
import code.seven.ch_project_demo.entity.SysUser;

import java.util.List;

/**
 * createTime: 2018-05-05 17:58:46
 * @author seven
 * @version
 */
public interface SysUserService {

	/**
	 * query
	 * @param userId
	 * @return SysUser
	 */
	public SysUser get(String userId);

	/**
	 * query
	 * @param sysUser
	 * @return List<SysUser>
	 */
	public List<SysUser> findList(SysUser sysUser);

	/**
	 * query
	 * @param sysUser
	 * @return Page<SysUser>
	 */
	public Page<SysUser> findListByPage(SysUser sysUser, Pagenation pagenation);

	/**
	 * insert
	 * @param sysUser
	 * @return
	 */
	public Integer insert(SysUser sysUser);


	/**
	 * update
	 * @param sysUser
	 * @return
	 */
	public Integer update(SysUser sysUser);


	/**
	 * delete
	 * @param userId
	 * @return
	 */
	public Integer delete(String userId);



}
