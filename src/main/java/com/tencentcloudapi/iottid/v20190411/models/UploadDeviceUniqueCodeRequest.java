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
package com.tencentcloudapi.iottid.v20190411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UploadDeviceUniqueCodeRequest  extends AbstractModel{

    /**
    * 硬件唯一标识码
    */
    @SerializedName("CodeSet")
    @Expose
    private String [] CodeSet;

    /**
    * 硬件标识码绑定的申请编号
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
     * 获取硬件唯一标识码
     * @return CodeSet 硬件唯一标识码
     */
    public String [] getCodeSet() {
        return this.CodeSet;
    }

    /**
     * 设置硬件唯一标识码
     * @param CodeSet 硬件唯一标识码
     */
    public void setCodeSet(String [] CodeSet) {
        this.CodeSet = CodeSet;
    }

    /**
     * 获取硬件标识码绑定的申请编号
     * @return OrderId 硬件标识码绑定的申请编号
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * 设置硬件标识码绑定的申请编号
     * @param OrderId 硬件标识码绑定的申请编号
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "CodeSet.", this.CodeSet);
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);

    }
}

