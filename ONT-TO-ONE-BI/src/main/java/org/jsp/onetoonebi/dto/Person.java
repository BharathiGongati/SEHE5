package org.jsp.onetoonebi.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class Person {
	
	
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int id;
		private String name;
		private long phone;
		private int age;
		@JoinColumn(name="Pancard_id")
		@OneToOne(cascade = CascadeType.ALL)
		private Pancard card;
		@Override
		public String toString() {
			return "Person [id=" + id + ", name=" + name + ", phone=" + phone + ", age=" + age + ", card=" + card + "]";
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public long getPhone() {
			return phone;
		}
		public void setPhone(long phone) {
			this.phone = phone;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public Pancard getCard() {
			return card;
		}
		public void setCard(Pancard card) {
			this.card = card;
		}
		
}



