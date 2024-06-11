package com.example.restServer.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Table(name = "license")
public class License extends BaseEntity{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "lno", nullable = false)
	private Long lno;

	@ManyToOne
	@JoinColumn(name = "rno", referencedColumnName = "rno", nullable = false)
	private Resume resume;

	@ManyToOne
	@JoinColumn(name = "user_username", referencedColumnName = "username", nullable = false)
	private User user;

	@Column(name = "ltype")
	private String ltype;

	@Column(name = "lname")
	private String lname;
	
	//발급기관
	@Column(name = "lorg")
	private String lorg;

	@Column(name = "getDate")
	private LocalDate getDate;
	
	public void update(License newLicense) {
        this.ltype = newLicense.getLtype();
        this.lname = newLicense.getLname();
        this.lorg = newLicense.getLorg();
        this.getDate = newLicense.getGetDate();
        // 필요에 따라 다른 필드도 업데이트
    }
}
