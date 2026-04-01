package org.openRealmOfStars.player.race.trait;

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
import static org.openRealmOfStars.player.race.trait.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class RaceTrait_toString_46428127720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2050;

    public RaceTrait_toString_46428127720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2050 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term2050, term2050.getClass(), "traitId", null);
        setField(term2050, term2050.getClass(), "traitName", null);
        setField(term2050, term2050.getClass(), "description", null);
        setField(term2050, term2050.getClass(), "group", null);
        setField(term2050, term2050.getClass(), "conflictsWithIds", null);
        setByteField(term2050, term2050.getClass(), "traitPoints", (byte) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2050, args);
    }

};


