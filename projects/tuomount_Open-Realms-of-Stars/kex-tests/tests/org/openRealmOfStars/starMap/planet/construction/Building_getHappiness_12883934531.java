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

public class Building_getHappiness_12883934531 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17790;

    public Building_getHappiness_12883934531() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17864 = Class.forName((String) "org.openRealmOfStars.starMap.planet.construction.BuildingType");
        Field term17863 = ((Class) term17864).getDeclaredField((String) "MILITARY");
        ((Field) term17863).setAccessible(true);
        Object enum39 = ((Field) term17863).get((Object) null);
        term17790 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.construction.Building"));
        setField(term17790, term17790.getClass(), "type", enum39);
        setIntField(term17790, term17790.getClass(), "farmBonus", -1617383807);
        setIntField(term17790, term17790.getClass(), "waterBonus", -1244386281);
        setIntField(term17790, term17790.getClass(), "mineBonus", -885788574);
        setIntField(term17790, term17790.getClass(), "factBonus", -865722613);
        setIntField(term17790, term17790.getClass(), "cultBonus", -1551355284);
        setIntField(term17790, term17790.getClass(), "reseBonus", -1381970335);
        setIntField(term17790, term17790.getClass(), "credBonus", 1213549815);
        setIntField(term17790, term17790.getClass(), "happinessBonus", -1518419301);
        setIntField(term17790, term17790.getClass(), "materialBonus", 674879025);
        setDoubleField(term17790, term17790.getClass(), "maintenanceCost", 0.6805867182029153);
        setBooleanField(term17790, term17790.getClass(), "singleAllowed", false);
        setBooleanField(term17790, term17790.getClass(), "scientificAchievement", false);
        setBooleanField(term17790, term17790.getClass(), "broadcaster", false);
        setBooleanField(term17790, term17790.getClass(), "orbitalElevator", false);
        setIntField(term17790, term17790.getClass(), "battleBonus", -1538936030);
        setIntField(term17790, term17790.getClass(), "defenseDamage", -752870423);
        setIntField(term17790, term17790.getClass(), "scanRange", -1698809299);
        setIntField(term17790, term17790.getClass(), "scanCloakingDetection", 401512128);
        setIntField(term17790, term17790.getClass(), "fleetCapacityBonus", -2069930777);
        setIntField(term17790, term17790.getClass(), "recycleBonus", 1543696412);
        setIntField(term17790, term17790.getClass(), "ancientArtifactResearch", -1385748168);
        setIntField(term17790, term17790.getClass(), "wildLifePower", -270592367);
        setField(term17790, term17790.getClass(), "name", "JmcmxoGhIK");
        setField(term17790, term17790.getClass(), "iconId", "jXzmYyrnnT");
        setField(term17790, term17790.getClass(), "description", "igCAtimmYB");
        setIntField(term17790, term17790.getClass(), "prodCost", 178847646);
        setIntField(term17790, term17790.getClass(), "metalCost", 273590437);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.construction.Building");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHappiness", argTypes, term17790, args);
    }

};


