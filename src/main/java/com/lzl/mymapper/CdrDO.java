package com.lzl.mymapper;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="cdr")
public class CdrDO {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cdrId;
    private String caller;
    private String callee;
    private Date beginTime;
    private Date endTime;

    public Long getCdrId() {
        return cdrId;
    }

    public void setCdrId(Long cdrId) {
        this.cdrId = cdrId;
    }

    public String getCaller() {
        return caller;
    }

    public void setCaller(String caller) {
        this.caller = caller;
    }

    public String getCallee() {
        return callee;
    }

    public void setCallee(String callee) {
        this.callee = callee;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
