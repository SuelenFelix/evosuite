package com.amazonaws.datastreamvectorization.embedding.model;

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
import static com.amazonaws.datastreamvectorization.embedding.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ChunkingInput_isEmpty_20631601030 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2979;

    public ChunkingInput_isEmpty_20631601030() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2979 = newInstance(Class.forName("com.amazonaws.datastreamvectorization.embedding.model.ChunkingInput"));
        setField(term2979, term2979.getClass(), "originalData", "hoicvmsovO");
        setField(term2979, term2979.getClass(), "chunkKey", "eqJfYWRaEL");
        setField(term2979, term2979.getClass(), "dataToChunk", "fhkbdRViHi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.datastreamvectorization.embedding.model.ChunkingInput");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isEmpty", argTypes, term2979, args);
    }

};


