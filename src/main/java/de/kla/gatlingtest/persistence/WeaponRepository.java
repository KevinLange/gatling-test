package de.kla.gatlingtest.persistence;

import de.kla.gatlingtest.persistence.entity.WeaponEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeaponRepository extends JpaRepository<WeaponEntity, Long> {
}
