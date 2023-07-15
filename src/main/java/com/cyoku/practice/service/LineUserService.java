package com.cyoku.practice.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.cyoku.practice.domain.model.LineUser;
import com.cyoku.practice.repository.LineUserMapper;

/**
 * serviceImplの役割
 * ただしMybatisではインターフェース(LineUserMapper)は継承しない
 * 動かないので一旦継承しておく
 */
@Service
public class LineUserService {
    
    /**
     * repositoryに該当するMapperインターフェースをAutoWiredする
     */
    // @Autowired
    // private LineUserMapper lineUserMapper;

    // @Autowired
    // private LineUserMapper lineUserMapper;

    private JdbcTemplate jdbcTemplate;

    //コンストラクタ
    @Autowired
    public LineUserService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    /**
     * テーブルから全レコードを取得
     * @return LINE登録ユーザーの情報
     */
    public List<LineUser> selectAll() {
        String sql = "SELECT * FROM line_user";
        //引数(String sql, new BeanPropertyRowMapper<受け取る形式のクラス名>(受け取るクラス形式.class))
        System.out.println("LineUserService execute sql selectAll: "+ sql);
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<LineUser>(LineUser.class));
        
    }

    /**
     * レコードのidを指定してユーザー情報を1件取得
     * param 対象ユーザーのレコードID
     */
    // public LineUser getLineUserById(int id) {
    //     return lineUserMapper.getLineUserById(id);
    // }

}
