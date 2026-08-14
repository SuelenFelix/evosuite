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

public class EmbeddingConfiguration_validate_3793013283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3859;

    public EmbeddingConfiguration_validate_3793013283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3860 = new HashMap();
        HashMap term3870 = new HashMap();
        term3859 = newInstance(Class.forName("com.amazonaws.datastreamvectorization.embedding.model.EmbeddingConfiguration"));
        setField(term3859, term3859.getClass(), "embeddingModel", null);
        setField(term3859, term3859.getClass(), "embeddingModelOverrideConfig", term3860);
        setField(term3859, term3859.getClass(), "embeddingInputConfig", term3870);
        setField(term3859, term3859.getClass(), "charset", "iNwOJRBEjp");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.datastreamvectorization.embedding.model.EmbeddingConfiguration");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "validate", argTypes, term3859, args);
    }

};


