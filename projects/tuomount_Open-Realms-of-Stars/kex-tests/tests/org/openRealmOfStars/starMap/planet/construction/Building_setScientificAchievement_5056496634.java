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
import java.lang.String;
import java.lang.Object;
import java.lang.Boolean;

public class Building_setScientificAchievement_5056496634 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19085;
     Object term19157;

    public Building_setScientificAchievement_5056496634() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term19160 = Class.forName((String) "org.openRealmOfStars.starMap.planet.construction.BuildingType");
        Field term19159 = ((Class) term19160).getDeclaredField((String) "FACTORY");
        ((Field) term19159).setAccessible(true);
        Object enum42 = ((Field) term19159).get((Object) null);
        term19085 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.construction.Building"));
        setField(term19085, term19085.getClass(), "type", enum42);
        setIntField(term19085, term19085.getClass(), "farmBonus", 269110087);
        setIntField(term19085, term19085.getClass(), "waterBonus", 1545119095);
        setIntField(term19085, term19085.getClass(), "mineBonus", 1671229683);
        setIntField(term19085, term19085.getClass(), "factBonus", 34167717);
        setIntField(term19085, term19085.getClass(), "cultBonus", -514195141);
        setIntField(term19085, term19085.getClass(), "reseBonus", -297946422);
        setIntField(term19085, term19085.getClass(), "credBonus", 385463636);
        setIntField(term19085, term19085.getClass(), "happinessBonus", -1677599962);
        setIntField(term19085, term19085.getClass(), "materialBonus", -1790275458);
        setDoubleField(term19085, term19085.getClass(), "maintenanceCost", 0.9737083944266686);
        setBooleanField(term19085, term19085.getClass(), "singleAllowed", false);
        setBooleanField(term19085, term19085.getClass(), "scientificAchievement", true);
        setBooleanField(term19085, term19085.getClass(), "broadcaster", false);
        setBooleanField(term19085, term19085.getClass(), "orbitalElevator", false);
        setIntField(term19085, term19085.getClass(), "battleBonus", -497534255);
        setIntField(term19085, term19085.getClass(), "defenseDamage", 1588942911);
        setIntField(term19085, term19085.getClass(), "scanRange", -2129828854);
        setIntField(term19085, term19085.getClass(), "scanCloakingDetection", -47438786);
        setIntField(term19085, term19085.getClass(), "fleetCapacityBonus", -1955400589);
        setIntField(term19085, term19085.getClass(), "recycleBonus", 626179200);
        setIntField(term19085, term19085.getClass(), "ancientArtifactResearch", -511077684);
        setIntField(term19085, term19085.getClass(), "wildLifePower", -711507760);
        setField(term19085, term19085.getClass(), "name", "JppkknKVOw");
        setField(term19085, term19085.getClass(), "iconId", "iljANwuEjk");
        setField(term19085, term19085.getClass(), "description", "kNqaJKIATy");
        setIntField(term19085, term19085.getClass(), "prodCost", 1053773809);
        setIntField(term19085, term19085.getClass(), "metalCost", 924127883);
        term19157 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.construction.Building");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term19157;
        callMethod(klass, "setScientificAchievement", argTypes, term19085, args);
    }

};


