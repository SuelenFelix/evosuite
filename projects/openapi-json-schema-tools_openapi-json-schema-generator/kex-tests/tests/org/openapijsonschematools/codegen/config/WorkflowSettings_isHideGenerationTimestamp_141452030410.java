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

public class WorkflowSettings_isHideGenerationTimestamp_141452030410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37923;

    public WorkflowSettings_isHideGenerationTimestamp_141452030410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term37985 = new HashMap();
        Boolean term37991 = new Boolean(true);
        Boolean term37993 = new Boolean(false);
        term37923 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings"));
        Object term37984 = newInstance(Class.forName("java.util.Collections$UnmodifiableMap"));
        setField(term37923, term37923.getClass(), "inputSpec", "IlBhdrCvHq");
        setField(term37923, term37923.getClass(), "outputDir", ".");
        setBooleanField(term37923, term37923.getClass(), "verbose", false);
        setBooleanField(term37923, term37923.getClass(), "skipOverwrite", false);
        setBooleanField(term37923, term37923.getClass(), "removeOperationIdPrefix", true);
        setBooleanField(term37923, term37923.getClass(), "skipOperationExample", true);
        setBooleanField(term37923, term37923.getClass(), "logToStderr", true);
        setBooleanField(term37923, term37923.getClass(), "validateSpec", true);
        setBooleanField(term37923, term37923.getClass(), "enablePostProcessFile", true);
        setBooleanField(term37923, term37923.getClass(), "enableMinimalUpdate", false);
        setBooleanField(term37923, term37923.getClass(), "strictSpecBehavior", true);
        setField(term37923, term37923.getClass(), "templateDir", "OirVUQhauU");
        setField(term37923, term37923.getClass(), "templatingEngineName", "handlebars");
        setField(term37923, term37923.getClass(), "ignoreFileOverride", "GLbyDfbNZI");
        setField(term37984, term37984.getClass(), "m", term37985);
        setField(term37984, term37984.getClass(), "keySet", null);
        setField(term37984, term37984.getClass(), "entrySet", null);
        setField(term37984, term37984.getClass(), "values", null);
        setField(term37923, term37923.getClass(), "globalProperties", term37984);
        setBooleanField(term37923, term37923.getClass(), "removeEnumValuePrefix", false);
        setField(term37923, term37923.getClass(), "hideGenerationTimestamp", term37991);
        setField(term37923, term37923.getClass(), "intsAllowedForFloatDoubleFormats", term37993);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isHideGenerationTimestamp", argTypes, term37923, args);
    }

};


