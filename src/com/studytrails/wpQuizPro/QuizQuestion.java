package com.studytrails.wpQuizPro;

public class QuizQuestion {

	private int id;
	private int quiz_id;
	private int online;
	private int sort;
	private String title="";
	private int points;
	private String correct_msg="";
	private String incorrect_msg="";
	private int correct_same_text;
	private int tip_enabled;
	private String tip_msg="";
	private String answer_type="";
	private int show_points_in_box;
	private int answer_points_activated;
	private int category_id;
	private int answer_points_diff_modus_activated;
	private int disable_correct;
	private int matrix_sort_answer_criteria_width;
	private String question="";
	private String answer_data="";
	String answer1;
	String answer2;
	String answer3;
	String answer4;
	int correctAnswer;
	public String getAnswer1() {
		return answer1;
	}
	public void setAnswer1(String answer1) {
		this.answer1 = answer1;
	}
	public String getAnswer2() {
		return answer2;
	}
	public void setAnswer2(String answer2) {
		this.answer2 = answer2;
	}
	public String getAnswer3() {
		return answer3;
	}
	public void setAnswer3(String answer3) {
		this.answer3 = answer3;
	}
	public String getAnswer4() {
		return answer4;
	}
	public void setAnswer4(String answer4) {
		this.answer4 = answer4;
	}
	public int getCorrectAnswer() {
		return correctAnswer;
	}
	public void setCorrectAnswer(int correctAnswer) {
		this.correctAnswer = correctAnswer;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQuiz_id() {
		return quiz_id;
	}
	public void setQuiz_id(int quiz_id) {
		this.quiz_id = quiz_id;
	}
	public int getOnline() {
		return online;
	}
	public void setOnline(int online) {
		this.online = online;
	}
	public int getSort() {
		return sort;
	}
	public void setSort(int sort) {
		this.sort = sort;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public int getCorrect_same_text() {
		return correct_same_text;
	}
	public void setCorrect_same_text(int correct_same_text) {
		this.correct_same_text = correct_same_text;
	}
	public int getTip_enabled() {
		return tip_enabled;
	}
	public void setTip_enabled(int tip_enabled) {
		this.tip_enabled = tip_enabled;
	}
	public String getTip_msg() {
		return tip_msg;
	}
	public void setTip_msg(String tip_msg) {
		this.tip_msg = tip_msg;
	}
	public String getAnswer_type() {
		return answer_type;
	}
	public void setAnswer_type(String answer_type) {
		this.answer_type = answer_type;
	}
	public int getShow_points_in_box() {
		return show_points_in_box;
	}
	public void setShow_points_in_box(int show_points_in_box) {
		this.show_points_in_box = show_points_in_box;
	}
	public int getAnswer_points_activated() {
		return answer_points_activated;
	}
	public void setAnswer_points_activated(int answer_points_activated) {
		this.answer_points_activated = answer_points_activated;
	}
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	public int getAnswer_points_diff_modus_activated() {
		return answer_points_diff_modus_activated;
	}
	public void setAnswer_points_diff_modus_activated(int answer_points_diff_modus_activated) {
		this.answer_points_diff_modus_activated = answer_points_diff_modus_activated;
	}
	public int getDisable_correct() {
		return disable_correct;
	}
	public void setDisable_correct(int disable_correct) {
		this.disable_correct = disable_correct;
	}
	public int getMatrix_sort_answer_criteria_width() {
		return matrix_sort_answer_criteria_width;
	}
	public void setMatrix_sort_answer_criteria_width(int matrix_sort_answer_criteria_width) {
		this.matrix_sort_answer_criteria_width = matrix_sort_answer_criteria_width;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer_data() {
		return answer_data;
	}
	public void setAnswer_data(String answer_data) {
		this.answer_data = answer_data;
	}
	public String getCorrect_msg() {
		return correct_msg;
	}
	public void setCorrect_msg(String correct_msg) {
		this.correct_msg = correct_msg;
	}
	public String getIncorrect_msg() {
		return incorrect_msg;
	}
	public void setIncorrect_msg(String incorrect_msg) {
		this.incorrect_msg = incorrect_msg;
	}
	
	
}
