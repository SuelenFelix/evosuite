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

public class CreatePreferenceVector_nextPreferenceElement_13171315561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7712;

    public CreatePreferenceVector_nextPreferenceElement_13171315561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7712 = newInstance(Class.forName("org.commoncrawl.webgraph.CreatePreferenceVector"));
        setLongField(term7712, term7712.getClass(), "lastId", -9069994265835848577L);
        setField(term7712, term7712.getClass(), "preferenceIterator", null);
        setField(term7712, term7712.getClass(), "preferenceIds", null);
        setDoubleField(term7712, term7712.getClass(), "defaultPreferenceValue", 0.9963416078314885);
        setField(term7712, term7712.getClass(), "nextPreferenceName", "XPKmummaqg");
        setLongField(term7712, term7712.getClass(), "recordsProcessed", -1698215709085558019L);
        setLongField(term7712, term7712.getClass(), "preferenceNamesFound", -9057998854977924783L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.CreatePreferenceVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "nextPreferenceElement", argTypes, term7712, args);
    }

};


