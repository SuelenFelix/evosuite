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

public class Building_getFactBonus_3847517158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4552;

    public Building_getFactBonus_3847517158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4625 = Class.forName((String) "org.openRealmOfStars.starMap.planet.construction.BuildingType");
        Field term4624 = ((Class) term4625).getDeclaredField((String) "FACTORY");
        ((Field) term4624).setAccessible(true);
        Object enum8 = ((Field) term4624).get((Object) null);
        term4552 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.construction.Building"));
        setField(term4552, term4552.getClass(), "type", enum8);
        setIntField(term4552, term4552.getClass(), "farmBonus", -461771056);
        setIntField(term4552, term4552.getClass(), "waterBonus", -243422082);
        setIntField(term4552, term4552.getClass(), "mineBonus", 1384592638);
        setIntField(term4552, term4552.getClass(), "factBonus", -1002370457);
        setIntField(term4552, term4552.getClass(), "cultBonus", -2014576105);
        setIntField(term4552, term4552.getClass(), "reseBonus", 1296895584);
        setIntField(term4552, term4552.getClass(), "credBonus", 628918458);
        setIntField(term4552, term4552.getClass(), "happinessBonus", -1274456137);
        setIntField(term4552, term4552.getClass(), "materialBonus", 1041916673);
        setDoubleField(term4552, term4552.getClass(), "maintenanceCost", 0.36923381893433327);
        setBooleanField(term4552, term4552.getClass(), "singleAllowed", true);
        setBooleanField(term4552, term4552.getClass(), "scientificAchievement", true);
        setBooleanField(term4552, term4552.getClass(), "broadcaster", true);
        setBooleanField(term4552, term4552.getClass(), "orbitalElevator", true);
        setIntField(term4552, term4552.getClass(), "battleBonus", -601863069);
        setIntField(term4552, term4552.getClass(), "defenseDamage", 663292551);
        setIntField(term4552, term4552.getClass(), "scanRange", -1885090354);
        setIntField(term4552, term4552.getClass(), "scanCloakingDetection", -2066804303);
        setIntField(term4552, term4552.getClass(), "fleetCapacityBonus", -1731761810);
        setIntField(term4552, term4552.getClass(), "recycleBonus", 197109649);
        setIntField(term4552, term4552.getClass(), "ancientArtifactResearch", -1239406390);
        setIntField(term4552, term4552.getClass(), "wildLifePower", 1557431527);
        setField(term4552, term4552.getClass(), "name", "TJmVBGfTML");
        setField(term4552, term4552.getClass(), "iconId", "tPlsykYBqO");
        setField(term4552, term4552.getClass(), "description", "bLPjGVBhlX");
        setIntField(term4552, term4552.getClass(), "prodCost", -1504890659);
        setIntField(term4552, term4552.getClass(), "metalCost", 1358829571);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.construction.Building");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFactBonus", argTypes, term4552, args);
    }

};


