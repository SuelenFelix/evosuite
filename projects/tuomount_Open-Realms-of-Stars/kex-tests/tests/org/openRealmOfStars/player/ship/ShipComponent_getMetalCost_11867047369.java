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

public class ShipComponent_getMetalCost_11867047369 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term466006;

    public ShipComponent_getMetalCost_11867047369() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term466057 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipComponentType");
        Field term466056 = ((Class) term466057).getDeclaredField((String) "POWERSOURCE");
        ((Field) term466056).setAccessible(true);
        Object enum1481 = ((Field) term466056).get((Object) null);
        term466006 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term466006, term466006.getClass(), "index", -677542538);
        setField(term466006, term466006.getClass(), "type", enum1481);
        setIntField(term466006, term466006.getClass(), "cost", 310695506);
        setIntField(term466006, term466006.getClass(), "metalCost", -2079854393);
        setField(term466006, term466006.getClass(), "name", "dolywHlSIi");
        setIntField(term466006, term466006.getClass(), "energyRequirement", 125914013);
        setIntField(term466006, term466006.getClass(), "energyResource", 236993107);
        setIntField(term466006, term466006.getClass(), "ftlSpeed", 1900650812);
        setIntField(term466006, term466006.getClass(), "speed", 1824505737);
        setIntField(term466006, term466006.getClass(), "tacticSpeed", -1231776024);
        setIntField(term466006, term466006.getClass(), "scannerRange", -201286705);
        setIntField(term466006, term466006.getClass(), "cloakDetection", 1946136392);
        setIntField(term466006, term466006.getClass(), "cloaking", 845409458);
        setIntField(term466006, term466006.getClass(), "defenseValue", -334809793);
        setIntField(term466006, term466006.getClass(), "baySize", 1336526057);
        setIntField(term466006, term466006.getClass(), "damage", -1183222215);
        setIntField(term466006, term466006.getClass(), "weaponRange", 280886553);
        setIntField(term466006, term466006.getClass(), "initiativeBoost", 1599117883);
        setIntField(term466006, term466006.getClass(), "cultureBonus", -1690488985);
        setIntField(term466006, term466006.getClass(), "creditBonus", -929504323);
        setIntField(term466006, term466006.getClass(), "researchBonus", 141562728);
        setIntField(term466006, term466006.getClass(), "espionageBonus", -1991277407);
        setIntField(term466006, term466006.getClass(), "fleetCapacityBonus", 519516662);
        setIntField(term466006, term466006.getClass(), "hitBonus", 396192446);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipComponent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMetalCost", argTypes, term466006, args);
    }

};


