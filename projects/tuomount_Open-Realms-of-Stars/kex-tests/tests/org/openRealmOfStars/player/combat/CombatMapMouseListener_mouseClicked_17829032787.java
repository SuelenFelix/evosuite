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

public class CombatMapMouseListener_mouseClicked_17829032787 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term556952;

    public CombatMapMouseListener_mouseClicked_17829032787() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term556952 = newInstance(Class.forName("org.openRealmOfStars.player.combat.CombatMapMouseListener"));
        setField(term556952, term556952.getClass(), "combat", null);
        setField(term556952, term556952.getClass(), "mapPanel", null);
        setField(term556952, term556952.getClass(), "battleInfoPanel", null);
        setBooleanField(term556952, term556952.getClass(), "routePlanning", false);
        setIntField(term556952, term556952.getClass(), "componentUse", 0);
        setField(term556952, term556952.getClass(), "coord", null);
        setField(term556952, term556952.getClass(), "activeShip", null);
        setField(term556952, term556952.getClass(), "shipDamage", null);
        setBooleanField(term556952, term556952.getClass(), "escaped", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.CombatMapMouseListener");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "mouseClicked", argTypes, term556952, args);
    }

};


