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

public class CombatCoordinate_calculateDistance_2862717095 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term584653;
     Object term584656;

    public CombatCoordinate_calculateDistance_2862717095() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term584653 = newInstance(Class.forName("org.openRealmOfStars.player.combat.CombatCoordinate"));
        setIntField(term584653, term584653.getClass(), "x", -1373883790);
        setIntField(term584653, term584653.getClass(), "y", -672659626);
        term584656 = newInstance(Class.forName("org.openRealmOfStars.player.combat.CombatCoordinate"));
        setIntField(term584656, term584656.getClass(), "x", 2098080220);
        setIntField(term584656, term584656.getClass(), "y", 2023147996);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.CombatCoordinate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.combat.CombatCoordinate");
        Object[] args = new Object[1];
        args[0] = term584656;
        callMethod(klass, "calculateDistance", argTypes, term584653, args);
    }

};


