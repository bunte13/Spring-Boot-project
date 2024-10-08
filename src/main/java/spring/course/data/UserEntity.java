package spring.course.data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

 //ova se koristi za da ispratime data do databaza i da dobieme nazad data
 //slicno na userModel ama treba da implementira serializeable interface
 // zmacjo trena da bide vo istiot format kakod atabazata shto kje gi rpima

@Entity //ova ni kazhuva deka ovaa klasa treba da bide matchnata so tabela vo databazata
public class UserEntity implements Serializable {

    @Id
    private String firstName;
    private String lastName;
    private Integer membershipId;

    private String creationTime;

    public UserEntity() {

    }

    public UserEntity(String firstName, String lastName, Integer membershipId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.membershipId = membershipId;
    }

    public UserEntity(String firstName, String lastName, Integer membershipId, String creationTime) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.membershipId = membershipId;
        this.creationTime = creationTime;
    }

    public String getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getMembershipId() {
        return membershipId;
    }

    public void setMembershipId(Integer membershipId) {
        this.membershipId = membershipId;
    }
}