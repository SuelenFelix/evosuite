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

public class Building_setSingleAllowed_84565988421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13484;
     Object term13554;

    public Building_setSingleAllowed_84565988421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13557 = Class.forName((String) "org.openRealmOfStars.starMap.planet.construction.BuildingType");
        Field term13556 = ((Class) term13557).getDeclaredField((String) "WATER");
        ((Field) term13556).setAccessible(true);
        Object enum29 = ((Field) term13556).get((Object) null);
        term13484 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.construction.Building"));
        setField(term13484, term13484.getClass(), "type", enum29);
        setIntField(term13484, term13484.getClass(), "farmBonus", 765766290);
        setIntField(term13484, term13484.getClass(), "waterBonus", -1284825282);
        setIntField(term13484, term13484.getClass(), "mineBonus", -1941343035);
        setIntField(term13484, term13484.getClass(), "factBonus", 947897214);
        setIntField(term13484, term13484.getClass(), "cultBonus", 1496340209);
        setIntField(term13484, term13484.getClass(), "reseBonus", -1748391876);
        setIntField(term13484, term13484.getClass(), "credBonus", 43258317);
        setIntField(term13484, term13484.getClass(), "happinessBonus", 1707220033);
        setIntField(term13484, term13484.getClass(), "materialBonus", -1792504217);
        setDoubleField(term13484, term13484.getClass(), "maintenanceCost", 0.8598297828918529);
        setBooleanField(term13484, term13484.getClass(), "singleAllowed", false);
        setBooleanField(term13484, term13484.getClass(), "scientificAchievement", true);
        setBooleanField(term13484, term13484.getClass(), "broadcaster", false);
        setBooleanField(term13484, term13484.getClass(), "orbitalElevator", true);
        setIntField(term13484, term13484.getClass(), "battleBonus", 1824538861);
        setIntField(term13484, term13484.getClass(), "defenseDamage", 499519708);
        setIntField(term13484, term13484.getClass(), "scanRange", 1501165033);
        setIntField(term13484, term13484.getClass(), "scanCloakingDetection", 510162332);
        setIntField(term13484, term13484.getClass(), "fleetCapacityBonus", 888506903);
        setIntField(term13484, term13484.getClass(), "recycleBonus", 200252898);
        setIntField(term13484, term13484.getClass(), "ancientArtifactResearch", -1831826725);
        setIntField(term13484, term13484.getClass(), "wildLifePower", 752152965);
        setField(term13484, term13484.getClass(), "name", "FPvxVzzSvD");
        setField(term13484, term13484.getClass(), "iconId", "WHcwFgsGFC");
        setField(term13484, term13484.getClass(), "description", "HzqpegHiRq");
        setIntField(term13484, term13484.getClass(), "prodCost", -1577069773);
        setIntField(term13484, term13484.getClass(), "metalCost", -266625190);
        term13554 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.construction.Building");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term13554;
        callMethod(klass, "setSingleAllowed", argTypes, term13484, args);
    }

};


