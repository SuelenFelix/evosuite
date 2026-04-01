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

public class CombatMapMouseListener_getComponentUse_159735734211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1020040;

    public CombatMapMouseListener_getComponentUse_159735734211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1020040 = newInstance(Class.forName("org.openRealmOfStars.player.combat.CombatMapMouseListener"));
        setField(term1020040, term1020040.getClass(), "combat", null);
        setField(term1020040, term1020040.getClass(), "mapPanel", null);
        setField(term1020040, term1020040.getClass(), "battleInfoPanel", null);
        setBooleanField(term1020040, term1020040.getClass(), "routePlanning", false);
        setIntField(term1020040, term1020040.getClass(), "componentUse", 0);
        setField(term1020040, term1020040.getClass(), "coord", null);
        setField(term1020040, term1020040.getClass(), "activeShip", null);
        setField(term1020040, term1020040.getClass(), "shipDamage", null);
        setBooleanField(term1020040, term1020040.getClass(), "escaped", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.CombatMapMouseListener");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getComponentUse", argTypes, term1020040, args);
    }

};


