package com.gs.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import mybatis.core.annotation.Id;
import mybatis.core.annotation.Table;

/**
* 用户实体类
* @author guos
* @date 2021/02/02 21:44
*/
@Table(name = "user")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User implements Serializable {
    
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 382951535657297L;

    /**
     * 编号
     */
    @Id()
    private Integer id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 是否删除，0未删除，1已删除，默认0
     */
    private Byte isDel;

    /**
     * 创建人姓名
     */
    private String creator;

    /**
     * 修改人姓名
     */
    private String updater;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 最近一次修改时间
     */
    private Date updateTime;

    /**
     * 版本号
     */
    private Integer version;

    
    
    
    public static final String ID = "id";

    public static final String NAME = "name";

    public static final String PHONE = "phone";

    public static final String IS_DEL = "isDel";

    public static final String CREATOR = "creator";

    public static final String UPDATER = "updater";

    public static final String CREATE_TIME = "createTime";

    public static final String UPDATE_TIME = "updateTime";

    public static final String VERSION = "version";
}