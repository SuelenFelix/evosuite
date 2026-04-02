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

public class CreatePreferenceVector_nextPreferenceElement_131713155613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8196;

    public CreatePreferenceVector_nextPreferenceElement_131713155613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8196 = newInstance(Class.forName("org.commoncrawl.webgraph.CreatePreferenceVector"));
        setLongField(term8196, term8196.getClass(), "lastId", 0L);
        setField(term8196, term8196.getClass(), "preferenceIterator", null);
        setField(term8196, term8196.getClass(), "preferenceIds", null);
        setDoubleField(term8196, term8196.getClass(), "defaultPreferenceValue", 0.0);
        setField(term8196, term8196.getClass(), "nextPreferenceName", null);
        setLongField(term8196, term8196.getClass(), "recordsProcessed", 0L);
        setLongField(term8196, term8196.getClass(), "preferenceNamesFound", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.CreatePreferenceVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "nextPreferenceElement", argTypes, term8196, args);
    }

};


