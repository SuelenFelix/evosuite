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

public class CombatMapMouseListener_setComponentUse_176108438815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term566940;
     Object term566944;

    public CombatMapMouseListener_setComponentUse_176108438815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term566940 = newInstance(Class.forName("org.openRealmOfStars.player.combat.CombatMapMouseListener"));
        setField(term566940, term566940.getClass(), "combat", null);
        setField(term566940, term566940.getClass(), "mapPanel", null);
        setField(term566940, term566940.getClass(), "battleInfoPanel", null);
        setBooleanField(term566940, term566940.getClass(), "routePlanning", false);
        setIntField(term566940, term566940.getClass(), "componentUse", 0);
        setField(term566940, term566940.getClass(), "coord", null);
        setField(term566940, term566940.getClass(), "activeShip", null);
        setField(term566940, term566940.getClass(), "shipDamage", null);
        setBooleanField(term566940, term566940.getClass(), "escaped", false);
        term566944 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.CombatMapMouseListener");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term566944;
        callMethod(klass, "setComponentUse", argTypes, term566940, args);
    }

};


