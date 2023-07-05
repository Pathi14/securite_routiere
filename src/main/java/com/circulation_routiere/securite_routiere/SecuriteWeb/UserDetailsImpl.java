package com.circulation_routiere.securite_routiere.SecuriteWeb;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.circulation_routiere.securite_routiere.Entites.Policier;

import java.util.Collection;

public class UserDetailsImpl implements UserDetails {

    private String nomPolicier;
    private String motDePasse;
    private Collection<? extends GrantedAuthority> authorities;

    public UserDetailsImpl(String nomPolicier, String motDePasse, Collection<? extends GrantedAuthority> authorities) {
        this.nomPolicier = nomPolicier;
        this.motDePasse = motDePasse;
        this.authorities = authorities;
    }

    // Implémentations des méthodes de l'interface UserDetails (getters, etc.)

    public UserDetailsImpl(Policier policier) {
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return motDePasse;
    }

    @Override
    public String getUsername() {
        return nomPolicier;
    }

    @Override
    public boolean isAccountNonExpired() {

        throw new UnsupportedOperationException("Unimplemented method 'isAccountNonExpired'");
    }

    @Override
    public boolean isAccountNonLocked() {

        throw new UnsupportedOperationException("Unimplemented method 'isAccountNonLocked'");
    }

    @Override
    public boolean isCredentialsNonExpired() {

        throw new UnsupportedOperationException("Unimplemented method 'isCredentialsNonExpired'");
    }

    @Override
    public boolean isEnabled() {
        
        throw new UnsupportedOperationException("Unimplemented method 'isEnabled'");
    }

    // Autres méthodes de l'interface UserDetails

    // ...
}
