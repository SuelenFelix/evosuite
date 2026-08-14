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

public class CreatePreferenceVector_validatePreferenceVector_182416854221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8632;

    public CreatePreferenceVector_validatePreferenceVector_182416854221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8632 = newInstance(Class.forName("org.commoncrawl.webgraph.CreatePreferenceVector"));
        setLongField(term8632, term8632.getClass(), "lastId", 0L);
        setField(term8632, term8632.getClass(), "preferenceIterator", null);
        setField(term8632, term8632.getClass(), "preferenceIds", null);
        setDoubleField(term8632, term8632.getClass(), "defaultPreferenceValue", 0.0);
        setField(term8632, term8632.getClass(), "nextPreferenceName", null);
        setLongField(term8632, term8632.getClass(), "recordsProcessed", 0L);
        setLongField(term8632, term8632.getClass(), "preferenceNamesFound", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.CreatePreferenceVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "validatePreferenceVector", argTypes, term8632, args);
    }

};


