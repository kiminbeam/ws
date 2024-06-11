package com.example.restServer.entity;

import java.time.LocalDate;
import java.time.Period;

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
@Table(name = "career")
public class Career extends BaseEntity{

	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "cno", nullable = false)
	    private Long cno;

	    @ManyToOne
	    @JoinColumn(name = "rno", referencedColumnName = "rno", nullable = false)
	    private Resume resume;

	    @ManyToOne
	    @JoinColumn(name = "user_username", referencedColumnName = "username", nullable = false)
	    private User user;

	    @Column(name = "startDate")
	    private LocalDate startDate;

	    @Column(name = "endDate")
	    private LocalDate endDate;

	    @Column(name = "cName")
	    private String cName;

	    @Column(name = "rank")
	    private String rank;

	    @Column(name = "status")
	    private String status;

	    @Column(name = "type")
	    private String type;

	    @Column(name = "position")
	    private String position;

	    @Column(name = "work")
	    private String work;
	    
	    public String getCareerDuration() {
	        Period period = Period.between(startDate, endDate);
	        int years = period.getYears();
	        int months = period.getMonths();

	        StringBuilder sb = new StringBuilder();
	        if (years > 0) {
	            sb.append(years).append("년 ");
	        }
	        if (months > 0) {
	            sb.append(months).append("개월");
	        }

	        return sb.toString().trim(); // 불필요한 공백 제거
	    }
	    
	    public void update(Career newCareer) {
	        this.startDate = newCareer.getStartDate();
	        this.endDate = newCareer.getEndDate();
	        this.cName = newCareer.getCName();
	        this.rank = newCareer.getRank();
	        this.status = newCareer.getStatus();
	        this.type = newCareer.getType();
	        this.position = newCareer.getPosition();
	        this.work = newCareer.getWork();
	        // 필요에 따라 다른 필드도 업데이트
	    }
}
