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

public class WorkflowSettings_isEnablePostProcessFile_62716874040 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39762;

    public WorkflowSettings_isEnablePostProcessFile_62716874040() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39762 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings"));
        setField(term39762, term39762.getClass(), "inputSpec", null);
        setField(term39762, term39762.getClass(), "outputDir", null);
        setBooleanField(term39762, term39762.getClass(), "verbose", false);
        setBooleanField(term39762, term39762.getClass(), "skipOverwrite", false);
        setBooleanField(term39762, term39762.getClass(), "removeOperationIdPrefix", false);
        setBooleanField(term39762, term39762.getClass(), "skipOperationExample", false);
        setBooleanField(term39762, term39762.getClass(), "logToStderr", false);
        setBooleanField(term39762, term39762.getClass(), "validateSpec", false);
        setBooleanField(term39762, term39762.getClass(), "enablePostProcessFile", false);
        setBooleanField(term39762, term39762.getClass(), "enableMinimalUpdate", false);
        setBooleanField(term39762, term39762.getClass(), "strictSpecBehavior", false);
        setField(term39762, term39762.getClass(), "templateDir", null);
        setField(term39762, term39762.getClass(), "templatingEngineName", null);
        setField(term39762, term39762.getClass(), "ignoreFileOverride", null);
        setField(term39762, term39762.getClass(), "globalProperties", null);
        setBooleanField(term39762, term39762.getClass(), "removeEnumValuePrefix", false);
        setField(term39762, term39762.getClass(), "hideGenerationTimestamp", null);
        setField(term39762, term39762.getClass(), "intsAllowedForFloatDoubleFormats", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isEnablePostProcessFile", argTypes, term39762, args);
    }

};


