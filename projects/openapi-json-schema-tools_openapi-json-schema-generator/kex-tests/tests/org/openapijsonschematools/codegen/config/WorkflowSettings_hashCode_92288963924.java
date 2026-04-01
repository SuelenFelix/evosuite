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

public class WorkflowSettings_hashCode_92288963924 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39506;

    public WorkflowSettings_hashCode_92288963924() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term39568 = new HashMap();
        Boolean term39574 = new Boolean(true);
        Boolean term39576 = new Boolean(false);
        term39506 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings"));
        Object term39567 = newInstance(Class.forName("java.util.Collections$UnmodifiableMap"));
        setField(term39506, term39506.getClass(), "inputSpec", "zHvfKaOstO");
        setField(term39506, term39506.getClass(), "outputDir", ".");
        setBooleanField(term39506, term39506.getClass(), "verbose", false);
        setBooleanField(term39506, term39506.getClass(), "skipOverwrite", false);
        setBooleanField(term39506, term39506.getClass(), "removeOperationIdPrefix", false);
        setBooleanField(term39506, term39506.getClass(), "skipOperationExample", false);
        setBooleanField(term39506, term39506.getClass(), "logToStderr", true);
        setBooleanField(term39506, term39506.getClass(), "validateSpec", true);
        setBooleanField(term39506, term39506.getClass(), "enablePostProcessFile", false);
        setBooleanField(term39506, term39506.getClass(), "enableMinimalUpdate", true);
        setBooleanField(term39506, term39506.getClass(), "strictSpecBehavior", true);
        setField(term39506, term39506.getClass(), "templateDir", "tOszriqETr");
        setField(term39506, term39506.getClass(), "templatingEngineName", "handlebars");
        setField(term39506, term39506.getClass(), "ignoreFileOverride", "ncSPTkhKjO");
        setField(term39567, term39567.getClass(), "m", term39568);
        setField(term39567, term39567.getClass(), "keySet", null);
        setField(term39567, term39567.getClass(), "entrySet", null);
        setField(term39567, term39567.getClass(), "values", null);
        setField(term39506, term39506.getClass(), "globalProperties", term39567);
        setBooleanField(term39506, term39506.getClass(), "removeEnumValuePrefix", false);
        setField(term39506, term39506.getClass(), "hideGenerationTimestamp", term39574);
        setField(term39506, term39506.getClass(), "intsAllowedForFloatDoubleFormats", term39576);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term39506, args);
    }

};


