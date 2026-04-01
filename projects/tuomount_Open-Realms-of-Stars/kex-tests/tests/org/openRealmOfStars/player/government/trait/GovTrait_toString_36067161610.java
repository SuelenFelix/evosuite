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
import java.util.ArrayList;

public class GovTrait_toString_36067161610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1828;

    public GovTrait_toString_36067161610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1877 = new ArrayList();
        ((ArrayList) term1877).add("JqXGgAhZPl");
        ((ArrayList) term1877).add("jiKYgYHqIS");
        ((ArrayList) term1877).add("DfISiziTgG");
        ((ArrayList) term1877).add("XqgfKFvPSD");
        ((ArrayList) term1877).add("JiVRgTZvKc");
        term1828 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term1828, term1828.getClass(), "traitId", "jSpAteRute");
        setField(term1828, term1828.getClass(), "traitName", "swZVeJAxjt");
        setField(term1828, term1828.getClass(), "description", "xOcJIiQQDu");
        setField(term1828, term1828.getClass(), "group", "GVizqqzXpy");
        setField(term1828, term1828.getClass(), "conflictsWithIds", term1877);
        setByteField(term1828, term1828.getClass(), "traitPoints", (byte) -66);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.government.trait.GovTrait");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1828, args);
    }

};


