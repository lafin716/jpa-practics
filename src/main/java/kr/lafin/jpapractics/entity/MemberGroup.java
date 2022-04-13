package kr.lafin.jpapractics.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "lf_member_group")
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String groupName;
}
