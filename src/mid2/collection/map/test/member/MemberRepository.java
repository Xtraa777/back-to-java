package mid2.collection.map.test.member;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MemberRepository {

    private Map<String, Member> memberMap = new HashMap<>();

    public void save(Member member1) {
        this.memberMap.put(member1.getId(), member1);
    }

    public void remove(String id) {
        memberMap.remove(id);
    }

    public Member findById(String id) {
        return memberMap.get(id);
    }

    public Member findByName(String name) {
        /*for (Entry<String, Member> memberEntry : memberMap.entrySet()) {
             if (memberEntry.getValue().getName().equals(name)) {
                 return memberEntry.getValue();
             }
        }*/
        for (Member member : memberMap.values()) {
            if (member.getName().equals(name)) {
                return member;
            }
        }
        return null;
    }
}