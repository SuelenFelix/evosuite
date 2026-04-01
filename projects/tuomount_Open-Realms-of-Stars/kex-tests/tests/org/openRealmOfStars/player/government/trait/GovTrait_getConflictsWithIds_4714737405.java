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

public class GovTrait_getConflictsWithIds_4714737405 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term751;

    public GovTrait_getConflictsWithIds_4714737405() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term800 = new ArrayList();
        ((ArrayList) term800).add("wSQxaModmm");
        term751 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term751, term751.getClass(), "traitId", "xrwlQZdwCp");
        setField(term751, term751.getClass(), "traitName", "IDCWpPLRkE");
        setField(term751, term751.getClass(), "description", "nyiiPDVjAc");
        setField(term751, term751.getClass(), "group", "aKnKipADSo");
        setField(term751, term751.getClass(), "conflictsWithIds", term800);
        setByteField(term751, term751.getClass(), "traitPoints", (byte) -58);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.government.trait.GovTrait");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getConflictsWithIds", argTypes, term751, args);
    }

};


