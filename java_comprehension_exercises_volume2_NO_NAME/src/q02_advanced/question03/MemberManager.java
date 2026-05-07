package q02_advanced.question03;

import java.util.List;

public class MemberManager {
	private MemberManager() {

	}

	public static void showAllMembers(List<Member> members) {
		System.out.println("---SHOW DATA---");
		for (Member member : members) {
			member.showMember();
		}
	}

	public static void updatePassword(List<Member> members, int targetId, String newPassword) {
		boolean isFound = false;

		for (Member member : members) {
			if (member.getId() == targetId) {
				member.setPassword(newPassword);
				isFound = true;
				break;
			}
		}

		if (!isFound) {
			System.out.println("該当者はいませんでした。");
		}
	}
}
