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

public class CreatePreferenceVector_read_14869820916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7891;

    public CreatePreferenceVector_read_14869820916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7891 = newInstance(Class.forName("org.commoncrawl.webgraph.CreatePreferenceVector"));
        setLongField(term7891, term7891.getClass(), "lastId", -3441020756295150684L);
        setField(term7891, term7891.getClass(), "preferenceIterator", null);
        setField(term7891, term7891.getClass(), "preferenceIds", null);
        setDoubleField(term7891, term7891.getClass(), "defaultPreferenceValue", 0.37439559220953034);
        setField(term7891, term7891.getClass(), "nextPreferenceName", "qxSDVejjiY");
        setLongField(term7891, term7891.getClass(), "recordsProcessed", -2938034344303060228L);
        setLongField(term7891, term7891.getClass(), "preferenceNamesFound", -758819117507836512L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.CreatePreferenceVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.stream.Stream");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "read", argTypes, term7891, args);
    }

};


