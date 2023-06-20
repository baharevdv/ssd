package isp.study.ssd.model;

import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Set;
import java.util.stream.Collectors;

public enum Role {
    USER(Set.of(Permition.DEVELOPERS_READ)),
    ADMIN(Set.of(Permition.DEVELOPERS_READ, Permition.DEVELOPERS_WRITE));

    private final Set<Permition> permitions;

    Role(Set<Permition> permitions) {
        this.permitions = permitions;
    }

    public Set<Permition> getPermitions(){
        return permitions;
    }
    public Set<SimpleGrantedAuthority> getAuthorities(){
        return getPermitions().stream()
                .map(permition -> new SimpleGrantedAuthority(permition.getPermition()))
                .collect(Collectors.toSet());
    }
}
