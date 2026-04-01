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

public class WorkflowSettings_isLogToStderr_46986093913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38262;

    public WorkflowSettings_isLogToStderr_46986093913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term38324 = new HashMap();
        Boolean term38330 = new Boolean(true);
        Boolean term38332 = new Boolean(false);
        term38262 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings"));
        Object term38323 = newInstance(Class.forName("java.util.Collections$UnmodifiableMap"));
        setField(term38262, term38262.getClass(), "inputSpec", "HknsTajwxJ");
        setField(term38262, term38262.getClass(), "outputDir", ".");
        setBooleanField(term38262, term38262.getClass(), "verbose", true);
        setBooleanField(term38262, term38262.getClass(), "skipOverwrite", true);
        setBooleanField(term38262, term38262.getClass(), "removeOperationIdPrefix", false);
        setBooleanField(term38262, term38262.getClass(), "skipOperationExample", false);
        setBooleanField(term38262, term38262.getClass(), "logToStderr", false);
        setBooleanField(term38262, term38262.getClass(), "validateSpec", true);
        setBooleanField(term38262, term38262.getClass(), "enablePostProcessFile", false);
        setBooleanField(term38262, term38262.getClass(), "enableMinimalUpdate", false);
        setBooleanField(term38262, term38262.getClass(), "strictSpecBehavior", true);
        setField(term38262, term38262.getClass(), "templateDir", "XtiurrVYKw");
        setField(term38262, term38262.getClass(), "templatingEngineName", "handlebars");
        setField(term38262, term38262.getClass(), "ignoreFileOverride", "rsumfoDNHa");
        setField(term38323, term38323.getClass(), "m", term38324);
        setField(term38323, term38323.getClass(), "keySet", null);
        setField(term38323, term38323.getClass(), "entrySet", null);
        setField(term38323, term38323.getClass(), "values", null);
        setField(term38262, term38262.getClass(), "globalProperties", term38323);
        setBooleanField(term38262, term38262.getClass(), "removeEnumValuePrefix", false);
        setField(term38262, term38262.getClass(), "hideGenerationTimestamp", term38330);
        setField(term38262, term38262.getClass(), "intsAllowedForFloatDoubleFormats", term38332);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isLogToStderr", argTypes, term38262, args);
    }

};


