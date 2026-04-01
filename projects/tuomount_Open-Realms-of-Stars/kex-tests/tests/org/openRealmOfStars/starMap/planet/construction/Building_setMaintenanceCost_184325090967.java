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
import java.lang.Double;

public class Building_setMaintenanceCost_184325090967 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25621;
     Object term25646;

    public Building_setMaintenanceCost_184325090967() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25621 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.construction.Building"));
        setField(term25621, term25621.getClass(), "type", null);
        setIntField(term25621, term25621.getClass(), "farmBonus", 0);
        setIntField(term25621, term25621.getClass(), "waterBonus", 0);
        setIntField(term25621, term25621.getClass(), "mineBonus", 0);
        setIntField(term25621, term25621.getClass(), "factBonus", 0);
        setIntField(term25621, term25621.getClass(), "cultBonus", 0);
        setIntField(term25621, term25621.getClass(), "reseBonus", 0);
        setIntField(term25621, term25621.getClass(), "credBonus", 0);
        setIntField(term25621, term25621.getClass(), "happinessBonus", 0);
        setIntField(term25621, term25621.getClass(), "materialBonus", 0);
        setDoubleField(term25621, term25621.getClass(), "maintenanceCost", 0.0);
        setBooleanField(term25621, term25621.getClass(), "singleAllowed", false);
        setBooleanField(term25621, term25621.getClass(), "scientificAchievement", false);
        setBooleanField(term25621, term25621.getClass(), "broadcaster", false);
        setBooleanField(term25621, term25621.getClass(), "orbitalElevator", false);
        setIntField(term25621, term25621.getClass(), "battleBonus", 0);
        setIntField(term25621, term25621.getClass(), "defenseDamage", 0);
        setIntField(term25621, term25621.getClass(), "scanRange", 0);
        setIntField(term25621, term25621.getClass(), "scanCloakingDetection", 0);
        setIntField(term25621, term25621.getClass(), "fleetCapacityBonus", 0);
        setIntField(term25621, term25621.getClass(), "recycleBonus", 0);
        setIntField(term25621, term25621.getClass(), "ancientArtifactResearch", 0);
        setIntField(term25621, term25621.getClass(), "wildLifePower", 0);
        setField(term25621, term25621.getClass(), "name", null);
        setField(term25621, term25621.getClass(), "iconId", null);
        setField(term25621, term25621.getClass(), "description", null);
        setIntField(term25621, term25621.getClass(), "prodCost", 0);
        setIntField(term25621, term25621.getClass(), "metalCost", 0);
        term25646 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.construction.Building");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term25646;
        callMethod(klass, "setMaintenanceCost", argTypes, term25621, args);
    }

};


