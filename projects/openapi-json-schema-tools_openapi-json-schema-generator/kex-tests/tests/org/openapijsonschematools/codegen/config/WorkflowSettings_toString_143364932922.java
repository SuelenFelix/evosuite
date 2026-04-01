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

public class WorkflowSettings_toString_143364932922 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39279;

    public WorkflowSettings_toString_143364932922() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term39341 = new HashMap();
        Boolean term39347 = new Boolean(true);
        Boolean term39349 = new Boolean(false);
        term39279 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings"));
        Object term39340 = newInstance(Class.forName("java.util.Collections$UnmodifiableMap"));
        setField(term39279, term39279.getClass(), "inputSpec", "EKpdCBubDE");
        setField(term39279, term39279.getClass(), "outputDir", ".");
        setBooleanField(term39279, term39279.getClass(), "verbose", true);
        setBooleanField(term39279, term39279.getClass(), "skipOverwrite", false);
        setBooleanField(term39279, term39279.getClass(), "removeOperationIdPrefix", false);
        setBooleanField(term39279, term39279.getClass(), "skipOperationExample", false);
        setBooleanField(term39279, term39279.getClass(), "logToStderr", false);
        setBooleanField(term39279, term39279.getClass(), "validateSpec", true);
        setBooleanField(term39279, term39279.getClass(), "enablePostProcessFile", false);
        setBooleanField(term39279, term39279.getClass(), "enableMinimalUpdate", false);
        setBooleanField(term39279, term39279.getClass(), "strictSpecBehavior", true);
        setField(term39279, term39279.getClass(), "templateDir", "zMsSLTfGhl");
        setField(term39279, term39279.getClass(), "templatingEngineName", "handlebars");
        setField(term39279, term39279.getClass(), "ignoreFileOverride", "bEmHScVZaQ");
        setField(term39340, term39340.getClass(), "m", term39341);
        setField(term39340, term39340.getClass(), "keySet", null);
        setField(term39340, term39340.getClass(), "entrySet", null);
        setField(term39340, term39340.getClass(), "values", null);
        setField(term39279, term39279.getClass(), "globalProperties", term39340);
        setBooleanField(term39279, term39279.getClass(), "removeEnumValuePrefix", true);
        setField(term39279, term39279.getClass(), "hideGenerationTimestamp", term39347);
        setField(term39279, term39279.getClass(), "intsAllowedForFloatDoubleFormats", term39349);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term39279, args);
    }

};


