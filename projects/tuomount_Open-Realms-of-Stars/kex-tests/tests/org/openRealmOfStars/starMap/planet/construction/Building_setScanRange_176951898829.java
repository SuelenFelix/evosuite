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

public class Building_setScanRange_176951898829 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16932;
     Object term17002;

    public Building_setScanRange_176951898829() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17005 = Class.forName((String) "org.openRealmOfStars.starMap.planet.construction.BuildingType");
        Field term17004 = ((Class) term17005).getDeclaredField((String) "WATER");
        ((Field) term17004).setAccessible(true);
        Object enum37 = ((Field) term17004).get((Object) null);
        term16932 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.construction.Building"));
        setField(term16932, term16932.getClass(), "type", enum37);
        setIntField(term16932, term16932.getClass(), "farmBonus", -2072158633);
        setIntField(term16932, term16932.getClass(), "waterBonus", -355469363);
        setIntField(term16932, term16932.getClass(), "mineBonus", 1465188553);
        setIntField(term16932, term16932.getClass(), "factBonus", 1633913667);
        setIntField(term16932, term16932.getClass(), "cultBonus", 1292332296);
        setIntField(term16932, term16932.getClass(), "reseBonus", -1415256843);
        setIntField(term16932, term16932.getClass(), "credBonus", 612177768);
        setIntField(term16932, term16932.getClass(), "happinessBonus", -1626451656);
        setIntField(term16932, term16932.getClass(), "materialBonus", 173952451);
        setDoubleField(term16932, term16932.getClass(), "maintenanceCost", 0.11493000848982304);
        setBooleanField(term16932, term16932.getClass(), "singleAllowed", false);
        setBooleanField(term16932, term16932.getClass(), "scientificAchievement", false);
        setBooleanField(term16932, term16932.getClass(), "broadcaster", true);
        setBooleanField(term16932, term16932.getClass(), "orbitalElevator", true);
        setIntField(term16932, term16932.getClass(), "battleBonus", -1972033388);
        setIntField(term16932, term16932.getClass(), "defenseDamage", -1005024758);
        setIntField(term16932, term16932.getClass(), "scanRange", 2634669);
        setIntField(term16932, term16932.getClass(), "scanCloakingDetection", -1912429941);
        setIntField(term16932, term16932.getClass(), "fleetCapacityBonus", 1801052257);
        setIntField(term16932, term16932.getClass(), "recycleBonus", -2110556060);
        setIntField(term16932, term16932.getClass(), "ancientArtifactResearch", 313459791);
        setIntField(term16932, term16932.getClass(), "wildLifePower", 752615112);
        setField(term16932, term16932.getClass(), "name", "rLHAoqXgPh");
        setField(term16932, term16932.getClass(), "iconId", "zUlRdimJtU");
        setField(term16932, term16932.getClass(), "description", "vwbEQQNQrx");
        setIntField(term16932, term16932.getClass(), "prodCost", -1674430871);
        setIntField(term16932, term16932.getClass(), "metalCost", 794352120);
        term17002 = new Integer(340719678);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.construction.Building");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term17002;
        callMethod(klass, "setScanRange", argTypes, term16932, args);
    }

};


