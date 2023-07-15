package com.cyoku.practice.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cyoku.practice.domain.mapper.LineUserMapper;
import com.cyoku.practice.domain.model.LineUser;

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
    //@Autowired
    private LineUserMapper lineUserMapper;

    /**
     * テーブルから全レコードを取得
     * @return LINE登録ユーザーの情報
     */
    public List<LineUser> findAll() {
        return lineUserMapper.findAll();
    }

    /**
     * レコードのidを指定してユーザー情報を1件取得
     * param 対象ユーザーのレコードID
     */
    public LineUser getLineUserById(int id) {
        return lineUserMapper.getLineUserById(id);
    }

}
