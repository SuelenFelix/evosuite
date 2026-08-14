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

public class WorkflowSettings_isSkipOverwrite_18847395527 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37584;

    public WorkflowSettings_isSkipOverwrite_18847395527() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term37646 = new HashMap();
        Boolean term37652 = new Boolean(true);
        Boolean term37654 = new Boolean(false);
        term37584 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings"));
        Object term37645 = newInstance(Class.forName("java.util.Collections$UnmodifiableMap"));
        setField(term37584, term37584.getClass(), "inputSpec", "FiYYLuailz");
        setField(term37584, term37584.getClass(), "outputDir", ".");
        setBooleanField(term37584, term37584.getClass(), "verbose", false);
        setBooleanField(term37584, term37584.getClass(), "skipOverwrite", false);
        setBooleanField(term37584, term37584.getClass(), "removeOperationIdPrefix", true);
        setBooleanField(term37584, term37584.getClass(), "skipOperationExample", false);
        setBooleanField(term37584, term37584.getClass(), "logToStderr", true);
        setBooleanField(term37584, term37584.getClass(), "validateSpec", true);
        setBooleanField(term37584, term37584.getClass(), "enablePostProcessFile", false);
        setBooleanField(term37584, term37584.getClass(), "enableMinimalUpdate", true);
        setBooleanField(term37584, term37584.getClass(), "strictSpecBehavior", true);
        setField(term37584, term37584.getClass(), "templateDir", "XebAeSnCKZ");
        setField(term37584, term37584.getClass(), "templatingEngineName", "handlebars");
        setField(term37584, term37584.getClass(), "ignoreFileOverride", "GeddnXjHGy");
        setField(term37645, term37645.getClass(), "m", term37646);
        setField(term37645, term37645.getClass(), "keySet", null);
        setField(term37645, term37645.getClass(), "entrySet", null);
        setField(term37645, term37645.getClass(), "values", null);
        setField(term37584, term37584.getClass(), "globalProperties", term37645);
        setBooleanField(term37584, term37584.getClass(), "removeEnumValuePrefix", true);
        setField(term37584, term37584.getClass(), "hideGenerationTimestamp", term37652);
        setField(term37584, term37584.getClass(), "intsAllowedForFloatDoubleFormats", term37654);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isSkipOverwrite", argTypes, term37584, args);
    }

};


