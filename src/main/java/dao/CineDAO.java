package dao;

public class CineDAO {
	db.Db db = new db.Db("CineStar");
	
	public String [][] getCines(){
		db.Sentencia("call sp_getCines()");	
		return db.getRegistros();
	}
	
}
