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

public class Building_getAncientArtifactResearch_99041972994 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26324;

    public Building_getAncientArtifactResearch_99041972994() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26324 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.construction.Building"));
        setField(term26324, term26324.getClass(), "type", null);
        setIntField(term26324, term26324.getClass(), "farmBonus", 0);
        setIntField(term26324, term26324.getClass(), "waterBonus", 0);
        setIntField(term26324, term26324.getClass(), "mineBonus", 0);
        setIntField(term26324, term26324.getClass(), "factBonus", 0);
        setIntField(term26324, term26324.getClass(), "cultBonus", 0);
        setIntField(term26324, term26324.getClass(), "reseBonus", 0);
        setIntField(term26324, term26324.getClass(), "credBonus", 0);
        setIntField(term26324, term26324.getClass(), "happinessBonus", 0);
        setIntField(term26324, term26324.getClass(), "materialBonus", 0);
        setDoubleField(term26324, term26324.getClass(), "maintenanceCost", 0.0);
        setBooleanField(term26324, term26324.getClass(), "singleAllowed", false);
        setBooleanField(term26324, term26324.getClass(), "scientificAchievement", false);
        setBooleanField(term26324, term26324.getClass(), "broadcaster", false);
        setBooleanField(term26324, term26324.getClass(), "orbitalElevator", false);
        setIntField(term26324, term26324.getClass(), "battleBonus", 0);
        setIntField(term26324, term26324.getClass(), "defenseDamage", 0);
        setIntField(term26324, term26324.getClass(), "scanRange", 0);
        setIntField(term26324, term26324.getClass(), "scanCloakingDetection", 0);
        setIntField(term26324, term26324.getClass(), "fleetCapacityBonus", 0);
        setIntField(term26324, term26324.getClass(), "recycleBonus", 0);
        setIntField(term26324, term26324.getClass(), "ancientArtifactResearch", 0);
        setIntField(term26324, term26324.getClass(), "wildLifePower", 0);
        setField(term26324, term26324.getClass(), "name", null);
        setField(term26324, term26324.getClass(), "iconId", null);
        setField(term26324, term26324.getClass(), "description", null);
        setIntField(term26324, term26324.getClass(), "prodCost", 0);
        setIntField(term26324, term26324.getClass(), "metalCost", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.construction.Building");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAncientArtifactResearch", argTypes, term26324, args);
    }

};


