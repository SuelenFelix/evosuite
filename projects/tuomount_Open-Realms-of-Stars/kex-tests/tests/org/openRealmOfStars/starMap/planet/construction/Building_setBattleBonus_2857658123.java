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
import java.lang.Integer;

public class Building_setBattleBonus_2857658123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14348;
     Object term14418;

    public Building_setBattleBonus_2857658123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term14421 = Class.forName((String) "org.openRealmOfStars.starMap.planet.construction.BuildingType");
        Field term14420 = ((Class) term14421).getDeclaredField((String) "WATER");
        ((Field) term14420).setAccessible(true);
        Object enum31 = ((Field) term14420).get((Object) null);
        term14348 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.construction.Building"));
        setField(term14348, term14348.getClass(), "type", enum31);
        setIntField(term14348, term14348.getClass(), "farmBonus", 91958879);
        setIntField(term14348, term14348.getClass(), "waterBonus", -645429025);
        setIntField(term14348, term14348.getClass(), "mineBonus", -688213483);
        setIntField(term14348, term14348.getClass(), "factBonus", 644154104);
        setIntField(term14348, term14348.getClass(), "cultBonus", 76650923);
        setIntField(term14348, term14348.getClass(), "reseBonus", 1003743923);
        setIntField(term14348, term14348.getClass(), "credBonus", 1887772522);
        setIntField(term14348, term14348.getClass(), "happinessBonus", 354196060);
        setIntField(term14348, term14348.getClass(), "materialBonus", -1840305774);
        setDoubleField(term14348, term14348.getClass(), "maintenanceCost", 0.7633268466829064);
        setBooleanField(term14348, term14348.getClass(), "singleAllowed", true);
        setBooleanField(term14348, term14348.getClass(), "scientificAchievement", true);
        setBooleanField(term14348, term14348.getClass(), "broadcaster", true);
        setBooleanField(term14348, term14348.getClass(), "orbitalElevator", true);
        setIntField(term14348, term14348.getClass(), "battleBonus", 1365087144);
        setIntField(term14348, term14348.getClass(), "defenseDamage", -1537255112);
        setIntField(term14348, term14348.getClass(), "scanRange", 934477462);
        setIntField(term14348, term14348.getClass(), "scanCloakingDetection", 4900410);
        setIntField(term14348, term14348.getClass(), "fleetCapacityBonus", -1252345779);
        setIntField(term14348, term14348.getClass(), "recycleBonus", -2063365430);
        setIntField(term14348, term14348.getClass(), "ancientArtifactResearch", 812570053);
        setIntField(term14348, term14348.getClass(), "wildLifePower", -1488938905);
        setField(term14348, term14348.getClass(), "name", "VYkqXKVlAJ");
        setField(term14348, term14348.getClass(), "iconId", "XkIoWJRNwN");
        setField(term14348, term14348.getClass(), "description", "aNWLJdrZMq");
        setIntField(term14348, term14348.getClass(), "prodCost", 1916544127);
        setIntField(term14348, term14348.getClass(), "metalCost", -1133405894);
        term14418 = new Integer(1289741214);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.construction.Building");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term14418;
        callMethod(klass, "setBattleBonus", argTypes, term14348, args);
    }

};


