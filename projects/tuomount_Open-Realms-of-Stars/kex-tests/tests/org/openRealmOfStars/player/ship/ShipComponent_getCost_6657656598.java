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

public class ShipComponent_getCost_6657656598 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term465624;

    public ShipComponent_getCost_6657656598() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term465683 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipComponentType");
        Field term465682 = ((Class) term465683).getDeclaredField((String) "PRIVATEERING_MODULE");
        ((Field) term465682).setAccessible(true);
        Object enum1480 = ((Field) term465682).get((Object) null);
        term465624 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term465624, term465624.getClass(), "index", 900564501);
        setField(term465624, term465624.getClass(), "type", enum1480);
        setIntField(term465624, term465624.getClass(), "cost", 691426483);
        setIntField(term465624, term465624.getClass(), "metalCost", -1874483545);
        setField(term465624, term465624.getClass(), "name", "ZVLMiVNCSY");
        setIntField(term465624, term465624.getClass(), "energyRequirement", -12947994);
        setIntField(term465624, term465624.getClass(), "energyResource", -2140327885);
        setIntField(term465624, term465624.getClass(), "ftlSpeed", -716761090);
        setIntField(term465624, term465624.getClass(), "speed", 164855440);
        setIntField(term465624, term465624.getClass(), "tacticSpeed", -1814635979);
        setIntField(term465624, term465624.getClass(), "scannerRange", 4956756);
        setIntField(term465624, term465624.getClass(), "cloakDetection", 1025289060);
        setIntField(term465624, term465624.getClass(), "cloaking", -1825138606);
        setIntField(term465624, term465624.getClass(), "defenseValue", -1528237952);
        setIntField(term465624, term465624.getClass(), "baySize", -778347388);
        setIntField(term465624, term465624.getClass(), "damage", -1582115328);
        setIntField(term465624, term465624.getClass(), "weaponRange", -847286682);
        setIntField(term465624, term465624.getClass(), "initiativeBoost", 1928848171);
        setIntField(term465624, term465624.getClass(), "cultureBonus", -646124218);
        setIntField(term465624, term465624.getClass(), "creditBonus", -1021537887);
        setIntField(term465624, term465624.getClass(), "researchBonus", -1125442276);
        setIntField(term465624, term465624.getClass(), "espionageBonus", 1396813980);
        setIntField(term465624, term465624.getClass(), "fleetCapacityBonus", -326534947);
        setIntField(term465624, term465624.getClass(), "hitBonus", 928430778);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipComponent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCost", argTypes, term465624, args);
    }

};


