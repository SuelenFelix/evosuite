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

public class Building_setFarmBonus_148532300551 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25207;
     Object term25232;

    public Building_setFarmBonus_148532300551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25207 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.construction.Building"));
        setField(term25207, term25207.getClass(), "type", null);
        setIntField(term25207, term25207.getClass(), "farmBonus", 0);
        setIntField(term25207, term25207.getClass(), "waterBonus", 0);
        setIntField(term25207, term25207.getClass(), "mineBonus", 0);
        setIntField(term25207, term25207.getClass(), "factBonus", 0);
        setIntField(term25207, term25207.getClass(), "cultBonus", 0);
        setIntField(term25207, term25207.getClass(), "reseBonus", 0);
        setIntField(term25207, term25207.getClass(), "credBonus", 0);
        setIntField(term25207, term25207.getClass(), "happinessBonus", 0);
        setIntField(term25207, term25207.getClass(), "materialBonus", 0);
        setDoubleField(term25207, term25207.getClass(), "maintenanceCost", 0.0);
        setBooleanField(term25207, term25207.getClass(), "singleAllowed", false);
        setBooleanField(term25207, term25207.getClass(), "scientificAchievement", false);
        setBooleanField(term25207, term25207.getClass(), "broadcaster", false);
        setBooleanField(term25207, term25207.getClass(), "orbitalElevator", false);
        setIntField(term25207, term25207.getClass(), "battleBonus", 0);
        setIntField(term25207, term25207.getClass(), "defenseDamage", 0);
        setIntField(term25207, term25207.getClass(), "scanRange", 0);
        setIntField(term25207, term25207.getClass(), "scanCloakingDetection", 0);
        setIntField(term25207, term25207.getClass(), "fleetCapacityBonus", 0);
        setIntField(term25207, term25207.getClass(), "recycleBonus", 0);
        setIntField(term25207, term25207.getClass(), "ancientArtifactResearch", 0);
        setIntField(term25207, term25207.getClass(), "wildLifePower", 0);
        setField(term25207, term25207.getClass(), "name", null);
        setField(term25207, term25207.getClass(), "iconId", null);
        setField(term25207, term25207.getClass(), "description", null);
        setIntField(term25207, term25207.getClass(), "prodCost", 0);
        setIntField(term25207, term25207.getClass(), "metalCost", 0);
        term25232 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.construction.Building");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term25232;
        callMethod(klass, "setFarmBonus", argTypes, term25207, args);
    }

};


