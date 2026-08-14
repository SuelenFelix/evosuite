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

public class FeatureSet_Builder_build_95050658253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1444248;

    public FeatureSet_Builder_build_95050658253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1444248 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.generatormetadata.FeatureSet$Builder"));
        setField(term1444248, term1444248.getClass(), "clientModificationFeatures", null);
        setField(term1444248, term1444248.getClass(), "dataTypeFeatures", null);
        setField(term1444248, term1444248.getClass(), "documentationFeatures", null);
        setField(term1444248, term1444248.getClass(), "schemaFeatures", null);
        setField(term1444248, term1444248.getClass(), "componentsFeatures", null);
        setField(term1444248, term1444248.getClass(), "globalFeatures", null);
        setField(term1444248, term1444248.getClass(), "parameterFeatures", null);
        setField(term1444248, term1444248.getClass(), "securityFeatures", null);
        setField(term1444248, term1444248.getClass(), "wireFormatFeatures", null);
        setField(term1444248, term1444248.getClass(), "operationFeatures", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generators.generatormetadata.FeatureSet$Builder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term1444248, args);
    }

};


