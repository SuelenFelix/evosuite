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

public class WorkflowSettings_equals_47420296423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39392;
     Object term39464;

    public WorkflowSettings_equals_47420296423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term39454 = new HashMap();
        Boolean term39460 = new Boolean(true);
        Boolean term39462 = new Boolean(false);
        term39392 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings"));
        Object term39453 = newInstance(Class.forName("java.util.Collections$UnmodifiableMap"));
        setField(term39392, term39392.getClass(), "inputSpec", "TcuXODkzBV");
        setField(term39392, term39392.getClass(), "outputDir", ".");
        setBooleanField(term39392, term39392.getClass(), "verbose", false);
        setBooleanField(term39392, term39392.getClass(), "skipOverwrite", false);
        setBooleanField(term39392, term39392.getClass(), "removeOperationIdPrefix", false);
        setBooleanField(term39392, term39392.getClass(), "skipOperationExample", true);
        setBooleanField(term39392, term39392.getClass(), "logToStderr", true);
        setBooleanField(term39392, term39392.getClass(), "validateSpec", true);
        setBooleanField(term39392, term39392.getClass(), "enablePostProcessFile", false);
        setBooleanField(term39392, term39392.getClass(), "enableMinimalUpdate", true);
        setBooleanField(term39392, term39392.getClass(), "strictSpecBehavior", true);
        setField(term39392, term39392.getClass(), "templateDir", "coJPjrBZNe");
        setField(term39392, term39392.getClass(), "templatingEngineName", "handlebars");
        setField(term39392, term39392.getClass(), "ignoreFileOverride", "vMsWjuPTnO");
        setField(term39453, term39453.getClass(), "m", term39454);
        setField(term39453, term39453.getClass(), "keySet", null);
        setField(term39453, term39453.getClass(), "entrySet", null);
        setField(term39453, term39453.getClass(), "values", null);
        setField(term39392, term39392.getClass(), "globalProperties", term39453);
        setBooleanField(term39392, term39392.getClass(), "removeEnumValuePrefix", true);
        setField(term39392, term39392.getClass(), "hideGenerationTimestamp", term39460);
        setField(term39392, term39392.getClass(), "intsAllowedForFloatDoubleFormats", term39462);
        term39464 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term39464;
        callMethod(klass, "equals", argTypes, term39392, args);
    }

};


