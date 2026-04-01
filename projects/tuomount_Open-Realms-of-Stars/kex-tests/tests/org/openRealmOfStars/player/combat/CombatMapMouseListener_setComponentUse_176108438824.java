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
import java.lang.Integer;

public class CombatMapMouseListener_setComponentUse_176108438824 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1039493;
     Object term1039497;

    public CombatMapMouseListener_setComponentUse_176108438824() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1039493 = newInstance(Class.forName("org.openRealmOfStars.player.combat.CombatMapMouseListener"));
        setField(term1039493, term1039493.getClass(), "combat", null);
        setField(term1039493, term1039493.getClass(), "mapPanel", null);
        setField(term1039493, term1039493.getClass(), "battleInfoPanel", null);
        setBooleanField(term1039493, term1039493.getClass(), "routePlanning", false);
        setIntField(term1039493, term1039493.getClass(), "componentUse", 0);
        setField(term1039493, term1039493.getClass(), "coord", null);
        setField(term1039493, term1039493.getClass(), "activeShip", null);
        setField(term1039493, term1039493.getClass(), "shipDamage", null);
        setBooleanField(term1039493, term1039493.getClass(), "escaped", false);
        term1039497 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.CombatMapMouseListener");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1039497;
        callMethod(klass, "setComponentUse", argTypes, term1039493, args);
    }

};


