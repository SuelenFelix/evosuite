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

public class Building_getScanCloakingDetection_67584368032 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18229;

    public Building_getScanCloakingDetection_67584368032() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18300 = Class.forName((String) "org.openRealmOfStars.starMap.planet.construction.BuildingType");
        Field term18299 = ((Class) term18300).getDeclaredField((String) "WATER");
        ((Field) term18299).setAccessible(true);
        Object enum40 = ((Field) term18299).get((Object) null);
        term18229 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.construction.Building"));
        setField(term18229, term18229.getClass(), "type", enum40);
        setIntField(term18229, term18229.getClass(), "farmBonus", -348612876);
        setIntField(term18229, term18229.getClass(), "waterBonus", 1302807565);
        setIntField(term18229, term18229.getClass(), "mineBonus", -838848221);
        setIntField(term18229, term18229.getClass(), "factBonus", 1163761623);
        setIntField(term18229, term18229.getClass(), "cultBonus", 718742281);
        setIntField(term18229, term18229.getClass(), "reseBonus", 1532723756);
        setIntField(term18229, term18229.getClass(), "credBonus", -124088550);
        setIntField(term18229, term18229.getClass(), "happinessBonus", 777492093);
        setIntField(term18229, term18229.getClass(), "materialBonus", 1414025609);
        setDoubleField(term18229, term18229.getClass(), "maintenanceCost", 0.2852810965221698);
        setBooleanField(term18229, term18229.getClass(), "singleAllowed", true);
        setBooleanField(term18229, term18229.getClass(), "scientificAchievement", false);
        setBooleanField(term18229, term18229.getClass(), "broadcaster", false);
        setBooleanField(term18229, term18229.getClass(), "orbitalElevator", true);
        setIntField(term18229, term18229.getClass(), "battleBonus", 255145822);
        setIntField(term18229, term18229.getClass(), "defenseDamage", -573608449);
        setIntField(term18229, term18229.getClass(), "scanRange", -1660057757);
        setIntField(term18229, term18229.getClass(), "scanCloakingDetection", 1816273440);
        setIntField(term18229, term18229.getClass(), "fleetCapacityBonus", -96541009);
        setIntField(term18229, term18229.getClass(), "recycleBonus", -43719302);
        setIntField(term18229, term18229.getClass(), "ancientArtifactResearch", 1024134939);
        setIntField(term18229, term18229.getClass(), "wildLifePower", 109078154);
        setField(term18229, term18229.getClass(), "name", "DyiXbeYIaN");
        setField(term18229, term18229.getClass(), "iconId", "VGizxZnyHX");
        setField(term18229, term18229.getClass(), "description", "kVEZMHmRtR");
        setIntField(term18229, term18229.getClass(), "prodCost", -314165467);
        setIntField(term18229, term18229.getClass(), "metalCost", 963694071);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.construction.Building");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getScanCloakingDetection", argTypes, term18229, args);
    }

};


