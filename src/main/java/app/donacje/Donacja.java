package app.donacje;

import javax.persistence.*;

@Entity
@Table(name = "donacja")
public class Donacja {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true)
    private String number;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false)
    private Integer id_dawcy;



}
