package kr.lafin.jpapractics.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "lf_member")
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long groupId;

    private String email;

    private String password;

    private String nickname;

}
