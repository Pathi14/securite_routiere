package com.circulation_routiere.securite_routiere.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.circulation_routiere.securite_routiere.Entites.Policier;

public interface PolicierRepository extends JpaRepository<Policier, Long>{
    Policier findByNomPolicier(String nomPolicier);
}
