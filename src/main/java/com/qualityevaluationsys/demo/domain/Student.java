package com.qualityevaluationsys.demo.domain;

import java.io.Serializable;

/**
 * @author 
 */
public class Student implements Serializable {
    private String sno;

    /**
     * 学生姓名
     */
    private String sname;

    /**
     * 学生性别
     */
    private String ssex;

    /**
     * 学生班级
     */
    private String sclass;

    /**
     * 学生生日
     */
    private Integer birth;

    /**
     * 学生地址
     */
    private String saddress;

    /**
     * 学生专业
     */
    private String sdept;

    /**
     * 入学时间
     */
    private Integer stime;

    private Integer uno;

    /**
     * 个性签名
     */
    private String ssignature;

    /**
     * 电话
     */
    private String stel;

    /**
     * 职业经历
     */
    private String careerexperience;

    private String sprofile;

    private Integer cid;

    private static final long serialVersionUID = 1L;

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex;
    }

    public String getSclass() {
        return sclass;
    }

    public void setSclass(String sclass) {
        this.sclass = sclass;
    }

    public Integer getBirth() {
        return birth;
    }

    public void setBirth(Integer birth) {
        this.birth = birth;
    }

    public String getSaddress() {
        return saddress;
    }

    public void setSaddress(String saddress) {
        this.saddress = saddress;
    }

    public String getSdept() {
        return sdept;
    }

    public void setSdept(String sdept) {
        this.sdept = sdept;
    }

    public Integer getStime() {
        return stime;
    }

    public void setStime(Integer stime) {
        this.stime = stime;
    }

    public Integer getUno() {
        return uno;
    }

    public void setUno(Integer uno) {
        this.uno = uno;
    }

    public String getSsignature() {
        return ssignature;
    }

    public void setSsignature(String ssignature) {
        this.ssignature = ssignature;
    }

    public String getStel() {
        return stel;
    }

    public void setStel(String stel) {
        this.stel = stel;
    }

    public String getCareerexperience() {
        return careerexperience;
    }

    public void setCareerexperience(String careerexperience) {
        this.careerexperience = careerexperience;
    }

    public String getSprofile() {
        return sprofile;
    }

    public void setSprofile(String sprofile) {
        this.sprofile = sprofile;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
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
        Student other = (Student) that;
        return (this.getSno() == null ? other.getSno() == null : this.getSno().equals(other.getSno()))
            && (this.getSname() == null ? other.getSname() == null : this.getSname().equals(other.getSname()))
            && (this.getSsex() == null ? other.getSsex() == null : this.getSsex().equals(other.getSsex()))
            && (this.getSclass() == null ? other.getSclass() == null : this.getSclass().equals(other.getSclass()))
            && (this.getBirth() == null ? other.getBirth() == null : this.getBirth().equals(other.getBirth()))
            && (this.getSaddress() == null ? other.getSaddress() == null : this.getSaddress().equals(other.getSaddress()))
            && (this.getSdept() == null ? other.getSdept() == null : this.getSdept().equals(other.getSdept()))
            && (this.getStime() == null ? other.getStime() == null : this.getStime().equals(other.getStime()))
            && (this.getUno() == null ? other.getUno() == null : this.getUno().equals(other.getUno()))
            && (this.getSsignature() == null ? other.getSsignature() == null : this.getSsignature().equals(other.getSsignature()))
            && (this.getStel() == null ? other.getStel() == null : this.getStel().equals(other.getStel()))
            && (this.getCareerexperience() == null ? other.getCareerexperience() == null : this.getCareerexperience().equals(other.getCareerexperience()))
            && (this.getSprofile() == null ? other.getSprofile() == null : this.getSprofile().equals(other.getSprofile()))
            && (this.getCid() == null ? other.getCid() == null : this.getCid().equals(other.getCid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSno() == null) ? 0 : getSno().hashCode());
        result = prime * result + ((getSname() == null) ? 0 : getSname().hashCode());
        result = prime * result + ((getSsex() == null) ? 0 : getSsex().hashCode());
        result = prime * result + ((getSclass() == null) ? 0 : getSclass().hashCode());
        result = prime * result + ((getBirth() == null) ? 0 : getBirth().hashCode());
        result = prime * result + ((getSaddress() == null) ? 0 : getSaddress().hashCode());
        result = prime * result + ((getSdept() == null) ? 0 : getSdept().hashCode());
        result = prime * result + ((getStime() == null) ? 0 : getStime().hashCode());
        result = prime * result + ((getUno() == null) ? 0 : getUno().hashCode());
        result = prime * result + ((getSsignature() == null) ? 0 : getSsignature().hashCode());
        result = prime * result + ((getStel() == null) ? 0 : getStel().hashCode());
        result = prime * result + ((getCareerexperience() == null) ? 0 : getCareerexperience().hashCode());
        result = prime * result + ((getSprofile() == null) ? 0 : getSprofile().hashCode());
        result = prime * result + ((getCid() == null) ? 0 : getCid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sno=").append(sno);
        sb.append(", sname=").append(sname);
        sb.append(", ssex=").append(ssex);
        sb.append(", sclass=").append(sclass);
        sb.append(", birth=").append(birth);
        sb.append(", saddress=").append(saddress);
        sb.append(", sdept=").append(sdept);
        sb.append(", stime=").append(stime);
        sb.append(", uno=").append(uno);
        sb.append(", ssignature=").append(ssignature);
        sb.append(", stel=").append(stel);
        sb.append(", careerexperience=").append(careerexperience);
        sb.append(", sprofile=").append(sprofile);
        sb.append(", cid=").append(cid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}