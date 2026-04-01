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

public class Building_setWildLifePower_112459153945 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23856;
     Object term23927;

    public Building_setWildLifePower_112459153945() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term23930 = Class.forName((String) "org.openRealmOfStars.starMap.planet.construction.BuildingType");
        Field term23929 = ((Class) term23930).getDeclaredField((String) "CREDIT");
        ((Field) term23929).setAccessible(true);
        Object enum53 = ((Field) term23929).get((Object) null);
        term23856 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.construction.Building"));
        setField(term23856, term23856.getClass(), "type", enum53);
        setIntField(term23856, term23856.getClass(), "farmBonus", -1716046610);
        setIntField(term23856, term23856.getClass(), "waterBonus", 65264024);
        setIntField(term23856, term23856.getClass(), "mineBonus", -252449812);
        setIntField(term23856, term23856.getClass(), "factBonus", -1885268968);
        setIntField(term23856, term23856.getClass(), "cultBonus", 277855691);
        setIntField(term23856, term23856.getClass(), "reseBonus", 675891483);
        setIntField(term23856, term23856.getClass(), "credBonus", -317900470);
        setIntField(term23856, term23856.getClass(), "happinessBonus", -979568);
        setIntField(term23856, term23856.getClass(), "materialBonus", -1422131197);
        setDoubleField(term23856, term23856.getClass(), "maintenanceCost", 0.5873228247510078);
        setBooleanField(term23856, term23856.getClass(), "singleAllowed", true);
        setBooleanField(term23856, term23856.getClass(), "scientificAchievement", false);
        setBooleanField(term23856, term23856.getClass(), "broadcaster", false);
        setBooleanField(term23856, term23856.getClass(), "orbitalElevator", true);
        setIntField(term23856, term23856.getClass(), "battleBonus", -20399281);
        setIntField(term23856, term23856.getClass(), "defenseDamage", -830170410);
        setIntField(term23856, term23856.getClass(), "scanRange", -1742790308);
        setIntField(term23856, term23856.getClass(), "scanCloakingDetection", -1592093430);
        setIntField(term23856, term23856.getClass(), "fleetCapacityBonus", 1178214545);
        setIntField(term23856, term23856.getClass(), "recycleBonus", -985334541);
        setIntField(term23856, term23856.getClass(), "ancientArtifactResearch", -1870004228);
        setIntField(term23856, term23856.getClass(), "wildLifePower", 380484139);
        setField(term23856, term23856.getClass(), "name", "SFqCrhEWLm");
        setField(term23856, term23856.getClass(), "iconId", "GZdcJyZntS");
        setField(term23856, term23856.getClass(), "description", "OIHoJeysUi");
        setIntField(term23856, term23856.getClass(), "prodCost", 1822317628);
        setIntField(term23856, term23856.getClass(), "metalCost", -608830309);
        term23927 = new Integer(-537786484);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.construction.Building");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term23927;
        callMethod(klass, "setWildLifePower", argTypes, term23856, args);
    }

};


