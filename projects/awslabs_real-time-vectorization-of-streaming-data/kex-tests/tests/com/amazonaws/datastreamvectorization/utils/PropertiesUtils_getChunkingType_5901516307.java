package com.amazonaws.datastreamvectorization.utils;

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
import static com.amazonaws.datastreamvectorization.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;

public class PropertiesUtils_getChunkingType_5901516307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term316;

    public PropertiesUtils_getChunkingType_5901516307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term317 = new HashMap();
        HashMap term327 = new HashMap();
        term316 = newInstance(Class.forName("com.amazonaws.datastreamvectorization.embedding.model.EmbeddingConfiguration"));
        setField(term316, term316.getClass(), "embeddingModel", null);
        setField(term316, term316.getClass(), "embeddingModelOverrideConfig", term317);
        setField(term316, term316.getClass(), "embeddingInputConfig", term327);
        setField(term316, term316.getClass(), "charset", "MxlszYVzRf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.datastreamvectorization.utils.PropertiesUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.amazonaws.datastreamvectorization.embedding.model.EmbeddingConfiguration");
        Object[] args = new Object[1];
        args[0] = term316;
        callMethod(klass, "getChunkingType", argTypes, null, args);
    }

};


