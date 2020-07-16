package io.choerodon.asgard.api.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import org.hzero.starter.keyencrypt.core.Encrypt;

import java.util.Date;
import java.util.Objects;

public class SagaTaskInstanceInfo {
    @Encrypt
    @ApiModelProperty(value = "主键ID")
    private Long id;

    @Encrypt
    @ApiModelProperty(value = "Saga实例ID")
    private Long sagaInstanceId;

    @ApiModelProperty(value = "所属sagatask实例")
    private String taskInstanceCode;

    @ApiModelProperty(value = "所属saga实例")
    private String sagaInstanceCode;

    @ApiModelProperty(value = "描述")
    private String description;

    @ApiModelProperty(value = "状态")
    private String status;

    @ApiModelProperty(value = "最大重试次数")
    private Integer maxRetryCount;

    @ApiModelProperty(value = "已重试次数")
    private Integer retriedCount;

    @ApiModelProperty(value = "计划开始时间")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date plannedStartTime;

    @ApiModelProperty(value = "实际开始时间")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date actualEndTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSagaInstanceId() {
        return sagaInstanceId;
    }

    public void setSagaInstanceId(Long sagaInstanceId) {
        this.sagaInstanceId = sagaInstanceId;
    }

    public String getTaskInstanceCode() {
        return taskInstanceCode;
    }

    public void setTaskInstanceCode(String taskInstanceCode) {
        this.taskInstanceCode = taskInstanceCode;
    }

    public String getSagaInstanceCode() {
        return sagaInstanceCode;
    }

    public void setSagaInstanceCode(String sagaInstanceCode) {
        this.sagaInstanceCode = sagaInstanceCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getMaxRetryCount() {
        return maxRetryCount;
    }

    public void setMaxRetryCount(Integer maxRetryCount) {
        this.maxRetryCount = maxRetryCount;
    }

    public Integer getRetriedCount() {
        return retriedCount;
    }

    public void setRetriedCount(Integer retriedCount) {
        this.retriedCount = retriedCount;
    }

    public Date getPlannedStartTime() {
        return plannedStartTime;
    }

    public void setPlannedStartTime(Date plannedStartTime) {
        this.plannedStartTime = plannedStartTime;
    }

    public Date getActualEndTime() {
        return actualEndTime;
    }

    public void setActualEndTime(Date actualEndTime) {
        this.actualEndTime = actualEndTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SagaTaskInstanceInfo that = (SagaTaskInstanceInfo) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "SagaTaskInstanceInfo{" +
                "id=" + id +
                ", status='" + status + '\'' +
                '}';
    }
}