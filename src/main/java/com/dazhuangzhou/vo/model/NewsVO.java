package com.dazhuangzhou.vo.model;

import java.util.Date;

public class NewsVO {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_news.Id
     *
     * @mbggenerated Sat Jul 02 14:54:59 CST 2016
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_news.TITLE
     *
     * @mbggenerated Sat Jul 02 14:54:59 CST 2016
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_news.CONTENT
     *
     * @mbggenerated Sat Jul 02 14:54:59 CST 2016
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_news.SOURCE
     *
     * @mbggenerated Sat Jul 02 14:54:59 CST 2016
     */
    private String source;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_news.DATE
     *
     * @mbggenerated Sat Jul 02 14:54:59 CST 2016
     */
    private Date date;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_news.Id
     *
     * @return the value of tb_news.Id
     *
     * @mbggenerated Sat Jul 02 14:54:59 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_news.Id
     *
     * @param id the value for tb_news.Id
     *
     * @mbggenerated Sat Jul 02 14:54:59 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_news.TITLE
     *
     * @return the value of tb_news.TITLE
     *
     * @mbggenerated Sat Jul 02 14:54:59 CST 2016
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_news.TITLE
     *
     * @param title the value for tb_news.TITLE
     *
     * @mbggenerated Sat Jul 02 14:54:59 CST 2016
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_news.CONTENT
     *
     * @return the value of tb_news.CONTENT
     *
     * @mbggenerated Sat Jul 02 14:54:59 CST 2016
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_news.CONTENT
     *
     * @param content the value for tb_news.CONTENT
     *
     * @mbggenerated Sat Jul 02 14:54:59 CST 2016
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_news.SOURCE
     *
     * @return the value of tb_news.SOURCE
     *
     * @mbggenerated Sat Jul 02 14:54:59 CST 2016
     */
    public String getSource() {
        return source;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_news.SOURCE
     *
     * @param source the value for tb_news.SOURCE
     *
     * @mbggenerated Sat Jul 02 14:54:59 CST 2016
     */
    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_news.DATE
     *
     * @return the value of tb_news.DATE
     *
     * @mbggenerated Sat Jul 02 14:54:59 CST 2016
     */
    public Date getDate() {
        return date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_news.DATE
     *
     * @param date the value for tb_news.DATE
     *
     * @mbggenerated Sat Jul 02 14:54:59 CST 2016
     */
    public void setDate(Date date) {
        this.date = date;
    }
}