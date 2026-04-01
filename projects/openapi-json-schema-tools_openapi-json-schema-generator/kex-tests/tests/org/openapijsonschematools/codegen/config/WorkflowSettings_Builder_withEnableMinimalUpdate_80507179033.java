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

public class WorkflowSettings_Builder_withEnableMinimalUpdate_80507179033 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33715;

    public WorkflowSettings_Builder_withEnableMinimalUpdate_80507179033() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33715 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings$Builder"));
        setField(term33715, term33715.getClass(), "inputSpec", null);
        setField(term33715, term33715.getClass(), "outputDir", null);
        setField(term33715, term33715.getClass(), "verbose", null);
        setField(term33715, term33715.getClass(), "skipOverwrite", null);
        setField(term33715, term33715.getClass(), "removeOperationIdPrefix", null);
        setField(term33715, term33715.getClass(), "removeEnumValuePrefix", null);
        setField(term33715, term33715.getClass(), "skipOperationExample", null);
        setField(term33715, term33715.getClass(), "logToStderr", null);
        setField(term33715, term33715.getClass(), "validateSpec", null);
        setField(term33715, term33715.getClass(), "enablePostProcessFile", null);
        setField(term33715, term33715.getClass(), "enableMinimalUpdate", null);
        setField(term33715, term33715.getClass(), "strictSpecBehavior", null);
        setField(term33715, term33715.getClass(), "templateDir", null);
        setField(term33715, term33715.getClass(), "templatingEngineName", null);
        setField(term33715, term33715.getClass(), "ignoreFileOverride", null);
        setField(term33715, term33715.getClass(), "hideGenerationTimestamp", null);
        setField(term33715, term33715.getClass(), "intsAllowedForFloatDoubleFormats", null);
        setField(term33715, term33715.getClass(), "globalProperties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "withEnableMinimalUpdate", argTypes, term33715, args);
    }

};


