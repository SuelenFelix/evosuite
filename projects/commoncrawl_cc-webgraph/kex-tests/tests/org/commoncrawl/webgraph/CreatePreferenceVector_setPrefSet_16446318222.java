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

public class CreatePreferenceVector_setPrefSet_16446318222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8135;

    public CreatePreferenceVector_setPrefSet_16446318222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8135 = newInstance(Class.forName("org.commoncrawl.webgraph.CreatePreferenceVector"));
        setLongField(term8135, term8135.getClass(), "lastId", 8015201292704898322L);
        setField(term8135, term8135.getClass(), "preferenceIterator", null);
        setField(term8135, term8135.getClass(), "preferenceIds", null);
        setDoubleField(term8135, term8135.getClass(), "defaultPreferenceValue", 0.3147638130628596);
        setField(term8135, term8135.getClass(), "nextPreferenceName", "XylxrMBraH");
        setLongField(term8135, term8135.getClass(), "recordsProcessed", 623115373634781772L);
        setLongField(term8135, term8135.getClass(), "preferenceNamesFound", -6928102703492980650L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.CreatePreferenceVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.stream.Stream");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPrefSet", argTypes, term8135, args);
    }

};


