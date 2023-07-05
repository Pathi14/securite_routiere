package com.circulation_routiere.securite_routiere.SecuriteWeb;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.circulation_routiere.securite_routiere.Entites.Policier;
import com.circulation_routiere.securite_routiere.Repository.PolicierRepository;

public class UserDetailsServiceImpl implements UserDetailsService{
    private PolicierRepository policierRepository;

    public UserDetailsServiceImpl(PolicierRepository policierRepository) {
        this.policierRepository = policierRepository;
    }

    // @Override
    // public UserDetails loadUserByNomPolicier(String nomPolicier) throws UsernameNotFoundException {
    //     Policier user = policierRepository.findByNomPolicier(nomPolicier);
    //     if (user == null) {
    //         throw new UsernameNotFoundException("User not found");
    //     }
    //     return new UserDetailsImpl(user);
    // }

    @Override
    public UserDetails loadUserByUsername(String nomPolicier) throws UsernameNotFoundException {
        Policier user = policierRepository.findByNomPolicier(nomPolicier);
        if (user == null) {
            throw new UsernameNotFoundException("User not found");
        }
        return new UserDetailsImpl(user);    }

}
