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

public class FeatureSet_getOperationFeatures_43623895619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2549113;

    public FeatureSet_getOperationFeatures_43623895619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2549113 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.generatormetadata.FeatureSet"));
        setField(term2549113, term2549113.getClass(), "clientModificationFeatures", null);
        setField(term2549113, term2549113.getClass(), "dataTypeFeatures", null);
        setField(term2549113, term2549113.getClass(), "componentsFeatures", null);
        setField(term2549113, term2549113.getClass(), "documentationFeatures", null);
        setField(term2549113, term2549113.getClass(), "globalFeatures", null);
        setField(term2549113, term2549113.getClass(), "schemaFeatures", null);
        setField(term2549113, term2549113.getClass(), "parameterFeatures", null);
        setField(term2549113, term2549113.getClass(), "securityFeatures", null);
        setField(term2549113, term2549113.getClass(), "operationFeatures", null);
        setField(term2549113, term2549113.getClass(), "wireFormatFeatures", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generators.generatormetadata.FeatureSet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOperationFeatures", argTypes, term2549113, args);
    }

};


