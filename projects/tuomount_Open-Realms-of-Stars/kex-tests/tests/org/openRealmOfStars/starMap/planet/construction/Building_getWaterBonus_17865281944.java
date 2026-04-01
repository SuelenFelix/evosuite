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

public class Building_getWaterBonus_17865281944 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2812;

    public Building_getWaterBonus_17865281944() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2885 = Class.forName((String) "org.openRealmOfStars.starMap.planet.construction.BuildingType");
        Field term2884 = ((Class) term2885).getDeclaredField((String) "CULTURE");
        ((Field) term2884).setAccessible(true);
        Object enum4 = ((Field) term2884).get((Object) null);
        term2812 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.construction.Building"));
        setField(term2812, term2812.getClass(), "type", enum4);
        setIntField(term2812, term2812.getClass(), "farmBonus", -1547384488);
        setIntField(term2812, term2812.getClass(), "waterBonus", 1442160736);
        setIntField(term2812, term2812.getClass(), "mineBonus", 1114000454);
        setIntField(term2812, term2812.getClass(), "factBonus", -556405712);
        setIntField(term2812, term2812.getClass(), "cultBonus", -1772434990);
        setIntField(term2812, term2812.getClass(), "reseBonus", -1845499264);
        setIntField(term2812, term2812.getClass(), "credBonus", -505439934);
        setIntField(term2812, term2812.getClass(), "happinessBonus", -344842608);
        setIntField(term2812, term2812.getClass(), "materialBonus", 941650513);
        setDoubleField(term2812, term2812.getClass(), "maintenanceCost", 0.544608645520025);
        setBooleanField(term2812, term2812.getClass(), "singleAllowed", false);
        setBooleanField(term2812, term2812.getClass(), "scientificAchievement", true);
        setBooleanField(term2812, term2812.getClass(), "broadcaster", false);
        setBooleanField(term2812, term2812.getClass(), "orbitalElevator", false);
        setIntField(term2812, term2812.getClass(), "battleBonus", 444029505);
        setIntField(term2812, term2812.getClass(), "defenseDamage", -1034506028);
        setIntField(term2812, term2812.getClass(), "scanRange", -1263114719);
        setIntField(term2812, term2812.getClass(), "scanCloakingDetection", -894662986);
        setIntField(term2812, term2812.getClass(), "fleetCapacityBonus", 304775596);
        setIntField(term2812, term2812.getClass(), "recycleBonus", -1347665717);
        setIntField(term2812, term2812.getClass(), "ancientArtifactResearch", -1888585309);
        setIntField(term2812, term2812.getClass(), "wildLifePower", 683666002);
        setField(term2812, term2812.getClass(), "name", "YRHGsAkhxb");
        setField(term2812, term2812.getClass(), "iconId", "ffYhPOzlUs");
        setField(term2812, term2812.getClass(), "description", "MLqYREekMl");
        setIntField(term2812, term2812.getClass(), "prodCost", 1596213415);
        setIntField(term2812, term2812.getClass(), "metalCost", -268815336);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.construction.Building");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWaterBonus", argTypes, term2812, args);
    }

};


