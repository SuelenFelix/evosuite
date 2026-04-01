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

public class CombatMapMouseListener_setActiveShip_18497008018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term573967;

    public CombatMapMouseListener_setActiveShip_18497008018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term573967 = newInstance(Class.forName("org.openRealmOfStars.player.combat.CombatMapMouseListener"));
        setField(term573967, term573967.getClass(), "combat", null);
        setField(term573967, term573967.getClass(), "mapPanel", null);
        setField(term573967, term573967.getClass(), "battleInfoPanel", null);
        setBooleanField(term573967, term573967.getClass(), "routePlanning", false);
        setIntField(term573967, term573967.getClass(), "componentUse", 0);
        setField(term573967, term573967.getClass(), "coord", null);
        setField(term573967, term573967.getClass(), "activeShip", null);
        setField(term573967, term573967.getClass(), "shipDamage", null);
        setBooleanField(term573967, term573967.getClass(), "escaped", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.CombatMapMouseListener");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.combat.CombatShip");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setActiveShip", argTypes, term573967, args);
    }

};


