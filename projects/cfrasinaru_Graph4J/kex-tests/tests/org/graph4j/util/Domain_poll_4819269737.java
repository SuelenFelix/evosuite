package org.graph4j.util;

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
import static org.graph4j.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Domain_poll_4819269737 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157610;

    public Domain_poll_4819269737() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term157610 = newInstance(Class.forName("org.graph4j.util.Domain"));
        int[] term157612 = (int[]) newIntArray(2);
        int[] term157615 = (int[]) newIntArray(9);
        setIntField(term157610, term157610.getClass(), "vertex", 1086376748);
        setIntElement(term157612, 0, 2131557237);
        setIntElement(term157612, 1, -1901381970);
        setField(term157610, term157610.getClass(), "values", term157612);
        setIntElement(term157615, 0, -339313863);
        setIntElement(term157615, 1, -1499709573);
        setIntElement(term157615, 2, 1820986893);
        setIntElement(term157615, 3, -1049557624);
        setIntElement(term157615, 4, 1727968244);
        setIntElement(term157615, 5, 198850392);
        setIntElement(term157615, 6, 764392376);
        setIntElement(term157615, 7, -1429149544);
        setIntElement(term157615, 8, 62960511);
        setField(term157610, term157610.getClass(), "positions", term157615);
        setIntField(term157610, term157610.getClass(), "size", 1090579118);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Domain");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "poll", argTypes, term157610, args);
    }

};


