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

public class CreatePreferenceVector_setPrefSet_164463182214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8201;

    public CreatePreferenceVector_setPrefSet_164463182214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8201 = newInstance(Class.forName("org.commoncrawl.webgraph.CreatePreferenceVector"));
        setLongField(term8201, term8201.getClass(), "lastId", 0L);
        setField(term8201, term8201.getClass(), "preferenceIterator", null);
        setField(term8201, term8201.getClass(), "preferenceIds", null);
        setDoubleField(term8201, term8201.getClass(), "defaultPreferenceValue", 0.0);
        setField(term8201, term8201.getClass(), "nextPreferenceName", null);
        setLongField(term8201, term8201.getClass(), "recordsProcessed", 0L);
        setLongField(term8201, term8201.getClass(), "preferenceNamesFound", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.CreatePreferenceVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.stream.Stream");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPrefSet", argTypes, term8201, args);
    }

};


