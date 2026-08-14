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
import java.util.HashMap;

public class EmbeddingConfiguration_EmbeddingConfigurationBuilder_embeddingModel_3268181831 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public EmbeddingConfiguration_EmbeddingConfigurationBuilder_embeddingModel_3268181831() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2 = new HashMap();
        HashMap term12 = new HashMap();
        term1 = newInstance(Class.forName("com.amazonaws.datastreamvectorization.embedding.model.EmbeddingConfiguration$EmbeddingConfigurationBuilder"));
        setField(term1, term1.getClass(), "embeddingModel", null);
        setField(term1, term1.getClass(), "embeddingModelOverrideConfig", term2);
        setField(term1, term1.getClass(), "embeddingInputConfig", term12);
        setField(term1, term1.getClass(), "charset", "MuLcgQHgqz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.datastreamvectorization.embedding.model.EmbeddingConfiguration$EmbeddingConfigurationBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.amazonaws.datastreamvectorization.embedding.model.EmbeddingModel");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "embeddingModel", argTypes, term1, args);
    }

};


