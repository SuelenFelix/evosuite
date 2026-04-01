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

public class Building_setBroadcaster_195094374689 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26193;
     Object term26218;

    public Building_setBroadcaster_195094374689() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26193 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.construction.Building"));
        setField(term26193, term26193.getClass(), "type", null);
        setIntField(term26193, term26193.getClass(), "farmBonus", 0);
        setIntField(term26193, term26193.getClass(), "waterBonus", 0);
        setIntField(term26193, term26193.getClass(), "mineBonus", 0);
        setIntField(term26193, term26193.getClass(), "factBonus", 0);
        setIntField(term26193, term26193.getClass(), "cultBonus", 0);
        setIntField(term26193, term26193.getClass(), "reseBonus", 0);
        setIntField(term26193, term26193.getClass(), "credBonus", 0);
        setIntField(term26193, term26193.getClass(), "happinessBonus", 0);
        setIntField(term26193, term26193.getClass(), "materialBonus", 0);
        setDoubleField(term26193, term26193.getClass(), "maintenanceCost", 0.0);
        setBooleanField(term26193, term26193.getClass(), "singleAllowed", false);
        setBooleanField(term26193, term26193.getClass(), "scientificAchievement", false);
        setBooleanField(term26193, term26193.getClass(), "broadcaster", false);
        setBooleanField(term26193, term26193.getClass(), "orbitalElevator", false);
        setIntField(term26193, term26193.getClass(), "battleBonus", 0);
        setIntField(term26193, term26193.getClass(), "defenseDamage", 0);
        setIntField(term26193, term26193.getClass(), "scanRange", 0);
        setIntField(term26193, term26193.getClass(), "scanCloakingDetection", 0);
        setIntField(term26193, term26193.getClass(), "fleetCapacityBonus", 0);
        setIntField(term26193, term26193.getClass(), "recycleBonus", 0);
        setIntField(term26193, term26193.getClass(), "ancientArtifactResearch", 0);
        setIntField(term26193, term26193.getClass(), "wildLifePower", 0);
        setField(term26193, term26193.getClass(), "name", null);
        setField(term26193, term26193.getClass(), "iconId", null);
        setField(term26193, term26193.getClass(), "description", null);
        setIntField(term26193, term26193.getClass(), "prodCost", 0);
        setIntField(term26193, term26193.getClass(), "metalCost", 0);
        term26218 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.construction.Building");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term26218;
        callMethod(klass, "setBroadcaster", argTypes, term26193, args);
    }

};


