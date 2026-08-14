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
     Object term8238;

    public CreatePreferenceVector_convertNode_15759863095() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8238 = newInstance(Class.forName("org.commoncrawl.webgraph.CreatePreferenceVector"));
        setLongField(term8238, term8238.getClass(), "lastId", 4486175312218543930L);
        setField(term8238, term8238.getClass(), "preferenceIterator", null);
        setField(term8238, term8238.getClass(), "preferenceIds", null);
        setDoubleField(term8238, term8238.getClass(), "defaultPreferenceValue", 0.7444535250398684);
        setField(term8238, term8238.getClass(), "nextPreferenceName", "hCWPJQKpdc");
        setLongField(term8238, term8238.getClass(), "recordsProcessed", -5866516262253090421L);
        setLongField(term8238, term8238.getClass(), "preferenceNamesFound", -4336769198128902991L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.CreatePreferenceVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "WzMEhMXkKx";
        callMethod(klass, "convertNode", argTypes, term8238, args);
    }

};


