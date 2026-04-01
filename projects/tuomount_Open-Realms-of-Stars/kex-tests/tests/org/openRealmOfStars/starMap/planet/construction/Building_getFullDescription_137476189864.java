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

public class Building_getFullDescription_137476189864 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25546;

    public Building_getFullDescription_137476189864() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25546 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.construction.Building"));
        setField(term25546, term25546.getClass(), "type", null);
        setIntField(term25546, term25546.getClass(), "farmBonus", 0);
        setIntField(term25546, term25546.getClass(), "waterBonus", 0);
        setIntField(term25546, term25546.getClass(), "mineBonus", 0);
        setIntField(term25546, term25546.getClass(), "factBonus", 0);
        setIntField(term25546, term25546.getClass(), "cultBonus", 0);
        setIntField(term25546, term25546.getClass(), "reseBonus", 0);
        setIntField(term25546, term25546.getClass(), "credBonus", 0);
        setIntField(term25546, term25546.getClass(), "happinessBonus", 0);
        setIntField(term25546, term25546.getClass(), "materialBonus", 0);
        setDoubleField(term25546, term25546.getClass(), "maintenanceCost", 0.0);
        setBooleanField(term25546, term25546.getClass(), "singleAllowed", false);
        setBooleanField(term25546, term25546.getClass(), "scientificAchievement", false);
        setBooleanField(term25546, term25546.getClass(), "broadcaster", false);
        setBooleanField(term25546, term25546.getClass(), "orbitalElevator", false);
        setIntField(term25546, term25546.getClass(), "battleBonus", 0);
        setIntField(term25546, term25546.getClass(), "defenseDamage", 0);
        setIntField(term25546, term25546.getClass(), "scanRange", 0);
        setIntField(term25546, term25546.getClass(), "scanCloakingDetection", 0);
        setIntField(term25546, term25546.getClass(), "fleetCapacityBonus", 0);
        setIntField(term25546, term25546.getClass(), "recycleBonus", 0);
        setIntField(term25546, term25546.getClass(), "ancientArtifactResearch", 0);
        setIntField(term25546, term25546.getClass(), "wildLifePower", 0);
        setField(term25546, term25546.getClass(), "name", null);
        setField(term25546, term25546.getClass(), "iconId", null);
        setField(term25546, term25546.getClass(), "description", null);
        setIntField(term25546, term25546.getClass(), "prodCost", 0);
        setIntField(term25546, term25546.getClass(), "metalCost", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.construction.Building");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.race.SpaceRace");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getFullDescription", argTypes, term25546, args);
    }

};


