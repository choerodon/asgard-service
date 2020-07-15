package io.choerodon.asgard.infra.dto;

import io.choerodon.mybatis.annotation.ModifyAudit;
import io.choerodon.mybatis.annotation.VersionAudit;
import io.choerodon.mybatis.domain.AuditDomain;
import io.choerodon.mybatis.domain.AuditDomain;

import javax.persistence.*;
import java.util.Date;

import org.hzero.starter.keyencrypt.core.Encrypt;

@VersionAudit
@ModifyAudit
@Table(name = "ASGARD_QUARTZ_TASK")
public class QuartzTaskDTO extends AuditDomain {
    @Encrypt
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String description;

    private Date startTime;

    private Date endTime;

    private String executeParams;

    private String executeMethod;

    private String executeStrategy;

    private String triggerType;

    private Integer simpleRepeatCount;

    private Long simpleRepeatInterval;

    private String simpleRepeatIntervalUnit;

    private String cronExpression;

    private String status;

    @Column(name = "FD_LEVEL")
    private String level;

    @Encrypt
    private Long sourceId;

    private String userDetails;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getTriggerType() {
        return triggerType;
    }

    public void setTriggerType(String triggerType) {
        this.triggerType = triggerType;
    }

    public String getExecuteParams() {
        return executeParams;
    }

    public void setExecuteParams(String executeParams) {
        this.executeParams = executeParams;
    }

    public String getExecuteMethod() {
        return executeMethod;
    }

    public void setExecuteMethod(String executeMethod) {
        this.executeMethod = executeMethod;
    }

    public Integer getSimpleRepeatCount() {
        return simpleRepeatCount;
    }

    public void setSimpleRepeatCount(Integer simpleRepeatCount) {
        this.simpleRepeatCount = simpleRepeatCount;
    }

    public Long getSimpleRepeatInterval() {
        return simpleRepeatInterval;
    }

    public void setSimpleRepeatInterval(Long simpleRepeatInterval) {
        this.simpleRepeatInterval = simpleRepeatInterval;
    }

    public String getCronExpression() {
        return cronExpression;
    }

    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Long getSourceId() {
        return sourceId;
    }

    public void setSourceId(Long sourceId) {
        this.sourceId = sourceId;
    }

    public String getSimpleRepeatIntervalUnit() {
        return simpleRepeatIntervalUnit;
    }

    public void setSimpleRepeatIntervalUnit(String simpleRepeatIntervalUnit) {
        this.simpleRepeatIntervalUnit = simpleRepeatIntervalUnit;
    }

    public String getExecuteStrategy() {
        return executeStrategy;
    }

    public void setExecuteStrategy(String executeStrategy) {
        this.executeStrategy = executeStrategy;
    }

    public String getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(String userDetails) {
        this.userDetails = userDetails;
    }

    @Override
    public String toString() {
        return "QuartzTaskDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", executeParams='" + executeParams + '\'' +
                ", executeMethod='" + executeMethod + '\'' +
                ", executeStrategy='" + executeStrategy + '\'' +
                ", triggerType='" + triggerType + '\'' +
                ", simpleRepeatCount=" + simpleRepeatCount +
                ", simpleRepeatInterval=" + simpleRepeatInterval +
                ", simpleRepeatIntervalUnit='" + simpleRepeatIntervalUnit + '\'' +
                ", cronExpression='" + cronExpression + '\'' +
                ", status='" + status + '\'' +
                ", level='" + level + '\'' +
                ", sourceId=" + sourceId +
                ", userDetails='" + userDetails + '\'' +
                '}';
    }
}
