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

public class WorkflowSettings_Builder_withIgnoreFileOverride_116578204437 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33719;

    public WorkflowSettings_Builder_withIgnoreFileOverride_116578204437() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33719 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings$Builder"));
        setField(term33719, term33719.getClass(), "inputSpec", null);
        setField(term33719, term33719.getClass(), "outputDir", null);
        setField(term33719, term33719.getClass(), "verbose", null);
        setField(term33719, term33719.getClass(), "skipOverwrite", null);
        setField(term33719, term33719.getClass(), "removeOperationIdPrefix", null);
        setField(term33719, term33719.getClass(), "removeEnumValuePrefix", null);
        setField(term33719, term33719.getClass(), "skipOperationExample", null);
        setField(term33719, term33719.getClass(), "logToStderr", null);
        setField(term33719, term33719.getClass(), "validateSpec", null);
        setField(term33719, term33719.getClass(), "enablePostProcessFile", null);
        setField(term33719, term33719.getClass(), "enableMinimalUpdate", null);
        setField(term33719, term33719.getClass(), "strictSpecBehavior", null);
        setField(term33719, term33719.getClass(), "templateDir", null);
        setField(term33719, term33719.getClass(), "templatingEngineName", null);
        setField(term33719, term33719.getClass(), "ignoreFileOverride", null);
        setField(term33719, term33719.getClass(), "hideGenerationTimestamp", null);
        setField(term33719, term33719.getClass(), "intsAllowedForFloatDoubleFormats", null);
        setField(term33719, term33719.getClass(), "globalProperties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "withIgnoreFileOverride", argTypes, term33719, args);
    }

};


