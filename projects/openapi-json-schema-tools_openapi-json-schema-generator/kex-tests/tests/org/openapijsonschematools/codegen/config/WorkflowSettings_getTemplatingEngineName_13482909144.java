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

public class WorkflowSettings_getTemplatingEngineName_13482909144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39806;

    public WorkflowSettings_getTemplatingEngineName_13482909144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39806 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings"));
        setField(term39806, term39806.getClass(), "inputSpec", null);
        setField(term39806, term39806.getClass(), "outputDir", null);
        setBooleanField(term39806, term39806.getClass(), "verbose", false);
        setBooleanField(term39806, term39806.getClass(), "skipOverwrite", false);
        setBooleanField(term39806, term39806.getClass(), "removeOperationIdPrefix", false);
        setBooleanField(term39806, term39806.getClass(), "skipOperationExample", false);
        setBooleanField(term39806, term39806.getClass(), "logToStderr", false);
        setBooleanField(term39806, term39806.getClass(), "validateSpec", false);
        setBooleanField(term39806, term39806.getClass(), "enablePostProcessFile", false);
        setBooleanField(term39806, term39806.getClass(), "enableMinimalUpdate", false);
        setBooleanField(term39806, term39806.getClass(), "strictSpecBehavior", false);
        setField(term39806, term39806.getClass(), "templateDir", null);
        setField(term39806, term39806.getClass(), "templatingEngineName", null);
        setField(term39806, term39806.getClass(), "ignoreFileOverride", null);
        setField(term39806, term39806.getClass(), "globalProperties", null);
        setBooleanField(term39806, term39806.getClass(), "removeEnumValuePrefix", false);
        setField(term39806, term39806.getClass(), "hideGenerationTimestamp", null);
        setField(term39806, term39806.getClass(), "intsAllowedForFloatDoubleFormats", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTemplatingEngineName", argTypes, term39806, args);
    }

};


