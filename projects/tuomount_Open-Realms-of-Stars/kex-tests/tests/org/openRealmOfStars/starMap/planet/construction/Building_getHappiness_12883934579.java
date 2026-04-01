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

public class Building_getHappiness_12883934579 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25935;

    public Building_getHappiness_12883934579() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25935 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.construction.Building"));
        setField(term25935, term25935.getClass(), "type", null);
        setIntField(term25935, term25935.getClass(), "farmBonus", 0);
        setIntField(term25935, term25935.getClass(), "waterBonus", 0);
        setIntField(term25935, term25935.getClass(), "mineBonus", 0);
        setIntField(term25935, term25935.getClass(), "factBonus", 0);
        setIntField(term25935, term25935.getClass(), "cultBonus", 0);
        setIntField(term25935, term25935.getClass(), "reseBonus", 0);
        setIntField(term25935, term25935.getClass(), "credBonus", 0);
        setIntField(term25935, term25935.getClass(), "happinessBonus", 0);
        setIntField(term25935, term25935.getClass(), "materialBonus", 0);
        setDoubleField(term25935, term25935.getClass(), "maintenanceCost", 0.0);
        setBooleanField(term25935, term25935.getClass(), "singleAllowed", false);
        setBooleanField(term25935, term25935.getClass(), "scientificAchievement", false);
        setBooleanField(term25935, term25935.getClass(), "broadcaster", false);
        setBooleanField(term25935, term25935.getClass(), "orbitalElevator", false);
        setIntField(term25935, term25935.getClass(), "battleBonus", 0);
        setIntField(term25935, term25935.getClass(), "defenseDamage", 0);
        setIntField(term25935, term25935.getClass(), "scanRange", 0);
        setIntField(term25935, term25935.getClass(), "scanCloakingDetection", 0);
        setIntField(term25935, term25935.getClass(), "fleetCapacityBonus", 0);
        setIntField(term25935, term25935.getClass(), "recycleBonus", 0);
        setIntField(term25935, term25935.getClass(), "ancientArtifactResearch", 0);
        setIntField(term25935, term25935.getClass(), "wildLifePower", 0);
        setField(term25935, term25935.getClass(), "name", null);
        setField(term25935, term25935.getClass(), "iconId", null);
        setField(term25935, term25935.getClass(), "description", null);
        setIntField(term25935, term25935.getClass(), "prodCost", 0);
        setIntField(term25935, term25935.getClass(), "metalCost", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.construction.Building");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHappiness", argTypes, term25935, args);
    }

};


