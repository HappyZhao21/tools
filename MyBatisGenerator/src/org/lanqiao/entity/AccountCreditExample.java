package org.lanqiao.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AccountCreditExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccountCreditExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAccountNoIsNull() {
            addCriterion("account_no is null");
            return (Criteria) this;
        }

        public Criteria andAccountNoIsNotNull() {
            addCriterion("account_no is not null");
            return (Criteria) this;
        }

        public Criteria andAccountNoEqualTo(String value) {
            addCriterion("account_no =", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoNotEqualTo(String value) {
            addCriterion("account_no <>", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoGreaterThan(String value) {
            addCriterion("account_no >", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoGreaterThanOrEqualTo(String value) {
            addCriterion("account_no >=", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoLessThan(String value) {
            addCriterion("account_no <", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoLessThanOrEqualTo(String value) {
            addCriterion("account_no <=", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoLike(String value) {
            addCriterion("account_no like", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoNotLike(String value) {
            addCriterion("account_no not like", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoIn(List<String> values) {
            addCriterion("account_no in", values, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoNotIn(List<String> values) {
            addCriterion("account_no not in", values, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoBetween(String value1, String value2) {
            addCriterion("account_no between", value1, value2, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoNotBetween(String value1, String value2) {
            addCriterion("account_no not between", value1, value2, "accountNo");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNull() {
            addCriterion("balance is null");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNotNull() {
            addCriterion("balance is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceEqualTo(BigDecimal value) {
            addCriterion("balance =", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotEqualTo(BigDecimal value) {
            addCriterion("balance <>", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThan(BigDecimal value) {
            addCriterion("balance >", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("balance >=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThan(BigDecimal value) {
            addCriterion("balance <", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("balance <=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceIn(List<BigDecimal> values) {
            addCriterion("balance in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotIn(List<BigDecimal> values) {
            addCriterion("balance not in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("balance between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("balance not between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andCreditBalanceIsNull() {
            addCriterion("credit_balance is null");
            return (Criteria) this;
        }

        public Criteria andCreditBalanceIsNotNull() {
            addCriterion("credit_balance is not null");
            return (Criteria) this;
        }

        public Criteria andCreditBalanceEqualTo(BigDecimal value) {
            addCriterion("credit_balance =", value, "creditBalance");
            return (Criteria) this;
        }

        public Criteria andCreditBalanceNotEqualTo(BigDecimal value) {
            addCriterion("credit_balance <>", value, "creditBalance");
            return (Criteria) this;
        }

        public Criteria andCreditBalanceGreaterThan(BigDecimal value) {
            addCriterion("credit_balance >", value, "creditBalance");
            return (Criteria) this;
        }

        public Criteria andCreditBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("credit_balance >=", value, "creditBalance");
            return (Criteria) this;
        }

        public Criteria andCreditBalanceLessThan(BigDecimal value) {
            addCriterion("credit_balance <", value, "creditBalance");
            return (Criteria) this;
        }

        public Criteria andCreditBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("credit_balance <=", value, "creditBalance");
            return (Criteria) this;
        }

        public Criteria andCreditBalanceIn(List<BigDecimal> values) {
            addCriterion("credit_balance in", values, "creditBalance");
            return (Criteria) this;
        }

        public Criteria andCreditBalanceNotIn(List<BigDecimal> values) {
            addCriterion("credit_balance not in", values, "creditBalance");
            return (Criteria) this;
        }

        public Criteria andCreditBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("credit_balance between", value1, value2, "creditBalance");
            return (Criteria) this;
        }

        public Criteria andCreditBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("credit_balance not between", value1, value2, "creditBalance");
            return (Criteria) this;
        }

        public Criteria andCreditMaxIsNull() {
            addCriterion("credit_max is null");
            return (Criteria) this;
        }

        public Criteria andCreditMaxIsNotNull() {
            addCriterion("credit_max is not null");
            return (Criteria) this;
        }

        public Criteria andCreditMaxEqualTo(BigDecimal value) {
            addCriterion("credit_max =", value, "creditMax");
            return (Criteria) this;
        }

        public Criteria andCreditMaxNotEqualTo(BigDecimal value) {
            addCriterion("credit_max <>", value, "creditMax");
            return (Criteria) this;
        }

        public Criteria andCreditMaxGreaterThan(BigDecimal value) {
            addCriterion("credit_max >", value, "creditMax");
            return (Criteria) this;
        }

        public Criteria andCreditMaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("credit_max >=", value, "creditMax");
            return (Criteria) this;
        }

        public Criteria andCreditMaxLessThan(BigDecimal value) {
            addCriterion("credit_max <", value, "creditMax");
            return (Criteria) this;
        }

        public Criteria andCreditMaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("credit_max <=", value, "creditMax");
            return (Criteria) this;
        }

        public Criteria andCreditMaxIn(List<BigDecimal> values) {
            addCriterion("credit_max in", values, "creditMax");
            return (Criteria) this;
        }

        public Criteria andCreditMaxNotIn(List<BigDecimal> values) {
            addCriterion("credit_max not in", values, "creditMax");
            return (Criteria) this;
        }

        public Criteria andCreditMaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("credit_max between", value1, value2, "creditMax");
            return (Criteria) this;
        }

        public Criteria andCreditMaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("credit_max not between", value1, value2, "creditMax");
            return (Criteria) this;
        }

        public Criteria andCreditMinIsNull() {
            addCriterion("credit_min is null");
            return (Criteria) this;
        }

        public Criteria andCreditMinIsNotNull() {
            addCriterion("credit_min is not null");
            return (Criteria) this;
        }

        public Criteria andCreditMinEqualTo(BigDecimal value) {
            addCriterion("credit_min =", value, "creditMin");
            return (Criteria) this;
        }

        public Criteria andCreditMinNotEqualTo(BigDecimal value) {
            addCriterion("credit_min <>", value, "creditMin");
            return (Criteria) this;
        }

        public Criteria andCreditMinGreaterThan(BigDecimal value) {
            addCriterion("credit_min >", value, "creditMin");
            return (Criteria) this;
        }

        public Criteria andCreditMinGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("credit_min >=", value, "creditMin");
            return (Criteria) this;
        }

        public Criteria andCreditMinLessThan(BigDecimal value) {
            addCriterion("credit_min <", value, "creditMin");
            return (Criteria) this;
        }

        public Criteria andCreditMinLessThanOrEqualTo(BigDecimal value) {
            addCriterion("credit_min <=", value, "creditMin");
            return (Criteria) this;
        }

        public Criteria andCreditMinIn(List<BigDecimal> values) {
            addCriterion("credit_min in", values, "creditMin");
            return (Criteria) this;
        }

        public Criteria andCreditMinNotIn(List<BigDecimal> values) {
            addCriterion("credit_min not in", values, "creditMin");
            return (Criteria) this;
        }

        public Criteria andCreditMinBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("credit_min between", value1, value2, "creditMin");
            return (Criteria) this;
        }

        public Criteria andCreditMinNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("credit_min not between", value1, value2, "creditMin");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("create_user like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("create_user not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
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
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNull() {
            addCriterion("update_user is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNotNull() {
            addCriterion("update_user is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserEqualTo(String value) {
            addCriterion("update_user =", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotEqualTo(String value) {
            addCriterion("update_user <>", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThan(String value) {
            addCriterion("update_user >", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(String value) {
            addCriterion("update_user >=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThan(String value) {
            addCriterion("update_user <", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(String value) {
            addCriterion("update_user <=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLike(String value) {
            addCriterion("update_user like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotLike(String value) {
            addCriterion("update_user not like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIn(List<String> values) {
            addCriterion("update_user in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotIn(List<String> values) {
            addCriterion("update_user not in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserBetween(String value1, String value2) {
            addCriterion("update_user between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotBetween(String value1, String value2) {
            addCriterion("update_user not between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andRoleTypeIsNull() {
            addCriterion("role_type is null");
            return (Criteria) this;
        }

        public Criteria andRoleTypeIsNotNull() {
            addCriterion("role_type is not null");
            return (Criteria) this;
        }

        public Criteria andRoleTypeEqualTo(Integer value) {
            addCriterion("role_type =", value, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeNotEqualTo(Integer value) {
            addCriterion("role_type <>", value, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeGreaterThan(Integer value) {
            addCriterion("role_type >", value, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("role_type >=", value, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeLessThan(Integer value) {
            addCriterion("role_type <", value, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeLessThanOrEqualTo(Integer value) {
            addCriterion("role_type <=", value, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeIn(List<Integer> values) {
            addCriterion("role_type in", values, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeNotIn(List<Integer> values) {
            addCriterion("role_type not in", values, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeBetween(Integer value1, Integer value2) {
            addCriterion("role_type between", value1, value2, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("role_type not between", value1, value2, "roleType");
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