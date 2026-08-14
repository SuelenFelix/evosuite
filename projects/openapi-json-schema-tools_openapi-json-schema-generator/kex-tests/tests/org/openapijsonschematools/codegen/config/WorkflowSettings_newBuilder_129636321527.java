package org.openapijsonschematools.codegen.config;

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
import static org.openapijsonschematools.codegen.config.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class WorkflowSettings_newBuilder_129636321527 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39619;

    public WorkflowSettings_newBuilder_129636321527() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39619 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings"));
        setField(term39619, term39619.getClass(), "inputSpec", null);
        setField(term39619, term39619.getClass(), "outputDir", null);
        setBooleanField(term39619, term39619.getClass(), "verbose", false);
        setBooleanField(term39619, term39619.getClass(), "skipOverwrite", false);
        setBooleanField(term39619, term39619.getClass(), "removeOperationIdPrefix", false);
        setBooleanField(term39619, term39619.getClass(), "skipOperationExample", false);
        setBooleanField(term39619, term39619.getClass(), "logToStderr", false);
        setBooleanField(term39619, term39619.getClass(), "validateSpec", false);
        setBooleanField(term39619, term39619.getClass(), "enablePostProcessFile", false);
        setBooleanField(term39619, term39619.getClass(), "enableMinimalUpdate", false);
        setBooleanField(term39619, term39619.getClass(), "strictSpecBehavior", false);
        setField(term39619, term39619.getClass(), "templateDir", null);
        setField(term39619, term39619.getClass(), "templatingEngineName", null);
        setField(term39619, term39619.getClass(), "ignoreFileOverride", null);
        setField(term39619, term39619.getClass(), "globalProperties", null);
        setBooleanField(term39619, term39619.getClass(), "removeEnumValuePrefix", false);
        setField(term39619, term39619.getClass(), "hideGenerationTimestamp", null);
        setField(term39619, term39619.getClass(), "intsAllowedForFloatDoubleFormats", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "newBuilder", argTypes, term39619, args);
    }

};


