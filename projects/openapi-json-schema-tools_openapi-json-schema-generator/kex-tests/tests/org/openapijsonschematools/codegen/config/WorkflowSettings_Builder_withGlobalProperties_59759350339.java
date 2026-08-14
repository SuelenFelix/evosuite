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

public class WorkflowSettings_Builder_withGlobalProperties_59759350339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33723;

    public WorkflowSettings_Builder_withGlobalProperties_59759350339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33723 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings$Builder"));
        setField(term33723, term33723.getClass(), "inputSpec", null);
        setField(term33723, term33723.getClass(), "outputDir", null);
        setField(term33723, term33723.getClass(), "verbose", null);
        setField(term33723, term33723.getClass(), "skipOverwrite", null);
        setField(term33723, term33723.getClass(), "removeOperationIdPrefix", null);
        setField(term33723, term33723.getClass(), "removeEnumValuePrefix", null);
        setField(term33723, term33723.getClass(), "skipOperationExample", null);
        setField(term33723, term33723.getClass(), "logToStderr", null);
        setField(term33723, term33723.getClass(), "validateSpec", null);
        setField(term33723, term33723.getClass(), "enablePostProcessFile", null);
        setField(term33723, term33723.getClass(), "enableMinimalUpdate", null);
        setField(term33723, term33723.getClass(), "strictSpecBehavior", null);
        setField(term33723, term33723.getClass(), "templateDir", null);
        setField(term33723, term33723.getClass(), "templatingEngineName", null);
        setField(term33723, term33723.getClass(), "ignoreFileOverride", null);
        setField(term33723, term33723.getClass(), "hideGenerationTimestamp", null);
        setField(term33723, term33723.getClass(), "intsAllowedForFloatDoubleFormats", null);
        setField(term33723, term33723.getClass(), "globalProperties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "withGlobalProperties", argTypes, term33723, args);
    }

};


