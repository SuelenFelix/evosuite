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
import java.lang.Integer;

public class Domain_remove_120802148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9970;
     Object term9979;

    public Domain_remove_120802148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9970 = newInstance(Class.forName("org.graph4j.util.Domain"));
        int[] term9972 = (int[]) newIntArray(1);
        int[] term9974 = (int[]) newIntArray(3);
        setIntField(term9970, term9970.getClass(), "vertex", -526492477);
        setIntElement(term9972, 0, 934758494);
        setField(term9970, term9970.getClass(), "values", term9972);
        setIntElement(term9974, 0, -1458746421);
        setIntElement(term9974, 1, 1248508832);
        setIntElement(term9974, 2, -1508290965);
        setField(term9970, term9970.getClass(), "positions", term9974);
        setIntField(term9970, term9970.getClass(), "size", -537204050);
        term9979 = new Integer(549083285);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Domain");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term9979;
        callMethod(klass, "remove", argTypes, term9970, args);
    }

};


