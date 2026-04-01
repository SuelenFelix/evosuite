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

public class Building_getWildLifePower_20093063344 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23417;

    public Building_getWildLifePower_20093063344() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term23491 = Class.forName((String) "org.openRealmOfStars.starMap.planet.construction.BuildingType");
        Field term23490 = ((Class) term23491).getDeclaredField((String) "RESEARCH");
        ((Field) term23490).setAccessible(true);
        Object enum52 = ((Field) term23490).get((Object) null);
        term23417 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.construction.Building"));
        setField(term23417, term23417.getClass(), "type", enum52);
        setIntField(term23417, term23417.getClass(), "farmBonus", 1850364894);
        setIntField(term23417, term23417.getClass(), "waterBonus", 915367534);
        setIntField(term23417, term23417.getClass(), "mineBonus", 1949983666);
        setIntField(term23417, term23417.getClass(), "factBonus", 154111854);
        setIntField(term23417, term23417.getClass(), "cultBonus", 710986341);
        setIntField(term23417, term23417.getClass(), "reseBonus", -873958002);
        setIntField(term23417, term23417.getClass(), "credBonus", -1780848958);
        setIntField(term23417, term23417.getClass(), "happinessBonus", 1235045850);
        setIntField(term23417, term23417.getClass(), "materialBonus", -75143033);
        setDoubleField(term23417, term23417.getClass(), "maintenanceCost", 0.25937345430928016);
        setBooleanField(term23417, term23417.getClass(), "singleAllowed", true);
        setBooleanField(term23417, term23417.getClass(), "scientificAchievement", false);
        setBooleanField(term23417, term23417.getClass(), "broadcaster", true);
        setBooleanField(term23417, term23417.getClass(), "orbitalElevator", false);
        setIntField(term23417, term23417.getClass(), "battleBonus", 797015478);
        setIntField(term23417, term23417.getClass(), "defenseDamage", 717574276);
        setIntField(term23417, term23417.getClass(), "scanRange", 1795369860);
        setIntField(term23417, term23417.getClass(), "scanCloakingDetection", -570164389);
        setIntField(term23417, term23417.getClass(), "fleetCapacityBonus", 43200329);
        setIntField(term23417, term23417.getClass(), "recycleBonus", 998679955);
        setIntField(term23417, term23417.getClass(), "ancientArtifactResearch", 953741504);
        setIntField(term23417, term23417.getClass(), "wildLifePower", 1389452261);
        setField(term23417, term23417.getClass(), "name", "zcorEihhLK");
        setField(term23417, term23417.getClass(), "iconId", "GrqozDKFOk");
        setField(term23417, term23417.getClass(), "description", "CFyoseFGLF");
        setIntField(term23417, term23417.getClass(), "prodCost", 1615957955);
        setIntField(term23417, term23417.getClass(), "metalCost", 1779370220);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.construction.Building");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWildLifePower", argTypes, term23417, args);
    }

};


