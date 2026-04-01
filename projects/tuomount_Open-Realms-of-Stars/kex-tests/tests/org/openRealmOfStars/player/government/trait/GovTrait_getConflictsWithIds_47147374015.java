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

public class GovTrait_getConflictsWithIds_47147374015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2040;

    public GovTrait_getConflictsWithIds_47147374015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2040 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term2040, term2040.getClass(), "traitId", null);
        setField(term2040, term2040.getClass(), "traitName", null);
        setField(term2040, term2040.getClass(), "description", null);
        setField(term2040, term2040.getClass(), "group", null);
        setField(term2040, term2040.getClass(), "conflictsWithIds", null);
        setByteField(term2040, term2040.getClass(), "traitPoints", (byte) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.government.trait.GovTrait");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getConflictsWithIds", argTypes, term2040, args);
    }

};


