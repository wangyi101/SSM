package com.demo.dao;

import com.demo.entity.Repair;

public interface RepairMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repair
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String repairid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repair
     *
     * @mbggenerated
     */
    int insert(Repair record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repair
     *
     * @mbggenerated
     */
    int insertSelective(Repair record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repair
     *
     * @mbggenerated
     */
    Repair selectByPrimaryKey(String repairid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repair
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Repair record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repair
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Repair record);
}