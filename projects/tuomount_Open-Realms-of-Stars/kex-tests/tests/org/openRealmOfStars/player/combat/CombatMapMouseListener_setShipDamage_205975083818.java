package org.openRealmOfStars.player.combat;

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
import static org.openRealmOfStars.player.combat.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CombatMapMouseListener_setShipDamage_205975083818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1034597;

    public CombatMapMouseListener_setShipDamage_205975083818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1034597 = newInstance(Class.forName("org.openRealmOfStars.player.combat.CombatMapMouseListener"));
        setField(term1034597, term1034597.getClass(), "combat", null);
        setField(term1034597, term1034597.getClass(), "mapPanel", null);
        setField(term1034597, term1034597.getClass(), "battleInfoPanel", null);
        setBooleanField(term1034597, term1034597.getClass(), "routePlanning", false);
        setIntField(term1034597, term1034597.getClass(), "componentUse", 0);
        setField(term1034597, term1034597.getClass(), "coord", null);
        setField(term1034597, term1034597.getClass(), "activeShip", null);
        setField(term1034597, term1034597.getClass(), "shipDamage", null);
        setBooleanField(term1034597, term1034597.getClass(), "escaped", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.CombatMapMouseListener");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.ship.ShipDamage");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setShipDamage", argTypes, term1034597, args);
    }

};


