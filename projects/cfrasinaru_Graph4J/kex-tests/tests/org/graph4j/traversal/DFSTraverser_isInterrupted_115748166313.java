package org.graph4j.traversal;

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
import static org.graph4j.traversal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DFSTraverser_isInterrupted_115748166313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110693;

    public DFSTraverser_isInterrupted_115748166313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term110693 = newInstance(Class.forName("org.graph4j.traversal.DFSTraverser"));
        setField(term110693, term110693.getClass(), "graph", null);
        setBooleanField(term110693, term110693.getClass(), "directed", false);
        setField(term110693, term110693.getClass(), "visitor", null);
        setIntField(term110693, term110693.getClass(), "orderIndex", 0);
        setIntField(term110693, term110693.getClass(), "compIndex", 0);
        setField(term110693, term110693.getClass(), "visited", null);
        setField(term110693, term110693.getClass(), "nextPos", null);
        setIntField(term110693, term110693.getClass(), "restartIndex", 0);
        setField(term110693, term110693.getClass(), "stack", null);
        setField(term110693, term110693.getClass(), "instack", null);
        setBooleanField(term110693, term110693.getClass(), "interrupted", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.DFSTraverser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isInterrupted", argTypes, term110693, args);
    }

};


