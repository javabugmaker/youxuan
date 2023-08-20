package com.atyouxuan.yx.acl.service.impl;

import com.atyouxuan.yx.acl.mapper.AdminRoleMapper;
import com.atyouxuan.yx.acl.service.AdminRoleService;
import com.atyouxuan.yx.model.acl.AdminRole;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class AdminRoleServiceImpl extends ServiceImpl<AdminRoleMapper, AdminRole> implements AdminRoleService {
}
