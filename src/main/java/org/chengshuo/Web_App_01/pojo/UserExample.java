package org.chengshuo.Web_App_01.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class UserExample implements Serializable {
    private static final long serialVersionUID = -2598771415044618175L;
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUsidIsNull() {
            addCriterion("usid is null");
            return (Criteria) this;
        }

        public Criteria andUsidIsNotNull() {
            addCriterion("usid is not null");
            return (Criteria) this;
        }

        public Criteria andUsidEqualTo(Integer value) {
            addCriterion("usid =", value, "usid");
            return (Criteria) this;
        }

        public Criteria andUsidNotEqualTo(Integer value) {
            addCriterion("usid <>", value, "usid");
            return (Criteria) this;
        }

        public Criteria andUsidGreaterThan(Integer value) {
            addCriterion("usid >", value, "usid");
            return (Criteria) this;
        }

        public Criteria andUsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("usid >=", value, "usid");
            return (Criteria) this;
        }

        public Criteria andUsidLessThan(Integer value) {
            addCriterion("usid <", value, "usid");
            return (Criteria) this;
        }

        public Criteria andUsidLessThanOrEqualTo(Integer value) {
            addCriterion("usid <=", value, "usid");
            return (Criteria) this;
        }

        public Criteria andUsidIn(List<Integer> values) {
            addCriterion("usid in", values, "usid");
            return (Criteria) this;
        }

        public Criteria andUsidNotIn(List<Integer> values) {
            addCriterion("usid not in", values, "usid");
            return (Criteria) this;
        }

        public Criteria andUsidBetween(Integer value1, Integer value2) {
            addCriterion("usid between", value1, value2, "usid");
            return (Criteria) this;
        }

        public Criteria andUsidNotBetween(Integer value1, Integer value2) {
            addCriterion("usid not between", value1, value2, "usid");
            return (Criteria) this;
        }

        public Criteria andUsnameIsNull() {
            addCriterion("usname is null");
            return (Criteria) this;
        }

        public Criteria andUsnameIsNotNull() {
            addCriterion("usname is not null");
            return (Criteria) this;
        }

        public Criteria andUsnameEqualTo(String value) {
            addCriterion("usname =", value, "usname");
            return (Criteria) this;
        }

        public Criteria andUsnameNotEqualTo(String value) {
            addCriterion("usname <>", value, "usname");
            return (Criteria) this;
        }

        public Criteria andUsnameGreaterThan(String value) {
            addCriterion("usname >", value, "usname");
            return (Criteria) this;
        }

        public Criteria andUsnameGreaterThanOrEqualTo(String value) {
            addCriterion("usname >=", value, "usname");
            return (Criteria) this;
        }

        public Criteria andUsnameLessThan(String value) {
            addCriterion("usname <", value, "usname");
            return (Criteria) this;
        }

        public Criteria andUsnameLessThanOrEqualTo(String value) {
            addCriterion("usname <=", value, "usname");
            return (Criteria) this;
        }

        public Criteria andUsnameLike(String value) {
            addCriterion("usname like", value, "usname");
            return (Criteria) this;
        }

        public Criteria andUsnameNotLike(String value) {
            addCriterion("usname not like", value, "usname");
            return (Criteria) this;
        }

        public Criteria andUsnameIn(List<String> values) {
            addCriterion("usname in", values, "usname");
            return (Criteria) this;
        }

        public Criteria andUsnameNotIn(List<String> values) {
            addCriterion("usname not in", values, "usname");
            return (Criteria) this;
        }

        public Criteria andUsnameBetween(String value1, String value2) {
            addCriterion("usname between", value1, value2, "usname");
            return (Criteria) this;
        }

        public Criteria andUsnameNotBetween(String value1, String value2) {
            addCriterion("usname not between", value1, value2, "usname");
            return (Criteria) this;
        }

        public Criteria andUsphoneIsNull() {
            addCriterion("usphone is null");
            return (Criteria) this;
        }

        public Criteria andUsphoneIsNotNull() {
            addCriterion("usphone is not null");
            return (Criteria) this;
        }

        public Criteria andUsphoneEqualTo(String value) {
            addCriterion("usphone =", value, "usphone");
            return (Criteria) this;
        }

        public Criteria andUsphoneNotEqualTo(String value) {
            addCriterion("usphone <>", value, "usphone");
            return (Criteria) this;
        }

        public Criteria andUsphoneGreaterThan(String value) {
            addCriterion("usphone >", value, "usphone");
            return (Criteria) this;
        }

        public Criteria andUsphoneGreaterThanOrEqualTo(String value) {
            addCriterion("usphone >=", value, "usphone");
            return (Criteria) this;
        }

        public Criteria andUsphoneLessThan(String value) {
            addCriterion("usphone <", value, "usphone");
            return (Criteria) this;
        }

        public Criteria andUsphoneLessThanOrEqualTo(String value) {
            addCriterion("usphone <=", value, "usphone");
            return (Criteria) this;
        }

        public Criteria andUsphoneLike(String value) {
            addCriterion("usphone like", value, "usphone");
            return (Criteria) this;
        }

        public Criteria andUsphoneNotLike(String value) {
            addCriterion("usphone not like", value, "usphone");
            return (Criteria) this;
        }

        public Criteria andUsphoneIn(List<String> values) {
            addCriterion("usphone in", values, "usphone");
            return (Criteria) this;
        }

        public Criteria andUsphoneNotIn(List<String> values) {
            addCriterion("usphone not in", values, "usphone");
            return (Criteria) this;
        }

        public Criteria andUsphoneBetween(String value1, String value2) {
            addCriterion("usphone between", value1, value2, "usphone");
            return (Criteria) this;
        }

        public Criteria andUsphoneNotBetween(String value1, String value2) {
            addCriterion("usphone not between", value1, value2, "usphone");
            return (Criteria) this;
        }

        public Criteria andUspassIsNull() {
            addCriterion("uspass is null");
            return (Criteria) this;
        }

        public Criteria andUspassIsNotNull() {
            addCriterion("uspass is not null");
            return (Criteria) this;
        }

        public Criteria andUspassEqualTo(String value) {
            addCriterion("uspass =", value, "uspass");
            return (Criteria) this;
        }

        public Criteria andUspassNotEqualTo(String value) {
            addCriterion("uspass <>", value, "uspass");
            return (Criteria) this;
        }

        public Criteria andUspassGreaterThan(String value) {
            addCriterion("uspass >", value, "uspass");
            return (Criteria) this;
        }

        public Criteria andUspassGreaterThanOrEqualTo(String value) {
            addCriterion("uspass >=", value, "uspass");
            return (Criteria) this;
        }

        public Criteria andUspassLessThan(String value) {
            addCriterion("uspass <", value, "uspass");
            return (Criteria) this;
        }

        public Criteria andUspassLessThanOrEqualTo(String value) {
            addCriterion("uspass <=", value, "uspass");
            return (Criteria) this;
        }

        public Criteria andUspassLike(String value) {
            addCriterion("uspass like", value, "uspass");
            return (Criteria) this;
        }

        public Criteria andUspassNotLike(String value) {
            addCriterion("uspass not like", value, "uspass");
            return (Criteria) this;
        }

        public Criteria andUspassIn(List<String> values) {
            addCriterion("uspass in", values, "uspass");
            return (Criteria) this;
        }

        public Criteria andUspassNotIn(List<String> values) {
            addCriterion("uspass not in", values, "uspass");
            return (Criteria) this;
        }

        public Criteria andUspassBetween(String value1, String value2) {
            addCriterion("uspass between", value1, value2, "uspass");
            return (Criteria) this;
        }

        public Criteria andUspassNotBetween(String value1, String value2) {
            addCriterion("uspass not between", value1, value2, "uspass");
            return (Criteria) this;
        }

        public Criteria andUsemailIsNull() {
            addCriterion("usemail is null");
            return (Criteria) this;
        }

        public Criteria andUsemailIsNotNull() {
            addCriterion("usemail is not null");
            return (Criteria) this;
        }

        public Criteria andUsemailEqualTo(String value) {
            addCriterion("usemail =", value, "usemail");
            return (Criteria) this;
        }

        public Criteria andUsemailNotEqualTo(String value) {
            addCriterion("usemail <>", value, "usemail");
            return (Criteria) this;
        }

        public Criteria andUsemailGreaterThan(String value) {
            addCriterion("usemail >", value, "usemail");
            return (Criteria) this;
        }

        public Criteria andUsemailGreaterThanOrEqualTo(String value) {
            addCriterion("usemail >=", value, "usemail");
            return (Criteria) this;
        }

        public Criteria andUsemailLessThan(String value) {
            addCriterion("usemail <", value, "usemail");
            return (Criteria) this;
        }

        public Criteria andUsemailLessThanOrEqualTo(String value) {
            addCriterion("usemail <=", value, "usemail");
            return (Criteria) this;
        }

        public Criteria andUsemailLike(String value) {
            addCriterion("usemail like", value, "usemail");
            return (Criteria) this;
        }

        public Criteria andUsemailNotLike(String value) {
            addCriterion("usemail not like", value, "usemail");
            return (Criteria) this;
        }

        public Criteria andUsemailIn(List<String> values) {
            addCriterion("usemail in", values, "usemail");
            return (Criteria) this;
        }

        public Criteria andUsemailNotIn(List<String> values) {
            addCriterion("usemail not in", values, "usemail");
            return (Criteria) this;
        }

        public Criteria andUsemailBetween(String value1, String value2) {
            addCriterion("usemail between", value1, value2, "usemail");
            return (Criteria) this;
        }

        public Criteria andUsemailNotBetween(String value1, String value2) {
            addCriterion("usemail not between", value1, value2, "usemail");
            return (Criteria) this;
        }

        public Criteria andUsimgIsNull() {
            addCriterion("usimg is null");
            return (Criteria) this;
        }

        public Criteria andUsimgIsNotNull() {
            addCriterion("usimg is not null");
            return (Criteria) this;
        }

        public Criteria andUsimgEqualTo(String value) {
            addCriterion("usimg =", value, "usimg");
            return (Criteria) this;
        }

        public Criteria andUsimgNotEqualTo(String value) {
            addCriterion("usimg <>", value, "usimg");
            return (Criteria) this;
        }

        public Criteria andUsimgGreaterThan(String value) {
            addCriterion("usimg >", value, "usimg");
            return (Criteria) this;
        }

        public Criteria andUsimgGreaterThanOrEqualTo(String value) {
            addCriterion("usimg >=", value, "usimg");
            return (Criteria) this;
        }

        public Criteria andUsimgLessThan(String value) {
            addCriterion("usimg <", value, "usimg");
            return (Criteria) this;
        }

        public Criteria andUsimgLessThanOrEqualTo(String value) {
            addCriterion("usimg <=", value, "usimg");
            return (Criteria) this;
        }

        public Criteria andUsimgLike(String value) {
            addCriterion("usimg like", value, "usimg");
            return (Criteria) this;
        }

        public Criteria andUsimgNotLike(String value) {
            addCriterion("usimg not like", value, "usimg");
            return (Criteria) this;
        }

        public Criteria andUsimgIn(List<String> values) {
            addCriterion("usimg in", values, "usimg");
            return (Criteria) this;
        }

        public Criteria andUsimgNotIn(List<String> values) {
            addCriterion("usimg not in", values, "usimg");
            return (Criteria) this;
        }

        public Criteria andUsimgBetween(String value1, String value2) {
            addCriterion("usimg between", value1, value2, "usimg");
            return (Criteria) this;
        }

        public Criteria andUsimgNotBetween(String value1, String value2) {
            addCriterion("usimg not between", value1, value2, "usimg");
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