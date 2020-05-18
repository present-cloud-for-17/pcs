package com.pcs.pojo;

public class DictionaryDetail {
    private Integer ddId;

    private Integer dId;

    private String englishTag;

    private Integer keyValue;

    private Boolean isDefault;

    private String value;

    private Integer sort;

    public Integer getDdId() {
        return ddId;
    }

    public void setDdId(Integer ddId) {
        this.ddId = ddId;
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public String getEnglishTag() {
        return englishTag;
    }

    public void setEnglishTag(String englishTag) {
        this.englishTag = englishTag == null ? null : englishTag.trim();
    }

    public Integer getKeyValue() {
        return keyValue;
    }

    public void setKeyValue(Integer keyValue) {
        this.keyValue = keyValue;
    }

    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}