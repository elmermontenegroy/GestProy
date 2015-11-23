package com.gestproy.mybatis.db;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.gestproy.config.enums.ConfigEnum;



/**
 * Esta clase es responsable de crear una instancia de conexion hacia la 
 * base de datos usando mybatis
 * @author suite701
 *
 */
public class MyBatisConnectionManager {

	private static MyBatisConnectionManager instancia;
	//Definir un SqlSessionFactory para mis conexiones a bd con MyBatis
	private SqlSessionFactory sessionfactory;
	
	private MyBatisConnectionManager(){
		try {
			//1. Voy a crear un lector de recursos (mybatis-config.xml)
			Reader resReader = Resources.getResourceAsReader(ConfigEnum.MYBATIS_CONFIG_FILE.getParametro());
			//2. Voy a asignar los valores leidos en esta configuracion al sessionFactory
			this.sessionfactory = new SqlSessionFactoryBuilder().build(resReader);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static MyBatisConnectionManager getInstance(){
		if(instancia == null){
			instancia = new MyBatisConnectionManager();
		}
		return instancia;
	}
	
	public SqlSessionFactory getSqlSessionFactory(){
		if(this.sessionfactory != null){
			return this.sessionfactory;
		}
		throw new NullPointerException("Debe inicializar el session factory correctamente");
	}
	
}
