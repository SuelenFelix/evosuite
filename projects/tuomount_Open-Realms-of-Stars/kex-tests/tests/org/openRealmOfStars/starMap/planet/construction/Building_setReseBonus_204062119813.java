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

public class Building_setReseBonus_204062119813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6731;
     Object term6802;

    public Building_setReseBonus_204062119813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6805 = Class.forName((String) "org.openRealmOfStars.starMap.planet.construction.BuildingType");
        Field term6804 = ((Class) term6805).getDeclaredField((String) "CREDIT");
        ((Field) term6804).setAccessible(true);
        Object enum13 = ((Field) term6804).get((Object) null);
        term6731 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.construction.Building"));
        setField(term6731, term6731.getClass(), "type", enum13);
        setIntField(term6731, term6731.getClass(), "farmBonus", 147209682);
        setIntField(term6731, term6731.getClass(), "waterBonus", 34470066);
        setIntField(term6731, term6731.getClass(), "mineBonus", 2058711405);
        setIntField(term6731, term6731.getClass(), "factBonus", 1743683601);
        setIntField(term6731, term6731.getClass(), "cultBonus", -945116798);
        setIntField(term6731, term6731.getClass(), "reseBonus", 1593461795);
        setIntField(term6731, term6731.getClass(), "credBonus", 515182546);
        setIntField(term6731, term6731.getClass(), "happinessBonus", -936895502);
        setIntField(term6731, term6731.getClass(), "materialBonus", -129547140);
        setDoubleField(term6731, term6731.getClass(), "maintenanceCost", 0.7655020693602768);
        setBooleanField(term6731, term6731.getClass(), "singleAllowed", false);
        setBooleanField(term6731, term6731.getClass(), "scientificAchievement", true);
        setBooleanField(term6731, term6731.getClass(), "broadcaster", false);
        setBooleanField(term6731, term6731.getClass(), "orbitalElevator", false);
        setIntField(term6731, term6731.getClass(), "battleBonus", 199287428);
        setIntField(term6731, term6731.getClass(), "defenseDamage", -1195339592);
        setIntField(term6731, term6731.getClass(), "scanRange", -376422566);
        setIntField(term6731, term6731.getClass(), "scanCloakingDetection", 306847454);
        setIntField(term6731, term6731.getClass(), "fleetCapacityBonus", 1745276158);
        setIntField(term6731, term6731.getClass(), "recycleBonus", 2009020256);
        setIntField(term6731, term6731.getClass(), "ancientArtifactResearch", 2049577015);
        setIntField(term6731, term6731.getClass(), "wildLifePower", 1236004505);
        setField(term6731, term6731.getClass(), "name", "jUbSRrkrYZ");
        setField(term6731, term6731.getClass(), "iconId", "bWWfajKbEX");
        setField(term6731, term6731.getClass(), "description", "cAPeiZHKGJ");
        setIntField(term6731, term6731.getClass(), "prodCost", 1050765721);
        setIntField(term6731, term6731.getClass(), "metalCost", 474518942);
        term6802 = new Integer(-1656687479);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.construction.Building");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term6802;
        callMethod(klass, "setReseBonus", argTypes, term6731, args);
    }

};


