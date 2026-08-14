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
import java.lang.Boolean;

public class WorkflowSettings_Builder_withHideGenerationTimestamp_79455432738 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33720;
     Object term33721;

    public WorkflowSettings_Builder_withHideGenerationTimestamp_79455432738() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33720 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings$Builder"));
        setField(term33720, term33720.getClass(), "inputSpec", null);
        setField(term33720, term33720.getClass(), "outputDir", null);
        setField(term33720, term33720.getClass(), "verbose", null);
        setField(term33720, term33720.getClass(), "skipOverwrite", null);
        setField(term33720, term33720.getClass(), "removeOperationIdPrefix", null);
        setField(term33720, term33720.getClass(), "removeEnumValuePrefix", null);
        setField(term33720, term33720.getClass(), "skipOperationExample", null);
        setField(term33720, term33720.getClass(), "logToStderr", null);
        setField(term33720, term33720.getClass(), "validateSpec", null);
        setField(term33720, term33720.getClass(), "enablePostProcessFile", null);
        setField(term33720, term33720.getClass(), "enableMinimalUpdate", null);
        setField(term33720, term33720.getClass(), "strictSpecBehavior", null);
        setField(term33720, term33720.getClass(), "templateDir", null);
        setField(term33720, term33720.getClass(), "templatingEngineName", null);
        setField(term33720, term33720.getClass(), "ignoreFileOverride", null);
        setField(term33720, term33720.getClass(), "hideGenerationTimestamp", null);
        setField(term33720, term33720.getClass(), "intsAllowedForFloatDoubleFormats", null);
        setField(term33720, term33720.getClass(), "globalProperties", null);
        term33721 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term33721;
        callMethod(klass, "withHideGenerationTimestamp", argTypes, term33720, args);
    }

};


