package main;

class Chinese {

	static final String planSelection = "請選擇: (1) 基本收費標準 (2) 競技池收費";
	static final String chargesBasic  = "游泳池基本收費標準:\n"
		+ "(1) 一般票價 200 (2) 星期六日250元 (3) 12歲以下, 60歲(含)以上打八折, 限定 3-75 歲可入內游泳\n"
		+ "(4) 七點以前八折 (營業時間: 05:00-22:00) (5) 團體打七折 (6) 會員打五折 (7) 各打折不得重疊使用\n";
	static final String chargesCompetitionPool = "競技持收費標準:\n"
		+ "至少需要一名教練, 每十人分配一條水道 (1) 未滿 10 人, 僅能租借單條水道, 每小時3000元 "
		+ "(2) 滿 10 人租借, 教練120元/一個時段, 學生70元/一個時段, 一個時段共2小時";
	static final String rentalPeriodSelection = "請選擇租借時段";
	static final String rentalDurationSelection = "請選擇租借時長(1 or 2)";
	static final String numberOfTraining = "請輸入教練(陪同家長) 與 學生人數";
	static final String minPeople = "最少訓練人數為 10 人, 少於 10 人請直接租單條水道";
	static final String needCoach = "至少需要一名教練";

	public static void main(String[] args) {
		System.out.println(Chinese.chargesBasic);
	}
}