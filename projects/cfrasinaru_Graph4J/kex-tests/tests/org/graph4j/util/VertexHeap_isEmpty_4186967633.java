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

public class VertexHeap_isEmpty_4186967633 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term457;

    public VertexHeap_isEmpty_4186967633() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term457 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term458 = (int[]) newIntArray(1);
        int[] term460 = (int[]) newIntArray(2);
        setField(term457, term457.getClass(), "graph", null);
        setField(term457, term457.getClass(), "comparator", null);
        setIntElement(term458, 0, 1141317871);
        setField(term457, term457.getClass(), "keys", term458);
        setIntElement(term460, 0, 890669485);
        setIntElement(term460, 1, 691577392);
        setField(term457, term457.getClass(), "positions", term460);
        setIntField(term457, term457.getClass(), "size", -893623680);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexHeap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isEmpty", argTypes, term457, args);
    }

};


