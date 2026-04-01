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
import java.lang.Integer;

public class ShipComponent_setCultureBonus_169643771740 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term476994;
     Object term477052;

    public ShipComponent_setCultureBonus_169643771740() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term477055 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipComponentType");
        Field term477054 = ((Class) term477055).getDeclaredField((String) "PRIVATEERING_MODULE");
        ((Field) term477054).setAccessible(true);
        Object enum1512 = ((Field) term477054).get((Object) null);
        term476994 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term476994, term476994.getClass(), "index", 980185716);
        setField(term476994, term476994.getClass(), "type", enum1512);
        setIntField(term476994, term476994.getClass(), "cost", -451513047);
        setIntField(term476994, term476994.getClass(), "metalCost", 1544010766);
        setField(term476994, term476994.getClass(), "name", "swmcBYbxZS");
        setIntField(term476994, term476994.getClass(), "energyRequirement", 706564579);
        setIntField(term476994, term476994.getClass(), "energyResource", 685229499);
        setIntField(term476994, term476994.getClass(), "ftlSpeed", -237452608);
        setIntField(term476994, term476994.getClass(), "speed", -1948272200);
        setIntField(term476994, term476994.getClass(), "tacticSpeed", -1769055397);
        setIntField(term476994, term476994.getClass(), "scannerRange", -855345856);
        setIntField(term476994, term476994.getClass(), "cloakDetection", 466230959);
        setIntField(term476994, term476994.getClass(), "cloaking", 771668035);
        setIntField(term476994, term476994.getClass(), "defenseValue", 1158875639);
        setIntField(term476994, term476994.getClass(), "baySize", -33961488);
        setIntField(term476994, term476994.getClass(), "damage", -1889485761);
        setIntField(term476994, term476994.getClass(), "weaponRange", -1436656998);
        setIntField(term476994, term476994.getClass(), "initiativeBoost", -314258295);
        setIntField(term476994, term476994.getClass(), "cultureBonus", -938986809);
        setIntField(term476994, term476994.getClass(), "creditBonus", 1895347898);
        setIntField(term476994, term476994.getClass(), "researchBonus", 506296423);
        setIntField(term476994, term476994.getClass(), "espionageBonus", -1284429911);
        setIntField(term476994, term476994.getClass(), "fleetCapacityBonus", 1205489283);
        setIntField(term476994, term476994.getClass(), "hitBonus", 2075978505);
        term477052 = new Integer(330178792);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipComponent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term477052;
        callMethod(klass, "setCultureBonus", argTypes, term476994, args);
    }

};


