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

public class CombatMapMouseListener_mouseMoved_1924944985 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term554562;

    public CombatMapMouseListener_mouseMoved_1924944985() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term554562 = newInstance(Class.forName("org.openRealmOfStars.player.combat.CombatMapMouseListener"));
        setField(term554562, term554562.getClass(), "combat", null);
        setField(term554562, term554562.getClass(), "mapPanel", null);
        setField(term554562, term554562.getClass(), "battleInfoPanel", null);
        setBooleanField(term554562, term554562.getClass(), "routePlanning", false);
        setIntField(term554562, term554562.getClass(), "componentUse", 0);
        setField(term554562, term554562.getClass(), "coord", null);
        setField(term554562, term554562.getClass(), "activeShip", null);
        setField(term554562, term554562.getClass(), "shipDamage", null);
        setBooleanField(term554562, term554562.getClass(), "escaped", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.CombatMapMouseListener");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "mouseMoved", argTypes, term554562, args);
    }

};


