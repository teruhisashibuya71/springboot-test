// package com.cyoku.practice.Config;

// import javax.sql.DataSource;

// import org.apache.ibatis.session.SqlSessionFactory;
// import org.mybatis.spring.SqlSessionFactoryBean;
// import org.mybatis.spring.annotation.MapperScan;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.core.io.ClassPathResource;
// import org.springframework.jdbc.datasource.DataSourceTransactionManager;
// import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
// import org.springframework.transaction.PlatformTransactionManager;
// import org.springframework.transaction.annotation.EnableTransactionManagement;

// /**
//  * アノテーションでmapperインターフェースがあるパッケージを指定する
//  */
// @Configuration
// @EnableTransactionManagement
// @MapperScan("com.cyoku.practice.domain.mapper")
// public class MyBatisConfig {

//     /**
//      * DBファイルのパスを指定
//      */
//     @Bean
//     public DataSource dataSource() {
//         return new EmbeddedDatabaseBuilder().addScript("schema.sql").build();
//     }

//     /**
//      * 
//      */
//     @Bean
//     public SqlSessionFactoryBean sqlSessionFactory() {
//         SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
//         // データソースを設定する。MyBatisの処理の中でSQLを発行すると、
//         // ここで指定したデータソースからコネクションが取得されます。
//         sessionFactoryBean.setDataSource(dataSource());
//         // MyBatis設定ファイルを指定します。
//         // XMLファイルへのパスを記述しておく
//         //sessionFactoryBean.setConfigLocation(new ClassPathResource("/myBatis-config.xml"));
//         sessionFactoryBean.setConfigLocation(new ClassPathResource("/com/cyoku/practice/domain/mapper/LineUserMapper.xml"));
//         return sessionFactoryBean;
//     }

//     // トランザクションマネージャーのBeanを定義します。
//     @Bean
//     public PlatformTransactionManager transactionManager() {
//         return new DataSourceTransactionManager(dataSource());
//     }
    
// }
