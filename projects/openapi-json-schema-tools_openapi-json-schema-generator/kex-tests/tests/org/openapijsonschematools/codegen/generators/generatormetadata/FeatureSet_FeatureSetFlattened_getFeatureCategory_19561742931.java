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
import java.util.ArrayList;

public class FeatureSet_FeatureSetFlattened_getFeatureCategory_19561742931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2549124;

    public FeatureSet_FeatureSetFlattened_getFeatureCategory_19561742931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2549150 = new ArrayList();
        term2549124 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.generatormetadata.FeatureSet$FeatureSetFlattened"));
        setField(term2549124, term2549124.getClass(), "featureCategory", "wgRGBNrTGP");
        setField(term2549124, term2549124.getClass(), "featureName", "FIdNVptZpW");
        setBooleanField(term2549124, term2549124.getClass(), "isSupported", false);
        setField(term2549124, term2549124.getClass(), "source", term2549150);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generators.generatormetadata.FeatureSet$FeatureSetFlattened");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFeatureCategory", argTypes, term2549124, args);
    }

};


