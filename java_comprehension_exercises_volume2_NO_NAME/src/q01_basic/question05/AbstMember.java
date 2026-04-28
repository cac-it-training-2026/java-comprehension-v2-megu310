package q01_basic.question05;

/**
 * 会員、非会員の基盤クラス
 * Memberクラス、NonMemberクラスに継承する
 * 
 */
abstract class AbstMember {

	/**
	 * name protected access
	 */
	protected String name;

	/**
	 * 商品を購入する（メッセージ出力）
	 * 抽象メソッド
	 */
	public abstract void buyItem();

	/**
	 * メンバー情報を表示する（メッセージ出力）
	 * 抽象メソッド
	 * 
	 */
	public abstract void showMember();

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}

	class Member extends AbstMember {

		private int id;
		private String password;
		private int age;
		private int rank;

		public Member() {

		}

		/**
		 * @param id
		 * @param password
		 * @param age
		 * @param rank
		 */
		public Member(int id, String password, int age, int rank) {
			this.id = id;
			this.password = password;
			this.age = age;
			this.rank = rank;
		}

		@Override
		public void buyItem() {
			System.out.println(name + "purchased the item at a fixed price");
		}

		@Override
		public void showMember() {
			System.out.println("***MEMBER DATA***");
			System.out.println("id:" + id);
			System.out.println("password:" + password);
			System.out.println("name:" + name);
			System.out.println("age:" + age);
			System.out.println("rank:" + rank);

			System.out.println("*****************");
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

	}

	public class NonMember extends AbstMember {
		public NonMember(String name) {
			this.name = name;
		}

		@Override
		public void buyItem() {
			System.out.println(name + "purchased the item at a fixed price");
		}

		@Override
		public void showMember() {
			System.out.println("***MEMBER DATA***");
			System.out.println(name + "purchased the item at 50% off");
			System.out.println("*****************");

		}
	}

	class MemberManager {
		private MemberManager() {

		}

		public static void showAllMembers(AbstMember[] members) {
			System.out.println("---SHOW MEMBERS---");

			for (AbstMember member : members) {
				member.showMember();
			}
		}
	}
}
