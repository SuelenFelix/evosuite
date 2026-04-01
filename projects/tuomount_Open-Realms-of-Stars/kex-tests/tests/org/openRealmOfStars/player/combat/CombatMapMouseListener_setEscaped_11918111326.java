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
import java.lang.Boolean;

public class CombatMapMouseListener_setEscaped_11918111326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term583975;
     Object term583979;

    public CombatMapMouseListener_setEscaped_11918111326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term583975 = newInstance(Class.forName("org.openRealmOfStars.player.combat.CombatMapMouseListener"));
        setField(term583975, term583975.getClass(), "combat", null);
        setField(term583975, term583975.getClass(), "mapPanel", null);
        setField(term583975, term583975.getClass(), "battleInfoPanel", null);
        setBooleanField(term583975, term583975.getClass(), "routePlanning", false);
        setIntField(term583975, term583975.getClass(), "componentUse", 0);
        setField(term583975, term583975.getClass(), "coord", null);
        setField(term583975, term583975.getClass(), "activeShip", null);
        setField(term583975, term583975.getClass(), "shipDamage", null);
        setBooleanField(term583975, term583975.getClass(), "escaped", false);
        term583979 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.CombatMapMouseListener");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term583979;
        callMethod(klass, "setEscaped", argTypes, term583975, args);
    }

};


