/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.organization.v20181225.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OrgNode  extends AbstractModel{

    /**
    * 组织单元ID
    */
    @SerializedName("NodeId")
    @Expose
    private Long NodeId;

    /**
    * 名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 父单元ID
    */
    @SerializedName("ParentNodeId")
    @Expose
    private Long ParentNodeId;

    /**
    * 成员数量
    */
    @SerializedName("MemberCount")
    @Expose
    private Long MemberCount;

    /**
     * 获取组织单元ID
     * @return NodeId 组织单元ID
     */
    public Long getNodeId() {
        return this.NodeId;
    }

    /**
     * 设置组织单元ID
     * @param NodeId 组织单元ID
     */
    public void setNodeId(Long NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * 获取名称
     * @return Name 名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置名称
     * @param Name 名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取父单元ID
     * @return ParentNodeId 父单元ID
     */
    public Long getParentNodeId() {
        return this.ParentNodeId;
    }

    /**
     * 设置父单元ID
     * @param ParentNodeId 父单元ID
     */
    public void setParentNodeId(Long ParentNodeId) {
        this.ParentNodeId = ParentNodeId;
    }

    /**
     * 获取成员数量
     * @return MemberCount 成员数量
     */
    public Long getMemberCount() {
        return this.MemberCount;
    }

    /**
     * 设置成员数量
     * @param MemberCount 成员数量
     */
    public void setMemberCount(Long MemberCount) {
        this.MemberCount = MemberCount;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ParentNodeId", this.ParentNodeId);
        this.setParamSimple(map, prefix + "MemberCount", this.MemberCount);

    }
}

