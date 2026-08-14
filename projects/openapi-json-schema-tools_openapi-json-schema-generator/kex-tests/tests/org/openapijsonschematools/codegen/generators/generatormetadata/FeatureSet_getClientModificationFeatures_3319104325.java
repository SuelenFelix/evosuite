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

public class FeatureSet_getClientModificationFeatures_3319104325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2549100;

    public FeatureSet_getClientModificationFeatures_3319104325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2549100 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.generatormetadata.FeatureSet"));
        setField(term2549100, term2549100.getClass(), "clientModificationFeatures", null);
        setField(term2549100, term2549100.getClass(), "dataTypeFeatures", null);
        setField(term2549100, term2549100.getClass(), "componentsFeatures", null);
        setField(term2549100, term2549100.getClass(), "documentationFeatures", null);
        setField(term2549100, term2549100.getClass(), "globalFeatures", null);
        setField(term2549100, term2549100.getClass(), "schemaFeatures", null);
        setField(term2549100, term2549100.getClass(), "parameterFeatures", null);
        setField(term2549100, term2549100.getClass(), "securityFeatures", null);
        setField(term2549100, term2549100.getClass(), "operationFeatures", null);
        setField(term2549100, term2549100.getClass(), "wireFormatFeatures", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generators.generatormetadata.FeatureSet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getClientModificationFeatures", argTypes, term2549100, args);
    }

};


