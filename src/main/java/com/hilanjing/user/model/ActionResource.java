package com.hilanjing.user.model;

import javax.persistence.*;

@Table(name = "tab_resource")
public class ActionResource {
    /**
     * 资源编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 菜单名称
     */
    @Column(name = "resource_name")
    private String resourceName;

    /**
     * 权限的父级编号
     */
    @Column(name = "parent_id")
    private Integer parentId;

    /**
     * 连接地址
     */
    private String action;

    @Column(name = "node_type")
    private String nodeType;

    /**
     * 资源类型
     */
    @Column(name = "resource_type")
    private String resourceType;

    private String method;

    /**
     * 资源描述
     */
    @Column(name = "resource_desc")
    private String resourceDesc;

    /**
     * "0"表示禁用,"1"表示启用
     */
    private String status;

    @Column(name = "create_time")
    private Integer createTime;

    /**
     * 获取资源编号
     *
     * @return id - 资源编号
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置资源编号
     *
     * @param id 资源编号
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取菜单名称
     *
     * @return resource_name - 菜单名称
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     * 设置菜单名称
     *
     * @param resourceName 菜单名称
     */
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * 获取权限的父级编号
     *
     * @return parent_id - 权限的父级编号
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * 设置权限的父级编号
     *
     * @param parentId 权限的父级编号
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取连接地址
     *
     * @return action - 连接地址
     */
    public String getAction() {
        return action;
    }

    /**
     * 设置连接地址
     *
     * @param action 连接地址
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * @return node_type
     */
    public String getNodeType() {
        return nodeType;
    }

    /**
     * @param nodeType
     */
    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    /**
     * 获取资源类型
     *
     * @return resource_type - 资源类型
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * 设置资源类型
     *
     * @param resourceType 资源类型
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * @return method
     */
    public String getMethod() {
        return method;
    }

    /**
     * @param method
     */
    public void setMethod(String method) {
        this.method = method;
    }

    /**
     * 获取资源描述
     *
     * @return resource_desc - 资源描述
     */
    public String getResourceDesc() {
        return resourceDesc;
    }

    /**
     * 设置资源描述
     *
     * @param resourceDesc 资源描述
     */
    public void setResourceDesc(String resourceDesc) {
        this.resourceDesc = resourceDesc;
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