package com.bencaojc.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class FeiyuClueExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FeiyuClueExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andClueIdIsNull() {
            addCriterion("clue_id is null");
            return (Criteria) this;
        }

        public Criteria andClueIdIsNotNull() {
            addCriterion("clue_id is not null");
            return (Criteria) this;
        }

        public Criteria andClueIdEqualTo(String value) {
            addCriterion("clue_id =", value, "clueId");
            return (Criteria) this;
        }

        public Criteria andClueIdNotEqualTo(String value) {
            addCriterion("clue_id <>", value, "clueId");
            return (Criteria) this;
        }

        public Criteria andClueIdGreaterThan(String value) {
            addCriterion("clue_id >", value, "clueId");
            return (Criteria) this;
        }

        public Criteria andClueIdGreaterThanOrEqualTo(String value) {
            addCriterion("clue_id >=", value, "clueId");
            return (Criteria) this;
        }

        public Criteria andClueIdLessThan(String value) {
            addCriterion("clue_id <", value, "clueId");
            return (Criteria) this;
        }

        public Criteria andClueIdLessThanOrEqualTo(String value) {
            addCriterion("clue_id <=", value, "clueId");
            return (Criteria) this;
        }

        public Criteria andClueIdLike(String value) {
            addCriterion("clue_id like", value, "clueId");
            return (Criteria) this;
        }

        public Criteria andClueIdNotLike(String value) {
            addCriterion("clue_id not like", value, "clueId");
            return (Criteria) this;
        }

        public Criteria andClueIdIn(List<String> values) {
            addCriterion("clue_id in", values, "clueId");
            return (Criteria) this;
        }

        public Criteria andClueIdNotIn(List<String> values) {
            addCriterion("clue_id not in", values, "clueId");
            return (Criteria) this;
        }

        public Criteria andClueIdBetween(String value1, String value2) {
            addCriterion("clue_id between", value1, value2, "clueId");
            return (Criteria) this;
        }

        public Criteria andClueIdNotBetween(String value1, String value2) {
            addCriterion("clue_id not between", value1, value2, "clueId");
            return (Criteria) this;
        }

        public Criteria andAdvertiserIdIsNull() {
            addCriterion("advertiser_id is null");
            return (Criteria) this;
        }

        public Criteria andAdvertiserIdIsNotNull() {
            addCriterion("advertiser_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdvertiserIdEqualTo(String value) {
            addCriterion("advertiser_id =", value, "advertiserId");
            return (Criteria) this;
        }

        public Criteria andAdvertiserIdNotEqualTo(String value) {
            addCriterion("advertiser_id <>", value, "advertiserId");
            return (Criteria) this;
        }

        public Criteria andAdvertiserIdGreaterThan(String value) {
            addCriterion("advertiser_id >", value, "advertiserId");
            return (Criteria) this;
        }

        public Criteria andAdvertiserIdGreaterThanOrEqualTo(String value) {
            addCriterion("advertiser_id >=", value, "advertiserId");
            return (Criteria) this;
        }

        public Criteria andAdvertiserIdLessThan(String value) {
            addCriterion("advertiser_id <", value, "advertiserId");
            return (Criteria) this;
        }

        public Criteria andAdvertiserIdLessThanOrEqualTo(String value) {
            addCriterion("advertiser_id <=", value, "advertiserId");
            return (Criteria) this;
        }

        public Criteria andAdvertiserIdLike(String value) {
            addCriterion("advertiser_id like", value, "advertiserId");
            return (Criteria) this;
        }

        public Criteria andAdvertiserIdNotLike(String value) {
            addCriterion("advertiser_id not like", value, "advertiserId");
            return (Criteria) this;
        }

        public Criteria andAdvertiserIdIn(List<String> values) {
            addCriterion("advertiser_id in", values, "advertiserId");
            return (Criteria) this;
        }

        public Criteria andAdvertiserIdNotIn(List<String> values) {
            addCriterion("advertiser_id not in", values, "advertiserId");
            return (Criteria) this;
        }

        public Criteria andAdvertiserIdBetween(String value1, String value2) {
            addCriterion("advertiser_id between", value1, value2, "advertiserId");
            return (Criteria) this;
        }

        public Criteria andAdvertiserIdNotBetween(String value1, String value2) {
            addCriterion("advertiser_id not between", value1, value2, "advertiserId");
            return (Criteria) this;
        }

        public Criteria andAdvertiserNameIsNull() {
            addCriterion("advertiser_name is null");
            return (Criteria) this;
        }

        public Criteria andAdvertiserNameIsNotNull() {
            addCriterion("advertiser_name is not null");
            return (Criteria) this;
        }

        public Criteria andAdvertiserNameEqualTo(String value) {
            addCriterion("advertiser_name =", value, "advertiserName");
            return (Criteria) this;
        }

        public Criteria andAdvertiserNameNotEqualTo(String value) {
            addCriterion("advertiser_name <>", value, "advertiserName");
            return (Criteria) this;
        }

        public Criteria andAdvertiserNameGreaterThan(String value) {
            addCriterion("advertiser_name >", value, "advertiserName");
            return (Criteria) this;
        }

        public Criteria andAdvertiserNameGreaterThanOrEqualTo(String value) {
            addCriterion("advertiser_name >=", value, "advertiserName");
            return (Criteria) this;
        }

        public Criteria andAdvertiserNameLessThan(String value) {
            addCriterion("advertiser_name <", value, "advertiserName");
            return (Criteria) this;
        }

        public Criteria andAdvertiserNameLessThanOrEqualTo(String value) {
            addCriterion("advertiser_name <=", value, "advertiserName");
            return (Criteria) this;
        }

        public Criteria andAdvertiserNameLike(String value) {
            addCriterion("advertiser_name like", value, "advertiserName");
            return (Criteria) this;
        }

        public Criteria andAdvertiserNameNotLike(String value) {
            addCriterion("advertiser_name not like", value, "advertiserName");
            return (Criteria) this;
        }

        public Criteria andAdvertiserNameIn(List<String> values) {
            addCriterion("advertiser_name in", values, "advertiserName");
            return (Criteria) this;
        }

        public Criteria andAdvertiserNameNotIn(List<String> values) {
            addCriterion("advertiser_name not in", values, "advertiserName");
            return (Criteria) this;
        }

        public Criteria andAdvertiserNameBetween(String value1, String value2) {
            addCriterion("advertiser_name between", value1, value2, "advertiserName");
            return (Criteria) this;
        }

        public Criteria andAdvertiserNameNotBetween(String value1, String value2) {
            addCriterion("advertiser_name not between", value1, value2, "advertiserName");
            return (Criteria) this;
        }

        public Criteria andAdIdIsNull() {
            addCriterion("ad_id is null");
            return (Criteria) this;
        }

        public Criteria andAdIdIsNotNull() {
            addCriterion("ad_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdIdEqualTo(String value) {
            addCriterion("ad_id =", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdNotEqualTo(String value) {
            addCriterion("ad_id <>", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdGreaterThan(String value) {
            addCriterion("ad_id >", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdGreaterThanOrEqualTo(String value) {
            addCriterion("ad_id >=", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdLessThan(String value) {
            addCriterion("ad_id <", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdLessThanOrEqualTo(String value) {
            addCriterion("ad_id <=", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdLike(String value) {
            addCriterion("ad_id like", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdNotLike(String value) {
            addCriterion("ad_id not like", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdIn(List<String> values) {
            addCriterion("ad_id in", values, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdNotIn(List<String> values) {
            addCriterion("ad_id not in", values, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdBetween(String value1, String value2) {
            addCriterion("ad_id between", value1, value2, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdNotBetween(String value1, String value2) {
            addCriterion("ad_id not between", value1, value2, "adId");
            return (Criteria) this;
        }

        public Criteria andAdNameIsNull() {
            addCriterion("ad_name is null");
            return (Criteria) this;
        }

        public Criteria andAdNameIsNotNull() {
            addCriterion("ad_name is not null");
            return (Criteria) this;
        }

        public Criteria andAdNameEqualTo(String value) {
            addCriterion("ad_name =", value, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameNotEqualTo(String value) {
            addCriterion("ad_name <>", value, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameGreaterThan(String value) {
            addCriterion("ad_name >", value, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameGreaterThanOrEqualTo(String value) {
            addCriterion("ad_name >=", value, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameLessThan(String value) {
            addCriterion("ad_name <", value, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameLessThanOrEqualTo(String value) {
            addCriterion("ad_name <=", value, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameLike(String value) {
            addCriterion("ad_name like", value, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameNotLike(String value) {
            addCriterion("ad_name not like", value, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameIn(List<String> values) {
            addCriterion("ad_name in", values, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameNotIn(List<String> values) {
            addCriterion("ad_name not in", values, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameBetween(String value1, String value2) {
            addCriterion("ad_name between", value1, value2, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameNotBetween(String value1, String value2) {
            addCriterion("ad_name not between", value1, value2, "adName");
            return (Criteria) this;
        }

        public Criteria andSiteIdIsNull() {
            addCriterion("site_id is null");
            return (Criteria) this;
        }

        public Criteria andSiteIdIsNotNull() {
            addCriterion("site_id is not null");
            return (Criteria) this;
        }

        public Criteria andSiteIdEqualTo(String value) {
            addCriterion("site_id =", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotEqualTo(String value) {
            addCriterion("site_id <>", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdGreaterThan(String value) {
            addCriterion("site_id >", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdGreaterThanOrEqualTo(String value) {
            addCriterion("site_id >=", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdLessThan(String value) {
            addCriterion("site_id <", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdLessThanOrEqualTo(String value) {
            addCriterion("site_id <=", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdLike(String value) {
            addCriterion("site_id like", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotLike(String value) {
            addCriterion("site_id not like", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdIn(List<String> values) {
            addCriterion("site_id in", values, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotIn(List<String> values) {
            addCriterion("site_id not in", values, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdBetween(String value1, String value2) {
            addCriterion("site_id between", value1, value2, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotBetween(String value1, String value2) {
            addCriterion("site_id not between", value1, value2, "siteId");
            return (Criteria) this;
        }

        public Criteria andExternalUrlIsNull() {
            addCriterion("external_url is null");
            return (Criteria) this;
        }

        public Criteria andExternalUrlIsNotNull() {
            addCriterion("external_url is not null");
            return (Criteria) this;
        }

        public Criteria andExternalUrlEqualTo(String value) {
            addCriterion("external_url =", value, "externalUrl");
            return (Criteria) this;
        }

        public Criteria andExternalUrlNotEqualTo(String value) {
            addCriterion("external_url <>", value, "externalUrl");
            return (Criteria) this;
        }

        public Criteria andExternalUrlGreaterThan(String value) {
            addCriterion("external_url >", value, "externalUrl");
            return (Criteria) this;
        }

        public Criteria andExternalUrlGreaterThanOrEqualTo(String value) {
            addCriterion("external_url >=", value, "externalUrl");
            return (Criteria) this;
        }

        public Criteria andExternalUrlLessThan(String value) {
            addCriterion("external_url <", value, "externalUrl");
            return (Criteria) this;
        }

        public Criteria andExternalUrlLessThanOrEqualTo(String value) {
            addCriterion("external_url <=", value, "externalUrl");
            return (Criteria) this;
        }

        public Criteria andExternalUrlLike(String value) {
            addCriterion("external_url like", value, "externalUrl");
            return (Criteria) this;
        }

        public Criteria andExternalUrlNotLike(String value) {
            addCriterion("external_url not like", value, "externalUrl");
            return (Criteria) this;
        }

        public Criteria andExternalUrlIn(List<String> values) {
            addCriterion("external_url in", values, "externalUrl");
            return (Criteria) this;
        }

        public Criteria andExternalUrlNotIn(List<String> values) {
            addCriterion("external_url not in", values, "externalUrl");
            return (Criteria) this;
        }

        public Criteria andExternalUrlBetween(String value1, String value2) {
            addCriterion("external_url between", value1, value2, "externalUrl");
            return (Criteria) this;
        }

        public Criteria andExternalUrlNotBetween(String value1, String value2) {
            addCriterion("external_url not between", value1, value2, "externalUrl");
            return (Criteria) this;
        }

        public Criteria andClueTypeIsNull() {
            addCriterion("clue_type is null");
            return (Criteria) this;
        }

        public Criteria andClueTypeIsNotNull() {
            addCriterion("clue_type is not null");
            return (Criteria) this;
        }

        public Criteria andClueTypeEqualTo(String value) {
            addCriterion("clue_type =", value, "clueType");
            return (Criteria) this;
        }

        public Criteria andClueTypeNotEqualTo(String value) {
            addCriterion("clue_type <>", value, "clueType");
            return (Criteria) this;
        }

        public Criteria andClueTypeGreaterThan(String value) {
            addCriterion("clue_type >", value, "clueType");
            return (Criteria) this;
        }

        public Criteria andClueTypeGreaterThanOrEqualTo(String value) {
            addCriterion("clue_type >=", value, "clueType");
            return (Criteria) this;
        }

        public Criteria andClueTypeLessThan(String value) {
            addCriterion("clue_type <", value, "clueType");
            return (Criteria) this;
        }

        public Criteria andClueTypeLessThanOrEqualTo(String value) {
            addCriterion("clue_type <=", value, "clueType");
            return (Criteria) this;
        }

        public Criteria andClueTypeLike(String value) {
            addCriterion("clue_type like", value, "clueType");
            return (Criteria) this;
        }

        public Criteria andClueTypeNotLike(String value) {
            addCriterion("clue_type not like", value, "clueType");
            return (Criteria) this;
        }

        public Criteria andClueTypeIn(List<String> values) {
            addCriterion("clue_type in", values, "clueType");
            return (Criteria) this;
        }

        public Criteria andClueTypeNotIn(List<String> values) {
            addCriterion("clue_type not in", values, "clueType");
            return (Criteria) this;
        }

        public Criteria andClueTypeBetween(String value1, String value2) {
            addCriterion("clue_type between", value1, value2, "clueType");
            return (Criteria) this;
        }

        public Criteria andClueTypeNotBetween(String value1, String value2) {
            addCriterion("clue_type not between", value1, value2, "clueType");
            return (Criteria) this;
        }

        public Criteria andModuleNameIsNull() {
            addCriterion("module_name is null");
            return (Criteria) this;
        }

        public Criteria andModuleNameIsNotNull() {
            addCriterion("module_name is not null");
            return (Criteria) this;
        }

        public Criteria andModuleNameEqualTo(String value) {
            addCriterion("module_name =", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameNotEqualTo(String value) {
            addCriterion("module_name <>", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameGreaterThan(String value) {
            addCriterion("module_name >", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameGreaterThanOrEqualTo(String value) {
            addCriterion("module_name >=", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameLessThan(String value) {
            addCriterion("module_name <", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameLessThanOrEqualTo(String value) {
            addCriterion("module_name <=", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameLike(String value) {
            addCriterion("module_name like", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameNotLike(String value) {
            addCriterion("module_name not like", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameIn(List<String> values) {
            addCriterion("module_name in", values, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameNotIn(List<String> values) {
            addCriterion("module_name not in", values, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameBetween(String value1, String value2) {
            addCriterion("module_name between", value1, value2, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameNotBetween(String value1, String value2) {
            addCriterion("module_name not between", value1, value2, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleIdIsNull() {
            addCriterion("module_id is null");
            return (Criteria) this;
        }

        public Criteria andModuleIdIsNotNull() {
            addCriterion("module_id is not null");
            return (Criteria) this;
        }

        public Criteria andModuleIdEqualTo(String value) {
            addCriterion("module_id =", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotEqualTo(String value) {
            addCriterion("module_id <>", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdGreaterThan(String value) {
            addCriterion("module_id >", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdGreaterThanOrEqualTo(String value) {
            addCriterion("module_id >=", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdLessThan(String value) {
            addCriterion("module_id <", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdLessThanOrEqualTo(String value) {
            addCriterion("module_id <=", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdLike(String value) {
            addCriterion("module_id like", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotLike(String value) {
            addCriterion("module_id not like", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdIn(List<String> values) {
            addCriterion("module_id in", values, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotIn(List<String> values) {
            addCriterion("module_id not in", values, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdBetween(String value1, String value2) {
            addCriterion("module_id between", value1, value2, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotBetween(String value1, String value2) {
            addCriterion("module_id not between", value1, value2, "moduleId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeDetailIsNull() {
            addCriterion("create_time_detail is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeDetailIsNotNull() {
            addCriterion("create_time_detail is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeDetailEqualTo(Date value) {
            addCriterion("create_time_detail =", value, "createTimeDetail");
            return (Criteria) this;
        }

        public Criteria andCreateTimeDetailNotEqualTo(Date value) {
            addCriterion("create_time_detail <>", value, "createTimeDetail");
            return (Criteria) this;
        }

        public Criteria andCreateTimeDetailGreaterThan(Date value) {
            addCriterion("create_time_detail >", value, "createTimeDetail");
            return (Criteria) this;
        }

        public Criteria andCreateTimeDetailGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time_detail >=", value, "createTimeDetail");
            return (Criteria) this;
        }

        public Criteria andCreateTimeDetailLessThan(Date value) {
            addCriterion("create_time_detail <", value, "createTimeDetail");
            return (Criteria) this;
        }

        public Criteria andCreateTimeDetailLessThanOrEqualTo(Date value) {
            addCriterion("create_time_detail <=", value, "createTimeDetail");
            return (Criteria) this;
        }

        public Criteria andCreateTimeDetailIn(List<Date> values) {
            addCriterion("create_time_detail in", values, "createTimeDetail");
            return (Criteria) this;
        }

        public Criteria andCreateTimeDetailNotIn(List<Date> values) {
            addCriterion("create_time_detail not in", values, "createTimeDetail");
            return (Criteria) this;
        }

        public Criteria andCreateTimeDetailBetween(Date value1, Date value2) {
            addCriterion("create_time_detail between", value1, value2, "createTimeDetail");
            return (Criteria) this;
        }

        public Criteria andCreateTimeDetailNotBetween(Date value1, Date value2) {
            addCriterion("create_time_detail not between", value1, value2, "createTimeDetail");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterion("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterion("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterion("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterion("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterion("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterion("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterion("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterion("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterion("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterion("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andClueSourceIsNull() {
            addCriterion("clue_source is null");
            return (Criteria) this;
        }

        public Criteria andClueSourceIsNotNull() {
            addCriterion("clue_source is not null");
            return (Criteria) this;
        }

        public Criteria andClueSourceEqualTo(String value) {
            addCriterion("clue_source =", value, "clueSource");
            return (Criteria) this;
        }

        public Criteria andClueSourceNotEqualTo(String value) {
            addCriterion("clue_source <>", value, "clueSource");
            return (Criteria) this;
        }

        public Criteria andClueSourceGreaterThan(String value) {
            addCriterion("clue_source >", value, "clueSource");
            return (Criteria) this;
        }

        public Criteria andClueSourceGreaterThanOrEqualTo(String value) {
            addCriterion("clue_source >=", value, "clueSource");
            return (Criteria) this;
        }

        public Criteria andClueSourceLessThan(String value) {
            addCriterion("clue_source <", value, "clueSource");
            return (Criteria) this;
        }

        public Criteria andClueSourceLessThanOrEqualTo(String value) {
            addCriterion("clue_source <=", value, "clueSource");
            return (Criteria) this;
        }

        public Criteria andClueSourceLike(String value) {
            addCriterion("clue_source like", value, "clueSource");
            return (Criteria) this;
        }

        public Criteria andClueSourceNotLike(String value) {
            addCriterion("clue_source not like", value, "clueSource");
            return (Criteria) this;
        }

        public Criteria andClueSourceIn(List<String> values) {
            addCriterion("clue_source in", values, "clueSource");
            return (Criteria) this;
        }

        public Criteria andClueSourceNotIn(List<String> values) {
            addCriterion("clue_source not in", values, "clueSource");
            return (Criteria) this;
        }

        public Criteria andClueSourceBetween(String value1, String value2) {
            addCriterion("clue_source between", value1, value2, "clueSource");
            return (Criteria) this;
        }

        public Criteria andClueSourceNotBetween(String value1, String value2) {
            addCriterion("clue_source not between", value1, value2, "clueSource");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("telephone is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("telephone =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("telephone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("telephone >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("telephone >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("telephone <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("telephone <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("telephone like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("telephone not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("telephone in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("telephone not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("telephone not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("gender like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("gender not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(String value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(String value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(String value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(String value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(String value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(String value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLike(String value) {
            addCriterion("age like", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotLike(String value) {
            addCriterion("age not like", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<String> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<String> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(String value1, String value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(String value1, String value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andWeixinIsNull() {
            addCriterion("weixin is null");
            return (Criteria) this;
        }

        public Criteria andWeixinIsNotNull() {
            addCriterion("weixin is not null");
            return (Criteria) this;
        }

        public Criteria andWeixinEqualTo(String value) {
            addCriterion("weixin =", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotEqualTo(String value) {
            addCriterion("weixin <>", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinGreaterThan(String value) {
            addCriterion("weixin >", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinGreaterThanOrEqualTo(String value) {
            addCriterion("weixin >=", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinLessThan(String value) {
            addCriterion("weixin <", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinLessThanOrEqualTo(String value) {
            addCriterion("weixin <=", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinLike(String value) {
            addCriterion("weixin like", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotLike(String value) {
            addCriterion("weixin not like", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinIn(List<String> values) {
            addCriterion("weixin in", values, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotIn(List<String> values) {
            addCriterion("weixin not in", values, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinBetween(String value1, String value2) {
            addCriterion("weixin between", value1, value2, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotBetween(String value1, String value2) {
            addCriterion("weixin not between", value1, value2, "weixin");
            return (Criteria) this;
        }

        public Criteria andQqIsNull() {
            addCriterion("qq is null");
            return (Criteria) this;
        }

        public Criteria andQqIsNotNull() {
            addCriterion("qq is not null");
            return (Criteria) this;
        }

        public Criteria andQqEqualTo(String value) {
            addCriterion("qq =", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotEqualTo(String value) {
            addCriterion("qq <>", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThan(String value) {
            addCriterion("qq >", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThanOrEqualTo(String value) {
            addCriterion("qq >=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThan(String value) {
            addCriterion("qq <", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThanOrEqualTo(String value) {
            addCriterion("qq <=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLike(String value) {
            addCriterion("qq like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotLike(String value) {
            addCriterion("qq not like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqIn(List<String> values) {
            addCriterion("qq in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotIn(List<String> values) {
            addCriterion("qq not in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqBetween(String value1, String value2) {
            addCriterion("qq between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotBetween(String value1, String value2) {
            addCriterion("qq not between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andProvinceNameIsNull() {
            addCriterion("province_name is null");
            return (Criteria) this;
        }

        public Criteria andProvinceNameIsNotNull() {
            addCriterion("province_name is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceNameEqualTo(String value) {
            addCriterion("province_name =", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotEqualTo(String value) {
            addCriterion("province_name <>", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameGreaterThan(String value) {
            addCriterion("province_name >", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameGreaterThanOrEqualTo(String value) {
            addCriterion("province_name >=", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLessThan(String value) {
            addCriterion("province_name <", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLessThanOrEqualTo(String value) {
            addCriterion("province_name <=", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLike(String value) {
            addCriterion("province_name like", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotLike(String value) {
            addCriterion("province_name not like", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameIn(List<String> values) {
            addCriterion("province_name in", values, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotIn(List<String> values) {
            addCriterion("province_name not in", values, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameBetween(String value1, String value2) {
            addCriterion("province_name between", value1, value2, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotBetween(String value1, String value2) {
            addCriterion("province_name not between", value1, value2, "provinceName");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNull() {
            addCriterion("city_name is null");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNotNull() {
            addCriterion("city_name is not null");
            return (Criteria) this;
        }

        public Criteria andCityNameEqualTo(String value) {
            addCriterion("city_name =", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotEqualTo(String value) {
            addCriterion("city_name <>", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThan(String value) {
            addCriterion("city_name >", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("city_name >=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThan(String value) {
            addCriterion("city_name <", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThanOrEqualTo(String value) {
            addCriterion("city_name <=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLike(String value) {
            addCriterion("city_name like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotLike(String value) {
            addCriterion("city_name not like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameIn(List<String> values) {
            addCriterion("city_name in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotIn(List<String> values) {
            addCriterion("city_name not in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameBetween(String value1, String value2) {
            addCriterion("city_name between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotBetween(String value1, String value2) {
            addCriterion("city_name not between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("location is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("location is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("location =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("location <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("location >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("location >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("location <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("location <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("location like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("location not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("location in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("location not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("location between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("location not between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkDictIsNull() {
            addCriterion("remark_dict is null");
            return (Criteria) this;
        }

        public Criteria andRemarkDictIsNotNull() {
            addCriterion("remark_dict is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkDictEqualTo(String value) {
            addCriterion("remark_dict =", value, "remarkDict");
            return (Criteria) this;
        }

        public Criteria andRemarkDictNotEqualTo(String value) {
            addCriterion("remark_dict <>", value, "remarkDict");
            return (Criteria) this;
        }

        public Criteria andRemarkDictGreaterThan(String value) {
            addCriterion("remark_dict >", value, "remarkDict");
            return (Criteria) this;
        }

        public Criteria andRemarkDictGreaterThanOrEqualTo(String value) {
            addCriterion("remark_dict >=", value, "remarkDict");
            return (Criteria) this;
        }

        public Criteria andRemarkDictLessThan(String value) {
            addCriterion("remark_dict <", value, "remarkDict");
            return (Criteria) this;
        }

        public Criteria andRemarkDictLessThanOrEqualTo(String value) {
            addCriterion("remark_dict <=", value, "remarkDict");
            return (Criteria) this;
        }

        public Criteria andRemarkDictLike(String value) {
            addCriterion("remark_dict like", value, "remarkDict");
            return (Criteria) this;
        }

        public Criteria andRemarkDictNotLike(String value) {
            addCriterion("remark_dict not like", value, "remarkDict");
            return (Criteria) this;
        }

        public Criteria andRemarkDictIn(List<String> values) {
            addCriterion("remark_dict in", values, "remarkDict");
            return (Criteria) this;
        }

        public Criteria andRemarkDictNotIn(List<String> values) {
            addCriterion("remark_dict not in", values, "remarkDict");
            return (Criteria) this;
        }

        public Criteria andRemarkDictBetween(String value1, String value2) {
            addCriterion("remark_dict between", value1, value2, "remarkDict");
            return (Criteria) this;
        }

        public Criteria andRemarkDictNotBetween(String value1, String value2) {
            addCriterion("remark_dict not between", value1, value2, "remarkDict");
            return (Criteria) this;
        }

        public Criteria andFormRemarkIsNull() {
            addCriterion("form_remark is null");
            return (Criteria) this;
        }

        public Criteria andFormRemarkIsNotNull() {
            addCriterion("form_remark is not null");
            return (Criteria) this;
        }

        public Criteria andFormRemarkEqualTo(String value) {
            addCriterion("form_remark =", value, "formRemark");
            return (Criteria) this;
        }

        public Criteria andFormRemarkNotEqualTo(String value) {
            addCriterion("form_remark <>", value, "formRemark");
            return (Criteria) this;
        }

        public Criteria andFormRemarkGreaterThan(String value) {
            addCriterion("form_remark >", value, "formRemark");
            return (Criteria) this;
        }

        public Criteria andFormRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("form_remark >=", value, "formRemark");
            return (Criteria) this;
        }

        public Criteria andFormRemarkLessThan(String value) {
            addCriterion("form_remark <", value, "formRemark");
            return (Criteria) this;
        }

        public Criteria andFormRemarkLessThanOrEqualTo(String value) {
            addCriterion("form_remark <=", value, "formRemark");
            return (Criteria) this;
        }

        public Criteria andFormRemarkLike(String value) {
            addCriterion("form_remark like", value, "formRemark");
            return (Criteria) this;
        }

        public Criteria andFormRemarkNotLike(String value) {
            addCriterion("form_remark not like", value, "formRemark");
            return (Criteria) this;
        }

        public Criteria andFormRemarkIn(List<String> values) {
            addCriterion("form_remark in", values, "formRemark");
            return (Criteria) this;
        }

        public Criteria andFormRemarkNotIn(List<String> values) {
            addCriterion("form_remark not in", values, "formRemark");
            return (Criteria) this;
        }

        public Criteria andFormRemarkBetween(String value1, String value2) {
            addCriterion("form_remark between", value1, value2, "formRemark");
            return (Criteria) this;
        }

        public Criteria andFormRemarkNotBetween(String value1, String value2) {
            addCriterion("form_remark not between", value1, value2, "formRemark");
            return (Criteria) this;
        }

        public Criteria andAppNameIsNull() {
            addCriterion("app_name is null");
            return (Criteria) this;
        }

        public Criteria andAppNameIsNotNull() {
            addCriterion("app_name is not null");
            return (Criteria) this;
        }

        public Criteria andAppNameEqualTo(String value) {
            addCriterion("app_name =", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotEqualTo(String value) {
            addCriterion("app_name <>", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameGreaterThan(String value) {
            addCriterion("app_name >", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameGreaterThanOrEqualTo(String value) {
            addCriterion("app_name >=", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameLessThan(String value) {
            addCriterion("app_name <", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameLessThanOrEqualTo(String value) {
            addCriterion("app_name <=", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameLike(String value) {
            addCriterion("app_name like", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotLike(String value) {
            addCriterion("app_name not like", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameIn(List<String> values) {
            addCriterion("app_name in", values, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotIn(List<String> values) {
            addCriterion("app_name not in", values, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameBetween(String value1, String value2) {
            addCriterion("app_name between", value1, value2, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotBetween(String value1, String value2) {
            addCriterion("app_name not between", value1, value2, "appName");
            return (Criteria) this;
        }

        public Criteria andConvertStatusIsNull() {
            addCriterion("convert_status is null");
            return (Criteria) this;
        }

        public Criteria andConvertStatusIsNotNull() {
            addCriterion("convert_status is not null");
            return (Criteria) this;
        }

        public Criteria andConvertStatusEqualTo(String value) {
            addCriterion("convert_status =", value, "convertStatus");
            return (Criteria) this;
        }

        public Criteria andConvertStatusNotEqualTo(String value) {
            addCriterion("convert_status <>", value, "convertStatus");
            return (Criteria) this;
        }

        public Criteria andConvertStatusGreaterThan(String value) {
            addCriterion("convert_status >", value, "convertStatus");
            return (Criteria) this;
        }

        public Criteria andConvertStatusGreaterThanOrEqualTo(String value) {
            addCriterion("convert_status >=", value, "convertStatus");
            return (Criteria) this;
        }

        public Criteria andConvertStatusLessThan(String value) {
            addCriterion("convert_status <", value, "convertStatus");
            return (Criteria) this;
        }

        public Criteria andConvertStatusLessThanOrEqualTo(String value) {
            addCriterion("convert_status <=", value, "convertStatus");
            return (Criteria) this;
        }

        public Criteria andConvertStatusLike(String value) {
            addCriterion("convert_status like", value, "convertStatus");
            return (Criteria) this;
        }

        public Criteria andConvertStatusNotLike(String value) {
            addCriterion("convert_status not like", value, "convertStatus");
            return (Criteria) this;
        }

        public Criteria andConvertStatusIn(List<String> values) {
            addCriterion("convert_status in", values, "convertStatus");
            return (Criteria) this;
        }

        public Criteria andConvertStatusNotIn(List<String> values) {
            addCriterion("convert_status not in", values, "convertStatus");
            return (Criteria) this;
        }

        public Criteria andConvertStatusBetween(String value1, String value2) {
            addCriterion("convert_status between", value1, value2, "convertStatus");
            return (Criteria) this;
        }

        public Criteria andConvertStatusNotBetween(String value1, String value2) {
            addCriterion("convert_status not between", value1, value2, "convertStatus");
            return (Criteria) this;
        }

        public Criteria andReqIdIsNull() {
            addCriterion("req_id is null");
            return (Criteria) this;
        }

        public Criteria andReqIdIsNotNull() {
            addCriterion("req_id is not null");
            return (Criteria) this;
        }

        public Criteria andReqIdEqualTo(String value) {
            addCriterion("req_id =", value, "reqId");
            return (Criteria) this;
        }

        public Criteria andReqIdNotEqualTo(String value) {
            addCriterion("req_id <>", value, "reqId");
            return (Criteria) this;
        }

        public Criteria andReqIdGreaterThan(String value) {
            addCriterion("req_id >", value, "reqId");
            return (Criteria) this;
        }

        public Criteria andReqIdGreaterThanOrEqualTo(String value) {
            addCriterion("req_id >=", value, "reqId");
            return (Criteria) this;
        }

        public Criteria andReqIdLessThan(String value) {
            addCriterion("req_id <", value, "reqId");
            return (Criteria) this;
        }

        public Criteria andReqIdLessThanOrEqualTo(String value) {
            addCriterion("req_id <=", value, "reqId");
            return (Criteria) this;
        }

        public Criteria andReqIdLike(String value) {
            addCriterion("req_id like", value, "reqId");
            return (Criteria) this;
        }

        public Criteria andReqIdNotLike(String value) {
            addCriterion("req_id not like", value, "reqId");
            return (Criteria) this;
        }

        public Criteria andReqIdIn(List<String> values) {
            addCriterion("req_id in", values, "reqId");
            return (Criteria) this;
        }

        public Criteria andReqIdNotIn(List<String> values) {
            addCriterion("req_id not in", values, "reqId");
            return (Criteria) this;
        }

        public Criteria andReqIdBetween(String value1, String value2) {
            addCriterion("req_id between", value1, value2, "reqId");
            return (Criteria) this;
        }

        public Criteria andReqIdNotBetween(String value1, String value2) {
            addCriterion("req_id not between", value1, value2, "reqId");
            return (Criteria) this;
        }

        public Criteria andClueStateIsNull() {
            addCriterion("clue_state is null");
            return (Criteria) this;
        }

        public Criteria andClueStateIsNotNull() {
            addCriterion("clue_state is not null");
            return (Criteria) this;
        }

        public Criteria andClueStateEqualTo(String value) {
            addCriterion("clue_state =", value, "clueState");
            return (Criteria) this;
        }

        public Criteria andClueStateNotEqualTo(String value) {
            addCriterion("clue_state <>", value, "clueState");
            return (Criteria) this;
        }

        public Criteria andClueStateGreaterThan(String value) {
            addCriterion("clue_state >", value, "clueState");
            return (Criteria) this;
        }

        public Criteria andClueStateGreaterThanOrEqualTo(String value) {
            addCriterion("clue_state >=", value, "clueState");
            return (Criteria) this;
        }

        public Criteria andClueStateLessThan(String value) {
            addCriterion("clue_state <", value, "clueState");
            return (Criteria) this;
        }

        public Criteria andClueStateLessThanOrEqualTo(String value) {
            addCriterion("clue_state <=", value, "clueState");
            return (Criteria) this;
        }

        public Criteria andClueStateLike(String value) {
            addCriterion("clue_state like", value, "clueState");
            return (Criteria) this;
        }

        public Criteria andClueStateNotLike(String value) {
            addCriterion("clue_state not like", value, "clueState");
            return (Criteria) this;
        }

        public Criteria andClueStateIn(List<String> values) {
            addCriterion("clue_state in", values, "clueState");
            return (Criteria) this;
        }

        public Criteria andClueStateNotIn(List<String> values) {
            addCriterion("clue_state not in", values, "clueState");
            return (Criteria) this;
        }

        public Criteria andClueStateBetween(String value1, String value2) {
            addCriterion("clue_state between", value1, value2, "clueState");
            return (Criteria) this;
        }

        public Criteria andClueStateNotBetween(String value1, String value2) {
            addCriterion("clue_state not between", value1, value2, "clueState");
            return (Criteria) this;
        }

        public Criteria andClueStateNameIsNull() {
            addCriterion("clue_state_name is null");
            return (Criteria) this;
        }

        public Criteria andClueStateNameIsNotNull() {
            addCriterion("clue_state_name is not null");
            return (Criteria) this;
        }

        public Criteria andClueStateNameEqualTo(String value) {
            addCriterion("clue_state_name =", value, "clueStateName");
            return (Criteria) this;
        }

        public Criteria andClueStateNameNotEqualTo(String value) {
            addCriterion("clue_state_name <>", value, "clueStateName");
            return (Criteria) this;
        }

        public Criteria andClueStateNameGreaterThan(String value) {
            addCriterion("clue_state_name >", value, "clueStateName");
            return (Criteria) this;
        }

        public Criteria andClueStateNameGreaterThanOrEqualTo(String value) {
            addCriterion("clue_state_name >=", value, "clueStateName");
            return (Criteria) this;
        }

        public Criteria andClueStateNameLessThan(String value) {
            addCriterion("clue_state_name <", value, "clueStateName");
            return (Criteria) this;
        }

        public Criteria andClueStateNameLessThanOrEqualTo(String value) {
            addCriterion("clue_state_name <=", value, "clueStateName");
            return (Criteria) this;
        }

        public Criteria andClueStateNameLike(String value) {
            addCriterion("clue_state_name like", value, "clueStateName");
            return (Criteria) this;
        }

        public Criteria andClueStateNameNotLike(String value) {
            addCriterion("clue_state_name not like", value, "clueStateName");
            return (Criteria) this;
        }

        public Criteria andClueStateNameIn(List<String> values) {
            addCriterion("clue_state_name in", values, "clueStateName");
            return (Criteria) this;
        }

        public Criteria andClueStateNameNotIn(List<String> values) {
            addCriterion("clue_state_name not in", values, "clueStateName");
            return (Criteria) this;
        }

        public Criteria andClueStateNameBetween(String value1, String value2) {
            addCriterion("clue_state_name between", value1, value2, "clueStateName");
            return (Criteria) this;
        }

        public Criteria andClueStateNameNotBetween(String value1, String value2) {
            addCriterion("clue_state_name not between", value1, value2, "clueStateName");
            return (Criteria) this;
        }

        public Criteria andClueOwnerNameIsNull() {
            addCriterion("clue_owner_name is null");
            return (Criteria) this;
        }

        public Criteria andClueOwnerNameIsNotNull() {
            addCriterion("clue_owner_name is not null");
            return (Criteria) this;
        }

        public Criteria andClueOwnerNameEqualTo(String value) {
            addCriterion("clue_owner_name =", value, "clueOwnerName");
            return (Criteria) this;
        }

        public Criteria andClueOwnerNameNotEqualTo(String value) {
            addCriterion("clue_owner_name <>", value, "clueOwnerName");
            return (Criteria) this;
        }

        public Criteria andClueOwnerNameGreaterThan(String value) {
            addCriterion("clue_owner_name >", value, "clueOwnerName");
            return (Criteria) this;
        }

        public Criteria andClueOwnerNameGreaterThanOrEqualTo(String value) {
            addCriterion("clue_owner_name >=", value, "clueOwnerName");
            return (Criteria) this;
        }

        public Criteria andClueOwnerNameLessThan(String value) {
            addCriterion("clue_owner_name <", value, "clueOwnerName");
            return (Criteria) this;
        }

        public Criteria andClueOwnerNameLessThanOrEqualTo(String value) {
            addCriterion("clue_owner_name <=", value, "clueOwnerName");
            return (Criteria) this;
        }

        public Criteria andClueOwnerNameLike(String value) {
            addCriterion("clue_owner_name like", value, "clueOwnerName");
            return (Criteria) this;
        }

        public Criteria andClueOwnerNameNotLike(String value) {
            addCriterion("clue_owner_name not like", value, "clueOwnerName");
            return (Criteria) this;
        }

        public Criteria andClueOwnerNameIn(List<String> values) {
            addCriterion("clue_owner_name in", values, "clueOwnerName");
            return (Criteria) this;
        }

        public Criteria andClueOwnerNameNotIn(List<String> values) {
            addCriterion("clue_owner_name not in", values, "clueOwnerName");
            return (Criteria) this;
        }

        public Criteria andClueOwnerNameBetween(String value1, String value2) {
            addCriterion("clue_owner_name between", value1, value2, "clueOwnerName");
            return (Criteria) this;
        }

        public Criteria andClueOwnerNameNotBetween(String value1, String value2) {
            addCriterion("clue_owner_name not between", value1, value2, "clueOwnerName");
            return (Criteria) this;
        }

        public Criteria andFollowStateNameIsNull() {
            addCriterion("follow_state_name is null");
            return (Criteria) this;
        }

        public Criteria andFollowStateNameIsNotNull() {
            addCriterion("follow_state_name is not null");
            return (Criteria) this;
        }

        public Criteria andFollowStateNameEqualTo(String value) {
            addCriterion("follow_state_name =", value, "followStateName");
            return (Criteria) this;
        }

        public Criteria andFollowStateNameNotEqualTo(String value) {
            addCriterion("follow_state_name <>", value, "followStateName");
            return (Criteria) this;
        }

        public Criteria andFollowStateNameGreaterThan(String value) {
            addCriterion("follow_state_name >", value, "followStateName");
            return (Criteria) this;
        }

        public Criteria andFollowStateNameGreaterThanOrEqualTo(String value) {
            addCriterion("follow_state_name >=", value, "followStateName");
            return (Criteria) this;
        }

        public Criteria andFollowStateNameLessThan(String value) {
            addCriterion("follow_state_name <", value, "followStateName");
            return (Criteria) this;
        }

        public Criteria andFollowStateNameLessThanOrEqualTo(String value) {
            addCriterion("follow_state_name <=", value, "followStateName");
            return (Criteria) this;
        }

        public Criteria andFollowStateNameLike(String value) {
            addCriterion("follow_state_name like", value, "followStateName");
            return (Criteria) this;
        }

        public Criteria andFollowStateNameNotLike(String value) {
            addCriterion("follow_state_name not like", value, "followStateName");
            return (Criteria) this;
        }

        public Criteria andFollowStateNameIn(List<String> values) {
            addCriterion("follow_state_name in", values, "followStateName");
            return (Criteria) this;
        }

        public Criteria andFollowStateNameNotIn(List<String> values) {
            addCriterion("follow_state_name not in", values, "followStateName");
            return (Criteria) this;
        }

        public Criteria andFollowStateNameBetween(String value1, String value2) {
            addCriterion("follow_state_name between", value1, value2, "followStateName");
            return (Criteria) this;
        }

        public Criteria andFollowStateNameNotBetween(String value1, String value2) {
            addCriterion("follow_state_name not between", value1, value2, "followStateName");
            return (Criteria) this;
        }

        public Criteria andCountryNameIsNull() {
            addCriterion("country_name is null");
            return (Criteria) this;
        }

        public Criteria andCountryNameIsNotNull() {
            addCriterion("country_name is not null");
            return (Criteria) this;
        }

        public Criteria andCountryNameEqualTo(String value) {
            addCriterion("country_name =", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameNotEqualTo(String value) {
            addCriterion("country_name <>", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameGreaterThan(String value) {
            addCriterion("country_name >", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameGreaterThanOrEqualTo(String value) {
            addCriterion("country_name >=", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameLessThan(String value) {
            addCriterion("country_name <", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameLessThanOrEqualTo(String value) {
            addCriterion("country_name <=", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameLike(String value) {
            addCriterion("country_name like", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameNotLike(String value) {
            addCriterion("country_name not like", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameIn(List<String> values) {
            addCriterion("country_name in", values, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameNotIn(List<String> values) {
            addCriterion("country_name not in", values, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameBetween(String value1, String value2) {
            addCriterion("country_name between", value1, value2, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameNotBetween(String value1, String value2) {
            addCriterion("country_name not between", value1, value2, "countryName");
            return (Criteria) this;
        }

        public Criteria andSystemTagsIsNull() {
            addCriterion("system_tags is null");
            return (Criteria) this;
        }

        public Criteria andSystemTagsIsNotNull() {
            addCriterion("system_tags is not null");
            return (Criteria) this;
        }

        public Criteria andSystemTagsEqualTo(String value) {
            addCriterion("system_tags =", value, "systemTags");
            return (Criteria) this;
        }

        public Criteria andSystemTagsNotEqualTo(String value) {
            addCriterion("system_tags <>", value, "systemTags");
            return (Criteria) this;
        }

        public Criteria andSystemTagsGreaterThan(String value) {
            addCriterion("system_tags >", value, "systemTags");
            return (Criteria) this;
        }

        public Criteria andSystemTagsGreaterThanOrEqualTo(String value) {
            addCriterion("system_tags >=", value, "systemTags");
            return (Criteria) this;
        }

        public Criteria andSystemTagsLessThan(String value) {
            addCriterion("system_tags <", value, "systemTags");
            return (Criteria) this;
        }

        public Criteria andSystemTagsLessThanOrEqualTo(String value) {
            addCriterion("system_tags <=", value, "systemTags");
            return (Criteria) this;
        }

        public Criteria andSystemTagsLike(String value) {
            addCriterion("system_tags like", value, "systemTags");
            return (Criteria) this;
        }

        public Criteria andSystemTagsNotLike(String value) {
            addCriterion("system_tags not like", value, "systemTags");
            return (Criteria) this;
        }

        public Criteria andSystemTagsIn(List<String> values) {
            addCriterion("system_tags in", values, "systemTags");
            return (Criteria) this;
        }

        public Criteria andSystemTagsNotIn(List<String> values) {
            addCriterion("system_tags not in", values, "systemTags");
            return (Criteria) this;
        }

        public Criteria andSystemTagsBetween(String value1, String value2) {
            addCriterion("system_tags between", value1, value2, "systemTags");
            return (Criteria) this;
        }

        public Criteria andSystemTagsNotBetween(String value1, String value2) {
            addCriterion("system_tags not between", value1, value2, "systemTags");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNull() {
            addCriterion("store_id is null");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNotNull() {
            addCriterion("store_id is not null");
            return (Criteria) this;
        }

        public Criteria andStoreIdEqualTo(String value) {
            addCriterion("store_id =", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotEqualTo(String value) {
            addCriterion("store_id <>", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThan(String value) {
            addCriterion("store_id >", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThanOrEqualTo(String value) {
            addCriterion("store_id >=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThan(String value) {
            addCriterion("store_id <", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThanOrEqualTo(String value) {
            addCriterion("store_id <=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLike(String value) {
            addCriterion("store_id like", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotLike(String value) {
            addCriterion("store_id not like", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdIn(List<String> values) {
            addCriterion("store_id in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotIn(List<String> values) {
            addCriterion("store_id not in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdBetween(String value1, String value2) {
            addCriterion("store_id between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotBetween(String value1, String value2) {
            addCriterion("store_id not between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreNameIsNull() {
            addCriterion("store_name is null");
            return (Criteria) this;
        }

        public Criteria andStoreNameIsNotNull() {
            addCriterion("store_name is not null");
            return (Criteria) this;
        }

        public Criteria andStoreNameEqualTo(String value) {
            addCriterion("store_name =", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotEqualTo(String value) {
            addCriterion("store_name <>", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThan(String value) {
            addCriterion("store_name >", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThanOrEqualTo(String value) {
            addCriterion("store_name >=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThan(String value) {
            addCriterion("store_name <", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThanOrEqualTo(String value) {
            addCriterion("store_name <=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLike(String value) {
            addCriterion("store_name like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotLike(String value) {
            addCriterion("store_name not like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameIn(List<String> values) {
            addCriterion("store_name in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotIn(List<String> values) {
            addCriterion("store_name not in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameBetween(String value1, String value2) {
            addCriterion("store_name between", value1, value2, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotBetween(String value1, String value2) {
            addCriterion("store_name not between", value1, value2, "storeName");
            return (Criteria) this;
        }

        public Criteria andStorePackIdIsNull() {
            addCriterion("store_pack_id is null");
            return (Criteria) this;
        }

        public Criteria andStorePackIdIsNotNull() {
            addCriterion("store_pack_id is not null");
            return (Criteria) this;
        }

        public Criteria andStorePackIdEqualTo(String value) {
            addCriterion("store_pack_id =", value, "storePackId");
            return (Criteria) this;
        }

        public Criteria andStorePackIdNotEqualTo(String value) {
            addCriterion("store_pack_id <>", value, "storePackId");
            return (Criteria) this;
        }

        public Criteria andStorePackIdGreaterThan(String value) {
            addCriterion("store_pack_id >", value, "storePackId");
            return (Criteria) this;
        }

        public Criteria andStorePackIdGreaterThanOrEqualTo(String value) {
            addCriterion("store_pack_id >=", value, "storePackId");
            return (Criteria) this;
        }

        public Criteria andStorePackIdLessThan(String value) {
            addCriterion("store_pack_id <", value, "storePackId");
            return (Criteria) this;
        }

        public Criteria andStorePackIdLessThanOrEqualTo(String value) {
            addCriterion("store_pack_id <=", value, "storePackId");
            return (Criteria) this;
        }

        public Criteria andStorePackIdLike(String value) {
            addCriterion("store_pack_id like", value, "storePackId");
            return (Criteria) this;
        }

        public Criteria andStorePackIdNotLike(String value) {
            addCriterion("store_pack_id not like", value, "storePackId");
            return (Criteria) this;
        }

        public Criteria andStorePackIdIn(List<String> values) {
            addCriterion("store_pack_id in", values, "storePackId");
            return (Criteria) this;
        }

        public Criteria andStorePackIdNotIn(List<String> values) {
            addCriterion("store_pack_id not in", values, "storePackId");
            return (Criteria) this;
        }

        public Criteria andStorePackIdBetween(String value1, String value2) {
            addCriterion("store_pack_id between", value1, value2, "storePackId");
            return (Criteria) this;
        }

        public Criteria andStorePackIdNotBetween(String value1, String value2) {
            addCriterion("store_pack_id not between", value1, value2, "storePackId");
            return (Criteria) this;
        }

        public Criteria andStorePackNameIsNull() {
            addCriterion("store_pack_name is null");
            return (Criteria) this;
        }

        public Criteria andStorePackNameIsNotNull() {
            addCriterion("store_pack_name is not null");
            return (Criteria) this;
        }

        public Criteria andStorePackNameEqualTo(String value) {
            addCriterion("store_pack_name =", value, "storePackName");
            return (Criteria) this;
        }

        public Criteria andStorePackNameNotEqualTo(String value) {
            addCriterion("store_pack_name <>", value, "storePackName");
            return (Criteria) this;
        }

        public Criteria andStorePackNameGreaterThan(String value) {
            addCriterion("store_pack_name >", value, "storePackName");
            return (Criteria) this;
        }

        public Criteria andStorePackNameGreaterThanOrEqualTo(String value) {
            addCriterion("store_pack_name >=", value, "storePackName");
            return (Criteria) this;
        }

        public Criteria andStorePackNameLessThan(String value) {
            addCriterion("store_pack_name <", value, "storePackName");
            return (Criteria) this;
        }

        public Criteria andStorePackNameLessThanOrEqualTo(String value) {
            addCriterion("store_pack_name <=", value, "storePackName");
            return (Criteria) this;
        }

        public Criteria andStorePackNameLike(String value) {
            addCriterion("store_pack_name like", value, "storePackName");
            return (Criteria) this;
        }

        public Criteria andStorePackNameNotLike(String value) {
            addCriterion("store_pack_name not like", value, "storePackName");
            return (Criteria) this;
        }

        public Criteria andStorePackNameIn(List<String> values) {
            addCriterion("store_pack_name in", values, "storePackName");
            return (Criteria) this;
        }

        public Criteria andStorePackNameNotIn(List<String> values) {
            addCriterion("store_pack_name not in", values, "storePackName");
            return (Criteria) this;
        }

        public Criteria andStorePackNameBetween(String value1, String value2) {
            addCriterion("store_pack_name between", value1, value2, "storePackName");
            return (Criteria) this;
        }

        public Criteria andStorePackNameNotBetween(String value1, String value2) {
            addCriterion("store_pack_name not between", value1, value2, "storePackName");
            return (Criteria) this;
        }

        public Criteria andStoreLocationIsNull() {
            addCriterion("store_location is null");
            return (Criteria) this;
        }

        public Criteria andStoreLocationIsNotNull() {
            addCriterion("store_location is not null");
            return (Criteria) this;
        }

        public Criteria andStoreLocationEqualTo(String value) {
            addCriterion("store_location =", value, "storeLocation");
            return (Criteria) this;
        }

        public Criteria andStoreLocationNotEqualTo(String value) {
            addCriterion("store_location <>", value, "storeLocation");
            return (Criteria) this;
        }

        public Criteria andStoreLocationGreaterThan(String value) {
            addCriterion("store_location >", value, "storeLocation");
            return (Criteria) this;
        }

        public Criteria andStoreLocationGreaterThanOrEqualTo(String value) {
            addCriterion("store_location >=", value, "storeLocation");
            return (Criteria) this;
        }

        public Criteria andStoreLocationLessThan(String value) {
            addCriterion("store_location <", value, "storeLocation");
            return (Criteria) this;
        }

        public Criteria andStoreLocationLessThanOrEqualTo(String value) {
            addCriterion("store_location <=", value, "storeLocation");
            return (Criteria) this;
        }

        public Criteria andStoreLocationLike(String value) {
            addCriterion("store_location like", value, "storeLocation");
            return (Criteria) this;
        }

        public Criteria andStoreLocationNotLike(String value) {
            addCriterion("store_location not like", value, "storeLocation");
            return (Criteria) this;
        }

        public Criteria andStoreLocationIn(List<String> values) {
            addCriterion("store_location in", values, "storeLocation");
            return (Criteria) this;
        }

        public Criteria andStoreLocationNotIn(List<String> values) {
            addCriterion("store_location not in", values, "storeLocation");
            return (Criteria) this;
        }

        public Criteria andStoreLocationBetween(String value1, String value2) {
            addCriterion("store_location between", value1, value2, "storeLocation");
            return (Criteria) this;
        }

        public Criteria andStoreLocationNotBetween(String value1, String value2) {
            addCriterion("store_location not between", value1, value2, "storeLocation");
            return (Criteria) this;
        }

        public Criteria andStoreAddressIsNull() {
            addCriterion("store_address is null");
            return (Criteria) this;
        }

        public Criteria andStoreAddressIsNotNull() {
            addCriterion("store_address is not null");
            return (Criteria) this;
        }

        public Criteria andStoreAddressEqualTo(String value) {
            addCriterion("store_address =", value, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressNotEqualTo(String value) {
            addCriterion("store_address <>", value, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressGreaterThan(String value) {
            addCriterion("store_address >", value, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressGreaterThanOrEqualTo(String value) {
            addCriterion("store_address >=", value, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressLessThan(String value) {
            addCriterion("store_address <", value, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressLessThanOrEqualTo(String value) {
            addCriterion("store_address <=", value, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressLike(String value) {
            addCriterion("store_address like", value, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressNotLike(String value) {
            addCriterion("store_address not like", value, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressIn(List<String> values) {
            addCriterion("store_address in", values, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressNotIn(List<String> values) {
            addCriterion("store_address not in", values, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressBetween(String value1, String value2) {
            addCriterion("store_address between", value1, value2, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressNotBetween(String value1, String value2) {
            addCriterion("store_address not between", value1, value2, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreRemarkIsNull() {
            addCriterion("store_remark is null");
            return (Criteria) this;
        }

        public Criteria andStoreRemarkIsNotNull() {
            addCriterion("store_remark is not null");
            return (Criteria) this;
        }

        public Criteria andStoreRemarkEqualTo(String value) {
            addCriterion("store_remark =", value, "storeRemark");
            return (Criteria) this;
        }

        public Criteria andStoreRemarkNotEqualTo(String value) {
            addCriterion("store_remark <>", value, "storeRemark");
            return (Criteria) this;
        }

        public Criteria andStoreRemarkGreaterThan(String value) {
            addCriterion("store_remark >", value, "storeRemark");
            return (Criteria) this;
        }

        public Criteria andStoreRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("store_remark >=", value, "storeRemark");
            return (Criteria) this;
        }

        public Criteria andStoreRemarkLessThan(String value) {
            addCriterion("store_remark <", value, "storeRemark");
            return (Criteria) this;
        }

        public Criteria andStoreRemarkLessThanOrEqualTo(String value) {
            addCriterion("store_remark <=", value, "storeRemark");
            return (Criteria) this;
        }

        public Criteria andStoreRemarkLike(String value) {
            addCriterion("store_remark like", value, "storeRemark");
            return (Criteria) this;
        }

        public Criteria andStoreRemarkNotLike(String value) {
            addCriterion("store_remark not like", value, "storeRemark");
            return (Criteria) this;
        }

        public Criteria andStoreRemarkIn(List<String> values) {
            addCriterion("store_remark in", values, "storeRemark");
            return (Criteria) this;
        }

        public Criteria andStoreRemarkNotIn(List<String> values) {
            addCriterion("store_remark not in", values, "storeRemark");
            return (Criteria) this;
        }

        public Criteria andStoreRemarkBetween(String value1, String value2) {
            addCriterion("store_remark between", value1, value2, "storeRemark");
            return (Criteria) this;
        }

        public Criteria andStoreRemarkNotBetween(String value1, String value2) {
            addCriterion("store_remark not between", value1, value2, "storeRemark");
            return (Criteria) this;
        }

        public Criteria andStorePackRemarkIsNull() {
            addCriterion("store_pack_remark is null");
            return (Criteria) this;
        }

        public Criteria andStorePackRemarkIsNotNull() {
            addCriterion("store_pack_remark is not null");
            return (Criteria) this;
        }

        public Criteria andStorePackRemarkEqualTo(String value) {
            addCriterion("store_pack_remark =", value, "storePackRemark");
            return (Criteria) this;
        }

        public Criteria andStorePackRemarkNotEqualTo(String value) {
            addCriterion("store_pack_remark <>", value, "storePackRemark");
            return (Criteria) this;
        }

        public Criteria andStorePackRemarkGreaterThan(String value) {
            addCriterion("store_pack_remark >", value, "storePackRemark");
            return (Criteria) this;
        }

        public Criteria andStorePackRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("store_pack_remark >=", value, "storePackRemark");
            return (Criteria) this;
        }

        public Criteria andStorePackRemarkLessThan(String value) {
            addCriterion("store_pack_remark <", value, "storePackRemark");
            return (Criteria) this;
        }

        public Criteria andStorePackRemarkLessThanOrEqualTo(String value) {
            addCriterion("store_pack_remark <=", value, "storePackRemark");
            return (Criteria) this;
        }

        public Criteria andStorePackRemarkLike(String value) {
            addCriterion("store_pack_remark like", value, "storePackRemark");
            return (Criteria) this;
        }

        public Criteria andStorePackRemarkNotLike(String value) {
            addCriterion("store_pack_remark not like", value, "storePackRemark");
            return (Criteria) this;
        }

        public Criteria andStorePackRemarkIn(List<String> values) {
            addCriterion("store_pack_remark in", values, "storePackRemark");
            return (Criteria) this;
        }

        public Criteria andStorePackRemarkNotIn(List<String> values) {
            addCriterion("store_pack_remark not in", values, "storePackRemark");
            return (Criteria) this;
        }

        public Criteria andStorePackRemarkBetween(String value1, String value2) {
            addCriterion("store_pack_remark between", value1, value2, "storePackRemark");
            return (Criteria) this;
        }

        public Criteria andStorePackRemarkNotBetween(String value1, String value2) {
            addCriterion("store_pack_remark not between", value1, value2, "storePackRemark");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}