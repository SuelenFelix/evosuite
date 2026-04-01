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

public class Building_getFullDescription_22181546017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11750;

    public Building_getFullDescription_22181546017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11824 = Class.forName((String) "org.openRealmOfStars.starMap.planet.construction.BuildingType");
        Field term11823 = ((Class) term11824).getDeclaredField((String) "MILITARY");
        ((Field) term11823).setAccessible(true);
        Object enum25 = ((Field) term11823).get((Object) null);
        term11750 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.construction.Building"));
        setField(term11750, term11750.getClass(), "type", enum25);
        setIntField(term11750, term11750.getClass(), "farmBonus", 798043553);
        setIntField(term11750, term11750.getClass(), "waterBonus", 533197381);
        setIntField(term11750, term11750.getClass(), "mineBonus", 1048271679);
        setIntField(term11750, term11750.getClass(), "factBonus", -1529797673);
        setIntField(term11750, term11750.getClass(), "cultBonus", -868676396);
        setIntField(term11750, term11750.getClass(), "reseBonus", 1922684808);
        setIntField(term11750, term11750.getClass(), "credBonus", -2005784375);
        setIntField(term11750, term11750.getClass(), "happinessBonus", -288604325);
        setIntField(term11750, term11750.getClass(), "materialBonus", -1268314569);
        setDoubleField(term11750, term11750.getClass(), "maintenanceCost", 0.9828442029246764);
        setBooleanField(term11750, term11750.getClass(), "singleAllowed", false);
        setBooleanField(term11750, term11750.getClass(), "scientificAchievement", true);
        setBooleanField(term11750, term11750.getClass(), "broadcaster", true);
        setBooleanField(term11750, term11750.getClass(), "orbitalElevator", true);
        setIntField(term11750, term11750.getClass(), "battleBonus", 877649659);
        setIntField(term11750, term11750.getClass(), "defenseDamage", -1332748804);
        setIntField(term11750, term11750.getClass(), "scanRange", 1774507971);
        setIntField(term11750, term11750.getClass(), "scanCloakingDetection", -1420269858);
        setIntField(term11750, term11750.getClass(), "fleetCapacityBonus", -2119545015);
        setIntField(term11750, term11750.getClass(), "recycleBonus", 1272542218);
        setIntField(term11750, term11750.getClass(), "ancientArtifactResearch", 1209799204);
        setIntField(term11750, term11750.getClass(), "wildLifePower", 1094107751);
        setField(term11750, term11750.getClass(), "name", "fWKJoSoCwE");
        setField(term11750, term11750.getClass(), "iconId", "wfaXBpWAUH");
        setField(term11750, term11750.getClass(), "description", "VMeAzAHwZj");
        setIntField(term11750, term11750.getClass(), "prodCost", 844222656);
        setIntField(term11750, term11750.getClass(), "metalCost", -18216811);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.construction.Building");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFullDescription", argTypes, term11750, args);
    }

};


