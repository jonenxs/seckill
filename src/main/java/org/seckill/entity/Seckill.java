package org.seckill.entity;

import java.util.Date;

public class Seckill {

    private long seckillId;

    private int number;

    private Date startTime;

    private Date createTime;

    public Seckill(long seckillId, int number, Date startTime, Date createTime) {
        this.seckillId = seckillId;
        this.number = number;
        this.startTime = startTime;
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Seckill{" +
                "seckillId=" + seckillId +
                ", number=" + number +
                ", startTime=" + startTime +
                ", createTime=" + createTime +
                '}';
    }

    public long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(long seckillId) {
        this.seckillId = seckillId;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
