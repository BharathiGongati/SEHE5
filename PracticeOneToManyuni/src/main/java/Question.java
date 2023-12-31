import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@	Entity
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String question;
	private String questionBy ;
	@Override
	public String toString() {
		return "Question [id=" + id + ", question=" + question + ", questionBy=" + questionBy + "]";
	}
	@OneToMany(cascade = CascadeType.ALL)
	private List<Answer> ans;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getQuestionBy() {
		return questionBy;
	}
	public void setQuestionBy(String questionBy) {
		this.questionBy = questionBy;
	}
	public List<Answer> getAns() {
		return ans;
	}
	public void setAns(List<Answer> ans) {
		this.ans = ans;
	}
	

}
