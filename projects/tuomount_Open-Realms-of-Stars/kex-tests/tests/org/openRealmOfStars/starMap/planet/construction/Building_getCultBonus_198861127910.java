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

public class Building_getCultBonus_198861127910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5428;

    public Building_getCultBonus_198861127910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5502 = Class.forName((String) "org.openRealmOfStars.starMap.planet.construction.BuildingType");
        Field term5501 = ((Class) term5502).getDeclaredField((String) "RESEARCH");
        ((Field) term5501).setAccessible(true);
        Object enum10 = ((Field) term5501).get((Object) null);
        term5428 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.construction.Building"));
        setField(term5428, term5428.getClass(), "type", enum10);
        setIntField(term5428, term5428.getClass(), "farmBonus", -1222614956);
        setIntField(term5428, term5428.getClass(), "waterBonus", -1870495012);
        setIntField(term5428, term5428.getClass(), "mineBonus", -1310015129);
        setIntField(term5428, term5428.getClass(), "factBonus", -2104981311);
        setIntField(term5428, term5428.getClass(), "cultBonus", -571169753);
        setIntField(term5428, term5428.getClass(), "reseBonus", 318591690);
        setIntField(term5428, term5428.getClass(), "credBonus", -165587447);
        setIntField(term5428, term5428.getClass(), "happinessBonus", -1347358701);
        setIntField(term5428, term5428.getClass(), "materialBonus", 806595993);
        setDoubleField(term5428, term5428.getClass(), "maintenanceCost", 0.37773193782763337);
        setBooleanField(term5428, term5428.getClass(), "singleAllowed", true);
        setBooleanField(term5428, term5428.getClass(), "scientificAchievement", true);
        setBooleanField(term5428, term5428.getClass(), "broadcaster", true);
        setBooleanField(term5428, term5428.getClass(), "orbitalElevator", false);
        setIntField(term5428, term5428.getClass(), "battleBonus", 548228925);
        setIntField(term5428, term5428.getClass(), "defenseDamage", -749861210);
        setIntField(term5428, term5428.getClass(), "scanRange", 1694224101);
        setIntField(term5428, term5428.getClass(), "scanCloakingDetection", 937859191);
        setIntField(term5428, term5428.getClass(), "fleetCapacityBonus", -916584829);
        setIntField(term5428, term5428.getClass(), "recycleBonus", -2131181468);
        setIntField(term5428, term5428.getClass(), "ancientArtifactResearch", 282916351);
        setIntField(term5428, term5428.getClass(), "wildLifePower", 880977281);
        setField(term5428, term5428.getClass(), "name", "KoyGrUJeJW");
        setField(term5428, term5428.getClass(), "iconId", "HqBOwkVqjD");
        setField(term5428, term5428.getClass(), "description", "MAcUBcBckh");
        setIntField(term5428, term5428.getClass(), "prodCost", 371943306);
        setIntField(term5428, term5428.getClass(), "metalCost", 982388293);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.construction.Building");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCultBonus", argTypes, term5428, args);
    }

};


