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

public class EmbeddingConfiguration_setEmbeddingModelOverrideConfig_121499529415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4446;
     Object term4479;

    public EmbeddingConfiguration_setEmbeddingModelOverrideConfig_121499529415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4447 = new HashMap();
        HashMap term4457 = new HashMap();
        term4446 = newInstance(Class.forName("com.amazonaws.datastreamvectorization.embedding.model.EmbeddingConfiguration"));
        setField(term4446, term4446.getClass(), "embeddingModel", null);
        setField(term4446, term4446.getClass(), "embeddingModelOverrideConfig", term4447);
        setField(term4446, term4446.getClass(), "embeddingInputConfig", term4457);
        setField(term4446, term4446.getClass(), "charset", "VeDtgDzGAN");
        term4479 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.datastreamvectorization.embedding.model.EmbeddingConfiguration");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term4479;
        callMethod(klass, "setEmbeddingModelOverrideConfig", argTypes, term4446, args);
    }

};


