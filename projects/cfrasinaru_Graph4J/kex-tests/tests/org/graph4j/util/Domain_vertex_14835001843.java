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

public class Domain_vertex_14835001843 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9815;

    public Domain_vertex_14835001843() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9815 = newInstance(Class.forName("org.graph4j.util.Domain"));
        int[] term9817 = (int[]) newIntArray(8);
        int[] term9826 = (int[]) newIntArray(8);
        setIntField(term9815, term9815.getClass(), "vertex", 1020931980);
        setIntElement(term9817, 0, -1435032444);
        setIntElement(term9817, 1, -420769218);
        setIntElement(term9817, 2, -1047476590);
        setIntElement(term9817, 3, -804745833);
        setIntElement(term9817, 4, 1080834214);
        setIntElement(term9817, 5, 323842695);
        setIntElement(term9817, 6, 331897564);
        setIntElement(term9817, 7, -968105925);
        setField(term9815, term9815.getClass(), "values", term9817);
        setIntElement(term9826, 0, -206020926);
        setIntElement(term9826, 1, -2054014210);
        setIntElement(term9826, 2, 1179045520);
        setIntElement(term9826, 3, 1056739921);
        setIntElement(term9826, 4, 1384627927);
        setIntElement(term9826, 5, -1252280115);
        setIntElement(term9826, 6, -120849363);
        setIntElement(term9826, 7, 147387583);
        setField(term9815, term9815.getClass(), "positions", term9826);
        setIntField(term9815, term9815.getClass(), "size", -1307347557);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Domain");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "vertex", argTypes, term9815, args);
    }

};


