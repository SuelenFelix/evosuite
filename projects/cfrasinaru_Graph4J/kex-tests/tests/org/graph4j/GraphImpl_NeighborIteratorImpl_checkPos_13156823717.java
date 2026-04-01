package org.graph4j;

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
import static org.graph4j.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GraphImpl_NeighborIteratorImpl_checkPos_13156823717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147511;

    public GraphImpl_NeighborIteratorImpl_checkPos_13156823717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term147511 = newInstance(Class.forName("org.graph4j.GraphImpl$NeighborIteratorImpl"));
        setIntField(term147511, term147511.getClass(), "v", -1668468860);
        setIntField(term147511, term147511.getClass(), "vi", 1091235013);
        setIntField(term147511, term147511.getClass(), "pos", 1013726711);
        setBooleanField(term147511, term147511.getClass(), "forward", true);
        setField(term147511, term147511.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl$NeighborIteratorImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "checkPos", argTypes, term147511, args);
    }

};


