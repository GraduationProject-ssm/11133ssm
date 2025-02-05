package com.entity.view;

import com.entity.TiwenshangbaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 体温上报
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-07 10:44:16
 */
@TableName("tiwenshangbao")
public class TiwenshangbaoView  extends TiwenshangbaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TiwenshangbaoView(){
	}
 
 	public TiwenshangbaoView(TiwenshangbaoEntity tiwenshangbaoEntity){
 	try {
			BeanUtils.copyProperties(this, tiwenshangbaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
