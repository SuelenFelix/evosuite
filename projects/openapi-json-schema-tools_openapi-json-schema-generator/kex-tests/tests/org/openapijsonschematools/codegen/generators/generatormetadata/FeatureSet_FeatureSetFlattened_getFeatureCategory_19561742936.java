package org.openapijsonschematools.codegen.generators.generatormetadata;

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
import static org.openapijsonschematools.codegen.generators.generatormetadata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class FeatureSet_FeatureSetFlattened_getFeatureCategory_19561742936 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2549324;

    public FeatureSet_FeatureSetFlattened_getFeatureCategory_19561742936() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2549324 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.generatormetadata.FeatureSet$FeatureSetFlattened"));
        setField(term2549324, term2549324.getClass(), "featureCategory", null);
        setField(term2549324, term2549324.getClass(), "featureName", null);
        setBooleanField(term2549324, term2549324.getClass(), "isSupported", false);
        setField(term2549324, term2549324.getClass(), "source", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generators.generatormetadata.FeatureSet$FeatureSetFlattened");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFeatureCategory", argTypes, term2549324, args);
    }

};


