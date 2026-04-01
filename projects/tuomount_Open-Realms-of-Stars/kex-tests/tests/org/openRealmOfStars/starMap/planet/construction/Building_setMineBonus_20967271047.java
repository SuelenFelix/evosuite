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

public class Building_setMineBonus_20967271047 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4115;
     Object term4187;

    public Building_setMineBonus_20967271047() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4190 = Class.forName((String) "org.openRealmOfStars.starMap.planet.construction.BuildingType");
        Field term4189 = ((Class) term4190).getDeclaredField((String) "CULTURE");
        ((Field) term4189).setAccessible(true);
        Object enum7 = ((Field) term4189).get((Object) null);
        term4115 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.construction.Building"));
        setField(term4115, term4115.getClass(), "type", enum7);
        setIntField(term4115, term4115.getClass(), "farmBonus", 9726679);
        setIntField(term4115, term4115.getClass(), "waterBonus", -25637976);
        setIntField(term4115, term4115.getClass(), "mineBonus", 1555897383);
        setIntField(term4115, term4115.getClass(), "factBonus", 202001407);
        setIntField(term4115, term4115.getClass(), "cultBonus", 158873461);
        setIntField(term4115, term4115.getClass(), "reseBonus", -430151637);
        setIntField(term4115, term4115.getClass(), "credBonus", -1697741339);
        setIntField(term4115, term4115.getClass(), "happinessBonus", 98922530);
        setIntField(term4115, term4115.getClass(), "materialBonus", -1388471422);
        setDoubleField(term4115, term4115.getClass(), "maintenanceCost", 0.2641345529914265);
        setBooleanField(term4115, term4115.getClass(), "singleAllowed", true);
        setBooleanField(term4115, term4115.getClass(), "scientificAchievement", false);
        setBooleanField(term4115, term4115.getClass(), "broadcaster", false);
        setBooleanField(term4115, term4115.getClass(), "orbitalElevator", false);
        setIntField(term4115, term4115.getClass(), "battleBonus", -1498296052);
        setIntField(term4115, term4115.getClass(), "defenseDamage", 2098647989);
        setIntField(term4115, term4115.getClass(), "scanRange", 1598895173);
        setIntField(term4115, term4115.getClass(), "scanCloakingDetection", 1830648570);
        setIntField(term4115, term4115.getClass(), "fleetCapacityBonus", -227365013);
        setIntField(term4115, term4115.getClass(), "recycleBonus", 11724947);
        setIntField(term4115, term4115.getClass(), "ancientArtifactResearch", 1953277050);
        setIntField(term4115, term4115.getClass(), "wildLifePower", 1283079251);
        setField(term4115, term4115.getClass(), "name", "fhkbdRViHi");
        setField(term4115, term4115.getClass(), "iconId", "uWHnvSvaPl");
        setField(term4115, term4115.getClass(), "description", "kBdSllIBVz");
        setIntField(term4115, term4115.getClass(), "prodCost", -523949691);
        setIntField(term4115, term4115.getClass(), "metalCost", 1398204340);
        term4187 = new Integer(229204365);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.construction.Building");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4187;
        callMethod(klass, "setMineBonus", argTypes, term4115, args);
    }

};


