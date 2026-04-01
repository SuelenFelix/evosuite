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
import java.lang.Integer;

public class ShipComponent_setHitBonus_1737392550101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term482086;
     Object term482109;

    public ShipComponent_setHitBonus_1737392550101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term482086 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term482086, term482086.getClass(), "index", 0);
        setField(term482086, term482086.getClass(), "type", null);
        setIntField(term482086, term482086.getClass(), "cost", 0);
        setIntField(term482086, term482086.getClass(), "metalCost", 0);
        setField(term482086, term482086.getClass(), "name", null);
        setIntField(term482086, term482086.getClass(), "energyRequirement", 0);
        setIntField(term482086, term482086.getClass(), "energyResource", 0);
        setIntField(term482086, term482086.getClass(), "ftlSpeed", 0);
        setIntField(term482086, term482086.getClass(), "speed", 0);
        setIntField(term482086, term482086.getClass(), "tacticSpeed", 0);
        setIntField(term482086, term482086.getClass(), "scannerRange", 0);
        setIntField(term482086, term482086.getClass(), "cloakDetection", 0);
        setIntField(term482086, term482086.getClass(), "cloaking", 0);
        setIntField(term482086, term482086.getClass(), "defenseValue", 0);
        setIntField(term482086, term482086.getClass(), "baySize", 0);
        setIntField(term482086, term482086.getClass(), "damage", 0);
        setIntField(term482086, term482086.getClass(), "weaponRange", 0);
        setIntField(term482086, term482086.getClass(), "initiativeBoost", 0);
        setIntField(term482086, term482086.getClass(), "cultureBonus", 0);
        setIntField(term482086, term482086.getClass(), "creditBonus", 0);
        setIntField(term482086, term482086.getClass(), "researchBonus", 0);
        setIntField(term482086, term482086.getClass(), "espionageBonus", 0);
        setIntField(term482086, term482086.getClass(), "fleetCapacityBonus", 0);
        setIntField(term482086, term482086.getClass(), "hitBonus", 0);
        term482109 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipComponent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term482109;
        callMethod(klass, "setHitBonus", argTypes, term482086, args);
    }

};


