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

public class CreatePreferenceVector_readJoinNode_3161575494 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8189;

    public CreatePreferenceVector_readJoinNode_3161575494() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8189 = newInstance(Class.forName("org.commoncrawl.webgraph.CreatePreferenceVector"));
        setLongField(term8189, term8189.getClass(), "lastId", -1437596366836021966L);
        setField(term8189, term8189.getClass(), "preferenceIterator", null);
        setField(term8189, term8189.getClass(), "preferenceIds", null);
        setDoubleField(term8189, term8189.getClass(), "defaultPreferenceValue", 0.9113409083257852);
        setField(term8189, term8189.getClass(), "nextPreferenceName", "mXGCWJDOqA");
        setLongField(term8189, term8189.getClass(), "recordsProcessed", 8542753860527083778L);
        setLongField(term8189, term8189.getClass(), "preferenceNamesFound", -7981877752051488010L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.CreatePreferenceVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "dpNsDgfPso";
        callMethod(klass, "readJoinNode", argTypes, term8189, args);
    }

};


