package com.cyoku.practice.repository;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.cyoku.practice.domain.model.LineUser;

/**
 * LineUserクラスをCRUDと結びつけるMapperクラス
 * repositoryみたいなもの
 * serviceのInterfaceの役割
 * マッパーインターフェースと呼ばれるのが一般的？
 */
//@Mapper
@Repository
public interface LineUserMapper  {
    
    // List<LineUser> findAll();
    // LineUser getLineUserById(int id);

    /*
     * 全件表示
     */
    //@Select("SELECT * FROM line_user")
    List<LineUser> selectAll();
    
}
