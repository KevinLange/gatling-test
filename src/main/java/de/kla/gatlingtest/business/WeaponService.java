package de.kla.gatlingtest.business;

import de.kla.gatlingtest.persistence.WeaponRepository;
import de.kla.gatlingtest.persistence.entity.WeaponEntity;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class WeaponService {

    private final WeaponRepository weaponRepository;

    public WeaponService(WeaponRepository weaponRepository) {
        this.weaponRepository = weaponRepository;
    }

    public Collection<WeaponEntity> findAll() {
        List<WeaponEntity> weapons = weaponRepository.findAll();

        weapons.add(new WeaponEntity("Pistol"));

        return weapons;
    }
}
