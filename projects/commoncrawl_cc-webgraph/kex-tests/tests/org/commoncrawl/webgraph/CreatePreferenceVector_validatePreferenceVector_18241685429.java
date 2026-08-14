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

public class CreatePreferenceVector_validatePreferenceVector_18241685429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8430;

    public CreatePreferenceVector_validatePreferenceVector_18241685429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8430 = newInstance(Class.forName("org.commoncrawl.webgraph.CreatePreferenceVector"));
        setLongField(term8430, term8430.getClass(), "lastId", -761256632171362830L);
        setField(term8430, term8430.getClass(), "preferenceIterator", null);
        setField(term8430, term8430.getClass(), "preferenceIds", null);
        setDoubleField(term8430, term8430.getClass(), "defaultPreferenceValue", 0.9952003100858836);
        setField(term8430, term8430.getClass(), "nextPreferenceName", "JDaAnsVTGV");
        setLongField(term8430, term8430.getClass(), "recordsProcessed", 6975846341920664143L);
        setLongField(term8430, term8430.getClass(), "preferenceNamesFound", -7055293192926325895L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.CreatePreferenceVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "validatePreferenceVector", argTypes, term8430, args);
    }

};


