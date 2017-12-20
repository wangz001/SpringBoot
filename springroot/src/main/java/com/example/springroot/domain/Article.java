package com.example.springroot.domain;

import org.springframework.beans.factory.annotation.Value;

import javax.annotation.sql.DataSourceDefinition;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Null;
import java.util.Date;

@Entity
public class Article {
    @Id
    @GeneratedValue
    @Column(name = "id")
    public Integer id;
    @Column(name = "articlename")
    public String articleName;
    @Column(name = "url")
    public String url;
    @Column(name = "coverimage")
    public String coverImage;
    @Column(name = "userid")
    public Integer userId;
    @Column(name = "keywords")
    public String keyWords;
    @Column(name = "description")
    public String description;
    @Column(name = "state")
    public Integer state;
    @Column(name = "publishtime")
    public Date publishTime;
    @Column(name = "createtime")
    public Date createTime;
    @Column(name = "updatetime")
    public Date updateTime;
    @Column(name = "company")
    public String company;

    public Article(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getArticleName() {
        return articleName;
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(String keyWords) {
        this.keyWords = keyWords;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
