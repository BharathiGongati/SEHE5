import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Answer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Answer [id=" + id + ", answer=" + answer + ", answerby=" + answerby + "]";
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getAnswerby() {
		return answerby;
	}
	public void setAnswerby(String answerby) {
		this.answerby = answerby;
	}
	private String answer;
	private String answerby;
	

}
