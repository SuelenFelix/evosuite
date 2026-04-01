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
import java.lang.Object;
import java.util.HashMap;
import java.lang.Boolean;

public class WorkflowSettings_newBuilder_18731390903 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37132;

    public WorkflowSettings_newBuilder_18731390903() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term37194 = new HashMap();
        Boolean term37200 = new Boolean(true);
        Boolean term37202 = new Boolean(false);
        term37132 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings"));
        Object term37193 = newInstance(Class.forName("java.util.Collections$UnmodifiableMap"));
        setField(term37132, term37132.getClass(), "inputSpec", "JWodNQzjjV");
        setField(term37132, term37132.getClass(), "outputDir", ".");
        setBooleanField(term37132, term37132.getClass(), "verbose", true);
        setBooleanField(term37132, term37132.getClass(), "skipOverwrite", false);
        setBooleanField(term37132, term37132.getClass(), "removeOperationIdPrefix", false);
        setBooleanField(term37132, term37132.getClass(), "skipOperationExample", true);
        setBooleanField(term37132, term37132.getClass(), "logToStderr", true);
        setBooleanField(term37132, term37132.getClass(), "validateSpec", true);
        setBooleanField(term37132, term37132.getClass(), "enablePostProcessFile", true);
        setBooleanField(term37132, term37132.getClass(), "enableMinimalUpdate", false);
        setBooleanField(term37132, term37132.getClass(), "strictSpecBehavior", true);
        setField(term37132, term37132.getClass(), "templateDir", "CAgxWjhxNf");
        setField(term37132, term37132.getClass(), "templatingEngineName", "handlebars");
        setField(term37132, term37132.getClass(), "ignoreFileOverride", "goAoCMhKBu");
        setField(term37193, term37193.getClass(), "m", term37194);
        setField(term37193, term37193.getClass(), "keySet", null);
        setField(term37193, term37193.getClass(), "entrySet", null);
        setField(term37193, term37193.getClass(), "values", null);
        setField(term37132, term37132.getClass(), "globalProperties", term37193);
        setBooleanField(term37132, term37132.getClass(), "removeEnumValuePrefix", true);
        setField(term37132, term37132.getClass(), "hideGenerationTimestamp", term37200);
        setField(term37132, term37132.getClass(), "intsAllowedForFloatDoubleFormats", term37202);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings");
        Object[] args = new Object[1];
        args[0] = term37132;
        callMethod(klass, "newBuilder", argTypes, null, args);
    }

};


