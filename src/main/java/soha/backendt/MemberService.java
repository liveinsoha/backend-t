package soha.backendt;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public Long createMember(MemberCreateRequest request){
        Member member = new Member(request);
        memberRepository.save(member);
        return member.getId();
    }

    public Member getMember(Long id){
        Member member = memberRepository.findById(id).orElseThrow(NoSuchElementException::new);
        return member;
    }
}
