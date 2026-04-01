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

public class Building_isSingleAllowed_52127690620 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13053;

    public Building_isSingleAllowed_52127690620() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13125 = Class.forName((String) "org.openRealmOfStars.starMap.planet.construction.BuildingType");
        Field term13124 = ((Class) term13125).getDeclaredField((String) "CREDIT");
        ((Field) term13124).setAccessible(true);
        Object enum28 = ((Field) term13124).get((Object) null);
        term13053 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.construction.Building"));
        setField(term13053, term13053.getClass(), "type", enum28);
        setIntField(term13053, term13053.getClass(), "farmBonus", 301401782);
        setIntField(term13053, term13053.getClass(), "waterBonus", 1988605357);
        setIntField(term13053, term13053.getClass(), "mineBonus", 808203320);
        setIntField(term13053, term13053.getClass(), "factBonus", -544382127);
        setIntField(term13053, term13053.getClass(), "cultBonus", -1830198043);
        setIntField(term13053, term13053.getClass(), "reseBonus", -439048495);
        setIntField(term13053, term13053.getClass(), "credBonus", -1849105286);
        setIntField(term13053, term13053.getClass(), "happinessBonus", 1334483645);
        setIntField(term13053, term13053.getClass(), "materialBonus", 917513193);
        setDoubleField(term13053, term13053.getClass(), "maintenanceCost", 0.4569171842750229);
        setBooleanField(term13053, term13053.getClass(), "singleAllowed", false);
        setBooleanField(term13053, term13053.getClass(), "scientificAchievement", false);
        setBooleanField(term13053, term13053.getClass(), "broadcaster", true);
        setBooleanField(term13053, term13053.getClass(), "orbitalElevator", false);
        setIntField(term13053, term13053.getClass(), "battleBonus", 787278105);
        setIntField(term13053, term13053.getClass(), "defenseDamage", -2063843486);
        setIntField(term13053, term13053.getClass(), "scanRange", 833762980);
        setIntField(term13053, term13053.getClass(), "scanCloakingDetection", 320711637);
        setIntField(term13053, term13053.getClass(), "fleetCapacityBonus", 1241164745);
        setIntField(term13053, term13053.getClass(), "recycleBonus", 1723148410);
        setIntField(term13053, term13053.getClass(), "ancientArtifactResearch", -920797484);
        setIntField(term13053, term13053.getClass(), "wildLifePower", -1631697577);
        setField(term13053, term13053.getClass(), "name", "GgZWSjxjyE");
        setField(term13053, term13053.getClass(), "iconId", "EeBVbzjcCI");
        setField(term13053, term13053.getClass(), "description", "UfQtPRyWRC");
        setIntField(term13053, term13053.getClass(), "prodCost", 765731371);
        setIntField(term13053, term13053.getClass(), "metalCost", -1703035419);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.construction.Building");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isSingleAllowed", argTypes, term13053, args);
    }

};


