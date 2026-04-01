package org.openRealmOfStars.game.state;

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
import static org.openRealmOfStars.game.state.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class ShipDesignView_componentListContains_16082871642 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1453049;
     Object term1453099;

    public ShipDesignView_componentListContains_16082871642() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1453104 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipComponentType");
        Field term1453103 = ((Class) term1453104).getDeclaredField((String) "FIGHTER_BAY");
        ((Field) term1453103).setAccessible(true);
        Object enum3101 = ((Field) term1453103).get((Object) null);
        term1453049 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term1453049, term1453049.getClass(), "index", -1828047867);
        setField(term1453049, term1453049.getClass(), "type", enum3101);
        setIntField(term1453049, term1453049.getClass(), "cost", -1256690623);
        setIntField(term1453049, term1453049.getClass(), "metalCost", 171135422);
        setField(term1453049, term1453049.getClass(), "name", "OGIhAAQfcW");
        setIntField(term1453049, term1453049.getClass(), "energyRequirement", 321575525);
        setIntField(term1453049, term1453049.getClass(), "energyResource", -234613588);
        setIntField(term1453049, term1453049.getClass(), "ftlSpeed", 475137502);
        setIntField(term1453049, term1453049.getClass(), "speed", 2089652974);
        setIntField(term1453049, term1453049.getClass(), "tacticSpeed", 1216772594);
        setIntField(term1453049, term1453049.getClass(), "scannerRange", -842805043);
        setIntField(term1453049, term1453049.getClass(), "cloakDetection", -1860628953);
        setIntField(term1453049, term1453049.getClass(), "cloaking", 1950586622);
        setIntField(term1453049, term1453049.getClass(), "defenseValue", -704784891);
        setIntField(term1453049, term1453049.getClass(), "baySize", -320733739);
        setIntField(term1453049, term1453049.getClass(), "damage", 1677854653);
        setIntField(term1453049, term1453049.getClass(), "weaponRange", -253202518);
        setIntField(term1453049, term1453049.getClass(), "initiativeBoost", -1805237655);
        setIntField(term1453049, term1453049.getClass(), "cultureBonus", -1718246919);
        setIntField(term1453049, term1453049.getClass(), "creditBonus", -1933594436);
        setIntField(term1453049, term1453049.getClass(), "researchBonus", 426451985);
        setIntField(term1453049, term1453049.getClass(), "espionageBonus", -1041869987);
        setIntField(term1453049, term1453049.getClass(), "fleetCapacityBonus", 2048619331);
        setIntField(term1453049, term1453049.getClass(), "hitBonus", 255120961);
        term1453099 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.ShipDesignView");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.ship.ShipComponent");
        argTypes[1] = Class.forName("java.util.ArrayList");
        Object[] args = new Object[2];
        args[0] = term1453049;
        args[1] = term1453099;
        callMethod(klass, "componentListContains", argTypes, null, args);
    }

};


