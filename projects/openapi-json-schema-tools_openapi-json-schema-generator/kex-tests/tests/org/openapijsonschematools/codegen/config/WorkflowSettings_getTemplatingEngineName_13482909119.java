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

public class WorkflowSettings_getTemplatingEngineName_13482909119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38940;

    public WorkflowSettings_getTemplatingEngineName_13482909119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term39002 = new HashMap();
        Boolean term39008 = new Boolean(true);
        Boolean term39010 = new Boolean(false);
        term38940 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings"));
        Object term39001 = newInstance(Class.forName("java.util.Collections$UnmodifiableMap"));
        setField(term38940, term38940.getClass(), "inputSpec", "DGRqjjdhzy");
        setField(term38940, term38940.getClass(), "outputDir", ".");
        setBooleanField(term38940, term38940.getClass(), "verbose", true);
        setBooleanField(term38940, term38940.getClass(), "skipOverwrite", false);
        setBooleanField(term38940, term38940.getClass(), "removeOperationIdPrefix", false);
        setBooleanField(term38940, term38940.getClass(), "skipOperationExample", true);
        setBooleanField(term38940, term38940.getClass(), "logToStderr", true);
        setBooleanField(term38940, term38940.getClass(), "validateSpec", true);
        setBooleanField(term38940, term38940.getClass(), "enablePostProcessFile", true);
        setBooleanField(term38940, term38940.getClass(), "enableMinimalUpdate", false);
        setBooleanField(term38940, term38940.getClass(), "strictSpecBehavior", true);
        setField(term38940, term38940.getClass(), "templateDir", "lQFkjJUPAR");
        setField(term38940, term38940.getClass(), "templatingEngineName", "handlebars");
        setField(term38940, term38940.getClass(), "ignoreFileOverride", "BsuVlGUUjV");
        setField(term39001, term39001.getClass(), "m", term39002);
        setField(term39001, term39001.getClass(), "keySet", null);
        setField(term39001, term39001.getClass(), "entrySet", null);
        setField(term39001, term39001.getClass(), "values", null);
        setField(term38940, term38940.getClass(), "globalProperties", term39001);
        setBooleanField(term38940, term38940.getClass(), "removeEnumValuePrefix", true);
        setField(term38940, term38940.getClass(), "hideGenerationTimestamp", term39008);
        setField(term38940, term38940.getClass(), "intsAllowedForFloatDoubleFormats", term39010);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTemplatingEngineName", argTypes, term38940, args);
    }

};


