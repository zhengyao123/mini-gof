package com.zy.template.two;

import java.sql.ResultSet;

/**
 * date:  2020-09-03 14:27
 *
 * @author zhengyao
 */
public interface RowMapper<T> {

    T mapRow(ResultSet rs, int rowNum) throws Exception;
}
