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

public class Building_getBattleBonus_179923899322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13913;

    public Building_getBattleBonus_179923899322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13986 = Class.forName((String) "org.openRealmOfStars.starMap.planet.construction.BuildingType");
        Field term13985 = ((Class) term13986).getDeclaredField((String) "CULTURE");
        ((Field) term13985).setAccessible(true);
        Object enum30 = ((Field) term13985).get((Object) null);
        term13913 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.construction.Building"));
        setField(term13913, term13913.getClass(), "type", enum30);
        setIntField(term13913, term13913.getClass(), "farmBonus", 489201218);
        setIntField(term13913, term13913.getClass(), "waterBonus", 464181937);
        setIntField(term13913, term13913.getClass(), "mineBonus", -1455526612);
        setIntField(term13913, term13913.getClass(), "factBonus", -941356098);
        setIntField(term13913, term13913.getClass(), "cultBonus", -201517446);
        setIntField(term13913, term13913.getClass(), "reseBonus", -97742366);
        setIntField(term13913, term13913.getClass(), "credBonus", 1638851942);
        setIntField(term13913, term13913.getClass(), "happinessBonus", 1374790203);
        setIntField(term13913, term13913.getClass(), "materialBonus", 1160010161);
        setDoubleField(term13913, term13913.getClass(), "maintenanceCost", 0.43692187681405226);
        setBooleanField(term13913, term13913.getClass(), "singleAllowed", true);
        setBooleanField(term13913, term13913.getClass(), "scientificAchievement", false);
        setBooleanField(term13913, term13913.getClass(), "broadcaster", false);
        setBooleanField(term13913, term13913.getClass(), "orbitalElevator", true);
        setIntField(term13913, term13913.getClass(), "battleBonus", -423900705);
        setIntField(term13913, term13913.getClass(), "defenseDamage", -525570815);
        setIntField(term13913, term13913.getClass(), "scanRange", 754055848);
        setIntField(term13913, term13913.getClass(), "scanCloakingDetection", -19246901);
        setIntField(term13913, term13913.getClass(), "fleetCapacityBonus", -370828664);
        setIntField(term13913, term13913.getClass(), "recycleBonus", 1168633950);
        setIntField(term13913, term13913.getClass(), "ancientArtifactResearch", 1607082164);
        setIntField(term13913, term13913.getClass(), "wildLifePower", 1890399366);
        setField(term13913, term13913.getClass(), "name", "jwsfVjMoJT");
        setField(term13913, term13913.getClass(), "iconId", "ZfdXfCCFDf");
        setField(term13913, term13913.getClass(), "description", "MwwjNtdOFT");
        setIntField(term13913, term13913.getClass(), "prodCost", -1867239125);
        setIntField(term13913, term13913.getClass(), "metalCost", 952869601);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.construction.Building");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBattleBonus", argTypes, term13913, args);
    }

};


