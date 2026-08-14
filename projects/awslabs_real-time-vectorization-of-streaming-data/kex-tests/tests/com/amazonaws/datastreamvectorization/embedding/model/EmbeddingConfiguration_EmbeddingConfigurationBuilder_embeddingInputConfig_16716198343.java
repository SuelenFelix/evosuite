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
import java.util.LinkedHashMap;

public class EmbeddingConfiguration_EmbeddingConfigurationBuilder_embeddingInputConfig_16716198343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134;
     Object term167;

    public EmbeddingConfiguration_EmbeddingConfigurationBuilder_embeddingInputConfig_16716198343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term135 = new HashMap();
        HashMap term145 = new HashMap();
        term134 = newInstance(Class.forName("com.amazonaws.datastreamvectorization.embedding.model.EmbeddingConfiguration$EmbeddingConfigurationBuilder"));
        setField(term134, term134.getClass(), "embeddingModel", null);
        setField(term134, term134.getClass(), "embeddingModelOverrideConfig", term135);
        setField(term134, term134.getClass(), "embeddingInputConfig", term145);
        setField(term134, term134.getClass(), "charset", "LQFpaHEwXR");
        term167 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.datastreamvectorization.embedding.model.EmbeddingConfiguration$EmbeddingConfigurationBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term167;
        callMethod(klass, "embeddingInputConfig", argTypes, term134, args);
    }

};


