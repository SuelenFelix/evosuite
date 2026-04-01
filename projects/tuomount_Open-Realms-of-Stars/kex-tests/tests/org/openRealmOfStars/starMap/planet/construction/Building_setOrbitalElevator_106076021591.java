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
import java.lang.Boolean;

public class Building_setOrbitalElevator_106076021591 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26245;
     Object term26270;

    public Building_setOrbitalElevator_106076021591() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26245 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.construction.Building"));
        setField(term26245, term26245.getClass(), "type", null);
        setIntField(term26245, term26245.getClass(), "farmBonus", 0);
        setIntField(term26245, term26245.getClass(), "waterBonus", 0);
        setIntField(term26245, term26245.getClass(), "mineBonus", 0);
        setIntField(term26245, term26245.getClass(), "factBonus", 0);
        setIntField(term26245, term26245.getClass(), "cultBonus", 0);
        setIntField(term26245, term26245.getClass(), "reseBonus", 0);
        setIntField(term26245, term26245.getClass(), "credBonus", 0);
        setIntField(term26245, term26245.getClass(), "happinessBonus", 0);
        setIntField(term26245, term26245.getClass(), "materialBonus", 0);
        setDoubleField(term26245, term26245.getClass(), "maintenanceCost", 0.0);
        setBooleanField(term26245, term26245.getClass(), "singleAllowed", false);
        setBooleanField(term26245, term26245.getClass(), "scientificAchievement", false);
        setBooleanField(term26245, term26245.getClass(), "broadcaster", false);
        setBooleanField(term26245, term26245.getClass(), "orbitalElevator", false);
        setIntField(term26245, term26245.getClass(), "battleBonus", 0);
        setIntField(term26245, term26245.getClass(), "defenseDamage", 0);
        setIntField(term26245, term26245.getClass(), "scanRange", 0);
        setIntField(term26245, term26245.getClass(), "scanCloakingDetection", 0);
        setIntField(term26245, term26245.getClass(), "fleetCapacityBonus", 0);
        setIntField(term26245, term26245.getClass(), "recycleBonus", 0);
        setIntField(term26245, term26245.getClass(), "ancientArtifactResearch", 0);
        setIntField(term26245, term26245.getClass(), "wildLifePower", 0);
        setField(term26245, term26245.getClass(), "name", null);
        setField(term26245, term26245.getClass(), "iconId", null);
        setField(term26245, term26245.getClass(), "description", null);
        setIntField(term26245, term26245.getClass(), "prodCost", 0);
        setIntField(term26245, term26245.getClass(), "metalCost", 0);
        term26270 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.construction.Building");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term26270;
        callMethod(klass, "setOrbitalElevator", argTypes, term26245, args);
    }

};


