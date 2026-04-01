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

public class ShipComponent_getEspionageBonus_146358963047 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term479476;

    public ShipComponent_getEspionageBonus_146358963047() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term479529 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipComponentType");
        Field term479528 = ((Class) term479529).getDeclaredField((String) "SHADOW_SHIELD");
        ((Field) term479528).setAccessible(true);
        Object enum1519 = ((Field) term479528).get((Object) null);
        term479476 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term479476, term479476.getClass(), "index", -12124373);
        setField(term479476, term479476.getClass(), "type", enum1519);
        setIntField(term479476, term479476.getClass(), "cost", -458525211);
        setIntField(term479476, term479476.getClass(), "metalCost", 79574412);
        setField(term479476, term479476.getClass(), "name", "VBFMzEDRSf");
        setIntField(term479476, term479476.getClass(), "energyRequirement", 1278232442);
        setIntField(term479476, term479476.getClass(), "energyResource", -30189614);
        setIntField(term479476, term479476.getClass(), "ftlSpeed", 621019431);
        setIntField(term479476, term479476.getClass(), "speed", 67755379);
        setIntField(term479476, term479476.getClass(), "tacticSpeed", 546827218);
        setIntField(term479476, term479476.getClass(), "scannerRange", 443225664);
        setIntField(term479476, term479476.getClass(), "cloakDetection", 695264841);
        setIntField(term479476, term479476.getClass(), "cloaking", -141489831);
        setIntField(term479476, term479476.getClass(), "defenseValue", 1842921890);
        setIntField(term479476, term479476.getClass(), "baySize", 1488820788);
        setIntField(term479476, term479476.getClass(), "damage", -892002512);
        setIntField(term479476, term479476.getClass(), "weaponRange", -8983814);
        setIntField(term479476, term479476.getClass(), "initiativeBoost", 1376766367);
        setIntField(term479476, term479476.getClass(), "cultureBonus", 728709306);
        setIntField(term479476, term479476.getClass(), "creditBonus", -235241687);
        setIntField(term479476, term479476.getClass(), "researchBonus", 6575429);
        setIntField(term479476, term479476.getClass(), "espionageBonus", 2015303962);
        setIntField(term479476, term479476.getClass(), "fleetCapacityBonus", -2104017987);
        setIntField(term479476, term479476.getClass(), "hitBonus", -140083994);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipComponent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEspionageBonus", argTypes, term479476, args);
    }

};


