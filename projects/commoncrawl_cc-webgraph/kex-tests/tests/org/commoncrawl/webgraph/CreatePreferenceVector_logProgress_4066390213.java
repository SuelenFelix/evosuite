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

public class CreatePreferenceVector_logProgress_4066390213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7766;

    public CreatePreferenceVector_logProgress_4066390213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7766 = newInstance(Class.forName("org.commoncrawl.webgraph.CreatePreferenceVector"));
        setLongField(term7766, term7766.getClass(), "lastId", -5269076898456067678L);
        setField(term7766, term7766.getClass(), "preferenceIterator", null);
        setField(term7766, term7766.getClass(), "preferenceIds", null);
        setDoubleField(term7766, term7766.getClass(), "defaultPreferenceValue", 0.24810335047389354);
        setField(term7766, term7766.getClass(), "nextPreferenceName", "SPpkrGcPRr");
        setLongField(term7766, term7766.getClass(), "recordsProcessed", 2124275424075254005L);
        setLongField(term7766, term7766.getClass(), "preferenceNamesFound", -6616339196088014666L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.CreatePreferenceVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "logProgress", argTypes, term7766, args);
    }

};


