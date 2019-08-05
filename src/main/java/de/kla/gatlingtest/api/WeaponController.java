package de.kla.gatlingtest.api;

import de.kla.gatlingtest.business.WeaponService;
import de.kla.gatlingtest.persistence.entity.WeaponEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/weapon-management/weapons")
public class WeaponController {

    private final WeaponService weaponService;

    @Autowired
    public WeaponController(WeaponService weaponService) {
        this.weaponService = weaponService;
    }

    @GetMapping
    public Collection<WeaponEntity> getWeapons() {
        return weaponService.findAll();
    }
}
