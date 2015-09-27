package cn.edu.ken.mybatis.mapper;

import cn.edu.ken.mybatis.model.ContactInfo;
import cn.edu.ken.mybatis.model.ContactInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContactInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contactinfo
     *
     * @mbggenerated Sun Sep 27 11:02:32 CST 2015
     */
    int countByExample(ContactInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contactinfo
     *
     * @mbggenerated Sun Sep 27 11:02:32 CST 2015
     */
    int deleteByExample(ContactInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contactinfo
     *
     * @mbggenerated Sun Sep 27 11:02:32 CST 2015
     */
    int deleteByPrimaryKey(Integer idcontactinfo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contactinfo
     *
     * @mbggenerated Sun Sep 27 11:02:32 CST 2015
     */
    int insert(ContactInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contactinfo
     *
     * @mbggenerated Sun Sep 27 11:02:32 CST 2015
     */
    int insertSelective(ContactInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contactinfo
     *
     * @mbggenerated Sun Sep 27 11:02:32 CST 2015
     */
    List<ContactInfo> selectByExample(ContactInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contactinfo
     *
     * @mbggenerated Sun Sep 27 11:02:32 CST 2015
     */
    ContactInfo selectByPrimaryKey(Integer idcontactinfo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contactinfo
     *
     * @mbggenerated Sun Sep 27 11:02:32 CST 2015
     */
    int updateByExampleSelective(@Param("record") ContactInfo record, @Param("example") ContactInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contactinfo
     *
     * @mbggenerated Sun Sep 27 11:02:32 CST 2015
     */
    int updateByExample(@Param("record") ContactInfo record, @Param("example") ContactInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contactinfo
     *
     * @mbggenerated Sun Sep 27 11:02:32 CST 2015
     */
    int updateByPrimaryKeySelective(ContactInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contactinfo
     *
     * @mbggenerated Sun Sep 27 11:02:32 CST 2015
     */
    int updateByPrimaryKey(ContactInfo record);
}