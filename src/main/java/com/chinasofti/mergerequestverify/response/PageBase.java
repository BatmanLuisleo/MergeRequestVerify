package com.chinasofti.mergerequestverify.response;

import java.io.Serializable;

/**
 * @author Li Shijie
 * @since 1.0.0
 */
public class PageBase<T> implements Serializable {
    private static final long serialVersionUID = -2571222031261651786L;
    /**
     * 当前第几页
     */
    private Integer pageNum;

    /**
     * 每页多少条
     */
    private Integer pageSize;

    /**
     * 总条数
     */
    private Long totalCount;

    /**
     * 总页数
     */
    private Integer totalPage;
    /**
     * 前一页
     */
    private Integer startIndex;
    /**
     * 后一页
     */
    private Integer isMore;


    private T items;

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public T getItems() {
        return items;
    }

    public void setItems(T items) {
        this.items = items;
    }

    public Integer getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    public Integer getIsMore() {
        return isMore;
    }

    public void setIsMore(Integer isMore) {
        this.isMore = isMore;
    }
}
