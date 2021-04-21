package com.xbyrh.service.impl;

import com.xbyrh.common.context.AuthContext;
import com.xbyrh.common.exception.NotFoundException;
import com.xbyrh.repo.entity.*;
import com.xbyrh.repo.mapper.DeviceMapper;
import com.xbyrh.repo.model.bo.DeviceBO;
import com.xbyrh.service.IDeviceService;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * create at 2021/4/14
 *
 * @author chenxinhui
 */
@Service
public class DeviceServiceImpl implements IDeviceService {

    @Autowired
    private DeviceMapper deviceMapper;

    @Override
    public Device getDeviceById(Long id) {
        return deviceMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Device> getDevicesByIds(List<Long> idList) {
        DeviceExample example = new DeviceExample();
        example.createCriteria().andIdIn(idList).andIsDeleteEqualTo(0);

        return deviceMapper.selectByExample(example);
    }

    @Override
    public List<Device> getDevicesByUid(Long uid, String deviceName, Integer deviceType, Integer page, Integer limit) {
        DeviceExample example = new DeviceExample();

        DeviceExample.Criteria criteria = example.createCriteria();

        criteria.andUidEqualTo(uid);

        if (StringUtils.isNotBlank(deviceName)) {
            criteria.andDeviceNameLike(deviceName);
        }

        if (deviceType != null) {
            criteria.andDeviceTypeEqualTo(deviceType);
        }

        example.setLimit(limit);
        example.setOffset((page - 1) * limit);

        List<Device> deviceList = deviceMapper.selectByExample(example);

        if (CollectionUtils.isEmpty(deviceList)) {
            return new ArrayList<>();
        }

        return deviceList;
    }

    @Override
    public Long countByUserId(Long uid, String deviceName, Integer deviceType) {
        DeviceExample example = new DeviceExample();

        DeviceExample.Criteria criteria = example.createCriteria();

        criteria.andUidEqualTo(uid);

        if (StringUtils.isNotBlank(deviceName)) {
            criteria.andDeviceNameLike(deviceName);
        }

        if (deviceType != null) {
            criteria.andDeviceTypeEqualTo(deviceType);
        }

        return (long) deviceMapper.countByExample(example);
    }

    @Override
    public void save(DeviceBO deviceBO) {
        if (deviceBO.getId() != null) {
            update(deviceBO);
        }else{
            add(deviceBO);
        }
    }

    private void add(DeviceBO deviceBO){
        User user = AuthContext.getUser();

        Device device = new Device();

        device.setDeviceName(deviceBO.getDeviceName());
        device.setDeviceType(deviceBO.getDeviceType());
        device.setHttpFlvUrl(deviceBO.getHttpFlvUrl());
        device.setUid(deviceBO.getUid());
        device.setModifier(user.getUid());
        device.setCreator(user.getUid());

        deviceMapper.insertSelective(device);
    }

    private void update(DeviceBO deviceBO){
        User user = AuthContext.getUser();

        Device device = getDeviceById(deviceBO.getId());
        device.setDeviceName(deviceBO.getDeviceName());
        device.setDeviceType(deviceBO.getDeviceType());
        device.setHttpFlvUrl(deviceBO.getHttpFlvUrl());
        device.setUid(deviceBO.getUid());
        device.setModifier(user.getUid());

        deviceMapper.updateByPrimaryKey(device);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        Device device = deviceMapper.selectByPrimaryKey(id);
        if (device == null) {
            throw new NotFoundException("设备不存在！");
        }

        device.setIsDelete(1);
        deviceMapper.updateByPrimaryKey(device);
    }
}
