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

public class WorkflowSettings_isVerbose_18351954346 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37471;

    public WorkflowSettings_isVerbose_18351954346() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term37533 = new HashMap();
        Boolean term37539 = new Boolean(true);
        Boolean term37541 = new Boolean(false);
        term37471 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings"));
        Object term37532 = newInstance(Class.forName("java.util.Collections$UnmodifiableMap"));
        setField(term37471, term37471.getClass(), "inputSpec", "jiCGTTzKGB");
        setField(term37471, term37471.getClass(), "outputDir", ".");
        setBooleanField(term37471, term37471.getClass(), "verbose", true);
        setBooleanField(term37471, term37471.getClass(), "skipOverwrite", true);
        setBooleanField(term37471, term37471.getClass(), "removeOperationIdPrefix", false);
        setBooleanField(term37471, term37471.getClass(), "skipOperationExample", false);
        setBooleanField(term37471, term37471.getClass(), "logToStderr", false);
        setBooleanField(term37471, term37471.getClass(), "validateSpec", true);
        setBooleanField(term37471, term37471.getClass(), "enablePostProcessFile", true);
        setBooleanField(term37471, term37471.getClass(), "enableMinimalUpdate", false);
        setBooleanField(term37471, term37471.getClass(), "strictSpecBehavior", true);
        setField(term37471, term37471.getClass(), "templateDir", "MqICFYzDJj");
        setField(term37471, term37471.getClass(), "templatingEngineName", "handlebars");
        setField(term37471, term37471.getClass(), "ignoreFileOverride", "YgQvdcBQKw");
        setField(term37532, term37532.getClass(), "m", term37533);
        setField(term37532, term37532.getClass(), "keySet", null);
        setField(term37532, term37532.getClass(), "entrySet", null);
        setField(term37532, term37532.getClass(), "values", null);
        setField(term37471, term37471.getClass(), "globalProperties", term37532);
        setBooleanField(term37471, term37471.getClass(), "removeEnumValuePrefix", false);
        setField(term37471, term37471.getClass(), "hideGenerationTimestamp", term37539);
        setField(term37471, term37471.getClass(), "intsAllowedForFloatDoubleFormats", term37541);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isVerbose", argTypes, term37471, args);
    }

};


