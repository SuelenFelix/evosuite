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

public class Building_getWildLifePower_20093063392 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26272;

    public Building_getWildLifePower_20093063392() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26272 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.construction.Building"));
        setField(term26272, term26272.getClass(), "type", null);
        setIntField(term26272, term26272.getClass(), "farmBonus", 0);
        setIntField(term26272, term26272.getClass(), "waterBonus", 0);
        setIntField(term26272, term26272.getClass(), "mineBonus", 0);
        setIntField(term26272, term26272.getClass(), "factBonus", 0);
        setIntField(term26272, term26272.getClass(), "cultBonus", 0);
        setIntField(term26272, term26272.getClass(), "reseBonus", 0);
        setIntField(term26272, term26272.getClass(), "credBonus", 0);
        setIntField(term26272, term26272.getClass(), "happinessBonus", 0);
        setIntField(term26272, term26272.getClass(), "materialBonus", 0);
        setDoubleField(term26272, term26272.getClass(), "maintenanceCost", 0.0);
        setBooleanField(term26272, term26272.getClass(), "singleAllowed", false);
        setBooleanField(term26272, term26272.getClass(), "scientificAchievement", false);
        setBooleanField(term26272, term26272.getClass(), "broadcaster", false);
        setBooleanField(term26272, term26272.getClass(), "orbitalElevator", false);
        setIntField(term26272, term26272.getClass(), "battleBonus", 0);
        setIntField(term26272, term26272.getClass(), "defenseDamage", 0);
        setIntField(term26272, term26272.getClass(), "scanRange", 0);
        setIntField(term26272, term26272.getClass(), "scanCloakingDetection", 0);
        setIntField(term26272, term26272.getClass(), "fleetCapacityBonus", 0);
        setIntField(term26272, term26272.getClass(), "recycleBonus", 0);
        setIntField(term26272, term26272.getClass(), "ancientArtifactResearch", 0);
        setIntField(term26272, term26272.getClass(), "wildLifePower", 0);
        setField(term26272, term26272.getClass(), "name", null);
        setField(term26272, term26272.getClass(), "iconId", null);
        setField(term26272, term26272.getClass(), "description", null);
        setIntField(term26272, term26272.getClass(), "prodCost", 0);
        setIntField(term26272, term26272.getClass(), "metalCost", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.construction.Building");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWildLifePower", argTypes, term26272, args);
    }

};


