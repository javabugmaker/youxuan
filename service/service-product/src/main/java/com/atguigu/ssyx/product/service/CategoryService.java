package com.atyouxuan.yx.product.service;

import com.atyouxuan.yx.model.product.Category;
import com.atyouxuan.yx.vo.product.CategoryQueryVo;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 商品三级分类 服务类
 * </p>
 *
 * @author atyouxuan
 * @since 2023-04-04
 */
public interface CategoryService extends IService<Category> {

    //商品分类列表
    IPage<Category> selectPageCategory(Page<Category> pageParam, CategoryQueryVo categoryQueryVo);
}
