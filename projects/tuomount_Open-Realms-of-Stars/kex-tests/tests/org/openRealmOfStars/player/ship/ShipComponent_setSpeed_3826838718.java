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

public class ShipComponent_setSpeed_3826838718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term469226;
     Object term469279;

    public ShipComponent_setSpeed_3826838718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term469282 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipComponentType");
        Field term469281 = ((Class) term469282).getDeclaredField((String) "GRAVITY_RIPPER");
        ((Field) term469281).setAccessible(true);
        Object enum1490 = ((Field) term469281).get((Object) null);
        term469226 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term469226, term469226.getClass(), "index", 1688587497);
        setField(term469226, term469226.getClass(), "type", enum1490);
        setIntField(term469226, term469226.getClass(), "cost", -607264868);
        setIntField(term469226, term469226.getClass(), "metalCost", -1460647226);
        setField(term469226, term469226.getClass(), "name", "WOpZuqVHKD");
        setIntField(term469226, term469226.getClass(), "energyRequirement", 862264056);
        setIntField(term469226, term469226.getClass(), "energyResource", 1933933027);
        setIntField(term469226, term469226.getClass(), "ftlSpeed", 1995024241);
        setIntField(term469226, term469226.getClass(), "speed", 364896764);
        setIntField(term469226, term469226.getClass(), "tacticSpeed", -509113815);
        setIntField(term469226, term469226.getClass(), "scannerRange", -1978644575);
        setIntField(term469226, term469226.getClass(), "cloakDetection", 1079520989);
        setIntField(term469226, term469226.getClass(), "cloaking", -495579516);
        setIntField(term469226, term469226.getClass(), "defenseValue", -1364226663);
        setIntField(term469226, term469226.getClass(), "baySize", -255671701);
        setIntField(term469226, term469226.getClass(), "damage", 454414154);
        setIntField(term469226, term469226.getClass(), "weaponRange", 1716689023);
        setIntField(term469226, term469226.getClass(), "initiativeBoost", -185240752);
        setIntField(term469226, term469226.getClass(), "cultureBonus", 1276298262);
        setIntField(term469226, term469226.getClass(), "creditBonus", 861694073);
        setIntField(term469226, term469226.getClass(), "researchBonus", 257279265);
        setIntField(term469226, term469226.getClass(), "espionageBonus", -293267957);
        setIntField(term469226, term469226.getClass(), "fleetCapacityBonus", -1966853151);
        setIntField(term469226, term469226.getClass(), "hitBonus", 1145144778);
        term469279 = new Integer(1858161828);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipComponent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term469279;
        callMethod(klass, "setSpeed", argTypes, term469226, args);
    }

};


