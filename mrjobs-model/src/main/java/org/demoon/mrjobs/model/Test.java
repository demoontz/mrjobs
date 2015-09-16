package org.demoon.mrjobs.model;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "tests")
public class Test extends GenericModel{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@Column
	private String question;
	@OneToMany(cascade = CascadeType.ALL)
	@Column
	private List<Answer> answers;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<Answer> getAnswers() {
		return answers;
	}
	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}
	
	
}
