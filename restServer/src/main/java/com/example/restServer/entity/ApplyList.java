package com.example.restServer.entity;

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
@Table(name = "applyList")
@Data
public class ApplyList extends BaseEntity{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ano", nullable = false)
	private Long ano;

	@ManyToOne
	@JoinColumn(name = "rno", referencedColumnName = "rno", nullable = false)
	private Resume resume;

	@ManyToOne
	@JoinColumn(name = "jno", referencedColumnName = "jno", nullable = false)
	private JobAd jobAd;
	
	@ManyToOne
    @JoinColumn(name = "company_username", referencedColumnName = "username", nullable = false)
    private Company company;

	@ManyToOne
	@JoinColumn(name = "user_username", referencedColumnName = "username", nullable = false)
	private User user;

	@Column(name = "status", nullable = false)
	private int status;

	@Column(name = "save", nullable = false, columnDefinition="TEXT")
	private String save;
}
