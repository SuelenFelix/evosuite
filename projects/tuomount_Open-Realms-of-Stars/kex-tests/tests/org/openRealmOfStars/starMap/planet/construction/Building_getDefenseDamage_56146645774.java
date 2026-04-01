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

public class Building_getDefenseDamage_56146645774 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25804;

    public Building_getDefenseDamage_56146645774() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25804 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.construction.Building"));
        setField(term25804, term25804.getClass(), "type", null);
        setIntField(term25804, term25804.getClass(), "farmBonus", 0);
        setIntField(term25804, term25804.getClass(), "waterBonus", 0);
        setIntField(term25804, term25804.getClass(), "mineBonus", 0);
        setIntField(term25804, term25804.getClass(), "factBonus", 0);
        setIntField(term25804, term25804.getClass(), "cultBonus", 0);
        setIntField(term25804, term25804.getClass(), "reseBonus", 0);
        setIntField(term25804, term25804.getClass(), "credBonus", 0);
        setIntField(term25804, term25804.getClass(), "happinessBonus", 0);
        setIntField(term25804, term25804.getClass(), "materialBonus", 0);
        setDoubleField(term25804, term25804.getClass(), "maintenanceCost", 0.0);
        setBooleanField(term25804, term25804.getClass(), "singleAllowed", false);
        setBooleanField(term25804, term25804.getClass(), "scientificAchievement", false);
        setBooleanField(term25804, term25804.getClass(), "broadcaster", false);
        setBooleanField(term25804, term25804.getClass(), "orbitalElevator", false);
        setIntField(term25804, term25804.getClass(), "battleBonus", 0);
        setIntField(term25804, term25804.getClass(), "defenseDamage", 0);
        setIntField(term25804, term25804.getClass(), "scanRange", 0);
        setIntField(term25804, term25804.getClass(), "scanCloakingDetection", 0);
        setIntField(term25804, term25804.getClass(), "fleetCapacityBonus", 0);
        setIntField(term25804, term25804.getClass(), "recycleBonus", 0);
        setIntField(term25804, term25804.getClass(), "ancientArtifactResearch", 0);
        setIntField(term25804, term25804.getClass(), "wildLifePower", 0);
        setField(term25804, term25804.getClass(), "name", null);
        setField(term25804, term25804.getClass(), "iconId", null);
        setField(term25804, term25804.getClass(), "description", null);
        setIntField(term25804, term25804.getClass(), "prodCost", 0);
        setIntField(term25804, term25804.getClass(), "metalCost", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.construction.Building");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDefenseDamage", argTypes, term25804, args);
    }

};


