package q02_advanced.question02;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SystemMain02 {

	public static void main(String[] args) {

		//TODO ここから実装する
		ConsoleReader consoleReader = new ConsoleReader();
		List<Member> members = new ArrayList<Member>();

		members.add(Member.getInstance(1, "Passw0rd", "Miura Manabu", 28, 2));
		members.add(Member.getInstance(2, "aaaAAA", "Sato Kensuke", 43, 1));

		MemberManager.showAllMembers(members);
		System.out.println("===パスワードを変更します===");

		try {
			System.out.println("input target id>>");
			int targetId = consoleReader.inputNumber();
			System.out.println("input new password>>");
			String newPassword = consoleReader.inputString();

			MemberManager.updatePassword(members, targetId, newPassword);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		} catch (NumberFormatException e) {
			System.out.println("不正な入力です");
			e.printStackTrace();
			return;
		}

		MemberManager.showAllMembers(members);
	}

}
