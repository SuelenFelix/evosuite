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

public class WorkflowSettings_isVerbose_183519543431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39663;

    public WorkflowSettings_isVerbose_183519543431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39663 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings"));
        setField(term39663, term39663.getClass(), "inputSpec", null);
        setField(term39663, term39663.getClass(), "outputDir", null);
        setBooleanField(term39663, term39663.getClass(), "verbose", false);
        setBooleanField(term39663, term39663.getClass(), "skipOverwrite", false);
        setBooleanField(term39663, term39663.getClass(), "removeOperationIdPrefix", false);
        setBooleanField(term39663, term39663.getClass(), "skipOperationExample", false);
        setBooleanField(term39663, term39663.getClass(), "logToStderr", false);
        setBooleanField(term39663, term39663.getClass(), "validateSpec", false);
        setBooleanField(term39663, term39663.getClass(), "enablePostProcessFile", false);
        setBooleanField(term39663, term39663.getClass(), "enableMinimalUpdate", false);
        setBooleanField(term39663, term39663.getClass(), "strictSpecBehavior", false);
        setField(term39663, term39663.getClass(), "templateDir", null);
        setField(term39663, term39663.getClass(), "templatingEngineName", null);
        setField(term39663, term39663.getClass(), "ignoreFileOverride", null);
        setField(term39663, term39663.getClass(), "globalProperties", null);
        setBooleanField(term39663, term39663.getClass(), "removeEnumValuePrefix", false);
        setField(term39663, term39663.getClass(), "hideGenerationTimestamp", null);
        setField(term39663, term39663.getClass(), "intsAllowedForFloatDoubleFormats", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isVerbose", argTypes, term39663, args);
    }

};


