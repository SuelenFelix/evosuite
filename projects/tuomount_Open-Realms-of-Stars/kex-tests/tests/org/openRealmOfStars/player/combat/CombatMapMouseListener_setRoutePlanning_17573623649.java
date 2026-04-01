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

public class CombatMapMouseListener_setRoutePlanning_17573623649 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1017487;
     Object term1017491;

    public CombatMapMouseListener_setRoutePlanning_17573623649() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1017487 = newInstance(Class.forName("org.openRealmOfStars.player.combat.CombatMapMouseListener"));
        setField(term1017487, term1017487.getClass(), "combat", null);
        setField(term1017487, term1017487.getClass(), "mapPanel", null);
        setField(term1017487, term1017487.getClass(), "battleInfoPanel", null);
        setBooleanField(term1017487, term1017487.getClass(), "routePlanning", false);
        setIntField(term1017487, term1017487.getClass(), "componentUse", 0);
        setField(term1017487, term1017487.getClass(), "coord", null);
        setField(term1017487, term1017487.getClass(), "activeShip", null);
        setField(term1017487, term1017487.getClass(), "shipDamage", null);
        setBooleanField(term1017487, term1017487.getClass(), "escaped", false);
        term1017491 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.CombatMapMouseListener");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1017491;
        callMethod(klass, "setRoutePlanning", argTypes, term1017487, args);
    }

};


