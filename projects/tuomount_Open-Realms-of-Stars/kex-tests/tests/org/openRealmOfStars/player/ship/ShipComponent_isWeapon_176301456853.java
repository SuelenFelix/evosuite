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

public class ShipComponent_isWeapon_176301456853 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term480946;

    public ShipComponent_isWeapon_176301456853() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term480946 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term480946, term480946.getClass(), "index", 0);
        setField(term480946, term480946.getClass(), "type", null);
        setIntField(term480946, term480946.getClass(), "cost", 0);
        setIntField(term480946, term480946.getClass(), "metalCost", 0);
        setField(term480946, term480946.getClass(), "name", null);
        setIntField(term480946, term480946.getClass(), "energyRequirement", 0);
        setIntField(term480946, term480946.getClass(), "energyResource", 0);
        setIntField(term480946, term480946.getClass(), "ftlSpeed", 0);
        setIntField(term480946, term480946.getClass(), "speed", 0);
        setIntField(term480946, term480946.getClass(), "tacticSpeed", 0);
        setIntField(term480946, term480946.getClass(), "scannerRange", 0);
        setIntField(term480946, term480946.getClass(), "cloakDetection", 0);
        setIntField(term480946, term480946.getClass(), "cloaking", 0);
        setIntField(term480946, term480946.getClass(), "defenseValue", 0);
        setIntField(term480946, term480946.getClass(), "baySize", 0);
        setIntField(term480946, term480946.getClass(), "damage", 0);
        setIntField(term480946, term480946.getClass(), "weaponRange", 0);
        setIntField(term480946, term480946.getClass(), "initiativeBoost", 0);
        setIntField(term480946, term480946.getClass(), "cultureBonus", 0);
        setIntField(term480946, term480946.getClass(), "creditBonus", 0);
        setIntField(term480946, term480946.getClass(), "researchBonus", 0);
        setIntField(term480946, term480946.getClass(), "espionageBonus", 0);
        setIntField(term480946, term480946.getClass(), "fleetCapacityBonus", 0);
        setIntField(term480946, term480946.getClass(), "hitBonus", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipComponent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isWeapon", argTypes, term480946, args);
    }

};


