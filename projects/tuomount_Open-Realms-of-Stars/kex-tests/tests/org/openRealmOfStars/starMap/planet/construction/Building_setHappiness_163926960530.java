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

public class Building_setHappiness_163926960530 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17361;
     Object term17431;

    public Building_setHappiness_163926960530() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17434 = Class.forName((String) "org.openRealmOfStars.starMap.planet.construction.BuildingType");
        Field term17433 = ((Class) term17434).getDeclaredField((String) "WATER");
        ((Field) term17433).setAccessible(true);
        Object enum38 = ((Field) term17433).get((Object) null);
        term17361 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.construction.Building"));
        setField(term17361, term17361.getClass(), "type", enum38);
        setIntField(term17361, term17361.getClass(), "farmBonus", 299791142);
        setIntField(term17361, term17361.getClass(), "waterBonus", 1862191391);
        setIntField(term17361, term17361.getClass(), "mineBonus", 1131398807);
        setIntField(term17361, term17361.getClass(), "factBonus", -344907703);
        setIntField(term17361, term17361.getClass(), "cultBonus", 824341437);
        setIntField(term17361, term17361.getClass(), "reseBonus", -1794965320);
        setIntField(term17361, term17361.getClass(), "credBonus", 520504102);
        setIntField(term17361, term17361.getClass(), "happinessBonus", -457396133);
        setIntField(term17361, term17361.getClass(), "materialBonus", -1793950607);
        setDoubleField(term17361, term17361.getClass(), "maintenanceCost", 0.37161417339133307);
        setBooleanField(term17361, term17361.getClass(), "singleAllowed", false);
        setBooleanField(term17361, term17361.getClass(), "scientificAchievement", false);
        setBooleanField(term17361, term17361.getClass(), "broadcaster", false);
        setBooleanField(term17361, term17361.getClass(), "orbitalElevator", false);
        setIntField(term17361, term17361.getClass(), "battleBonus", 1091954101);
        setIntField(term17361, term17361.getClass(), "defenseDamage", 1895143076);
        setIntField(term17361, term17361.getClass(), "scanRange", 1981860404);
        setIntField(term17361, term17361.getClass(), "scanCloakingDetection", 732174235);
        setIntField(term17361, term17361.getClass(), "fleetCapacityBonus", 470895808);
        setIntField(term17361, term17361.getClass(), "recycleBonus", 1787325291);
        setIntField(term17361, term17361.getClass(), "ancientArtifactResearch", 1470349147);
        setIntField(term17361, term17361.getClass(), "wildLifePower", -255317272);
        setField(term17361, term17361.getClass(), "name", "xtftXXMbem");
        setField(term17361, term17361.getClass(), "iconId", "cudZvLMQon");
        setField(term17361, term17361.getClass(), "description", "lihXWlGDxk");
        setIntField(term17361, term17361.getClass(), "prodCost", -706253892);
        setIntField(term17361, term17361.getClass(), "metalCost", -1341439819);
        term17431 = new Integer(-728760750);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.construction.Building");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term17431;
        callMethod(klass, "setHappiness", argTypes, term17361, args);
    }

};


