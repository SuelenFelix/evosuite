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

public class EmbeddingConfiguration_getCharset_8512072639 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4053;

    public EmbeddingConfiguration_getCharset_8512072639() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4054 = new HashMap();
        HashMap term4064 = new HashMap();
        term4053 = newInstance(Class.forName("com.amazonaws.datastreamvectorization.embedding.model.EmbeddingConfiguration"));
        setField(term4053, term4053.getClass(), "embeddingModel", null);
        setField(term4053, term4053.getClass(), "embeddingModelOverrideConfig", term4054);
        setField(term4053, term4053.getClass(), "embeddingInputConfig", term4064);
        setField(term4053, term4053.getClass(), "charset", "SdCKLMIYnX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.datastreamvectorization.embedding.model.EmbeddingConfiguration");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCharset", argTypes, term4053, args);
    }

};


