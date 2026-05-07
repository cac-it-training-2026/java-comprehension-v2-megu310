package q01_basic.question06;

class Member extends AbstMember {

	private int id;
	private String password;
	private int age;
	private int rank;

	/**
	 * @param id
	 * @param password
	 * @param age
	 * @param rank
	 */
	public Member(int id, String password, String name, int age, int rank) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.rank = rank;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	//引数なしのコンストラクタ
	public Member() {

	}

	@Override
	public void buyItem() {

	}

	@Override
	public void showMember() {
		System.out.println("---SHOW MEMBER---");
		System.out.println("***MEMBER DATA***");
		System.out.println("id:" + id);
		System.out.println("password:" + password);
		System.out.println("name:" + name);
		System.out.println("age:" + age);
		System.out.println("rank:" + rank);

		System.out.println("*****************");
	}
}
