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

public class WorkflowSettings_getOutputDir_4035616075 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37358;

    public WorkflowSettings_getOutputDir_4035616075() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term37420 = new HashMap();
        Boolean term37426 = new Boolean(true);
        Boolean term37428 = new Boolean(false);
        term37358 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings"));
        Object term37419 = newInstance(Class.forName("java.util.Collections$UnmodifiableMap"));
        setField(term37358, term37358.getClass(), "inputSpec", "kVAmKknVln");
        setField(term37358, term37358.getClass(), "outputDir", ".");
        setBooleanField(term37358, term37358.getClass(), "verbose", true);
        setBooleanField(term37358, term37358.getClass(), "skipOverwrite", false);
        setBooleanField(term37358, term37358.getClass(), "removeOperationIdPrefix", false);
        setBooleanField(term37358, term37358.getClass(), "skipOperationExample", true);
        setBooleanField(term37358, term37358.getClass(), "logToStderr", true);
        setBooleanField(term37358, term37358.getClass(), "validateSpec", true);
        setBooleanField(term37358, term37358.getClass(), "enablePostProcessFile", true);
        setBooleanField(term37358, term37358.getClass(), "enableMinimalUpdate", false);
        setBooleanField(term37358, term37358.getClass(), "strictSpecBehavior", true);
        setField(term37358, term37358.getClass(), "templateDir", "MRFLbEGYKG");
        setField(term37358, term37358.getClass(), "templatingEngineName", "handlebars");
        setField(term37358, term37358.getClass(), "ignoreFileOverride", "BYrGukTyof");
        setField(term37419, term37419.getClass(), "m", term37420);
        setField(term37419, term37419.getClass(), "keySet", null);
        setField(term37419, term37419.getClass(), "entrySet", null);
        setField(term37419, term37419.getClass(), "values", null);
        setField(term37358, term37358.getClass(), "globalProperties", term37419);
        setBooleanField(term37358, term37358.getClass(), "removeEnumValuePrefix", true);
        setField(term37358, term37358.getClass(), "hideGenerationTimestamp", term37426);
        setField(term37358, term37358.getClass(), "intsAllowedForFloatDoubleFormats", term37428);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOutputDir", argTypes, term37358, args);
    }

};


