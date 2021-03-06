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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReplaceRoutesRequest  extends AbstractModel{

    /**
    * 路由表实例ID，例如：rtb-azd4dt1c。
    */
    @SerializedName("RouteTableId")
    @Expose
    private String RouteTableId;

    /**
    * 路由策略对象。需要指定路由策略ID（RouteId）。
    */
    @SerializedName("Routes")
    @Expose
    private Route [] Routes;

    /**
     * 获取路由表实例ID，例如：rtb-azd4dt1c。
     * @return RouteTableId 路由表实例ID，例如：rtb-azd4dt1c。
     */
    public String getRouteTableId() {
        return this.RouteTableId;
    }

    /**
     * 设置路由表实例ID，例如：rtb-azd4dt1c。
     * @param RouteTableId 路由表实例ID，例如：rtb-azd4dt1c。
     */
    public void setRouteTableId(String RouteTableId) {
        this.RouteTableId = RouteTableId;
    }

    /**
     * 获取路由策略对象。需要指定路由策略ID（RouteId）。
     * @return Routes 路由策略对象。需要指定路由策略ID（RouteId）。
     */
    public Route [] getRoutes() {
        return this.Routes;
    }

    /**
     * 设置路由策略对象。需要指定路由策略ID（RouteId）。
     * @param Routes 路由策略对象。需要指定路由策略ID（RouteId）。
     */
    public void setRoutes(Route [] Routes) {
        this.Routes = Routes;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RouteTableId", this.RouteTableId);
        this.setParamArrayObj(map, prefix + "Routes.", this.Routes);

    }
}

