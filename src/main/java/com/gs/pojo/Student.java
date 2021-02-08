package com.gs.pojo;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import mybatis.core.annotation.Id;
import mybatis.core.annotation.Table;

/**
* 实体类
* @author guos
* @date 2021/02/02 21:44
*/
@Table(name = "student")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student implements Serializable {
    
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 952264797925692L;

    /**
     * 
     */
    @Id()
    private String id;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private Integer age;

    
    
    
    public static final String ID = "id";

    public static final String NAME = "name";

    public static final String AGE = "age";
}