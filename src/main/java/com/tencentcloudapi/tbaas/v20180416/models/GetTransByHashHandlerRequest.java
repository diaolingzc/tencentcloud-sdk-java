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
package com.tencentcloudapi.tbaas.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetTransByHashHandlerRequest  extends AbstractModel{

    /**
    * 模块名，固定字段：transaction
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 操作名，固定字段：get_trans_by_hash
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * 群组编号
    */
    @SerializedName("GroupPk")
    @Expose
    private String GroupPk;

    /**
    * 交易哈希
    */
    @SerializedName("TransHash")
    @Expose
    private String TransHash;

    /**
     * 获取模块名，固定字段：transaction
     * @return Module 模块名，固定字段：transaction
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * 设置模块名，固定字段：transaction
     * @param Module 模块名，固定字段：transaction
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * 获取操作名，固定字段：get_trans_by_hash
     * @return Operation 操作名，固定字段：get_trans_by_hash
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * 设置操作名，固定字段：get_trans_by_hash
     * @param Operation 操作名，固定字段：get_trans_by_hash
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * 获取群组编号
     * @return GroupPk 群组编号
     */
    public String getGroupPk() {
        return this.GroupPk;
    }

    /**
     * 设置群组编号
     * @param GroupPk 群组编号
     */
    public void setGroupPk(String GroupPk) {
        this.GroupPk = GroupPk;
    }

    /**
     * 获取交易哈希
     * @return TransHash 交易哈希
     */
    public String getTransHash() {
        return this.TransHash;
    }

    /**
     * 设置交易哈希
     * @param TransHash 交易哈希
     */
    public void setTransHash(String TransHash) {
        this.TransHash = TransHash;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "GroupPk", this.GroupPk);
        this.setParamSimple(map, prefix + "TransHash", this.TransHash);

    }
}

