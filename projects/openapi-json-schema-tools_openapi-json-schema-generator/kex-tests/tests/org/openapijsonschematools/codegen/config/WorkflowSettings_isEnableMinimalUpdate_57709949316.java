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

public class WorkflowSettings_isEnableMinimalUpdate_57709949316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38601;

    public WorkflowSettings_isEnableMinimalUpdate_57709949316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term38663 = new HashMap();
        Boolean term38669 = new Boolean(true);
        Boolean term38671 = new Boolean(false);
        term38601 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings"));
        Object term38662 = newInstance(Class.forName("java.util.Collections$UnmodifiableMap"));
        setField(term38601, term38601.getClass(), "inputSpec", "bycpZjxXFn");
        setField(term38601, term38601.getClass(), "outputDir", ".");
        setBooleanField(term38601, term38601.getClass(), "verbose", true);
        setBooleanField(term38601, term38601.getClass(), "skipOverwrite", false);
        setBooleanField(term38601, term38601.getClass(), "removeOperationIdPrefix", false);
        setBooleanField(term38601, term38601.getClass(), "skipOperationExample", true);
        setBooleanField(term38601, term38601.getClass(), "logToStderr", true);
        setBooleanField(term38601, term38601.getClass(), "validateSpec", true);
        setBooleanField(term38601, term38601.getClass(), "enablePostProcessFile", false);
        setBooleanField(term38601, term38601.getClass(), "enableMinimalUpdate", true);
        setBooleanField(term38601, term38601.getClass(), "strictSpecBehavior", true);
        setField(term38601, term38601.getClass(), "templateDir", "jQWttOAiwL");
        setField(term38601, term38601.getClass(), "templatingEngineName", "handlebars");
        setField(term38601, term38601.getClass(), "ignoreFileOverride", "DzKFxEuEEC");
        setField(term38662, term38662.getClass(), "m", term38663);
        setField(term38662, term38662.getClass(), "keySet", null);
        setField(term38662, term38662.getClass(), "entrySet", null);
        setField(term38662, term38662.getClass(), "values", null);
        setField(term38601, term38601.getClass(), "globalProperties", term38662);
        setBooleanField(term38601, term38601.getClass(), "removeEnumValuePrefix", true);
        setField(term38601, term38601.getClass(), "hideGenerationTimestamp", term38669);
        setField(term38601, term38601.getClass(), "intsAllowedForFloatDoubleFormats", term38671);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isEnableMinimalUpdate", argTypes, term38601, args);
    }

};


