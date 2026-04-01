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

public class Building_getFarmBonus_104153534150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25182;

    public Building_getFarmBonus_104153534150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25182 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.construction.Building"));
        setField(term25182, term25182.getClass(), "type", null);
        setIntField(term25182, term25182.getClass(), "farmBonus", 0);
        setIntField(term25182, term25182.getClass(), "waterBonus", 0);
        setIntField(term25182, term25182.getClass(), "mineBonus", 0);
        setIntField(term25182, term25182.getClass(), "factBonus", 0);
        setIntField(term25182, term25182.getClass(), "cultBonus", 0);
        setIntField(term25182, term25182.getClass(), "reseBonus", 0);
        setIntField(term25182, term25182.getClass(), "credBonus", 0);
        setIntField(term25182, term25182.getClass(), "happinessBonus", 0);
        setIntField(term25182, term25182.getClass(), "materialBonus", 0);
        setDoubleField(term25182, term25182.getClass(), "maintenanceCost", 0.0);
        setBooleanField(term25182, term25182.getClass(), "singleAllowed", false);
        setBooleanField(term25182, term25182.getClass(), "scientificAchievement", false);
        setBooleanField(term25182, term25182.getClass(), "broadcaster", false);
        setBooleanField(term25182, term25182.getClass(), "orbitalElevator", false);
        setIntField(term25182, term25182.getClass(), "battleBonus", 0);
        setIntField(term25182, term25182.getClass(), "defenseDamage", 0);
        setIntField(term25182, term25182.getClass(), "scanRange", 0);
        setIntField(term25182, term25182.getClass(), "scanCloakingDetection", 0);
        setIntField(term25182, term25182.getClass(), "fleetCapacityBonus", 0);
        setIntField(term25182, term25182.getClass(), "recycleBonus", 0);
        setIntField(term25182, term25182.getClass(), "ancientArtifactResearch", 0);
        setIntField(term25182, term25182.getClass(), "wildLifePower", 0);
        setField(term25182, term25182.getClass(), "name", null);
        setField(term25182, term25182.getClass(), "iconId", null);
        setField(term25182, term25182.getClass(), "description", null);
        setIntField(term25182, term25182.getClass(), "prodCost", 0);
        setIntField(term25182, term25182.getClass(), "metalCost", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.construction.Building");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFarmBonus", argTypes, term25182, args);
    }

};


