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

public class CombatCoordinate_sameAs_17632922796 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term584659;
     Object term584662;

    public CombatCoordinate_sameAs_17632922796() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term584659 = newInstance(Class.forName("org.openRealmOfStars.player.combat.CombatCoordinate"));
        setIntField(term584659, term584659.getClass(), "x", 2060220804);
        setIntField(term584659, term584659.getClass(), "y", 1584622242);
        term584662 = newInstance(Class.forName("org.openRealmOfStars.player.combat.CombatCoordinate"));
        setIntField(term584662, term584662.getClass(), "x", -1650881323);
        setIntField(term584662, term584662.getClass(), "y", -72648238);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.CombatCoordinate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.combat.CombatCoordinate");
        Object[] args = new Object[1];
        args[0] = term584662;
        callMethod(klass, "sameAs", argTypes, term584659, args);
    }

};


