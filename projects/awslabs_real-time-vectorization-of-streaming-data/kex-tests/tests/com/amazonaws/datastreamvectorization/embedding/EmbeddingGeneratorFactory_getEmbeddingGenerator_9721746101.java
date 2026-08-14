package com.amazonaws.datastreamvectorization.embedding;

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
import static com.amazonaws.datastreamvectorization.embedding.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;

public class EmbeddingGeneratorFactory_getEmbeddingGenerator_9721746101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23;
     Object term36;

    public EmbeddingGeneratorFactory_getEmbeddingGenerator_9721746101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23 = newInstance(Class.forName("com.amazonaws.datastreamvectorization.embedding.EmbeddingGeneratorFactory"));
        setField(term23, term23.getClass(), "region", "sjlJAEtRrb");
        HashMap term37 = new HashMap();
        HashMap term47 = new HashMap();
        term36 = newInstance(Class.forName("com.amazonaws.datastreamvectorization.embedding.model.EmbeddingConfiguration"));
        setField(term36, term36.getClass(), "embeddingModel", null);
        setField(term36, term36.getClass(), "embeddingModelOverrideConfig", term37);
        setField(term36, term36.getClass(), "embeddingInputConfig", term47);
        setField(term36, term36.getClass(), "charset", "jJCZpVmanW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.datastreamvectorization.embedding.EmbeddingGeneratorFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Class");
        argTypes[1] = Class.forName("com.amazonaws.datastreamvectorization.embedding.model.EmbeddingConfiguration");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term36;
        callMethod(klass, "getEmbeddingGenerator", argTypes, term23, args);
    }

};


