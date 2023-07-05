package com.circulation_routiere.securite_routiere.services;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.circulation_routiere.securite_routiere.Entites.Policier;
import com.circulation_routiere.securite_routiere.Repository.PolicierRepository;
import com.circulation_routiere.securite_routiere.SecuriteWeb.UserDetailsImpl;

@Service
public class PolicierService implements UserDetailsService{
    

    private PolicierRepository policierRepository;

    public PolicierService (PolicierRepository policierRepository){
        this.policierRepository = policierRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String nomPolicier) throws UsernameNotFoundException{
        
        Policier policier = policierRepository.findByNomPolicier(nomPolicier);
        
        if (policier == null) {
            throw new UsernameNotFoundException("Utilisateur introuvable");
        }
        return new UserDetailsImpl(policier);
    }
}
