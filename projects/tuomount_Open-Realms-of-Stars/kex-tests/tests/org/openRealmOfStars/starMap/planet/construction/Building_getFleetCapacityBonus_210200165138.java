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

public class Building_getFleetCapacityBonus_210200165138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20829;

    public Building_getFleetCapacityBonus_210200165138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term20903 = Class.forName((String) "org.openRealmOfStars.starMap.planet.construction.BuildingType");
        Field term20902 = ((Class) term20903).getDeclaredField((String) "MILITARY");
        ((Field) term20902).setAccessible(true);
        Object enum46 = ((Field) term20902).get((Object) null);
        term20829 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.construction.Building"));
        setField(term20829, term20829.getClass(), "type", enum46);
        setIntField(term20829, term20829.getClass(), "farmBonus", 529625347);
        setIntField(term20829, term20829.getClass(), "waterBonus", 1409095253);
        setIntField(term20829, term20829.getClass(), "mineBonus", 315179039);
        setIntField(term20829, term20829.getClass(), "factBonus", -1835923897);
        setIntField(term20829, term20829.getClass(), "cultBonus", -341287775);
        setIntField(term20829, term20829.getClass(), "reseBonus", -1651110911);
        setIntField(term20829, term20829.getClass(), "credBonus", -1934033808);
        setIntField(term20829, term20829.getClass(), "happinessBonus", 950322609);
        setIntField(term20829, term20829.getClass(), "materialBonus", -2023791789);
        setDoubleField(term20829, term20829.getClass(), "maintenanceCost", 0.5279279537140873);
        setBooleanField(term20829, term20829.getClass(), "singleAllowed", false);
        setBooleanField(term20829, term20829.getClass(), "scientificAchievement", true);
        setBooleanField(term20829, term20829.getClass(), "broadcaster", true);
        setBooleanField(term20829, term20829.getClass(), "orbitalElevator", false);
        setIntField(term20829, term20829.getClass(), "battleBonus", 353974456);
        setIntField(term20829, term20829.getClass(), "defenseDamage", -485108462);
        setIntField(term20829, term20829.getClass(), "scanRange", 1418551216);
        setIntField(term20829, term20829.getClass(), "scanCloakingDetection", -626779272);
        setIntField(term20829, term20829.getClass(), "fleetCapacityBonus", -1150062870);
        setIntField(term20829, term20829.getClass(), "recycleBonus", -886200503);
        setIntField(term20829, term20829.getClass(), "ancientArtifactResearch", 1136393691);
        setIntField(term20829, term20829.getClass(), "wildLifePower", -1288536479);
        setField(term20829, term20829.getClass(), "name", "XJJNClzHRf");
        setField(term20829, term20829.getClass(), "iconId", "HDaezxQfQR");
        setField(term20829, term20829.getClass(), "description", "iikZEapDlu");
        setIntField(term20829, term20829.getClass(), "prodCost", 1092038167);
        setIntField(term20829, term20829.getClass(), "metalCost", 1879729823);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.construction.Building");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFleetCapacityBonus", argTypes, term20829, args);
    }

};


