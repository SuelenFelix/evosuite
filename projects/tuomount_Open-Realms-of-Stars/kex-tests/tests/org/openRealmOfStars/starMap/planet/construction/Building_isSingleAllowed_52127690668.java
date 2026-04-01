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

public class Building_isSingleAllowed_52127690668 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25648;

    public Building_isSingleAllowed_52127690668() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25648 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.construction.Building"));
        setField(term25648, term25648.getClass(), "type", null);
        setIntField(term25648, term25648.getClass(), "farmBonus", 0);
        setIntField(term25648, term25648.getClass(), "waterBonus", 0);
        setIntField(term25648, term25648.getClass(), "mineBonus", 0);
        setIntField(term25648, term25648.getClass(), "factBonus", 0);
        setIntField(term25648, term25648.getClass(), "cultBonus", 0);
        setIntField(term25648, term25648.getClass(), "reseBonus", 0);
        setIntField(term25648, term25648.getClass(), "credBonus", 0);
        setIntField(term25648, term25648.getClass(), "happinessBonus", 0);
        setIntField(term25648, term25648.getClass(), "materialBonus", 0);
        setDoubleField(term25648, term25648.getClass(), "maintenanceCost", 0.0);
        setBooleanField(term25648, term25648.getClass(), "singleAllowed", false);
        setBooleanField(term25648, term25648.getClass(), "scientificAchievement", false);
        setBooleanField(term25648, term25648.getClass(), "broadcaster", false);
        setBooleanField(term25648, term25648.getClass(), "orbitalElevator", false);
        setIntField(term25648, term25648.getClass(), "battleBonus", 0);
        setIntField(term25648, term25648.getClass(), "defenseDamage", 0);
        setIntField(term25648, term25648.getClass(), "scanRange", 0);
        setIntField(term25648, term25648.getClass(), "scanCloakingDetection", 0);
        setIntField(term25648, term25648.getClass(), "fleetCapacityBonus", 0);
        setIntField(term25648, term25648.getClass(), "recycleBonus", 0);
        setIntField(term25648, term25648.getClass(), "ancientArtifactResearch", 0);
        setIntField(term25648, term25648.getClass(), "wildLifePower", 0);
        setField(term25648, term25648.getClass(), "name", null);
        setField(term25648, term25648.getClass(), "iconId", null);
        setField(term25648, term25648.getClass(), "description", null);
        setIntField(term25648, term25648.getClass(), "prodCost", 0);
        setIntField(term25648, term25648.getClass(), "metalCost", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.construction.Building");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isSingleAllowed", argTypes, term25648, args);
    }

};


