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

public class Building_setCultBonus_22050232911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5867;
     Object term5937;

    public Building_setCultBonus_22050232911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5940 = Class.forName((String) "org.openRealmOfStars.starMap.planet.construction.BuildingType");
        Field term5939 = ((Class) term5940).getDeclaredField((String) "WATER");
        ((Field) term5939).setAccessible(true);
        Object enum11 = ((Field) term5939).get((Object) null);
        term5867 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.construction.Building"));
        setField(term5867, term5867.getClass(), "type", enum11);
        setIntField(term5867, term5867.getClass(), "farmBonus", -159494544);
        setIntField(term5867, term5867.getClass(), "waterBonus", -75206835);
        setIntField(term5867, term5867.getClass(), "mineBonus", -1618206977);
        setIntField(term5867, term5867.getClass(), "factBonus", -1747406163);
        setIntField(term5867, term5867.getClass(), "cultBonus", 388157121);
        setIntField(term5867, term5867.getClass(), "reseBonus", 1684998508);
        setIntField(term5867, term5867.getClass(), "credBonus", -1476644457);
        setIntField(term5867, term5867.getClass(), "happinessBonus", 1270666529);
        setIntField(term5867, term5867.getClass(), "materialBonus", -1146679443);
        setDoubleField(term5867, term5867.getClass(), "maintenanceCost", 0.8474802076607362);
        setBooleanField(term5867, term5867.getClass(), "singleAllowed", false);
        setBooleanField(term5867, term5867.getClass(), "scientificAchievement", false);
        setBooleanField(term5867, term5867.getClass(), "broadcaster", true);
        setBooleanField(term5867, term5867.getClass(), "orbitalElevator", true);
        setIntField(term5867, term5867.getClass(), "battleBonus", -860131894);
        setIntField(term5867, term5867.getClass(), "defenseDamage", -1022990421);
        setIntField(term5867, term5867.getClass(), "scanRange", 1045547089);
        setIntField(term5867, term5867.getClass(), "scanCloakingDetection", -1122880881);
        setIntField(term5867, term5867.getClass(), "fleetCapacityBonus", -542712742);
        setIntField(term5867, term5867.getClass(), "recycleBonus", -1254072822);
        setIntField(term5867, term5867.getClass(), "ancientArtifactResearch", -1111249833);
        setIntField(term5867, term5867.getClass(), "wildLifePower", -1692331299);
        setField(term5867, term5867.getClass(), "name", "oVgzLbrsFr");
        setField(term5867, term5867.getClass(), "iconId", "vQVyKLdtaz");
        setField(term5867, term5867.getClass(), "description", "OWKQODBLzb");
        setIntField(term5867, term5867.getClass(), "prodCost", 479531250);
        setIntField(term5867, term5867.getClass(), "metalCost", 1320570890);
        term5937 = new Integer(-130649791);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.construction.Building");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5937;
        callMethod(klass, "setCultBonus", argTypes, term5867, args);
    }

};


