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

public class CombatMapMouseListener_isEscaped_24541331724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term581443;

    public CombatMapMouseListener_isEscaped_24541331724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term581443 = newInstance(Class.forName("org.openRealmOfStars.player.combat.CombatMapMouseListener"));
        setField(term581443, term581443.getClass(), "combat", null);
        setField(term581443, term581443.getClass(), "mapPanel", null);
        setField(term581443, term581443.getClass(), "battleInfoPanel", null);
        setBooleanField(term581443, term581443.getClass(), "routePlanning", false);
        setIntField(term581443, term581443.getClass(), "componentUse", 0);
        setField(term581443, term581443.getClass(), "coord", null);
        setField(term581443, term581443.getClass(), "activeShip", null);
        setField(term581443, term581443.getClass(), "shipDamage", null);
        setBooleanField(term581443, term581443.getClass(), "escaped", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.CombatMapMouseListener");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isEscaped", argTypes, term581443, args);
    }

};


