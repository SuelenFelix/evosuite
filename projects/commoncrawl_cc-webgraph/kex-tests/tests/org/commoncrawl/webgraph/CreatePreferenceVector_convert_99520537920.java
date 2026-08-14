package org.commoncrawl.webgraph;

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
import static org.commoncrawl.webgraph.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CreatePreferenceVector_convert_99520537920 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8627;

    public CreatePreferenceVector_convert_99520537920() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8627 = newInstance(Class.forName("org.commoncrawl.webgraph.CreatePreferenceVector"));
        setLongField(term8627, term8627.getClass(), "lastId", 0L);
        setField(term8627, term8627.getClass(), "preferenceIterator", null);
        setField(term8627, term8627.getClass(), "preferenceIds", null);
        setDoubleField(term8627, term8627.getClass(), "defaultPreferenceValue", 0.0);
        setField(term8627, term8627.getClass(), "nextPreferenceName", null);
        setLongField(term8627, term8627.getClass(), "recordsProcessed", 0L);
        setLongField(term8627, term8627.getClass(), "preferenceNamesFound", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.CreatePreferenceVector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.stream.Stream");
        argTypes[1] = Class.forName("java.io.DataOutputStream");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "convert", argTypes, term8627, args);
    }

};


