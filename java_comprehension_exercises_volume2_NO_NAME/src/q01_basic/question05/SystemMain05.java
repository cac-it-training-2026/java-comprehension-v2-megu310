package q01_basic.question05;

import q01_basic.question05.AbstMember.Member;
import q01_basic.question05.AbstMember.MemberManager;

public class SystemMain05 {

	public static void main(String[] args) {

		AbstMember[] members = new AbstMember[2];
		//TODO ここから実装する
		members[0] = new Member("Sato Kensuke");
		members[1] = new Member(1, "Passw0rd", "Miura Manabu", 28, 2);

		MemberManager.showAllMembers(members);

		System.out.println("---BUY ITEM---");

		for (AbstMember member : members) {
			member.buyItem();
		}
	}

}
