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

public class FeatureSet_Builder_includeDocumentationFeatures_202121508839 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1444234;

    public FeatureSet_Builder_includeDocumentationFeatures_202121508839() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1444234 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.generatormetadata.FeatureSet$Builder"));
        setField(term1444234, term1444234.getClass(), "clientModificationFeatures", null);
        setField(term1444234, term1444234.getClass(), "dataTypeFeatures", null);
        setField(term1444234, term1444234.getClass(), "documentationFeatures", null);
        setField(term1444234, term1444234.getClass(), "schemaFeatures", null);
        setField(term1444234, term1444234.getClass(), "componentsFeatures", null);
        setField(term1444234, term1444234.getClass(), "globalFeatures", null);
        setField(term1444234, term1444234.getClass(), "parameterFeatures", null);
        setField(term1444234, term1444234.getClass(), "securityFeatures", null);
        setField(term1444234, term1444234.getClass(), "wireFormatFeatures", null);
        setField(term1444234, term1444234.getClass(), "operationFeatures", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generators.generatormetadata.FeatureSet$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("org.openapijsonschematools.codegen.generators.generatormetadata.features.DocumentationFeature"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "includeDocumentationFeatures", argTypes, term1444234, args);
    }

};


