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

public class EmbeddingConfiguration_EmbeddingConfigurationBuilder_embeddingModelOverrideConfig_6748663632 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44;
     Object term77;

    public EmbeddingConfiguration_EmbeddingConfigurationBuilder_embeddingModelOverrideConfig_6748663632() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term45 = new HashMap();
        HashMap term55 = new HashMap();
        term44 = newInstance(Class.forName("com.amazonaws.datastreamvectorization.embedding.model.EmbeddingConfiguration$EmbeddingConfigurationBuilder"));
        setField(term44, term44.getClass(), "embeddingModel", null);
        setField(term44, term44.getClass(), "embeddingModelOverrideConfig", term45);
        setField(term44, term44.getClass(), "embeddingInputConfig", term55);
        setField(term44, term44.getClass(), "charset", "EGtDIRbSSb");
        term77 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.datastreamvectorization.embedding.model.EmbeddingConfiguration$EmbeddingConfigurationBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term77;
        callMethod(klass, "embeddingModelOverrideConfig", argTypes, term44, args);
    }

};


