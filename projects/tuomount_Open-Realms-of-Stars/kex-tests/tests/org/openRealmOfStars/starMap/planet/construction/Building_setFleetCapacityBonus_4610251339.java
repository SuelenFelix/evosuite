package org.openRealmOfStars.starMap.planet.construction;

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
import static org.openRealmOfStars.starMap.planet.construction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;

public class Building_setFleetCapacityBonus_4610251339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21268;
     Object term21337;

    public Building_setFleetCapacityBonus_4610251339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term21340 = Class.forName((String) "org.openRealmOfStars.starMap.planet.construction.BuildingType");
        Field term21339 = ((Class) term21340).getDeclaredField((String) "FARM");
        ((Field) term21339).setAccessible(true);
        Object enum47 = ((Field) term21339).get((Object) null);
        term21268 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.construction.Building"));
        setField(term21268, term21268.getClass(), "type", enum47);
        setIntField(term21268, term21268.getClass(), "farmBonus", 1443855558);
        setIntField(term21268, term21268.getClass(), "waterBonus", -1933419449);
        setIntField(term21268, term21268.getClass(), "mineBonus", -1804322375);
        setIntField(term21268, term21268.getClass(), "factBonus", 1595814906);
        setIntField(term21268, term21268.getClass(), "cultBonus", -834193529);
        setIntField(term21268, term21268.getClass(), "reseBonus", 335780735);
        setIntField(term21268, term21268.getClass(), "credBonus", -1541981599);
        setIntField(term21268, term21268.getClass(), "happinessBonus", 1605456363);
        setIntField(term21268, term21268.getClass(), "materialBonus", 2059896693);
        setDoubleField(term21268, term21268.getClass(), "maintenanceCost", 0.3202192021706908);
        setBooleanField(term21268, term21268.getClass(), "singleAllowed", false);
        setBooleanField(term21268, term21268.getClass(), "scientificAchievement", false);
        setBooleanField(term21268, term21268.getClass(), "broadcaster", true);
        setBooleanField(term21268, term21268.getClass(), "orbitalElevator", false);
        setIntField(term21268, term21268.getClass(), "battleBonus", 2109912812);
        setIntField(term21268, term21268.getClass(), "defenseDamage", 1841286431);
        setIntField(term21268, term21268.getClass(), "scanRange", -1723168189);
        setIntField(term21268, term21268.getClass(), "scanCloakingDetection", -675283917);
        setIntField(term21268, term21268.getClass(), "fleetCapacityBonus", -2093862988);
        setIntField(term21268, term21268.getClass(), "recycleBonus", 1337828646);
        setIntField(term21268, term21268.getClass(), "ancientArtifactResearch", 532666604);
        setIntField(term21268, term21268.getClass(), "wildLifePower", -13725716);
        setField(term21268, term21268.getClass(), "name", "nhoHrZfnIN");
        setField(term21268, term21268.getClass(), "iconId", "ZkMALXpEAZ");
        setField(term21268, term21268.getClass(), "description", "tXfQjSqDzN");
        setIntField(term21268, term21268.getClass(), "prodCost", -1695750603);
        setIntField(term21268, term21268.getClass(), "metalCost", 63677360);
        term21337 = new Integer(1478914037);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.construction.Building");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term21337;
        callMethod(klass, "setFleetCapacityBonus", argTypes, term21268, args);
    }

};


