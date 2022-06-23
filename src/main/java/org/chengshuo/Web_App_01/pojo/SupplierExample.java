package org.chengshuo.Web_App_01.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SupplierExample implements Serializable {
    private static final long serialVersionUID = 4464307314299835393L;
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SupplierExample() {
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

        public Criteria andSuidIsNull() {
            addCriterion("suid is null");
            return (Criteria) this;
        }

        public Criteria andSuidIsNotNull() {
            addCriterion("suid is not null");
            return (Criteria) this;
        }

        public Criteria andSuidEqualTo(Integer value) {
            addCriterion("suid =", value, "suid");
            return (Criteria) this;
        }

        public Criteria andSuidNotEqualTo(Integer value) {
            addCriterion("suid <>", value, "suid");
            return (Criteria) this;
        }

        public Criteria andSuidGreaterThan(Integer value) {
            addCriterion("suid >", value, "suid");
            return (Criteria) this;
        }

        public Criteria andSuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("suid >=", value, "suid");
            return (Criteria) this;
        }

        public Criteria andSuidLessThan(Integer value) {
            addCriterion("suid <", value, "suid");
            return (Criteria) this;
        }

        public Criteria andSuidLessThanOrEqualTo(Integer value) {
            addCriterion("suid <=", value, "suid");
            return (Criteria) this;
        }

        public Criteria andSuidIn(List<Integer> values) {
            addCriterion("suid in", values, "suid");
            return (Criteria) this;
        }

        public Criteria andSuidNotIn(List<Integer> values) {
            addCriterion("suid not in", values, "suid");
            return (Criteria) this;
        }

        public Criteria andSuidBetween(Integer value1, Integer value2) {
            addCriterion("suid between", value1, value2, "suid");
            return (Criteria) this;
        }

        public Criteria andSuidNotBetween(Integer value1, Integer value2) {
            addCriterion("suid not between", value1, value2, "suid");
            return (Criteria) this;
        }

        public Criteria andSunameIsNull() {
            addCriterion("suname is null");
            return (Criteria) this;
        }

        public Criteria andSunameIsNotNull() {
            addCriterion("suname is not null");
            return (Criteria) this;
        }

        public Criteria andSunameEqualTo(String value) {
            addCriterion("suname =", value, "suname");
            return (Criteria) this;
        }

        public Criteria andSunameNotEqualTo(String value) {
            addCriterion("suname <>", value, "suname");
            return (Criteria) this;
        }

        public Criteria andSunameGreaterThan(String value) {
            addCriterion("suname >", value, "suname");
            return (Criteria) this;
        }

        public Criteria andSunameGreaterThanOrEqualTo(String value) {
            addCriterion("suname >=", value, "suname");
            return (Criteria) this;
        }

        public Criteria andSunameLessThan(String value) {
            addCriterion("suname <", value, "suname");
            return (Criteria) this;
        }

        public Criteria andSunameLessThanOrEqualTo(String value) {
            addCriterion("suname <=", value, "suname");
            return (Criteria) this;
        }

        public Criteria andSunameLike(String value) {
            addCriterion("suname like", value, "suname");
            return (Criteria) this;
        }

        public Criteria andSunameNotLike(String value) {
            addCriterion("suname not like", value, "suname");
            return (Criteria) this;
        }

        public Criteria andSunameIn(List<String> values) {
            addCriterion("suname in", values, "suname");
            return (Criteria) this;
        }

        public Criteria andSunameNotIn(List<String> values) {
            addCriterion("suname not in", values, "suname");
            return (Criteria) this;
        }

        public Criteria andSunameBetween(String value1, String value2) {
            addCriterion("suname between", value1, value2, "suname");
            return (Criteria) this;
        }

        public Criteria andSunameNotBetween(String value1, String value2) {
            addCriterion("suname not between", value1, value2, "suname");
            return (Criteria) this;
        }

        public Criteria andSuaddressIsNull() {
            addCriterion("suaddress is null");
            return (Criteria) this;
        }

        public Criteria andSuaddressIsNotNull() {
            addCriterion("suaddress is not null");
            return (Criteria) this;
        }

        public Criteria andSuaddressEqualTo(String value) {
            addCriterion("suaddress =", value, "suaddress");
            return (Criteria) this;
        }

        public Criteria andSuaddressNotEqualTo(String value) {
            addCriterion("suaddress <>", value, "suaddress");
            return (Criteria) this;
        }

        public Criteria andSuaddressGreaterThan(String value) {
            addCriterion("suaddress >", value, "suaddress");
            return (Criteria) this;
        }

        public Criteria andSuaddressGreaterThanOrEqualTo(String value) {
            addCriterion("suaddress >=", value, "suaddress");
            return (Criteria) this;
        }

        public Criteria andSuaddressLessThan(String value) {
            addCriterion("suaddress <", value, "suaddress");
            return (Criteria) this;
        }

        public Criteria andSuaddressLessThanOrEqualTo(String value) {
            addCriterion("suaddress <=", value, "suaddress");
            return (Criteria) this;
        }

        public Criteria andSuaddressLike(String value) {
            addCriterion("suaddress like", value, "suaddress");
            return (Criteria) this;
        }

        public Criteria andSuaddressNotLike(String value) {
            addCriterion("suaddress not like", value, "suaddress");
            return (Criteria) this;
        }

        public Criteria andSuaddressIn(List<String> values) {
            addCriterion("suaddress in", values, "suaddress");
            return (Criteria) this;
        }

        public Criteria andSuaddressNotIn(List<String> values) {
            addCriterion("suaddress not in", values, "suaddress");
            return (Criteria) this;
        }

        public Criteria andSuaddressBetween(String value1, String value2) {
            addCriterion("suaddress between", value1, value2, "suaddress");
            return (Criteria) this;
        }

        public Criteria andSuaddressNotBetween(String value1, String value2) {
            addCriterion("suaddress not between", value1, value2, "suaddress");
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