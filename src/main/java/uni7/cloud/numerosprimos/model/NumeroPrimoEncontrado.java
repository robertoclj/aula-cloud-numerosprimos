package uni7.cloud.numerosprimos.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "primenumber")
public class NumeroPrimoEncontrado implements Serializable {

    @Getter
    @Setter
    @Id
    @GeneratedValue(generator = "primenumber_seq", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "primenumber_seq", sequenceName = "primenumber_seq", initialValue = 1, allocationSize = 1)
    @Column(name = "id")
    private Long id;

    @Getter
    @Setter
    @Column(name = "creationdate")
    private Date date;

    @Getter
    @Setter
    @Column(name = "primenumberfound")
    private Long numberFound;

}
