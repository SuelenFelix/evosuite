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

public class EmbeddingInput_getStringToEmbed_18933501581 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1487;

    public EmbeddingInput_getStringToEmbed_18933501581() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1487 = newInstance(Class.forName("com.amazonaws.datastreamvectorization.embedding.model.EmbeddingInput"));
        setField(term1487, term1487.getClass(), "originalData", "kuTXqwMtDB");
        setField(term1487, term1487.getClass(), "chunkKey", "Ghbwtircqb");
        setField(term1487, term1487.getClass(), "chunkData", "xrwlQZdwCp");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.datastreamvectorization.embedding.model.EmbeddingInput");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStringToEmbed", argTypes, term1487, args);
    }

};


