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

public class RaceTrait_getDescription_150656898914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2038;

    public RaceTrait_getDescription_150656898914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2038 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term2038, term2038.getClass(), "traitId", null);
        setField(term2038, term2038.getClass(), "traitName", null);
        setField(term2038, term2038.getClass(), "description", null);
        setField(term2038, term2038.getClass(), "group", null);
        setField(term2038, term2038.getClass(), "conflictsWithIds", null);
        setByteField(term2038, term2038.getClass(), "traitPoints", (byte) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescription", argTypes, term2038, args);
    }

};


