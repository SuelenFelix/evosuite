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

public class Building_setAncientArtifactResearch_25133628147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24720;
     Object term24792;

    public Building_setAncientArtifactResearch_25133628147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term24795 = Class.forName((String) "org.openRealmOfStars.starMap.planet.construction.BuildingType");
        Field term24794 = ((Class) term24795).getDeclaredField((String) "CULTURE");
        ((Field) term24794).setAccessible(true);
        Object enum55 = ((Field) term24794).get((Object) null);
        term24720 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.construction.Building"));
        setField(term24720, term24720.getClass(), "type", enum55);
        setIntField(term24720, term24720.getClass(), "farmBonus", 1983756621);
        setIntField(term24720, term24720.getClass(), "waterBonus", -2134711835);
        setIntField(term24720, term24720.getClass(), "mineBonus", -1641244494);
        setIntField(term24720, term24720.getClass(), "factBonus", 1124282188);
        setIntField(term24720, term24720.getClass(), "cultBonus", -489441521);
        setIntField(term24720, term24720.getClass(), "reseBonus", 225873732);
        setIntField(term24720, term24720.getClass(), "credBonus", 529879356);
        setIntField(term24720, term24720.getClass(), "happinessBonus", 18072182);
        setIntField(term24720, term24720.getClass(), "materialBonus", 1544768934);
        setDoubleField(term24720, term24720.getClass(), "maintenanceCost", 0.2192450926212024);
        setBooleanField(term24720, term24720.getClass(), "singleAllowed", false);
        setBooleanField(term24720, term24720.getClass(), "scientificAchievement", false);
        setBooleanField(term24720, term24720.getClass(), "broadcaster", false);
        setBooleanField(term24720, term24720.getClass(), "orbitalElevator", false);
        setIntField(term24720, term24720.getClass(), "battleBonus", -383508597);
        setIntField(term24720, term24720.getClass(), "defenseDamage", -819372164);
        setIntField(term24720, term24720.getClass(), "scanRange", 958132675);
        setIntField(term24720, term24720.getClass(), "scanCloakingDetection", -689879283);
        setIntField(term24720, term24720.getClass(), "fleetCapacityBonus", 1985432430);
        setIntField(term24720, term24720.getClass(), "recycleBonus", -1769933499);
        setIntField(term24720, term24720.getClass(), "ancientArtifactResearch", -1510932472);
        setIntField(term24720, term24720.getClass(), "wildLifePower", 1970654816);
        setField(term24720, term24720.getClass(), "name", "qCpEbQDHdF");
        setField(term24720, term24720.getClass(), "iconId", "AHbZyFOmlo");
        setField(term24720, term24720.getClass(), "description", "TwfWVQGiIj");
        setIntField(term24720, term24720.getClass(), "prodCost", 1354781442);
        setIntField(term24720, term24720.getClass(), "metalCost", -393590701);
        term24792 = new Integer(86344574);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.construction.Building");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term24792;
        callMethod(klass, "setAncientArtifactResearch", argTypes, term24720, args);
    }

};


