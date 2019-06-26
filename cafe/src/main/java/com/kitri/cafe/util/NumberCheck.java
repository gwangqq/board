package com.kitri.cafe.util;

public class NumberCheck {

	public static int NotNumberToZeoro(String tmp) {
		if (isNumber(tmp)) {
			return Integer.parseInt(tmp);
		}
		return 0;
	}

	public static int NotNumberToOne(String tmp) {
		if (isNumber(tmp)) {
			return Integer.parseInt(tmp);
		}
		return 1;
	}

	private static boolean isNumber(String tmp) {
		boolean flag = true;

		if (tmp != null) {
			int len = tmp.length();
			for (int i = 0; i < len; i++) {
				int num = tmp.charAt(i) - 48;
				if (num < 0 || num > 9) {
					flag = false;
					break;
				}
			}
		} else {
			flag = false;
		}
		return flag;
	}

}
