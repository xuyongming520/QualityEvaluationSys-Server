package com.qualityevaluationsys.demo.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class Teacher implements Serializable {
    private Integer tno;

    /**
     * 老师姓名
     */
    private String tname;

    /**
     * 入学时间
     */
    private Date ttime;

    /**
     * 简介
     */
    private String tintroduce;

    /**
     * 老师性别
     */
    private String tsex;

    /**
     * 老师工资
     */
    private Float twage;

    private Integer uno;

    private static final long serialVersionUID = 1L;

    public Integer getTno() {
        return tno;
    }

    public void setTno(Integer tno) {
        this.tno = tno;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public Date getTtime() {
        return ttime;
    }

    public void setTtime(Date ttime) {
        this.ttime = ttime;
    }

    public String getTintroduce() {
        return tintroduce;
    }

    public void setTintroduce(String tintroduce) {
        this.tintroduce = tintroduce;
    }

    public String getTsex() {
        return tsex;
    }

    public void setTsex(String tsex) {
        this.tsex = tsex;
    }

    public Float getTwage() {
        return twage;
    }

    public void setTwage(Float twage) {
        this.twage = twage;
    }

    public Integer getUno() {
        return uno;
    }

    public void setUno(Integer uno) {
        this.uno = uno;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Teacher other = (Teacher) that;
        return (this.getTno() == null ? other.getTno() == null : this.getTno().equals(other.getTno()))
            && (this.getTname() == null ? other.getTname() == null : this.getTname().equals(other.getTname()))
            && (this.getTtime() == null ? other.getTtime() == null : this.getTtime().equals(other.getTtime()))
            && (this.getTintroduce() == null ? other.getTintroduce() == null : this.getTintroduce().equals(other.getTintroduce()))
            && (this.getTsex() == null ? other.getTsex() == null : this.getTsex().equals(other.getTsex()))
            && (this.getTwage() == null ? other.getTwage() == null : this.getTwage().equals(other.getTwage()))
            && (this.getUno() == null ? other.getUno() == null : this.getUno().equals(other.getUno()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTno() == null) ? 0 : getTno().hashCode());
        result = prime * result + ((getTname() == null) ? 0 : getTname().hashCode());
        result = prime * result + ((getTtime() == null) ? 0 : getTtime().hashCode());
        result = prime * result + ((getTintroduce() == null) ? 0 : getTintroduce().hashCode());
        result = prime * result + ((getTsex() == null) ? 0 : getTsex().hashCode());
        result = prime * result + ((getTwage() == null) ? 0 : getTwage().hashCode());
        result = prime * result + ((getUno() == null) ? 0 : getUno().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tno=").append(tno);
        sb.append(", tname=").append(tname);
        sb.append(", ttime=").append(ttime);
        sb.append(", tintroduce=").append(tintroduce);
        sb.append(", tsex=").append(tsex);
        sb.append(", twage=").append(twage);
        sb.append(", uno=").append(uno);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}