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

public class CombatMapMouseListener_getShipDamage_176829937826 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1039503;

    public CombatMapMouseListener_getShipDamage_176829937826() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1039503 = newInstance(Class.forName("org.openRealmOfStars.player.combat.CombatMapMouseListener"));
        setField(term1039503, term1039503.getClass(), "combat", null);
        setField(term1039503, term1039503.getClass(), "mapPanel", null);
        setField(term1039503, term1039503.getClass(), "battleInfoPanel", null);
        setBooleanField(term1039503, term1039503.getClass(), "routePlanning", false);
        setIntField(term1039503, term1039503.getClass(), "componentUse", 0);
        setField(term1039503, term1039503.getClass(), "coord", null);
        setField(term1039503, term1039503.getClass(), "activeShip", null);
        setField(term1039503, term1039503.getClass(), "shipDamage", null);
        setBooleanField(term1039503, term1039503.getClass(), "escaped", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.CombatMapMouseListener");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getShipDamage", argTypes, term1039503, args);
    }

};


