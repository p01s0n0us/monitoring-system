# 基于 SpringBoot 的视频实时监控系统的设计与实现

## 任务与要求
视频监控系统是安防领域中的研究热点，随着近年来各类智能设备数量的爆发性增长，视频监控系统正朝着数字化、智能化、网络化、人性化的方向发展。

本课题要求结合安全防御业务实际工作需求，围绕实时监控与网络传输的信息可视化目标，设计并实现一个基于 SpringBoot 的视频实时监控系统，能够链接到安防摄像头，并查看实时视频，对于所有的视频，可以按时间顺序保存数据并检索。

## 功能要求
1. 链接安防摄像头
2. 实时查看视频监控
3. 视频按时间顺序保存
4. 视频检索
5. 前端页面开发和后端服务开发

## 技术选型
### 后端
基于 SpringBoot 框架开发，分模块设计，使用基于贫血模型的传统开发模式。

#### 功能设计
1. 用户信息模块（用户信息管理）monitoring-system-user
2. 设备信息模块（设备信息管理）monitoring-system-device
2. 在线视频模块（在线播放）monitoring-system-online
3. 离线视频模块（离线播放）monitoring-system-offline

#### 模块设计


1. 存储模块，monitoring-system-repo
2. 服务模块，monitoring-system-service
3. Web 模块，monitoring-system-web
4. 公共模块，monitoring-system-common

##### 存储模块 monitoring-system-repo
> 提供例如数据库等底层数据的存取接口。用户信息、设备信息等拟采用 Mysql 数据库存取，视频数据采用本地文件系统存取。

##### 服务模块 monitoring-system-service
> 提供存储模块与 Web 模块交互的接口。

##### Web 模块 monitoring-system-web
> 提供与前端交互的接口。

##### 公共模块 monitoring-system-common
> 提供公共能力。

### 前端
 基于微信小程序，使用 Vant 组件库进行开发。