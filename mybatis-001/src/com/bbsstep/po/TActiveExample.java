package com.bbsstep.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TActiveExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TActiveExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Long value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Long value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Long value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Long value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Long value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Long value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Long> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Long> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Long value1, Long value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Long value1, Long value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andActivenameIsNull() {
            addCriterion("activename is null");
            return (Criteria) this;
        }

        public Criteria andActivenameIsNotNull() {
            addCriterion("activename is not null");
            return (Criteria) this;
        }

        public Criteria andActivenameEqualTo(String value) {
            addCriterion("activename =", value, "activename");
            return (Criteria) this;
        }

        public Criteria andActivenameNotEqualTo(String value) {
            addCriterion("activename <>", value, "activename");
            return (Criteria) this;
        }

        public Criteria andActivenameGreaterThan(String value) {
            addCriterion("activename >", value, "activename");
            return (Criteria) this;
        }

        public Criteria andActivenameGreaterThanOrEqualTo(String value) {
            addCriterion("activename >=", value, "activename");
            return (Criteria) this;
        }

        public Criteria andActivenameLessThan(String value) {
            addCriterion("activename <", value, "activename");
            return (Criteria) this;
        }

        public Criteria andActivenameLessThanOrEqualTo(String value) {
            addCriterion("activename <=", value, "activename");
            return (Criteria) this;
        }

        public Criteria andActivenameLike(String value) {
            addCriterion("activename like", value, "activename");
            return (Criteria) this;
        }

        public Criteria andActivenameNotLike(String value) {
            addCriterion("activename not like", value, "activename");
            return (Criteria) this;
        }

        public Criteria andActivenameIn(List<String> values) {
            addCriterion("activename in", values, "activename");
            return (Criteria) this;
        }

        public Criteria andActivenameNotIn(List<String> values) {
            addCriterion("activename not in", values, "activename");
            return (Criteria) this;
        }

        public Criteria andActivenameBetween(String value1, String value2) {
            addCriterion("activename between", value1, value2, "activename");
            return (Criteria) this;
        }

        public Criteria andActivenameNotBetween(String value1, String value2) {
            addCriterion("activename not between", value1, value2, "activename");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Long value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Long value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Long value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Long value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Long value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Long value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Long> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Long> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Long value1, Long value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Long value1, Long value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNull() {
            addCriterion("startdate is null");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNotNull() {
            addCriterion("startdate is not null");
            return (Criteria) this;
        }

        public Criteria andStartdateEqualTo(Date value) {
            addCriterion("startdate =", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotEqualTo(Date value) {
            addCriterion("startdate <>", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThan(Date value) {
            addCriterion("startdate >", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThanOrEqualTo(Date value) {
            addCriterion("startdate >=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThan(Date value) {
            addCriterion("startdate <", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThanOrEqualTo(Date value) {
            addCriterion("startdate <=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateIn(List<Date> values) {
            addCriterion("startdate in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotIn(List<Date> values) {
            addCriterion("startdate not in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateBetween(Date value1, Date value2) {
            addCriterion("startdate between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotBetween(Date value1, Date value2) {
            addCriterion("startdate not between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNull() {
            addCriterion("enddate is null");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNotNull() {
            addCriterion("enddate is not null");
            return (Criteria) this;
        }

        public Criteria andEnddateEqualTo(Date value) {
            addCriterion("enddate =", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotEqualTo(Date value) {
            addCriterion("enddate <>", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThan(Date value) {
            addCriterion("enddate >", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThanOrEqualTo(Date value) {
            addCriterion("enddate >=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThan(Date value) {
            addCriterion("enddate <", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThanOrEqualTo(Date value) {
            addCriterion("enddate <=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateIn(List<Date> values) {
            addCriterion("enddate in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotIn(List<Date> values) {
            addCriterion("enddate not in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateBetween(Date value1, Date value2) {
            addCriterion("enddate between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotBetween(Date value1, Date value2) {
            addCriterion("enddate not between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
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

        public Criteria andLongitudeIsNull() {
            addCriterion("longitude is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("longitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(Float value) {
            addCriterion("longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(Float value) {
            addCriterion("longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(Float value) {
            addCriterion("longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(Float value) {
            addCriterion("longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(Float value) {
            addCriterion("longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(Float value) {
            addCriterion("longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<Float> values) {
            addCriterion("longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<Float> values) {
            addCriterion("longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(Float value1, Float value2) {
            addCriterion("longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(Float value1, Float value2) {
            addCriterion("longitude not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("latitude is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("latitude is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(Float value) {
            addCriterion("latitude =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(Float value) {
            addCriterion("latitude <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(Float value) {
            addCriterion("latitude >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(Float value) {
            addCriterion("latitude >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(Float value) {
            addCriterion("latitude <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(Float value) {
            addCriterion("latitude <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<Float> values) {
            addCriterion("latitude in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<Float> values) {
            addCriterion("latitude not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(Float value1, Float value2) {
            addCriterion("latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(Float value1, Float value2) {
            addCriterion("latitude not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andRadiusIsNull() {
            addCriterion("radius is null");
            return (Criteria) this;
        }

        public Criteria andRadiusIsNotNull() {
            addCriterion("radius is not null");
            return (Criteria) this;
        }

        public Criteria andRadiusEqualTo(Float value) {
            addCriterion("radius =", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusNotEqualTo(Float value) {
            addCriterion("radius <>", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusGreaterThan(Float value) {
            addCriterion("radius >", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusGreaterThanOrEqualTo(Float value) {
            addCriterion("radius >=", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusLessThan(Float value) {
            addCriterion("radius <", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusLessThanOrEqualTo(Float value) {
            addCriterion("radius <=", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusIn(List<Float> values) {
            addCriterion("radius in", values, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusNotIn(List<Float> values) {
            addCriterion("radius not in", values, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusBetween(Float value1, Float value2) {
            addCriterion("radius between", value1, value2, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusNotBetween(Float value1, Float value2) {
            addCriterion("radius not between", value1, value2, "radius");
            return (Criteria) this;
        }

        public Criteria andAddrIsNull() {
            addCriterion("addr is null");
            return (Criteria) this;
        }

        public Criteria andAddrIsNotNull() {
            addCriterion("addr is not null");
            return (Criteria) this;
        }

        public Criteria andAddrEqualTo(String value) {
            addCriterion("addr =", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotEqualTo(String value) {
            addCriterion("addr <>", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrGreaterThan(String value) {
            addCriterion("addr >", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrGreaterThanOrEqualTo(String value) {
            addCriterion("addr >=", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLessThan(String value) {
            addCriterion("addr <", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLessThanOrEqualTo(String value) {
            addCriterion("addr <=", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLike(String value) {
            addCriterion("addr like", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotLike(String value) {
            addCriterion("addr not like", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrIn(List<String> values) {
            addCriterion("addr in", values, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotIn(List<String> values) {
            addCriterion("addr not in", values, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrBetween(String value1, String value2) {
            addCriterion("addr between", value1, value2, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotBetween(String value1, String value2) {
            addCriterion("addr not between", value1, value2, "addr");
            return (Criteria) this;
        }

        public Criteria andPraiseIsNull() {
            addCriterion("praise is null");
            return (Criteria) this;
        }

        public Criteria andPraiseIsNotNull() {
            addCriterion("praise is not null");
            return (Criteria) this;
        }

        public Criteria andPraiseEqualTo(String value) {
            addCriterion("praise =", value, "praise");
            return (Criteria) this;
        }

        public Criteria andPraiseNotEqualTo(String value) {
            addCriterion("praise <>", value, "praise");
            return (Criteria) this;
        }

        public Criteria andPraiseGreaterThan(String value) {
            addCriterion("praise >", value, "praise");
            return (Criteria) this;
        }

        public Criteria andPraiseGreaterThanOrEqualTo(String value) {
            addCriterion("praise >=", value, "praise");
            return (Criteria) this;
        }

        public Criteria andPraiseLessThan(String value) {
            addCriterion("praise <", value, "praise");
            return (Criteria) this;
        }

        public Criteria andPraiseLessThanOrEqualTo(String value) {
            addCriterion("praise <=", value, "praise");
            return (Criteria) this;
        }

        public Criteria andPraiseLike(String value) {
            addCriterion("praise like", value, "praise");
            return (Criteria) this;
        }

        public Criteria andPraiseNotLike(String value) {
            addCriterion("praise not like", value, "praise");
            return (Criteria) this;
        }

        public Criteria andPraiseIn(List<String> values) {
            addCriterion("praise in", values, "praise");
            return (Criteria) this;
        }

        public Criteria andPraiseNotIn(List<String> values) {
            addCriterion("praise not in", values, "praise");
            return (Criteria) this;
        }

        public Criteria andPraiseBetween(String value1, String value2) {
            addCriterion("praise between", value1, value2, "praise");
            return (Criteria) this;
        }

        public Criteria andPraiseNotBetween(String value1, String value2) {
            addCriterion("praise not between", value1, value2, "praise");
            return (Criteria) this;
        }

        public Criteria andStepsIsNull() {
            addCriterion("steps is null");
            return (Criteria) this;
        }

        public Criteria andStepsIsNotNull() {
            addCriterion("steps is not null");
            return (Criteria) this;
        }

        public Criteria andStepsEqualTo(String value) {
            addCriterion("steps =", value, "steps");
            return (Criteria) this;
        }

        public Criteria andStepsNotEqualTo(String value) {
            addCriterion("steps <>", value, "steps");
            return (Criteria) this;
        }

        public Criteria andStepsGreaterThan(String value) {
            addCriterion("steps >", value, "steps");
            return (Criteria) this;
        }

        public Criteria andStepsGreaterThanOrEqualTo(String value) {
            addCriterion("steps >=", value, "steps");
            return (Criteria) this;
        }

        public Criteria andStepsLessThan(String value) {
            addCriterion("steps <", value, "steps");
            return (Criteria) this;
        }

        public Criteria andStepsLessThanOrEqualTo(String value) {
            addCriterion("steps <=", value, "steps");
            return (Criteria) this;
        }

        public Criteria andStepsLike(String value) {
            addCriterion("steps like", value, "steps");
            return (Criteria) this;
        }

        public Criteria andStepsNotLike(String value) {
            addCriterion("steps not like", value, "steps");
            return (Criteria) this;
        }

        public Criteria andStepsIn(List<String> values) {
            addCriterion("steps in", values, "steps");
            return (Criteria) this;
        }

        public Criteria andStepsNotIn(List<String> values) {
            addCriterion("steps not in", values, "steps");
            return (Criteria) this;
        }

        public Criteria andStepsBetween(String value1, String value2) {
            addCriterion("steps between", value1, value2, "steps");
            return (Criteria) this;
        }

        public Criteria andStepsNotBetween(String value1, String value2) {
            addCriterion("steps not between", value1, value2, "steps");
            return (Criteria) this;
        }

        public Criteria andActivestatusIsNull() {
            addCriterion("activestatus is null");
            return (Criteria) this;
        }

        public Criteria andActivestatusIsNotNull() {
            addCriterion("activestatus is not null");
            return (Criteria) this;
        }

        public Criteria andActivestatusEqualTo(Integer value) {
            addCriterion("activestatus =", value, "activestatus");
            return (Criteria) this;
        }

        public Criteria andActivestatusNotEqualTo(Integer value) {
            addCriterion("activestatus <>", value, "activestatus");
            return (Criteria) this;
        }

        public Criteria andActivestatusGreaterThan(Integer value) {
            addCriterion("activestatus >", value, "activestatus");
            return (Criteria) this;
        }

        public Criteria andActivestatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("activestatus >=", value, "activestatus");
            return (Criteria) this;
        }

        public Criteria andActivestatusLessThan(Integer value) {
            addCriterion("activestatus <", value, "activestatus");
            return (Criteria) this;
        }

        public Criteria andActivestatusLessThanOrEqualTo(Integer value) {
            addCriterion("activestatus <=", value, "activestatus");
            return (Criteria) this;
        }

        public Criteria andActivestatusIn(List<Integer> values) {
            addCriterion("activestatus in", values, "activestatus");
            return (Criteria) this;
        }

        public Criteria andActivestatusNotIn(List<Integer> values) {
            addCriterion("activestatus not in", values, "activestatus");
            return (Criteria) this;
        }

        public Criteria andActivestatusBetween(Integer value1, Integer value2) {
            addCriterion("activestatus between", value1, value2, "activestatus");
            return (Criteria) this;
        }

        public Criteria andActivestatusNotBetween(Integer value1, Integer value2) {
            addCriterion("activestatus not between", value1, value2, "activestatus");
            return (Criteria) this;
        }

        public Criteria andActivepowerIsNull() {
            addCriterion("activepower is null");
            return (Criteria) this;
        }

        public Criteria andActivepowerIsNotNull() {
            addCriterion("activepower is not null");
            return (Criteria) this;
        }

        public Criteria andActivepowerEqualTo(Integer value) {
            addCriterion("activepower =", value, "activepower");
            return (Criteria) this;
        }

        public Criteria andActivepowerNotEqualTo(Integer value) {
            addCriterion("activepower <>", value, "activepower");
            return (Criteria) this;
        }

        public Criteria andActivepowerGreaterThan(Integer value) {
            addCriterion("activepower >", value, "activepower");
            return (Criteria) this;
        }

        public Criteria andActivepowerGreaterThanOrEqualTo(Integer value) {
            addCriterion("activepower >=", value, "activepower");
            return (Criteria) this;
        }

        public Criteria andActivepowerLessThan(Integer value) {
            addCriterion("activepower <", value, "activepower");
            return (Criteria) this;
        }

        public Criteria andActivepowerLessThanOrEqualTo(Integer value) {
            addCriterion("activepower <=", value, "activepower");
            return (Criteria) this;
        }

        public Criteria andActivepowerIn(List<Integer> values) {
            addCriterion("activepower in", values, "activepower");
            return (Criteria) this;
        }

        public Criteria andActivepowerNotIn(List<Integer> values) {
            addCriterion("activepower not in", values, "activepower");
            return (Criteria) this;
        }

        public Criteria andActivepowerBetween(Integer value1, Integer value2) {
            addCriterion("activepower between", value1, value2, "activepower");
            return (Criteria) this;
        }

        public Criteria andActivepowerNotBetween(Integer value1, Integer value2) {
            addCriterion("activepower not between", value1, value2, "activepower");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("createdate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("createdate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterion("createdate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterion("createdate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterion("createdate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("createdate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterion("createdate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("createdate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterion("createdate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterion("createdate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterion("createdate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("createdate not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIsNull() {
            addCriterion("updatedate is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIsNotNull() {
            addCriterion("updatedate is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedateEqualTo(Date value) {
            addCriterion("updatedate =", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotEqualTo(Date value) {
            addCriterion("updatedate <>", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThan(Date value) {
            addCriterion("updatedate >", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("updatedate >=", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThan(Date value) {
            addCriterion("updatedate <", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThanOrEqualTo(Date value) {
            addCriterion("updatedate <=", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIn(List<Date> values) {
            addCriterion("updatedate in", values, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotIn(List<Date> values) {
            addCriterion("updatedate not in", values, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateBetween(Date value1, Date value2) {
            addCriterion("updatedate between", value1, value2, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotBetween(Date value1, Date value2) {
            addCriterion("updatedate not between", value1, value2, "updatedate");
            return (Criteria) this;
        }

        public Criteria andActivesexIsNull() {
            addCriterion("activesex is null");
            return (Criteria) this;
        }

        public Criteria andActivesexIsNotNull() {
            addCriterion("activesex is not null");
            return (Criteria) this;
        }

        public Criteria andActivesexEqualTo(Integer value) {
            addCriterion("activesex =", value, "activesex");
            return (Criteria) this;
        }

        public Criteria andActivesexNotEqualTo(Integer value) {
            addCriterion("activesex <>", value, "activesex");
            return (Criteria) this;
        }

        public Criteria andActivesexGreaterThan(Integer value) {
            addCriterion("activesex >", value, "activesex");
            return (Criteria) this;
        }

        public Criteria andActivesexGreaterThanOrEqualTo(Integer value) {
            addCriterion("activesex >=", value, "activesex");
            return (Criteria) this;
        }

        public Criteria andActivesexLessThan(Integer value) {
            addCriterion("activesex <", value, "activesex");
            return (Criteria) this;
        }

        public Criteria andActivesexLessThanOrEqualTo(Integer value) {
            addCriterion("activesex <=", value, "activesex");
            return (Criteria) this;
        }

        public Criteria andActivesexIn(List<Integer> values) {
            addCriterion("activesex in", values, "activesex");
            return (Criteria) this;
        }

        public Criteria andActivesexNotIn(List<Integer> values) {
            addCriterion("activesex not in", values, "activesex");
            return (Criteria) this;
        }

        public Criteria andActivesexBetween(Integer value1, Integer value2) {
            addCriterion("activesex between", value1, value2, "activesex");
            return (Criteria) this;
        }

        public Criteria andActivesexNotBetween(Integer value1, Integer value2) {
            addCriterion("activesex not between", value1, value2, "activesex");
            return (Criteria) this;
        }

        public Criteria andJoinnumIsNull() {
            addCriterion("joinnum is null");
            return (Criteria) this;
        }

        public Criteria andJoinnumIsNotNull() {
            addCriterion("joinnum is not null");
            return (Criteria) this;
        }

        public Criteria andJoinnumEqualTo(Integer value) {
            addCriterion("joinnum =", value, "joinnum");
            return (Criteria) this;
        }

        public Criteria andJoinnumNotEqualTo(Integer value) {
            addCriterion("joinnum <>", value, "joinnum");
            return (Criteria) this;
        }

        public Criteria andJoinnumGreaterThan(Integer value) {
            addCriterion("joinnum >", value, "joinnum");
            return (Criteria) this;
        }

        public Criteria andJoinnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("joinnum >=", value, "joinnum");
            return (Criteria) this;
        }

        public Criteria andJoinnumLessThan(Integer value) {
            addCriterion("joinnum <", value, "joinnum");
            return (Criteria) this;
        }

        public Criteria andJoinnumLessThanOrEqualTo(Integer value) {
            addCriterion("joinnum <=", value, "joinnum");
            return (Criteria) this;
        }

        public Criteria andJoinnumIn(List<Integer> values) {
            addCriterion("joinnum in", values, "joinnum");
            return (Criteria) this;
        }

        public Criteria andJoinnumNotIn(List<Integer> values) {
            addCriterion("joinnum not in", values, "joinnum");
            return (Criteria) this;
        }

        public Criteria andJoinnumBetween(Integer value1, Integer value2) {
            addCriterion("joinnum between", value1, value2, "joinnum");
            return (Criteria) this;
        }

        public Criteria andJoinnumNotBetween(Integer value1, Integer value2) {
            addCriterion("joinnum not between", value1, value2, "joinnum");
            return (Criteria) this;
        }

        public Criteria andCostIsNull() {
            addCriterion("cost is null");
            return (Criteria) this;
        }

        public Criteria andCostIsNotNull() {
            addCriterion("cost is not null");
            return (Criteria) this;
        }

        public Criteria andCostEqualTo(Float value) {
            addCriterion("cost =", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotEqualTo(Float value) {
            addCriterion("cost <>", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThan(Float value) {
            addCriterion("cost >", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThanOrEqualTo(Float value) {
            addCriterion("cost >=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThan(Float value) {
            addCriterion("cost <", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThanOrEqualTo(Float value) {
            addCriterion("cost <=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostIn(List<Float> values) {
            addCriterion("cost in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotIn(List<Float> values) {
            addCriterion("cost not in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostBetween(Float value1, Float value2) {
            addCriterion("cost between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotBetween(Float value1, Float value2) {
            addCriterion("cost not between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andCommissionIsNull() {
            addCriterion("commission is null");
            return (Criteria) this;
        }

        public Criteria andCommissionIsNotNull() {
            addCriterion("commission is not null");
            return (Criteria) this;
        }

        public Criteria andCommissionEqualTo(Float value) {
            addCriterion("commission =", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionNotEqualTo(Float value) {
            addCriterion("commission <>", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionGreaterThan(Float value) {
            addCriterion("commission >", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionGreaterThanOrEqualTo(Float value) {
            addCriterion("commission >=", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionLessThan(Float value) {
            addCriterion("commission <", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionLessThanOrEqualTo(Float value) {
            addCriterion("commission <=", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionIn(List<Float> values) {
            addCriterion("commission in", values, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionNotIn(List<Float> values) {
            addCriterion("commission not in", values, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionBetween(Float value1, Float value2) {
            addCriterion("commission between", value1, value2, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionNotBetween(Float value1, Float value2) {
            addCriterion("commission not between", value1, value2, "commission");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNull() {
            addCriterion("isdelete is null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNotNull() {
            addCriterion("isdelete is not null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteEqualTo(Integer value) {
            addCriterion("isdelete =", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotEqualTo(Integer value) {
            addCriterion("isdelete <>", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThan(Integer value) {
            addCriterion("isdelete >", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("isdelete >=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThan(Integer value) {
            addCriterion("isdelete <", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThanOrEqualTo(Integer value) {
            addCriterion("isdelete <=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIn(List<Integer> values) {
            addCriterion("isdelete in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotIn(List<Integer> values) {
            addCriterion("isdelete not in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteBetween(Integer value1, Integer value2) {
            addCriterion("isdelete between", value1, value2, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("isdelete not between", value1, value2, "isdelete");
            return (Criteria) this;
        }

        public Criteria andHxgroupidIsNull() {
            addCriterion("hxgroupid is null");
            return (Criteria) this;
        }

        public Criteria andHxgroupidIsNotNull() {
            addCriterion("hxgroupid is not null");
            return (Criteria) this;
        }

        public Criteria andHxgroupidEqualTo(String value) {
            addCriterion("hxgroupid =", value, "hxgroupid");
            return (Criteria) this;
        }

        public Criteria andHxgroupidNotEqualTo(String value) {
            addCriterion("hxgroupid <>", value, "hxgroupid");
            return (Criteria) this;
        }

        public Criteria andHxgroupidGreaterThan(String value) {
            addCriterion("hxgroupid >", value, "hxgroupid");
            return (Criteria) this;
        }

        public Criteria andHxgroupidGreaterThanOrEqualTo(String value) {
            addCriterion("hxgroupid >=", value, "hxgroupid");
            return (Criteria) this;
        }

        public Criteria andHxgroupidLessThan(String value) {
            addCriterion("hxgroupid <", value, "hxgroupid");
            return (Criteria) this;
        }

        public Criteria andHxgroupidLessThanOrEqualTo(String value) {
            addCriterion("hxgroupid <=", value, "hxgroupid");
            return (Criteria) this;
        }

        public Criteria andHxgroupidLike(String value) {
            addCriterion("hxgroupid like", value, "hxgroupid");
            return (Criteria) this;
        }

        public Criteria andHxgroupidNotLike(String value) {
            addCriterion("hxgroupid not like", value, "hxgroupid");
            return (Criteria) this;
        }

        public Criteria andHxgroupidIn(List<String> values) {
            addCriterion("hxgroupid in", values, "hxgroupid");
            return (Criteria) this;
        }

        public Criteria andHxgroupidNotIn(List<String> values) {
            addCriterion("hxgroupid not in", values, "hxgroupid");
            return (Criteria) this;
        }

        public Criteria andHxgroupidBetween(String value1, String value2) {
            addCriterion("hxgroupid between", value1, value2, "hxgroupid");
            return (Criteria) this;
        }

        public Criteria andHxgroupidNotBetween(String value1, String value2) {
            addCriterion("hxgroupid not between", value1, value2, "hxgroupid");
            return (Criteria) this;
        }

        public Criteria andRequirenameIsNull() {
            addCriterion("requireName is null");
            return (Criteria) this;
        }

        public Criteria andRequirenameIsNotNull() {
            addCriterion("requireName is not null");
            return (Criteria) this;
        }

        public Criteria andRequirenameEqualTo(String value) {
            addCriterion("requireName =", value, "requirename");
            return (Criteria) this;
        }

        public Criteria andRequirenameNotEqualTo(String value) {
            addCriterion("requireName <>", value, "requirename");
            return (Criteria) this;
        }

        public Criteria andRequirenameGreaterThan(String value) {
            addCriterion("requireName >", value, "requirename");
            return (Criteria) this;
        }

        public Criteria andRequirenameGreaterThanOrEqualTo(String value) {
            addCriterion("requireName >=", value, "requirename");
            return (Criteria) this;
        }

        public Criteria andRequirenameLessThan(String value) {
            addCriterion("requireName <", value, "requirename");
            return (Criteria) this;
        }

        public Criteria andRequirenameLessThanOrEqualTo(String value) {
            addCriterion("requireName <=", value, "requirename");
            return (Criteria) this;
        }

        public Criteria andRequirenameLike(String value) {
            addCriterion("requireName like", value, "requirename");
            return (Criteria) this;
        }

        public Criteria andRequirenameNotLike(String value) {
            addCriterion("requireName not like", value, "requirename");
            return (Criteria) this;
        }

        public Criteria andRequirenameIn(List<String> values) {
            addCriterion("requireName in", values, "requirename");
            return (Criteria) this;
        }

        public Criteria andRequirenameNotIn(List<String> values) {
            addCriterion("requireName not in", values, "requirename");
            return (Criteria) this;
        }

        public Criteria andRequirenameBetween(String value1, String value2) {
            addCriterion("requireName between", value1, value2, "requirename");
            return (Criteria) this;
        }

        public Criteria andRequirenameNotBetween(String value1, String value2) {
            addCriterion("requireName not between", value1, value2, "requirename");
            return (Criteria) this;
        }

        public Criteria andRequirecompIsNull() {
            addCriterion("requireComp is null");
            return (Criteria) this;
        }

        public Criteria andRequirecompIsNotNull() {
            addCriterion("requireComp is not null");
            return (Criteria) this;
        }

        public Criteria andRequirecompEqualTo(String value) {
            addCriterion("requireComp =", value, "requirecomp");
            return (Criteria) this;
        }

        public Criteria andRequirecompNotEqualTo(String value) {
            addCriterion("requireComp <>", value, "requirecomp");
            return (Criteria) this;
        }

        public Criteria andRequirecompGreaterThan(String value) {
            addCriterion("requireComp >", value, "requirecomp");
            return (Criteria) this;
        }

        public Criteria andRequirecompGreaterThanOrEqualTo(String value) {
            addCriterion("requireComp >=", value, "requirecomp");
            return (Criteria) this;
        }

        public Criteria andRequirecompLessThan(String value) {
            addCriterion("requireComp <", value, "requirecomp");
            return (Criteria) this;
        }

        public Criteria andRequirecompLessThanOrEqualTo(String value) {
            addCriterion("requireComp <=", value, "requirecomp");
            return (Criteria) this;
        }

        public Criteria andRequirecompLike(String value) {
            addCriterion("requireComp like", value, "requirecomp");
            return (Criteria) this;
        }

        public Criteria andRequirecompNotLike(String value) {
            addCriterion("requireComp not like", value, "requirecomp");
            return (Criteria) this;
        }

        public Criteria andRequirecompIn(List<String> values) {
            addCriterion("requireComp in", values, "requirecomp");
            return (Criteria) this;
        }

        public Criteria andRequirecompNotIn(List<String> values) {
            addCriterion("requireComp not in", values, "requirecomp");
            return (Criteria) this;
        }

        public Criteria andRequirecompBetween(String value1, String value2) {
            addCriterion("requireComp between", value1, value2, "requirecomp");
            return (Criteria) this;
        }

        public Criteria andRequirecompNotBetween(String value1, String value2) {
            addCriterion("requireComp not between", value1, value2, "requirecomp");
            return (Criteria) this;
        }

        public Criteria andRequirepositionIsNull() {
            addCriterion("requirePosition is null");
            return (Criteria) this;
        }

        public Criteria andRequirepositionIsNotNull() {
            addCriterion("requirePosition is not null");
            return (Criteria) this;
        }

        public Criteria andRequirepositionEqualTo(String value) {
            addCriterion("requirePosition =", value, "requireposition");
            return (Criteria) this;
        }

        public Criteria andRequirepositionNotEqualTo(String value) {
            addCriterion("requirePosition <>", value, "requireposition");
            return (Criteria) this;
        }

        public Criteria andRequirepositionGreaterThan(String value) {
            addCriterion("requirePosition >", value, "requireposition");
            return (Criteria) this;
        }

        public Criteria andRequirepositionGreaterThanOrEqualTo(String value) {
            addCriterion("requirePosition >=", value, "requireposition");
            return (Criteria) this;
        }

        public Criteria andRequirepositionLessThan(String value) {
            addCriterion("requirePosition <", value, "requireposition");
            return (Criteria) this;
        }

        public Criteria andRequirepositionLessThanOrEqualTo(String value) {
            addCriterion("requirePosition <=", value, "requireposition");
            return (Criteria) this;
        }

        public Criteria andRequirepositionLike(String value) {
            addCriterion("requirePosition like", value, "requireposition");
            return (Criteria) this;
        }

        public Criteria andRequirepositionNotLike(String value) {
            addCriterion("requirePosition not like", value, "requireposition");
            return (Criteria) this;
        }

        public Criteria andRequirepositionIn(List<String> values) {
            addCriterion("requirePosition in", values, "requireposition");
            return (Criteria) this;
        }

        public Criteria andRequirepositionNotIn(List<String> values) {
            addCriterion("requirePosition not in", values, "requireposition");
            return (Criteria) this;
        }

        public Criteria andRequirepositionBetween(String value1, String value2) {
            addCriterion("requirePosition between", value1, value2, "requireposition");
            return (Criteria) this;
        }

        public Criteria andRequirepositionNotBetween(String value1, String value2) {
            addCriterion("requirePosition not between", value1, value2, "requireposition");
            return (Criteria) this;
        }

        public Criteria andRequiremobileIsNull() {
            addCriterion("requireMobile is null");
            return (Criteria) this;
        }

        public Criteria andRequiremobileIsNotNull() {
            addCriterion("requireMobile is not null");
            return (Criteria) this;
        }

        public Criteria andRequiremobileEqualTo(String value) {
            addCriterion("requireMobile =", value, "requiremobile");
            return (Criteria) this;
        }

        public Criteria andRequiremobileNotEqualTo(String value) {
            addCriterion("requireMobile <>", value, "requiremobile");
            return (Criteria) this;
        }

        public Criteria andRequiremobileGreaterThan(String value) {
            addCriterion("requireMobile >", value, "requiremobile");
            return (Criteria) this;
        }

        public Criteria andRequiremobileGreaterThanOrEqualTo(String value) {
            addCriterion("requireMobile >=", value, "requiremobile");
            return (Criteria) this;
        }

        public Criteria andRequiremobileLessThan(String value) {
            addCriterion("requireMobile <", value, "requiremobile");
            return (Criteria) this;
        }

        public Criteria andRequiremobileLessThanOrEqualTo(String value) {
            addCriterion("requireMobile <=", value, "requiremobile");
            return (Criteria) this;
        }

        public Criteria andRequiremobileLike(String value) {
            addCriterion("requireMobile like", value, "requiremobile");
            return (Criteria) this;
        }

        public Criteria andRequiremobileNotLike(String value) {
            addCriterion("requireMobile not like", value, "requiremobile");
            return (Criteria) this;
        }

        public Criteria andRequiremobileIn(List<String> values) {
            addCriterion("requireMobile in", values, "requiremobile");
            return (Criteria) this;
        }

        public Criteria andRequiremobileNotIn(List<String> values) {
            addCriterion("requireMobile not in", values, "requiremobile");
            return (Criteria) this;
        }

        public Criteria andRequiremobileBetween(String value1, String value2) {
            addCriterion("requireMobile between", value1, value2, "requiremobile");
            return (Criteria) this;
        }

        public Criteria andRequiremobileNotBetween(String value1, String value2) {
            addCriterion("requireMobile not between", value1, value2, "requiremobile");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderIsNull() {
            addCriterion("display_order is null");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderIsNotNull() {
            addCriterion("display_order is not null");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderEqualTo(Integer value) {
            addCriterion("display_order =", value, "displayOrder");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderNotEqualTo(Integer value) {
            addCriterion("display_order <>", value, "displayOrder");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderGreaterThan(Integer value) {
            addCriterion("display_order >", value, "displayOrder");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("display_order >=", value, "displayOrder");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderLessThan(Integer value) {
            addCriterion("display_order <", value, "displayOrder");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderLessThanOrEqualTo(Integer value) {
            addCriterion("display_order <=", value, "displayOrder");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderIn(List<Integer> values) {
            addCriterion("display_order in", values, "displayOrder");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderNotIn(List<Integer> values) {
            addCriterion("display_order not in", values, "displayOrder");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderBetween(Integer value1, Integer value2) {
            addCriterion("display_order between", value1, value2, "displayOrder");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("display_order not between", value1, value2, "displayOrder");
            return (Criteria) this;
        }

        public Criteria andMaxnumIsNull() {
            addCriterion("maxnum is null");
            return (Criteria) this;
        }

        public Criteria andMaxnumIsNotNull() {
            addCriterion("maxnum is not null");
            return (Criteria) this;
        }

        public Criteria andMaxnumEqualTo(Integer value) {
            addCriterion("maxnum =", value, "maxnum");
            return (Criteria) this;
        }

        public Criteria andMaxnumNotEqualTo(Integer value) {
            addCriterion("maxnum <>", value, "maxnum");
            return (Criteria) this;
        }

        public Criteria andMaxnumGreaterThan(Integer value) {
            addCriterion("maxnum >", value, "maxnum");
            return (Criteria) this;
        }

        public Criteria andMaxnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("maxnum >=", value, "maxnum");
            return (Criteria) this;
        }

        public Criteria andMaxnumLessThan(Integer value) {
            addCriterion("maxnum <", value, "maxnum");
            return (Criteria) this;
        }

        public Criteria andMaxnumLessThanOrEqualTo(Integer value) {
            addCriterion("maxnum <=", value, "maxnum");
            return (Criteria) this;
        }

        public Criteria andMaxnumIn(List<Integer> values) {
            addCriterion("maxnum in", values, "maxnum");
            return (Criteria) this;
        }

        public Criteria andMaxnumNotIn(List<Integer> values) {
            addCriterion("maxnum not in", values, "maxnum");
            return (Criteria) this;
        }

        public Criteria andMaxnumBetween(Integer value1, Integer value2) {
            addCriterion("maxnum between", value1, value2, "maxnum");
            return (Criteria) this;
        }

        public Criteria andMaxnumNotBetween(Integer value1, Integer value2) {
            addCriterion("maxnum not between", value1, value2, "maxnum");
            return (Criteria) this;
        }

        public Criteria andRecommendIsNull() {
            addCriterion("recommend is null");
            return (Criteria) this;
        }

        public Criteria andRecommendIsNotNull() {
            addCriterion("recommend is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendEqualTo(String value) {
            addCriterion("recommend =", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendNotEqualTo(String value) {
            addCriterion("recommend <>", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendGreaterThan(String value) {
            addCriterion("recommend >", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendGreaterThanOrEqualTo(String value) {
            addCriterion("recommend >=", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendLessThan(String value) {
            addCriterion("recommend <", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendLessThanOrEqualTo(String value) {
            addCriterion("recommend <=", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendLike(String value) {
            addCriterion("recommend like", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendNotLike(String value) {
            addCriterion("recommend not like", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendIn(List<String> values) {
            addCriterion("recommend in", values, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendNotIn(List<String> values) {
            addCriterion("recommend not in", values, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendBetween(String value1, String value2) {
            addCriterion("recommend between", value1, value2, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendNotBetween(String value1, String value2) {
            addCriterion("recommend not between", value1, value2, "recommend");
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