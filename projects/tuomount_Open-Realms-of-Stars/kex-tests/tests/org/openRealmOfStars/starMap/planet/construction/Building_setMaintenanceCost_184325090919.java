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
import java.lang.Double;

public class Building_setMaintenanceCost_184325090919 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12628;
     Object term12697;

    public Building_setMaintenanceCost_184325090919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12700 = Class.forName((String) "org.openRealmOfStars.starMap.planet.construction.BuildingType");
        Field term12699 = ((Class) term12700).getDeclaredField((String) "FARM");
        ((Field) term12699).setAccessible(true);
        Object enum27 = ((Field) term12699).get((Object) null);
        term12628 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.construction.Building"));
        setField(term12628, term12628.getClass(), "type", enum27);
        setIntField(term12628, term12628.getClass(), "farmBonus", -100825168);
        setIntField(term12628, term12628.getClass(), "waterBonus", 768407648);
        setIntField(term12628, term12628.getClass(), "mineBonus", -350454594);
        setIntField(term12628, term12628.getClass(), "factBonus", -1148142995);
        setIntField(term12628, term12628.getClass(), "cultBonus", -233024044);
        setIntField(term12628, term12628.getClass(), "reseBonus", 1820784228);
        setIntField(term12628, term12628.getClass(), "credBonus", 1390820006);
        setIntField(term12628, term12628.getClass(), "happinessBonus", -828982065);
        setIntField(term12628, term12628.getClass(), "materialBonus", 1221443226);
        setDoubleField(term12628, term12628.getClass(), "maintenanceCost", 0.6436713023569729);
        setBooleanField(term12628, term12628.getClass(), "singleAllowed", false);
        setBooleanField(term12628, term12628.getClass(), "scientificAchievement", false);
        setBooleanField(term12628, term12628.getClass(), "broadcaster", false);
        setBooleanField(term12628, term12628.getClass(), "orbitalElevator", true);
        setIntField(term12628, term12628.getClass(), "battleBonus", 908108726);
        setIntField(term12628, term12628.getClass(), "defenseDamage", 1023209512);
        setIntField(term12628, term12628.getClass(), "scanRange", 1084849225);
        setIntField(term12628, term12628.getClass(), "scanCloakingDetection", -1702055571);
        setIntField(term12628, term12628.getClass(), "fleetCapacityBonus", -944542900);
        setIntField(term12628, term12628.getClass(), "recycleBonus", 2063762142);
        setIntField(term12628, term12628.getClass(), "ancientArtifactResearch", 1658391716);
        setIntField(term12628, term12628.getClass(), "wildLifePower", 2143282300);
        setField(term12628, term12628.getClass(), "name", "yVMkkQhvmN");
        setField(term12628, term12628.getClass(), "iconId", "mvrkADEgpp");
        setField(term12628, term12628.getClass(), "description", "pXOkjyeIRb");
        setIntField(term12628, term12628.getClass(), "prodCost", 1137624258);
        setIntField(term12628, term12628.getClass(), "metalCost", 977862393);
        term12697 = new Double(0.7332741045694002);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.construction.Building");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term12697;
        callMethod(klass, "setMaintenanceCost", argTypes, term12628, args);
    }

};


