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

public class WorkflowSettings_Builder_withSkipOperationExample_57208855529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33711;

    public WorkflowSettings_Builder_withSkipOperationExample_57208855529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33711 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings$Builder"));
        setField(term33711, term33711.getClass(), "inputSpec", null);
        setField(term33711, term33711.getClass(), "outputDir", null);
        setField(term33711, term33711.getClass(), "verbose", null);
        setField(term33711, term33711.getClass(), "skipOverwrite", null);
        setField(term33711, term33711.getClass(), "removeOperationIdPrefix", null);
        setField(term33711, term33711.getClass(), "removeEnumValuePrefix", null);
        setField(term33711, term33711.getClass(), "skipOperationExample", null);
        setField(term33711, term33711.getClass(), "logToStderr", null);
        setField(term33711, term33711.getClass(), "validateSpec", null);
        setField(term33711, term33711.getClass(), "enablePostProcessFile", null);
        setField(term33711, term33711.getClass(), "enableMinimalUpdate", null);
        setField(term33711, term33711.getClass(), "strictSpecBehavior", null);
        setField(term33711, term33711.getClass(), "templateDir", null);
        setField(term33711, term33711.getClass(), "templatingEngineName", null);
        setField(term33711, term33711.getClass(), "ignoreFileOverride", null);
        setField(term33711, term33711.getClass(), "hideGenerationTimestamp", null);
        setField(term33711, term33711.getClass(), "intsAllowedForFloatDoubleFormats", null);
        setField(term33711, term33711.getClass(), "globalProperties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "withSkipOperationExample", argTypes, term33711, args);
    }

};


