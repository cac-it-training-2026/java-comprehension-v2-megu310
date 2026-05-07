package q02_advanced.question03;

import java.io.IOException;

public class SystemMain03 {

	public static void main(String[] args) {

		LoginService loginService = new LoginService(new MemberStorage());
		System.out.println("ログイン情報を入力してください");
		boolean isLogin = false;
		//TODO ここから実装する
		ConsoleReader consoleReader = new ConsoleReader();

		while (!isLogin) {
			try {
				System.out.println("input id>>");
				int inputId = consoleReader.inputNumber();

				System.out.println("input password>>");
				String inputPassword = consoleReader.inputString();
				Member loginUser = loginService.doLogin(inputId, inputPassword);

				if (loginUser == null) {
					System.out.println("ID またはパスワードが違っています。再度入力してください。");
					continue;
				} else {
					System.out.println("ログインに成功しました ");
					System.out.println("ログインユーザ情報を表示します。 ");

					loginUser.showMember();
					isLogin = true;
					break;
				}
			} catch (NumberFormatException e) {
				System.out.println("不正な入力です。再度入力してください ");
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

}
