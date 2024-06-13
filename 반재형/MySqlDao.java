package chap00_practice.Dao;

public class MySqlDao implements DataAccessObject{

	public void select() {
		System.out.println("MySql DB에서 검색");
	}
	
	public void insert() {
		System.out.println("MySql DB에 삽입");
	}
	
	public void update() {
		System.out.println("MySql DB에 수정");
	}
	
	public void delete() {
		System.out.println("MySql DB에 삭제");
	}
}
