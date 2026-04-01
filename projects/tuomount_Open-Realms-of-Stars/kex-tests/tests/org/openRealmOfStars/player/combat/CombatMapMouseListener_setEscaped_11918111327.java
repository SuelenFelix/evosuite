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

public class CombatMapMouseListener_setEscaped_11918111327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1039507;
     Object term1039511;

    public CombatMapMouseListener_setEscaped_11918111327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1039507 = newInstance(Class.forName("org.openRealmOfStars.player.combat.CombatMapMouseListener"));
        setField(term1039507, term1039507.getClass(), "combat", null);
        setField(term1039507, term1039507.getClass(), "mapPanel", null);
        setField(term1039507, term1039507.getClass(), "battleInfoPanel", null);
        setBooleanField(term1039507, term1039507.getClass(), "routePlanning", false);
        setIntField(term1039507, term1039507.getClass(), "componentUse", 0);
        setField(term1039507, term1039507.getClass(), "coord", null);
        setField(term1039507, term1039507.getClass(), "activeShip", null);
        setField(term1039507, term1039507.getClass(), "shipDamage", null);
        setBooleanField(term1039507, term1039507.getClass(), "escaped", false);
        term1039511 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.CombatMapMouseListener");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1039511;
        callMethod(klass, "setEscaped", argTypes, term1039507, args);
    }

};


