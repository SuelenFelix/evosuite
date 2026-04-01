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

public class Building_setHappiness_163926960578 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25908;
     Object term25933;

    public Building_setHappiness_163926960578() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25908 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.construction.Building"));
        setField(term25908, term25908.getClass(), "type", null);
        setIntField(term25908, term25908.getClass(), "farmBonus", 0);
        setIntField(term25908, term25908.getClass(), "waterBonus", 0);
        setIntField(term25908, term25908.getClass(), "mineBonus", 0);
        setIntField(term25908, term25908.getClass(), "factBonus", 0);
        setIntField(term25908, term25908.getClass(), "cultBonus", 0);
        setIntField(term25908, term25908.getClass(), "reseBonus", 0);
        setIntField(term25908, term25908.getClass(), "credBonus", 0);
        setIntField(term25908, term25908.getClass(), "happinessBonus", 0);
        setIntField(term25908, term25908.getClass(), "materialBonus", 0);
        setDoubleField(term25908, term25908.getClass(), "maintenanceCost", 0.0);
        setBooleanField(term25908, term25908.getClass(), "singleAllowed", false);
        setBooleanField(term25908, term25908.getClass(), "scientificAchievement", false);
        setBooleanField(term25908, term25908.getClass(), "broadcaster", false);
        setBooleanField(term25908, term25908.getClass(), "orbitalElevator", false);
        setIntField(term25908, term25908.getClass(), "battleBonus", 0);
        setIntField(term25908, term25908.getClass(), "defenseDamage", 0);
        setIntField(term25908, term25908.getClass(), "scanRange", 0);
        setIntField(term25908, term25908.getClass(), "scanCloakingDetection", 0);
        setIntField(term25908, term25908.getClass(), "fleetCapacityBonus", 0);
        setIntField(term25908, term25908.getClass(), "recycleBonus", 0);
        setIntField(term25908, term25908.getClass(), "ancientArtifactResearch", 0);
        setIntField(term25908, term25908.getClass(), "wildLifePower", 0);
        setField(term25908, term25908.getClass(), "name", null);
        setField(term25908, term25908.getClass(), "iconId", null);
        setField(term25908, term25908.getClass(), "description", null);
        setIntField(term25908, term25908.getClass(), "prodCost", 0);
        setIntField(term25908, term25908.getClass(), "metalCost", 0);
        term25933 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.construction.Building");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term25933;
        callMethod(klass, "setHappiness", argTypes, term25908, args);
    }

};


