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

public class Building_setFactBonus_21421066319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4987;
     Object term5060;

    public Building_setFactBonus_21421066319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5063 = Class.forName((String) "org.openRealmOfStars.starMap.planet.construction.BuildingType");
        Field term5062 = ((Class) term5063).getDeclaredField((String) "MILITARY");
        ((Field) term5062).setAccessible(true);
        Object enum9 = ((Field) term5062).get((Object) null);
        term4987 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.construction.Building"));
        setField(term4987, term4987.getClass(), "type", enum9);
        setIntField(term4987, term4987.getClass(), "farmBonus", 991356662);
        setIntField(term4987, term4987.getClass(), "waterBonus", -506958186);
        setIntField(term4987, term4987.getClass(), "mineBonus", -507387516);
        setIntField(term4987, term4987.getClass(), "factBonus", -1970452551);
        setIntField(term4987, term4987.getClass(), "cultBonus", -1896376975);
        setIntField(term4987, term4987.getClass(), "reseBonus", 729658803);
        setIntField(term4987, term4987.getClass(), "credBonus", 114754804);
        setIntField(term4987, term4987.getClass(), "happinessBonus", 1687361082);
        setIntField(term4987, term4987.getClass(), "materialBonus", 584893196);
        setDoubleField(term4987, term4987.getClass(), "maintenanceCost", 0.6076495596892013);
        setBooleanField(term4987, term4987.getClass(), "singleAllowed", true);
        setBooleanField(term4987, term4987.getClass(), "scientificAchievement", true);
        setBooleanField(term4987, term4987.getClass(), "broadcaster", false);
        setBooleanField(term4987, term4987.getClass(), "orbitalElevator", true);
        setIntField(term4987, term4987.getClass(), "battleBonus", 497269071);
        setIntField(term4987, term4987.getClass(), "defenseDamage", -1899301124);
        setIntField(term4987, term4987.getClass(), "scanRange", -1882480155);
        setIntField(term4987, term4987.getClass(), "scanCloakingDetection", -1410220680);
        setIntField(term4987, term4987.getClass(), "fleetCapacityBonus", 389427431);
        setIntField(term4987, term4987.getClass(), "recycleBonus", -1945706126);
        setIntField(term4987, term4987.getClass(), "ancientArtifactResearch", 1152356969);
        setIntField(term4987, term4987.getClass(), "wildLifePower", -1667990367);
        setField(term4987, term4987.getClass(), "name", "whBvTVIIlC");
        setField(term4987, term4987.getClass(), "iconId", "IgRJUzaCwW");
        setField(term4987, term4987.getClass(), "description", "JUmudUmaaV");
        setIntField(term4987, term4987.getClass(), "prodCost", -1214628358);
        setIntField(term4987, term4987.getClass(), "metalCost", 1102721075);
        term5060 = new Integer(-426764678);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.construction.Building");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5060;
        callMethod(klass, "setFactBonus", argTypes, term4987, args);
    }

};


