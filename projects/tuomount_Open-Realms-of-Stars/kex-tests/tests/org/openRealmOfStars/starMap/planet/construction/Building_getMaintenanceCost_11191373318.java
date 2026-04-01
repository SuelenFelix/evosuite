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

public class Building_getMaintenanceCost_11191373318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12189;

    public Building_getMaintenanceCost_11191373318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12263 = Class.forName((String) "org.openRealmOfStars.starMap.planet.construction.BuildingType");
        Field term12262 = ((Class) term12263).getDeclaredField((String) "RESEARCH");
        ((Field) term12262).setAccessible(true);
        Object enum26 = ((Field) term12262).get((Object) null);
        term12189 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.construction.Building"));
        setField(term12189, term12189.getClass(), "type", enum26);
        setIntField(term12189, term12189.getClass(), "farmBonus", -1813280137);
        setIntField(term12189, term12189.getClass(), "waterBonus", 719656595);
        setIntField(term12189, term12189.getClass(), "mineBonus", -1516995753);
        setIntField(term12189, term12189.getClass(), "factBonus", -390501023);
        setIntField(term12189, term12189.getClass(), "cultBonus", -1667482829);
        setIntField(term12189, term12189.getClass(), "reseBonus", 1116576792);
        setIntField(term12189, term12189.getClass(), "credBonus", -942194446);
        setIntField(term12189, term12189.getClass(), "happinessBonus", -938508470);
        setIntField(term12189, term12189.getClass(), "materialBonus", 1242676024);
        setDoubleField(term12189, term12189.getClass(), "maintenanceCost", 0.2779719046761513);
        setBooleanField(term12189, term12189.getClass(), "singleAllowed", false);
        setBooleanField(term12189, term12189.getClass(), "scientificAchievement", false);
        setBooleanField(term12189, term12189.getClass(), "broadcaster", false);
        setBooleanField(term12189, term12189.getClass(), "orbitalElevator", false);
        setIntField(term12189, term12189.getClass(), "battleBonus", -1865023308);
        setIntField(term12189, term12189.getClass(), "defenseDamage", 1698510819);
        setIntField(term12189, term12189.getClass(), "scanRange", -1553893255);
        setIntField(term12189, term12189.getClass(), "scanCloakingDetection", 1303442927);
        setIntField(term12189, term12189.getClass(), "fleetCapacityBonus", 794568325);
        setIntField(term12189, term12189.getClass(), "recycleBonus", -434468428);
        setIntField(term12189, term12189.getClass(), "ancientArtifactResearch", 1559605714);
        setIntField(term12189, term12189.getClass(), "wildLifePower", 1146601902);
        setField(term12189, term12189.getClass(), "name", "PznxWXsZME");
        setField(term12189, term12189.getClass(), "iconId", "ZzIujlwVsw");
        setField(term12189, term12189.getClass(), "description", "LWyEaeIyAo");
        setIntField(term12189, term12189.getClass(), "prodCost", -1938881385);
        setIntField(term12189, term12189.getClass(), "metalCost", -1629418973);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.construction.Building");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaintenanceCost", argTypes, term12189, args);
    }

};


