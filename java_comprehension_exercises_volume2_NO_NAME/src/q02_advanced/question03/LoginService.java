package q02_advanced.question03;

/**
 * MemberStorageにアクセスし、ログイン処理を行う
 */
class LoginService {

	/**
	 * memberStorage Memberクラスのリスト一覧
	 */
	private MemberStorage memberStorage;

	/**
	 * @param memberStorage
	 */
	public LoginService(MemberStorage memberStorage) {
		this.memberStorage = memberStorage;
	}

	public Member doLogin(int id, String password) {

		Member loginMember = null;

		for (Member member : memberStorage.getMembers()) {
			if (member.getId() == id && member.getPassword().equals(password)) {
				loginMember = member;
				break;
			}
		}
		return loginMember;
	}
}
