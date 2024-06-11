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
@Data
@Table(name = "oa")
public class Oa extends BaseEntity{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ono", nullable = false)
    private Long ono;

	@ManyToOne
	@JoinColumn(name = "rno", referencedColumnName = "rno", nullable = false)
	private Resume resume;


	@ManyToOne
	@JoinColumn(name = "user_username", referencedColumnName = "username", nullable = false)
	private User user;


    @Column(name = "type")
    private String type;

    @Column(name = "content")
    private String content;
    
    public void update(Oa newOa) {
        this.type = newOa.getType();
        this.content = newOa.getContent();
        // 필요에 따라 다른 필드도 업데이트
    }
}
