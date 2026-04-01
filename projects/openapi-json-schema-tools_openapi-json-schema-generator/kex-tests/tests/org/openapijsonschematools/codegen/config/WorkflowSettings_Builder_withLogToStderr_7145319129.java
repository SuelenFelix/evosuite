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
import java.util.HashMap;

public class WorkflowSettings_Builder_withLogToStderr_7145319129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32059;
     Object term32140;

    public WorkflowSettings_Builder_withLogToStderr_7145319129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term32075 = new Boolean(false);
        Boolean term32077 = new Boolean(false);
        Boolean term32079 = new Boolean(false);
        Boolean term32081 = new Boolean(false);
        Boolean term32083 = new Boolean(false);
        Boolean term32085 = new Boolean(false);
        Boolean term32087 = new Boolean(true);
        Boolean term32089 = new Boolean(false);
        Boolean term32091 = new Boolean(false);
        Boolean term32093 = new Boolean(true);
        Boolean term32131 = new Boolean(true);
        Boolean term32133 = new Boolean(false);
        HashMap term32135 = new HashMap();
        term32059 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings$Builder"));
        setField(term32059, term32059.getClass(), "inputSpec", "cSHGbqKqlN");
        setField(term32059, term32059.getClass(), "outputDir", ".");
        setField(term32059, term32059.getClass(), "verbose", term32075);
        setField(term32059, term32059.getClass(), "skipOverwrite", term32077);
        setField(term32059, term32059.getClass(), "removeOperationIdPrefix", term32079);
        setField(term32059, term32059.getClass(), "removeEnumValuePrefix", term32081);
        setField(term32059, term32059.getClass(), "skipOperationExample", term32083);
        setField(term32059, term32059.getClass(), "logToStderr", term32085);
        setField(term32059, term32059.getClass(), "validateSpec", term32087);
        setField(term32059, term32059.getClass(), "enablePostProcessFile", term32089);
        setField(term32059, term32059.getClass(), "enableMinimalUpdate", term32091);
        setField(term32059, term32059.getClass(), "strictSpecBehavior", term32093);
        setField(term32059, term32059.getClass(), "templateDir", "pFAfANnxup");
        setField(term32059, term32059.getClass(), "templatingEngineName", "handlebars");
        setField(term32059, term32059.getClass(), "ignoreFileOverride", "FbSIUZyBXZ");
        setField(term32059, term32059.getClass(), "hideGenerationTimestamp", term32131);
        setField(term32059, term32059.getClass(), "intsAllowedForFloatDoubleFormats", term32133);
        setField(term32059, term32059.getClass(), "globalProperties", term32135);
        term32140 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term32140;
        callMethod(klass, "withLogToStderr", argTypes, term32059, args);
    }

};


