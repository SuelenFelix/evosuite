package org.openRealmOfStars.player.ship;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static org.openRealmOfStars.player.ship.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class ShipComponent_getWeaponRange_104125182133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term474540;

    public ShipComponent_getWeaponRange_104125182133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term474593 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipComponentType");
        Field term474592 = ((Class) term474593).getDeclaredField((String) "COLONY_MODULE");
        ((Field) term474592).setAccessible(true);
        Object enum1505 = ((Field) term474592).get((Object) null);
        term474540 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term474540, term474540.getClass(), "index", 649542687);
        setField(term474540, term474540.getClass(), "type", enum1505);
        setIntField(term474540, term474540.getClass(), "cost", -207146487);
        setIntField(term474540, term474540.getClass(), "metalCost", -1672295339);
        setField(term474540, term474540.getClass(), "name", "cDMjKpBqug");
        setIntField(term474540, term474540.getClass(), "energyRequirement", -1625760666);
        setIntField(term474540, term474540.getClass(), "energyResource", 228127178);
        setIntField(term474540, term474540.getClass(), "ftlSpeed", -1027398473);
        setIntField(term474540, term474540.getClass(), "speed", -1684799483);
        setIntField(term474540, term474540.getClass(), "tacticSpeed", -908780352);
        setIntField(term474540, term474540.getClass(), "scannerRange", 502316894);
        setIntField(term474540, term474540.getClass(), "cloakDetection", 346829197);
        setIntField(term474540, term474540.getClass(), "cloaking", -1144431477);
        setIntField(term474540, term474540.getClass(), "defenseValue", -410028668);
        setIntField(term474540, term474540.getClass(), "baySize", -1620470555);
        setIntField(term474540, term474540.getClass(), "damage", -1071514936);
        setIntField(term474540, term474540.getClass(), "weaponRange", 948646989);
        setIntField(term474540, term474540.getClass(), "initiativeBoost", -1091739087);
        setIntField(term474540, term474540.getClass(), "cultureBonus", -436415220);
        setIntField(term474540, term474540.getClass(), "creditBonus", -733438551);
        setIntField(term474540, term474540.getClass(), "researchBonus", 810630955);
        setIntField(term474540, term474540.getClass(), "espionageBonus", -630134606);
        setIntField(term474540, term474540.getClass(), "fleetCapacityBonus", -1976364009);
        setIntField(term474540, term474540.getClass(), "hitBonus", 1488533591);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipComponent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWeaponRange", argTypes, term474540, args);
    }

};


