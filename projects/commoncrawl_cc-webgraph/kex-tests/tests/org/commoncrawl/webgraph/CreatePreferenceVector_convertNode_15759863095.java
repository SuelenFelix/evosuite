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

public class CreatePreferenceVector_convertNode_15759863095 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7842;

    public CreatePreferenceVector_convertNode_15759863095() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7842 = newInstance(Class.forName("org.commoncrawl.webgraph.CreatePreferenceVector"));
        setLongField(term7842, term7842.getClass(), "lastId", 4486175312218543930L);
        setField(term7842, term7842.getClass(), "preferenceIterator", null);
        setField(term7842, term7842.getClass(), "preferenceIds", null);
        setDoubleField(term7842, term7842.getClass(), "defaultPreferenceValue", 0.7444535250398684);
        setField(term7842, term7842.getClass(), "nextPreferenceName", "vjxIhXHxGR");
        setLongField(term7842, term7842.getClass(), "recordsProcessed", -5866516262253090421L);
        setLongField(term7842, term7842.getClass(), "preferenceNamesFound", -4336769198128902991L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.CreatePreferenceVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "QXzGXbEXMu";
        callMethod(klass, "convertNode", argTypes, term7842, args);
    }

};


