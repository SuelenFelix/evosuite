package org.openRealmOfStars.player.government.trait;

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
import static org.openRealmOfStars.player.government.trait.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GovTrait_isTraitConflict_81907871019 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2048;

    public GovTrait_isTraitConflict_81907871019() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2048 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term2048, term2048.getClass(), "traitId", null);
        setField(term2048, term2048.getClass(), "traitName", null);
        setField(term2048, term2048.getClass(), "description", null);
        setField(term2048, term2048.getClass(), "group", null);
        setField(term2048, term2048.getClass(), "conflictsWithIds", null);
        setByteField(term2048, term2048.getClass(), "traitPoints", (byte) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.government.trait.GovTrait");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.government.trait.GovTrait");
        argTypes[1] = Array.newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "isTraitConflict", argTypes, term2048, args);
    }

};


