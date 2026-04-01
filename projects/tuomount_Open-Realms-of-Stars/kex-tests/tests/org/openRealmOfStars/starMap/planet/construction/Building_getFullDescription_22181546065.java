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

public class Building_getFullDescription_22181546065 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25571;

    public Building_getFullDescription_22181546065() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25571 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.construction.Building"));
        setField(term25571, term25571.getClass(), "type", null);
        setIntField(term25571, term25571.getClass(), "farmBonus", 0);
        setIntField(term25571, term25571.getClass(), "waterBonus", 0);
        setIntField(term25571, term25571.getClass(), "mineBonus", 0);
        setIntField(term25571, term25571.getClass(), "factBonus", 0);
        setIntField(term25571, term25571.getClass(), "cultBonus", 0);
        setIntField(term25571, term25571.getClass(), "reseBonus", 0);
        setIntField(term25571, term25571.getClass(), "credBonus", 0);
        setIntField(term25571, term25571.getClass(), "happinessBonus", 0);
        setIntField(term25571, term25571.getClass(), "materialBonus", 0);
        setDoubleField(term25571, term25571.getClass(), "maintenanceCost", 0.0);
        setBooleanField(term25571, term25571.getClass(), "singleAllowed", false);
        setBooleanField(term25571, term25571.getClass(), "scientificAchievement", false);
        setBooleanField(term25571, term25571.getClass(), "broadcaster", false);
        setBooleanField(term25571, term25571.getClass(), "orbitalElevator", false);
        setIntField(term25571, term25571.getClass(), "battleBonus", 0);
        setIntField(term25571, term25571.getClass(), "defenseDamage", 0);
        setIntField(term25571, term25571.getClass(), "scanRange", 0);
        setIntField(term25571, term25571.getClass(), "scanCloakingDetection", 0);
        setIntField(term25571, term25571.getClass(), "fleetCapacityBonus", 0);
        setIntField(term25571, term25571.getClass(), "recycleBonus", 0);
        setIntField(term25571, term25571.getClass(), "ancientArtifactResearch", 0);
        setIntField(term25571, term25571.getClass(), "wildLifePower", 0);
        setField(term25571, term25571.getClass(), "name", null);
        setField(term25571, term25571.getClass(), "iconId", null);
        setField(term25571, term25571.getClass(), "description", null);
        setIntField(term25571, term25571.getClass(), "prodCost", 0);
        setIntField(term25571, term25571.getClass(), "metalCost", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.construction.Building");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFullDescription", argTypes, term25571, args);
    }

};


