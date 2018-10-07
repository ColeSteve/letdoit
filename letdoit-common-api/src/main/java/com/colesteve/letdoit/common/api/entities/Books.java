package com.colesteve.letdoit.common.api.entities;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@NoArgsConstructor
@Data
@Accessors(chain=true)
//必须进行序列化，否则mybatis加载找不到该实体类
public class Books implements Serializable{
	private static final long serialVersionUID = 1L;
	private String id ;//序列號
    private String bookName;//書名
    private String author;//作者
    private String url;//鏈接
    private String price;//價格
    
}
