package com.demo.dao;

import com.demo.entity.Thing;

public interface ThingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table thing
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String thingid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table thing
     *
     * @mbggenerated
     */
    int insert(Thing record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table thing
     *
     * @mbggenerated
     */
    int insertSelective(Thing record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table thing
     *
     * @mbggenerated
     */
    Thing selectByPrimaryKey(String thingid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table thing
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Thing record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table thing
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Thing record);
}