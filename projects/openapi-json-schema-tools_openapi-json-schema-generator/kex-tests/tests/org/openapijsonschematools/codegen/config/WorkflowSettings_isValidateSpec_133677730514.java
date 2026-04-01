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

public class WorkflowSettings_isValidateSpec_133677730514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38375;

    public WorkflowSettings_isValidateSpec_133677730514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term38437 = new HashMap();
        Boolean term38443 = new Boolean(true);
        Boolean term38445 = new Boolean(false);
        term38375 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings"));
        Object term38436 = newInstance(Class.forName("java.util.Collections$UnmodifiableMap"));
        setField(term38375, term38375.getClass(), "inputSpec", "ceCWHUTQUM");
        setField(term38375, term38375.getClass(), "outputDir", ".");
        setBooleanField(term38375, term38375.getClass(), "verbose", true);
        setBooleanField(term38375, term38375.getClass(), "skipOverwrite", true);
        setBooleanField(term38375, term38375.getClass(), "removeOperationIdPrefix", true);
        setBooleanField(term38375, term38375.getClass(), "skipOperationExample", false);
        setBooleanField(term38375, term38375.getClass(), "logToStderr", false);
        setBooleanField(term38375, term38375.getClass(), "validateSpec", true);
        setBooleanField(term38375, term38375.getClass(), "enablePostProcessFile", false);
        setBooleanField(term38375, term38375.getClass(), "enableMinimalUpdate", true);
        setBooleanField(term38375, term38375.getClass(), "strictSpecBehavior", true);
        setField(term38375, term38375.getClass(), "templateDir", "LrqwfrKKtS");
        setField(term38375, term38375.getClass(), "templatingEngineName", "handlebars");
        setField(term38375, term38375.getClass(), "ignoreFileOverride", "ZUdnQXfzCI");
        setField(term38436, term38436.getClass(), "m", term38437);
        setField(term38436, term38436.getClass(), "keySet", null);
        setField(term38436, term38436.getClass(), "entrySet", null);
        setField(term38436, term38436.getClass(), "values", null);
        setField(term38375, term38375.getClass(), "globalProperties", term38436);
        setBooleanField(term38375, term38375.getClass(), "removeEnumValuePrefix", true);
        setField(term38375, term38375.getClass(), "hideGenerationTimestamp", term38443);
        setField(term38375, term38375.getClass(), "intsAllowedForFloatDoubleFormats", term38445);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isValidateSpec", argTypes, term38375, args);
    }

};


