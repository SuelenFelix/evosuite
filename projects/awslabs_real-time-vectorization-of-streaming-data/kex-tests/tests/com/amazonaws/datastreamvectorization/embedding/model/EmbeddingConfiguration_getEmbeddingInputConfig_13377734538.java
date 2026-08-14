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

public class EmbeddingConfiguration_getEmbeddingInputConfig_13377734538 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4010;

    public EmbeddingConfiguration_getEmbeddingInputConfig_13377734538() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4011 = new HashMap();
        HashMap term4021 = new HashMap();
        term4010 = newInstance(Class.forName("com.amazonaws.datastreamvectorization.embedding.model.EmbeddingConfiguration"));
        setField(term4010, term4010.getClass(), "embeddingModel", null);
        setField(term4010, term4010.getClass(), "embeddingModelOverrideConfig", term4011);
        setField(term4010, term4010.getClass(), "embeddingInputConfig", term4021);
        setField(term4010, term4010.getClass(), "charset", "JDaAnsVTGV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.datastreamvectorization.embedding.model.EmbeddingConfiguration");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmbeddingInputConfig", argTypes, term4010, args);
    }

};


