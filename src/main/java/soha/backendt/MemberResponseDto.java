package soha.backendt;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MemberResponseDto {

    private String name;

    public MemberResponseDto(Member member) {
        this.name = member.getName();
    }

}
