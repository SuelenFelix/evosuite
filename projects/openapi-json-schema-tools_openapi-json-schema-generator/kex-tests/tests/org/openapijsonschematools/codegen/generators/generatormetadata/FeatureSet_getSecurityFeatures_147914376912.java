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

public class FeatureSet_getSecurityFeatures_147914376912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2549107;

    public FeatureSet_getSecurityFeatures_147914376912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2549107 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.generatormetadata.FeatureSet"));
        setField(term2549107, term2549107.getClass(), "clientModificationFeatures", null);
        setField(term2549107, term2549107.getClass(), "dataTypeFeatures", null);
        setField(term2549107, term2549107.getClass(), "componentsFeatures", null);
        setField(term2549107, term2549107.getClass(), "documentationFeatures", null);
        setField(term2549107, term2549107.getClass(), "globalFeatures", null);
        setField(term2549107, term2549107.getClass(), "schemaFeatures", null);
        setField(term2549107, term2549107.getClass(), "parameterFeatures", null);
        setField(term2549107, term2549107.getClass(), "securityFeatures", null);
        setField(term2549107, term2549107.getClass(), "operationFeatures", null);
        setField(term2549107, term2549107.getClass(), "wireFormatFeatures", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generators.generatormetadata.FeatureSet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSecurityFeatures", argTypes, term2549107, args);
    }

};


