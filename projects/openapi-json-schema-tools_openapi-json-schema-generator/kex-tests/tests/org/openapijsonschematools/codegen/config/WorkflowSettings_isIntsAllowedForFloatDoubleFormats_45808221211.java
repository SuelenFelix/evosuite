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

public class WorkflowSettings_isIntsAllowedForFloatDoubleFormats_45808221211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38036;

    public WorkflowSettings_isIntsAllowedForFloatDoubleFormats_45808221211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term38098 = new HashMap();
        Boolean term38104 = new Boolean(true);
        Boolean term38106 = new Boolean(false);
        term38036 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings"));
        Object term38097 = newInstance(Class.forName("java.util.Collections$UnmodifiableMap"));
        setField(term38036, term38036.getClass(), "inputSpec", "oNLcCYDAsO");
        setField(term38036, term38036.getClass(), "outputDir", ".");
        setBooleanField(term38036, term38036.getClass(), "verbose", true);
        setBooleanField(term38036, term38036.getClass(), "skipOverwrite", true);
        setBooleanField(term38036, term38036.getClass(), "removeOperationIdPrefix", false);
        setBooleanField(term38036, term38036.getClass(), "skipOperationExample", false);
        setBooleanField(term38036, term38036.getClass(), "logToStderr", true);
        setBooleanField(term38036, term38036.getClass(), "validateSpec", true);
        setBooleanField(term38036, term38036.getClass(), "enablePostProcessFile", false);
        setBooleanField(term38036, term38036.getClass(), "enableMinimalUpdate", false);
        setBooleanField(term38036, term38036.getClass(), "strictSpecBehavior", true);
        setField(term38036, term38036.getClass(), "templateDir", "CNqMxLvtcJ");
        setField(term38036, term38036.getClass(), "templatingEngineName", "handlebars");
        setField(term38036, term38036.getClass(), "ignoreFileOverride", "ktbqerIaKW");
        setField(term38097, term38097.getClass(), "m", term38098);
        setField(term38097, term38097.getClass(), "keySet", null);
        setField(term38097, term38097.getClass(), "entrySet", null);
        setField(term38097, term38097.getClass(), "values", null);
        setField(term38036, term38036.getClass(), "globalProperties", term38097);
        setBooleanField(term38036, term38036.getClass(), "removeEnumValuePrefix", true);
        setField(term38036, term38036.getClass(), "hideGenerationTimestamp", term38104);
        setField(term38036, term38036.getClass(), "intsAllowedForFloatDoubleFormats", term38106);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isIntsAllowedForFloatDoubleFormats", argTypes, term38036, args);
    }

};


