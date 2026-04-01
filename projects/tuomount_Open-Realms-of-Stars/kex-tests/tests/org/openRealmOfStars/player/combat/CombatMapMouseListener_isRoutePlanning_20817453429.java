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

public class CombatMapMouseListener_isRoutePlanning_20817453429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term559615;

    public CombatMapMouseListener_isRoutePlanning_20817453429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term559615 = newInstance(Class.forName("org.openRealmOfStars.player.combat.CombatMapMouseListener"));
        setField(term559615, term559615.getClass(), "combat", null);
        setField(term559615, term559615.getClass(), "mapPanel", null);
        setField(term559615, term559615.getClass(), "battleInfoPanel", null);
        setBooleanField(term559615, term559615.getClass(), "routePlanning", false);
        setIntField(term559615, term559615.getClass(), "componentUse", 0);
        setField(term559615, term559615.getClass(), "coord", null);
        setField(term559615, term559615.getClass(), "activeShip", null);
        setField(term559615, term559615.getClass(), "shipDamage", null);
        setBooleanField(term559615, term559615.getClass(), "escaped", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.CombatMapMouseListener");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isRoutePlanning", argTypes, term559615, args);
    }

};


