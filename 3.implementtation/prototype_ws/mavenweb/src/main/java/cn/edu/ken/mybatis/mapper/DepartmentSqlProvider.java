package cn.edu.ken.mybatis.mapper;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.DELETE_FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.ORDER_BY;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT_DISTINCT;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import cn.edu.ken.mybatis.model.Department;
import cn.edu.ken.mybatis.model.DepartmentExample.Criteria;
import cn.edu.ken.mybatis.model.DepartmentExample.Criterion;
import cn.edu.ken.mybatis.model.DepartmentExample;
import java.util.List;
import java.util.Map;

public class DepartmentSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table department
     *
     * @mbggenerated Wed Sep 23 10:11:07 CST 2015
     */
    public String countByExample(DepartmentExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("department");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table department
     *
     * @mbggenerated Wed Sep 23 10:11:07 CST 2015
     */
    public String deleteByExample(DepartmentExample example) {
        BEGIN();
        DELETE_FROM("department");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table department
     *
     * @mbggenerated Wed Sep 23 10:11:07 CST 2015
     */
    public String insertSelective(Department record) {
        BEGIN();
        INSERT_INTO("department");
        
        if (record.getIddepartment() != null) {
            VALUES("iddepartment", "#{iddepartment,jdbcType=INTEGER}");
        }
        
        if (record.getTypecode() != null) {
            VALUES("typecode", "#{typecode,jdbcType=VARCHAR}");
        }
        
        if (record.getTypename() != null) {
            VALUES("typename", "#{typename,jdbcType=VARCHAR}");
        }
        
        if (record.getDescription() != null) {
            VALUES("description", "#{description,jdbcType=VARCHAR}");
        }
        
        if (record.getPriority() != null) {
            VALUES("priority", "#{priority,jdbcType=VARCHAR}");
        }
        
        if (record.getRetired() != null) {
            VALUES("retired", "#{retired,jdbcType=BIT}");
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table department
     *
     * @mbggenerated Wed Sep 23 10:11:07 CST 2015
     */
    public String selectByExample(DepartmentExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("iddepartment");
        } else {
            SELECT("iddepartment");
        }
        SELECT("typecode");
        SELECT("typename");
        SELECT("description");
        SELECT("priority");
        SELECT("retired");
        FROM("department");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table department
     *
     * @mbggenerated Wed Sep 23 10:11:07 CST 2015
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        Department record = (Department) parameter.get("record");
        DepartmentExample example = (DepartmentExample) parameter.get("example");
        
        BEGIN();
        UPDATE("department");
        
        if (record.getIddepartment() != null) {
            SET("iddepartment = #{record.iddepartment,jdbcType=INTEGER}");
        }
        
        if (record.getTypecode() != null) {
            SET("typecode = #{record.typecode,jdbcType=VARCHAR}");
        }
        
        if (record.getTypename() != null) {
            SET("typename = #{record.typename,jdbcType=VARCHAR}");
        }
        
        if (record.getDescription() != null) {
            SET("description = #{record.description,jdbcType=VARCHAR}");
        }
        
        if (record.getPriority() != null) {
            SET("priority = #{record.priority,jdbcType=VARCHAR}");
        }
        
        if (record.getRetired() != null) {
            SET("retired = #{record.retired,jdbcType=BIT}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table department
     *
     * @mbggenerated Wed Sep 23 10:11:07 CST 2015
     */
    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("department");
        
        SET("iddepartment = #{record.iddepartment,jdbcType=INTEGER}");
        SET("typecode = #{record.typecode,jdbcType=VARCHAR}");
        SET("typename = #{record.typename,jdbcType=VARCHAR}");
        SET("description = #{record.description,jdbcType=VARCHAR}");
        SET("priority = #{record.priority,jdbcType=VARCHAR}");
        SET("retired = #{record.retired,jdbcType=BIT}");
        
        DepartmentExample example = (DepartmentExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table department
     *
     * @mbggenerated Wed Sep 23 10:11:07 CST 2015
     */
    public String updateByPrimaryKeySelective(Department record) {
        BEGIN();
        UPDATE("department");
        
        if (record.getTypecode() != null) {
            SET("typecode = #{typecode,jdbcType=VARCHAR}");
        }
        
        if (record.getTypename() != null) {
            SET("typename = #{typename,jdbcType=VARCHAR}");
        }
        
        if (record.getDescription() != null) {
            SET("description = #{description,jdbcType=VARCHAR}");
        }
        
        if (record.getPriority() != null) {
            SET("priority = #{priority,jdbcType=VARCHAR}");
        }
        
        if (record.getRetired() != null) {
            SET("retired = #{retired,jdbcType=BIT}");
        }
        
        WHERE("iddepartment = #{iddepartment,jdbcType=INTEGER}");
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table department
     *
     * @mbggenerated Wed Sep 23 10:11:07 CST 2015
     */
    protected void applyWhere(DepartmentExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            WHERE(sb.toString());
        }
    }
}