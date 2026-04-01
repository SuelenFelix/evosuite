package org.openRealmOfStars.player.ship;

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
import static org.openRealmOfStars.player.ship.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class ShipComponent_getCreditBonus_162438942241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term477378;

    public ShipComponent_getCreditBonus_162438942241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term477431 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipComponentType");
        Field term477430 = ((Class) term477431).getDeclaredField((String) "ORBITAL_BOMBS");
        ((Field) term477430).setAccessible(true);
        Object enum1513 = ((Field) term477430).get((Object) null);
        term477378 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term477378, term477378.getClass(), "index", 1545298429);
        setField(term477378, term477378.getClass(), "type", enum1513);
        setIntField(term477378, term477378.getClass(), "cost", -534750055);
        setIntField(term477378, term477378.getClass(), "metalCost", -1676589154);
        setField(term477378, term477378.getClass(), "name", "lFHgJjAGJi");
        setIntField(term477378, term477378.getClass(), "energyRequirement", 594573065);
        setIntField(term477378, term477378.getClass(), "energyResource", 238432442);
        setIntField(term477378, term477378.getClass(), "ftlSpeed", 1053641068);
        setIntField(term477378, term477378.getClass(), "speed", 1534572179);
        setIntField(term477378, term477378.getClass(), "tacticSpeed", -1604928850);
        setIntField(term477378, term477378.getClass(), "scannerRange", -1565710230);
        setIntField(term477378, term477378.getClass(), "cloakDetection", -1566848580);
        setIntField(term477378, term477378.getClass(), "cloaking", -136903149);
        setIntField(term477378, term477378.getClass(), "defenseValue", 700453711);
        setIntField(term477378, term477378.getClass(), "baySize", 1796077039);
        setIntField(term477378, term477378.getClass(), "damage", -2113586852);
        setIntField(term477378, term477378.getClass(), "weaponRange", -1398967560);
        setIntField(term477378, term477378.getClass(), "initiativeBoost", -553848886);
        setIntField(term477378, term477378.getClass(), "cultureBonus", -677534777);
        setIntField(term477378, term477378.getClass(), "creditBonus", 825962791);
        setIntField(term477378, term477378.getClass(), "researchBonus", 1873721781);
        setIntField(term477378, term477378.getClass(), "espionageBonus", -32960653);
        setIntField(term477378, term477378.getClass(), "fleetCapacityBonus", -416911471);
        setIntField(term477378, term477378.getClass(), "hitBonus", -1202714572);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipComponent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreditBonus", argTypes, term477378, args);
    }

};


