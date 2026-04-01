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

public class Building_getMineBonus_4301312426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3680;

    public Building_getMineBonus_4301312426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3753 = Class.forName((String) "org.openRealmOfStars.starMap.planet.construction.BuildingType");
        Field term3752 = ((Class) term3753).getDeclaredField((String) "CULTURE");
        ((Field) term3752).setAccessible(true);
        Object enum6 = ((Field) term3752).get((Object) null);
        term3680 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.construction.Building"));
        setField(term3680, term3680.getClass(), "type", enum6);
        setIntField(term3680, term3680.getClass(), "farmBonus", 53410913);
        setIntField(term3680, term3680.getClass(), "waterBonus", -375014958);
        setIntField(term3680, term3680.getClass(), "mineBonus", 1107176718);
        setIntField(term3680, term3680.getClass(), "factBonus", 480137250);
        setIntField(term3680, term3680.getClass(), "cultBonus", -341152642);
        setIntField(term3680, term3680.getClass(), "reseBonus", -2015854073);
        setIntField(term3680, term3680.getClass(), "credBonus", 538259104);
        setIntField(term3680, term3680.getClass(), "happinessBonus", 96566506);
        setIntField(term3680, term3680.getClass(), "materialBonus", -343325701);
        setDoubleField(term3680, term3680.getClass(), "maintenanceCost", 0.40176586625454525);
        setBooleanField(term3680, term3680.getClass(), "singleAllowed", true);
        setBooleanField(term3680, term3680.getClass(), "scientificAchievement", true);
        setBooleanField(term3680, term3680.getClass(), "broadcaster", true);
        setBooleanField(term3680, term3680.getClass(), "orbitalElevator", true);
        setIntField(term3680, term3680.getClass(), "battleBonus", 107945604);
        setIntField(term3680, term3680.getClass(), "defenseDamage", -1963464809);
        setIntField(term3680, term3680.getClass(), "scanRange", 71190297);
        setIntField(term3680, term3680.getClass(), "scanCloakingDetection", 1202361360);
        setIntField(term3680, term3680.getClass(), "fleetCapacityBonus", -2015048153);
        setIntField(term3680, term3680.getClass(), "recycleBonus", -2063457669);
        setIntField(term3680, term3680.getClass(), "ancientArtifactResearch", -1222006000);
        setIntField(term3680, term3680.getClass(), "wildLifePower", 2095798786);
        setField(term3680, term3680.getClass(), "name", "dEnhdmILtU");
        setField(term3680, term3680.getClass(), "iconId", "hoicvmsovO");
        setField(term3680, term3680.getClass(), "description", "eqJfYWRaEL");
        setIntField(term3680, term3680.getClass(), "prodCost", -1565502840);
        setIntField(term3680, term3680.getClass(), "metalCost", 344323424);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.construction.Building");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMineBonus", argTypes, term3680, args);
    }

};


