package com.cyoku.practice.domain.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.cyoku.practice.domain.model.LineUser;

/**
 * LineUserクラスをCRUDと結びつけるMapperクラス
 * repositoryみたいなもの
 * serviceのInterfaceの役割
 * マッパーインターフェースと呼ばれるのが一般的？
 */
@Mapper
@Repository
public interface LineUserMapper  {
    
    List<LineUser> findAll();
    LineUser getLineUserById(int id);
    
}
