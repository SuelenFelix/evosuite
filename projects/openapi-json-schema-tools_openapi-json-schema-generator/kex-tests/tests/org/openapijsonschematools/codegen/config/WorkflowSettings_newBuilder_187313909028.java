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

public class WorkflowSettings_newBuilder_187313909028 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39630;

    public WorkflowSettings_newBuilder_187313909028() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39630 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings"));
        setField(term39630, term39630.getClass(), "inputSpec", null);
        setField(term39630, term39630.getClass(), "outputDir", null);
        setBooleanField(term39630, term39630.getClass(), "verbose", false);
        setBooleanField(term39630, term39630.getClass(), "skipOverwrite", false);
        setBooleanField(term39630, term39630.getClass(), "removeOperationIdPrefix", false);
        setBooleanField(term39630, term39630.getClass(), "skipOperationExample", false);
        setBooleanField(term39630, term39630.getClass(), "logToStderr", false);
        setBooleanField(term39630, term39630.getClass(), "validateSpec", false);
        setBooleanField(term39630, term39630.getClass(), "enablePostProcessFile", false);
        setBooleanField(term39630, term39630.getClass(), "enableMinimalUpdate", false);
        setBooleanField(term39630, term39630.getClass(), "strictSpecBehavior", false);
        setField(term39630, term39630.getClass(), "templateDir", null);
        setField(term39630, term39630.getClass(), "templatingEngineName", null);
        setField(term39630, term39630.getClass(), "ignoreFileOverride", null);
        setField(term39630, term39630.getClass(), "globalProperties", null);
        setBooleanField(term39630, term39630.getClass(), "removeEnumValuePrefix", false);
        setField(term39630, term39630.getClass(), "hideGenerationTimestamp", null);
        setField(term39630, term39630.getClass(), "intsAllowedForFloatDoubleFormats", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "newBuilder", argTypes, term39630, args);
    }

};


