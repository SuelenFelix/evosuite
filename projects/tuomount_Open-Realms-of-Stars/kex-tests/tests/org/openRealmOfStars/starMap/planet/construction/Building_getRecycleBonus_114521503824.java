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

public class Building_getRecycleBonus_114521503824 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14777;

    public Building_getRecycleBonus_114521503824() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term14849 = Class.forName((String) "org.openRealmOfStars.starMap.planet.construction.BuildingType");
        Field term14848 = ((Class) term14849).getDeclaredField((String) "CREDIT");
        ((Field) term14848).setAccessible(true);
        Object enum32 = ((Field) term14848).get((Object) null);
        term14777 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.construction.Building"));
        setField(term14777, term14777.getClass(), "type", enum32);
        setIntField(term14777, term14777.getClass(), "farmBonus", 243280944);
        setIntField(term14777, term14777.getClass(), "waterBonus", -726681073);
        setIntField(term14777, term14777.getClass(), "mineBonus", -1724487863);
        setIntField(term14777, term14777.getClass(), "factBonus", -128490829);
        setIntField(term14777, term14777.getClass(), "cultBonus", 202214133);
        setIntField(term14777, term14777.getClass(), "reseBonus", 1543091617);
        setIntField(term14777, term14777.getClass(), "credBonus", -763166094);
        setIntField(term14777, term14777.getClass(), "happinessBonus", -222941705);
        setIntField(term14777, term14777.getClass(), "materialBonus", 291864719);
        setDoubleField(term14777, term14777.getClass(), "maintenanceCost", 0.13481025392611334);
        setBooleanField(term14777, term14777.getClass(), "singleAllowed", false);
        setBooleanField(term14777, term14777.getClass(), "scientificAchievement", false);
        setBooleanField(term14777, term14777.getClass(), "broadcaster", true);
        setBooleanField(term14777, term14777.getClass(), "orbitalElevator", true);
        setIntField(term14777, term14777.getClass(), "battleBonus", -1549607466);
        setIntField(term14777, term14777.getClass(), "defenseDamage", 853609788);
        setIntField(term14777, term14777.getClass(), "scanRange", -197820800);
        setIntField(term14777, term14777.getClass(), "scanCloakingDetection", 723812297);
        setIntField(term14777, term14777.getClass(), "fleetCapacityBonus", 1639448749);
        setIntField(term14777, term14777.getClass(), "recycleBonus", 873659088);
        setIntField(term14777, term14777.getClass(), "ancientArtifactResearch", -975748721);
        setIntField(term14777, term14777.getClass(), "wildLifePower", 433248783);
        setField(term14777, term14777.getClass(), "name", "HHmNoYxIGj");
        setField(term14777, term14777.getClass(), "iconId", "PtirvZmsGt");
        setField(term14777, term14777.getClass(), "description", "HWkpTmtlrc");
        setIntField(term14777, term14777.getClass(), "prodCost", -507944154);
        setIntField(term14777, term14777.getClass(), "metalCost", -1736183862);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.construction.Building");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRecycleBonus", argTypes, term14777, args);
    }

};


