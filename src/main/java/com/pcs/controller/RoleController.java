package com.pcs.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pcs.pojo.Role;
import com.pcs.service.IRoleService;

@Controller
@RequestMapping("/role")
public class RoleController {
	@Resource
	private IRoleService roleService;

	/**
	 * 获取单个角色信息
	 * 
	 * @param role
	 * @return
	 */
	@RequestMapping(value = "/selectByPrimaryKey.do", method = { RequestMethod.POST })
	public @ResponseBody Role selectByPrimaryKey(@RequestBody Role role) {
		return this.roleService.selectByPrimaryKey(role.getrId());
	}

	/**
	 * 删除单个角色信息
	 * 
	 * @param role
	 * @return
	 */
	@RequestMapping(value = "/deleteByPrimaryKey.do", method = { RequestMethod.POST })
	public @ResponseBody Integer deleteByPrimaryKey(@RequestBody Role role) {
		// 软删除
		return this.roleService.deleteByPrimaryKey(role.getrId());
	}

	/**
	 * 修改单个角色信息
	 * 
	 * @param role
	 * @return
	 */
	@RequestMapping(value = "/updateByPrimaryKey.do", method = { RequestMethod.POST })
	public @ResponseBody Integer updateByPrimaryKeySelective(@RequestBody Role role) {
		return this.roleService.updateByPrimaryKeySelective(role);
	}

	/**
	 * 添加单个角色信息
	 * 
	 * @param role
	 * @return
	 */
	@RequestMapping(value = "/insert.do", method = { RequestMethod.POST })
	public @ResponseBody Integer insertSelective(@RequestBody Role role) {
		return this.roleService.insertSelective(role);
	}

	/**
	 * 查找全部角色信息
	 */
	@RequestMapping("/findAll.do")
	public @ResponseBody List<Role> findAll() {
		return this.roleService.findAll();
	}

	/**
	 * 查找角色权限信息
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping("/selectRolePermission.do")
	public @ResponseBody List<Map<String, Object>> selectRolePermission() {
		List<Map<String, Object>> lm = new ArrayList<Map<String, Object>>();
		Set hs = new HashSet();
		List<Role> lr = this.roleService.selectRolePermission();
		for (Role role : lr) {
			hs.add(role.getrName()); // 获取所有角色信息
		}
		Iterator it = hs.iterator();
		while (it.hasNext()) {
			Map map = new HashMap();
			String rName = (String) it.next();
			for (Role role : lr) {
				if (rName.equals(role.getrName())) {
					map.put("rId", role.getrId());
					map.put("description", role.getDescription());
				}
			}
			map.put("rName", rName);

			List<Map<String, Object>> permissions = new ArrayList<>();
			for (Role role : lr) {
				if (rName.equals(role.getrName())) {
					Map m1 = new HashMap();
					m1.put("pId", role.getpId());
					m1.put("pName", role.getpName());
					m1.put("status", role.getStatus());
					permissions.add(m1);
				}
				map.put("permissions", permissions);
			}
			lm.add(map);
		}
		return lm;
	}
}