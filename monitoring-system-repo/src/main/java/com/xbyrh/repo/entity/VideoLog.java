package com.xbyrh.repo.entity;

import java.util.Date;

public class VideoLog {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_log.id
     *
     * @mbggenerated Fri Apr 16 14:10:38 CST 2021
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_log.device_id
     *
     * @mbggenerated Fri Apr 16 14:10:38 CST 2021
     */
    private Long deviceId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_log.video_name
     *
     * @mbggenerated Fri Apr 16 14:10:38 CST 2021
     */
    private String videoName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_log.video_url
     *
     * @mbggenerated Fri Apr 16 14:10:38 CST 2021
     */
    private String videoUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_log.video_size
     *
     * @mbggenerated Fri Apr 16 14:10:38 CST 2021
     */
    private Integer videoSize;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_log.is_delete
     *
     * @mbggenerated Fri Apr 16 14:10:38 CST 2021
     */
    private Integer isDelete;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_log.create_time
     *
     * @mbggenerated Fri Apr 16 14:10:38 CST 2021
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_log.update_time
     *
     * @mbggenerated Fri Apr 16 14:10:38 CST 2021
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_log.id
     *
     * @return the value of video_log.id
     *
     * @mbggenerated Fri Apr 16 14:10:38 CST 2021
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_log.id
     *
     * @param id the value for video_log.id
     *
     * @mbggenerated Fri Apr 16 14:10:38 CST 2021
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_log.device_id
     *
     * @return the value of video_log.device_id
     *
     * @mbggenerated Fri Apr 16 14:10:38 CST 2021
     */
    public Long getDeviceId() {
        return deviceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_log.device_id
     *
     * @param deviceId the value for video_log.device_id
     *
     * @mbggenerated Fri Apr 16 14:10:38 CST 2021
     */
    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_log.video_name
     *
     * @return the value of video_log.video_name
     *
     * @mbggenerated Fri Apr 16 14:10:38 CST 2021
     */
    public String getVideoName() {
        return videoName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_log.video_name
     *
     * @param videoName the value for video_log.video_name
     *
     * @mbggenerated Fri Apr 16 14:10:38 CST 2021
     */
    public void setVideoName(String videoName) {
        this.videoName = videoName == null ? null : videoName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_log.video_url
     *
     * @return the value of video_log.video_url
     *
     * @mbggenerated Fri Apr 16 14:10:38 CST 2021
     */
    public String getVideoUrl() {
        return videoUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_log.video_url
     *
     * @param videoUrl the value for video_log.video_url
     *
     * @mbggenerated Fri Apr 16 14:10:38 CST 2021
     */
    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl == null ? null : videoUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_log.video_size
     *
     * @return the value of video_log.video_size
     *
     * @mbggenerated Fri Apr 16 14:10:38 CST 2021
     */
    public Integer getVideoSize() {
        return videoSize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_log.video_size
     *
     * @param videoSize the value for video_log.video_size
     *
     * @mbggenerated Fri Apr 16 14:10:38 CST 2021
     */
    public void setVideoSize(Integer videoSize) {
        this.videoSize = videoSize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_log.is_delete
     *
     * @return the value of video_log.is_delete
     *
     * @mbggenerated Fri Apr 16 14:10:38 CST 2021
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_log.is_delete
     *
     * @param isDelete the value for video_log.is_delete
     *
     * @mbggenerated Fri Apr 16 14:10:38 CST 2021
     */
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_log.create_time
     *
     * @return the value of video_log.create_time
     *
     * @mbggenerated Fri Apr 16 14:10:38 CST 2021
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_log.create_time
     *
     * @param createTime the value for video_log.create_time
     *
     * @mbggenerated Fri Apr 16 14:10:38 CST 2021
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_log.update_time
     *
     * @return the value of video_log.update_time
     *
     * @mbggenerated Fri Apr 16 14:10:38 CST 2021
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_log.update_time
     *
     * @param updateTime the value for video_log.update_time
     *
     * @mbggenerated Fri Apr 16 14:10:38 CST 2021
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}