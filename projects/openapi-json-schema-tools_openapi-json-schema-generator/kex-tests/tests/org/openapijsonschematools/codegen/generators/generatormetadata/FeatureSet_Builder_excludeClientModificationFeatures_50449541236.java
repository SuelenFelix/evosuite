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

public class FeatureSet_Builder_excludeClientModificationFeatures_50449541236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1444231;

    public FeatureSet_Builder_excludeClientModificationFeatures_50449541236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1444231 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.generatormetadata.FeatureSet$Builder"));
        setField(term1444231, term1444231.getClass(), "clientModificationFeatures", null);
        setField(term1444231, term1444231.getClass(), "dataTypeFeatures", null);
        setField(term1444231, term1444231.getClass(), "documentationFeatures", null);
        setField(term1444231, term1444231.getClass(), "schemaFeatures", null);
        setField(term1444231, term1444231.getClass(), "componentsFeatures", null);
        setField(term1444231, term1444231.getClass(), "globalFeatures", null);
        setField(term1444231, term1444231.getClass(), "parameterFeatures", null);
        setField(term1444231, term1444231.getClass(), "securityFeatures", null);
        setField(term1444231, term1444231.getClass(), "wireFormatFeatures", null);
        setField(term1444231, term1444231.getClass(), "operationFeatures", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generators.generatormetadata.FeatureSet$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("org.openapijsonschematools.codegen.generators.generatormetadata.features.ClientModificationFeature"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "excludeClientModificationFeatures", argTypes, term1444231, args);
    }

};


