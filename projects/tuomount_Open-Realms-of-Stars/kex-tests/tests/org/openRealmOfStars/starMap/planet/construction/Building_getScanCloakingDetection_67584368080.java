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

public class Building_getScanCloakingDetection_67584368080 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25960;

    public Building_getScanCloakingDetection_67584368080() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25960 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.construction.Building"));
        setField(term25960, term25960.getClass(), "type", null);
        setIntField(term25960, term25960.getClass(), "farmBonus", 0);
        setIntField(term25960, term25960.getClass(), "waterBonus", 0);
        setIntField(term25960, term25960.getClass(), "mineBonus", 0);
        setIntField(term25960, term25960.getClass(), "factBonus", 0);
        setIntField(term25960, term25960.getClass(), "cultBonus", 0);
        setIntField(term25960, term25960.getClass(), "reseBonus", 0);
        setIntField(term25960, term25960.getClass(), "credBonus", 0);
        setIntField(term25960, term25960.getClass(), "happinessBonus", 0);
        setIntField(term25960, term25960.getClass(), "materialBonus", 0);
        setDoubleField(term25960, term25960.getClass(), "maintenanceCost", 0.0);
        setBooleanField(term25960, term25960.getClass(), "singleAllowed", false);
        setBooleanField(term25960, term25960.getClass(), "scientificAchievement", false);
        setBooleanField(term25960, term25960.getClass(), "broadcaster", false);
        setBooleanField(term25960, term25960.getClass(), "orbitalElevator", false);
        setIntField(term25960, term25960.getClass(), "battleBonus", 0);
        setIntField(term25960, term25960.getClass(), "defenseDamage", 0);
        setIntField(term25960, term25960.getClass(), "scanRange", 0);
        setIntField(term25960, term25960.getClass(), "scanCloakingDetection", 0);
        setIntField(term25960, term25960.getClass(), "fleetCapacityBonus", 0);
        setIntField(term25960, term25960.getClass(), "recycleBonus", 0);
        setIntField(term25960, term25960.getClass(), "ancientArtifactResearch", 0);
        setIntField(term25960, term25960.getClass(), "wildLifePower", 0);
        setField(term25960, term25960.getClass(), "name", null);
        setField(term25960, term25960.getClass(), "iconId", null);
        setField(term25960, term25960.getClass(), "description", null);
        setIntField(term25960, term25960.getClass(), "prodCost", 0);
        setIntField(term25960, term25960.getClass(), "metalCost", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.construction.Building");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getScanCloakingDetection", argTypes, term25960, args);
    }

};


