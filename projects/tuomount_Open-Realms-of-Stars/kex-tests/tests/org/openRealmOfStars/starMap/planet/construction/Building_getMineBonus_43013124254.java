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

public class Building_getMineBonus_43013124254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25286;

    public Building_getMineBonus_43013124254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25286 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.construction.Building"));
        setField(term25286, term25286.getClass(), "type", null);
        setIntField(term25286, term25286.getClass(), "farmBonus", 0);
        setIntField(term25286, term25286.getClass(), "waterBonus", 0);
        setIntField(term25286, term25286.getClass(), "mineBonus", 0);
        setIntField(term25286, term25286.getClass(), "factBonus", 0);
        setIntField(term25286, term25286.getClass(), "cultBonus", 0);
        setIntField(term25286, term25286.getClass(), "reseBonus", 0);
        setIntField(term25286, term25286.getClass(), "credBonus", 0);
        setIntField(term25286, term25286.getClass(), "happinessBonus", 0);
        setIntField(term25286, term25286.getClass(), "materialBonus", 0);
        setDoubleField(term25286, term25286.getClass(), "maintenanceCost", 0.0);
        setBooleanField(term25286, term25286.getClass(), "singleAllowed", false);
        setBooleanField(term25286, term25286.getClass(), "scientificAchievement", false);
        setBooleanField(term25286, term25286.getClass(), "broadcaster", false);
        setBooleanField(term25286, term25286.getClass(), "orbitalElevator", false);
        setIntField(term25286, term25286.getClass(), "battleBonus", 0);
        setIntField(term25286, term25286.getClass(), "defenseDamage", 0);
        setIntField(term25286, term25286.getClass(), "scanRange", 0);
        setIntField(term25286, term25286.getClass(), "scanCloakingDetection", 0);
        setIntField(term25286, term25286.getClass(), "fleetCapacityBonus", 0);
        setIntField(term25286, term25286.getClass(), "recycleBonus", 0);
        setIntField(term25286, term25286.getClass(), "ancientArtifactResearch", 0);
        setIntField(term25286, term25286.getClass(), "wildLifePower", 0);
        setField(term25286, term25286.getClass(), "name", null);
        setField(term25286, term25286.getClass(), "iconId", null);
        setField(term25286, term25286.getClass(), "description", null);
        setIntField(term25286, term25286.getClass(), "prodCost", 0);
        setIntField(term25286, term25286.getClass(), "metalCost", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.construction.Building");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMineBonus", argTypes, term25286, args);
    }

};


