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
import java.lang.Integer;

public class Building_setMaterialBonus_140975255685 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26089;
     Object term26114;

    public Building_setMaterialBonus_140975255685() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26089 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.construction.Building"));
        setField(term26089, term26089.getClass(), "type", null);
        setIntField(term26089, term26089.getClass(), "farmBonus", 0);
        setIntField(term26089, term26089.getClass(), "waterBonus", 0);
        setIntField(term26089, term26089.getClass(), "mineBonus", 0);
        setIntField(term26089, term26089.getClass(), "factBonus", 0);
        setIntField(term26089, term26089.getClass(), "cultBonus", 0);
        setIntField(term26089, term26089.getClass(), "reseBonus", 0);
        setIntField(term26089, term26089.getClass(), "credBonus", 0);
        setIntField(term26089, term26089.getClass(), "happinessBonus", 0);
        setIntField(term26089, term26089.getClass(), "materialBonus", 0);
        setDoubleField(term26089, term26089.getClass(), "maintenanceCost", 0.0);
        setBooleanField(term26089, term26089.getClass(), "singleAllowed", false);
        setBooleanField(term26089, term26089.getClass(), "scientificAchievement", false);
        setBooleanField(term26089, term26089.getClass(), "broadcaster", false);
        setBooleanField(term26089, term26089.getClass(), "orbitalElevator", false);
        setIntField(term26089, term26089.getClass(), "battleBonus", 0);
        setIntField(term26089, term26089.getClass(), "defenseDamage", 0);
        setIntField(term26089, term26089.getClass(), "scanRange", 0);
        setIntField(term26089, term26089.getClass(), "scanCloakingDetection", 0);
        setIntField(term26089, term26089.getClass(), "fleetCapacityBonus", 0);
        setIntField(term26089, term26089.getClass(), "recycleBonus", 0);
        setIntField(term26089, term26089.getClass(), "ancientArtifactResearch", 0);
        setIntField(term26089, term26089.getClass(), "wildLifePower", 0);
        setField(term26089, term26089.getClass(), "name", null);
        setField(term26089, term26089.getClass(), "iconId", null);
        setField(term26089, term26089.getClass(), "description", null);
        setIntField(term26089, term26089.getClass(), "prodCost", 0);
        setIntField(term26089, term26089.getClass(), "metalCost", 0);
        term26114 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.construction.Building");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term26114;
        callMethod(klass, "setMaterialBonus", argTypes, term26089, args);
    }

};


