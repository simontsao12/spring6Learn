package com.atsimoncc.spring6.jdbc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.List;

/**
 * ClassName: JdbcTemplateTest
 * Package: com.atsimoncc.spring6.jdbc
 * Description:
 */
@SpringJUnitConfig(locations = "classpath:beans.xml")
public class JdbcTemplateTest {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    // 查詢 返回對象
    @Test
    public void testSelectObject() {
        // 寫法一
        // String sql = "SELECT id, name, age, sex FROM t_emp WHERE id = ?";
        // Emp empResult = jdbcTemplate.queryForObject(sql,
        //         (rs, rowNum) -> {
        //                 Emp emp = new Emp();
        //                 emp.setId(rs.getInt("id"));
        //                 emp.setName(rs.getString("name"));
        //                 emp.setAge(rs.getInt("age"));
        //                 emp.setSex(rs.getString("sex"));
        //                 return emp;
        //             }, 1);
        // System.out.println(empResult);
        // 寫法二
        String sql = "SELECT id, name, age, sex FROM t_emp WHERE id = ?";
        Emp empResult = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Emp.class), 1);
        System.out.println(empResult);
    }
    // 查詢 返回 list 集合
    @Test
    public void testSelectList() {
        String sql = "SELECT id, name, age, sex FROM t_emp";
        List<Emp> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Emp.class));
        System.out.println(list);
    }
    // 查詢 返回單值
    @Test
    public void testSelectValue() {
        String sql = "SELECT COUNT(*) FROM t_emp";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.println(count);
    }
    // 新增 修改 刪除操作
    @Test
    public void testUpdate() {
        /*
        // 1 新增
        // 1.1 寫 sql
        String sql = "INSERT INTO t_emp VALUES (NULL, ?, ?, ?)";
        // 1.2 呼叫 jdbcTemplate 方法 傳入相關參數
        // int rows = jdbcTemplate.update(sql, "東方不敗", 20, "未知");
        Object[] params = {"林平之", 20, "未知"};
        int rows = jdbcTemplate.update(sql, params);
        System.out.println(rows);
        */
        /*
        // 修改
        String sql = "UPDATE t_emp SET name=? WHERE id=?";
        // 1.2 呼叫 jdbcTemplate 方法 傳入相關參數
        int rows = jdbcTemplate.update(sql, "平平之", 3);
        System.out.println(rows);
        */
        // 刪除
        String sql = "DELETE FROM t_emp WHERE id=?";
        // 1.2 呼叫 jdbcTemplate 方法 傳入相關參數
        int rows = jdbcTemplate.update(sql, 3);
        System.out.println(rows);
    }
}
