package com.hilanjing.user.model;

import javax.persistence.*;

@Table(name = "tab_role_info")
public class RoleInfo {
    /**
     * 角色编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 创建人
     */
    @Column(name = "create_user_id")
    private Integer createUserId;

    @Column(name = "role_name")
    private String roleName;

    /**
     * "0"表示禁用,"1"表示启用
     */
    private String status;

    @Column(name = "create_time")
    private Integer createTime;

    /**
     * 获取角色编号
     *
     * @return id - 角色编号
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置角色编号
     *
     * @param id 角色编号
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取创建人
     *
     * @return create_user_id - 创建人
     */
    public Integer getCreateUserId() {
        return createUserId;
    }

    /**
     * 设置创建人
     *
     * @param createUserId 创建人
     */
    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * @return role_name
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * @param roleName
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * 获取"0"表示禁用,"1"表示启用
     *
     * @return status - "0"表示禁用,"1"表示启用
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置"0"表示禁用,"1"表示启用
     *
     * @param status "0"表示禁用,"1"表示启用
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return create_time
     */
    public Integer getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }
}