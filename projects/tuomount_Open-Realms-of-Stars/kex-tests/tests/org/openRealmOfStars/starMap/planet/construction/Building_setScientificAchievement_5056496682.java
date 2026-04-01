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

public class Building_setScientificAchievement_5056496682 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26012;
     Object term26037;

    public Building_setScientificAchievement_5056496682() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26012 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.construction.Building"));
        setField(term26012, term26012.getClass(), "type", null);
        setIntField(term26012, term26012.getClass(), "farmBonus", 0);
        setIntField(term26012, term26012.getClass(), "waterBonus", 0);
        setIntField(term26012, term26012.getClass(), "mineBonus", 0);
        setIntField(term26012, term26012.getClass(), "factBonus", 0);
        setIntField(term26012, term26012.getClass(), "cultBonus", 0);
        setIntField(term26012, term26012.getClass(), "reseBonus", 0);
        setIntField(term26012, term26012.getClass(), "credBonus", 0);
        setIntField(term26012, term26012.getClass(), "happinessBonus", 0);
        setIntField(term26012, term26012.getClass(), "materialBonus", 0);
        setDoubleField(term26012, term26012.getClass(), "maintenanceCost", 0.0);
        setBooleanField(term26012, term26012.getClass(), "singleAllowed", false);
        setBooleanField(term26012, term26012.getClass(), "scientificAchievement", false);
        setBooleanField(term26012, term26012.getClass(), "broadcaster", false);
        setBooleanField(term26012, term26012.getClass(), "orbitalElevator", false);
        setIntField(term26012, term26012.getClass(), "battleBonus", 0);
        setIntField(term26012, term26012.getClass(), "defenseDamage", 0);
        setIntField(term26012, term26012.getClass(), "scanRange", 0);
        setIntField(term26012, term26012.getClass(), "scanCloakingDetection", 0);
        setIntField(term26012, term26012.getClass(), "fleetCapacityBonus", 0);
        setIntField(term26012, term26012.getClass(), "recycleBonus", 0);
        setIntField(term26012, term26012.getClass(), "ancientArtifactResearch", 0);
        setIntField(term26012, term26012.getClass(), "wildLifePower", 0);
        setField(term26012, term26012.getClass(), "name", null);
        setField(term26012, term26012.getClass(), "iconId", null);
        setField(term26012, term26012.getClass(), "description", null);
        setIntField(term26012, term26012.getClass(), "prodCost", 0);
        setIntField(term26012, term26012.getClass(), "metalCost", 0);
        term26037 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.construction.Building");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term26037;
        callMethod(klass, "setScientificAchievement", argTypes, term26012, args);
    }

};


