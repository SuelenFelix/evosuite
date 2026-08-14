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

public class WorkflowSettings_Builder_build_19478226241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33725;

    public WorkflowSettings_Builder_build_19478226241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33725 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings$Builder"));
        setField(term33725, term33725.getClass(), "inputSpec", null);
        setField(term33725, term33725.getClass(), "outputDir", null);
        setField(term33725, term33725.getClass(), "verbose", null);
        setField(term33725, term33725.getClass(), "skipOverwrite", null);
        setField(term33725, term33725.getClass(), "removeOperationIdPrefix", null);
        setField(term33725, term33725.getClass(), "removeEnumValuePrefix", null);
        setField(term33725, term33725.getClass(), "skipOperationExample", null);
        setField(term33725, term33725.getClass(), "logToStderr", null);
        setField(term33725, term33725.getClass(), "validateSpec", null);
        setField(term33725, term33725.getClass(), "enablePostProcessFile", null);
        setField(term33725, term33725.getClass(), "enableMinimalUpdate", null);
        setField(term33725, term33725.getClass(), "strictSpecBehavior", null);
        setField(term33725, term33725.getClass(), "templateDir", null);
        setField(term33725, term33725.getClass(), "templatingEngineName", null);
        setField(term33725, term33725.getClass(), "ignoreFileOverride", null);
        setField(term33725, term33725.getClass(), "hideGenerationTimestamp", null);
        setField(term33725, term33725.getClass(), "intsAllowedForFloatDoubleFormats", null);
        setField(term33725, term33725.getClass(), "globalProperties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings$Builder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term33725, args);
    }

};


