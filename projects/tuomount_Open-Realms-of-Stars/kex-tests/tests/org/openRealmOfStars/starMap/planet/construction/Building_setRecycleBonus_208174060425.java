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

public class Building_setRecycleBonus_208174060425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15208;
     Object term15280;

    public Building_setRecycleBonus_208174060425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15283 = Class.forName((String) "org.openRealmOfStars.starMap.planet.construction.BuildingType");
        Field term15282 = ((Class) term15283).getDeclaredField((String) "FACTORY");
        ((Field) term15282).setAccessible(true);
        Object enum33 = ((Field) term15282).get((Object) null);
        term15208 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.construction.Building"));
        setField(term15208, term15208.getClass(), "type", enum33);
        setIntField(term15208, term15208.getClass(), "farmBonus", 897010381);
        setIntField(term15208, term15208.getClass(), "waterBonus", -15712667);
        setIntField(term15208, term15208.getClass(), "mineBonus", 1964967720);
        setIntField(term15208, term15208.getClass(), "factBonus", 1351900243);
        setIntField(term15208, term15208.getClass(), "cultBonus", -330897705);
        setIntField(term15208, term15208.getClass(), "reseBonus", 1065595802);
        setIntField(term15208, term15208.getClass(), "credBonus", 21031843);
        setIntField(term15208, term15208.getClass(), "happinessBonus", -380787857);
        setIntField(term15208, term15208.getClass(), "materialBonus", 319853052);
        setDoubleField(term15208, term15208.getClass(), "maintenanceCost", 0.3800088629986428);
        setBooleanField(term15208, term15208.getClass(), "singleAllowed", true);
        setBooleanField(term15208, term15208.getClass(), "scientificAchievement", false);
        setBooleanField(term15208, term15208.getClass(), "broadcaster", true);
        setBooleanField(term15208, term15208.getClass(), "orbitalElevator", true);
        setIntField(term15208, term15208.getClass(), "battleBonus", -1097563716);
        setIntField(term15208, term15208.getClass(), "defenseDamage", 1572907769);
        setIntField(term15208, term15208.getClass(), "scanRange", 1608016787);
        setIntField(term15208, term15208.getClass(), "scanCloakingDetection", -516303035);
        setIntField(term15208, term15208.getClass(), "fleetCapacityBonus", -2143043890);
        setIntField(term15208, term15208.getClass(), "recycleBonus", -2138825831);
        setIntField(term15208, term15208.getClass(), "ancientArtifactResearch", 1454781562);
        setIntField(term15208, term15208.getClass(), "wildLifePower", -27944011);
        setField(term15208, term15208.getClass(), "name", "hMmaoREuCK");
        setField(term15208, term15208.getClass(), "iconId", "VeDtgDzGAN");
        setField(term15208, term15208.getClass(), "description", "aWYOWZFyaX");
        setIntField(term15208, term15208.getClass(), "prodCost", -20614472);
        setIntField(term15208, term15208.getClass(), "metalCost", 1126618861);
        term15280 = new Integer(947449400);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.construction.Building");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term15280;
        callMethod(klass, "setRecycleBonus", argTypes, term15208, args);
    }

};


