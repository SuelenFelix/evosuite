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

public class WorkflowSettings_getGlobalProperties_185255975021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39166;

    public WorkflowSettings_getGlobalProperties_185255975021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term39228 = new HashMap();
        Boolean term39234 = new Boolean(true);
        Boolean term39236 = new Boolean(false);
        term39166 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings"));
        Object term39227 = newInstance(Class.forName("java.util.Collections$UnmodifiableMap"));
        setField(term39166, term39166.getClass(), "inputSpec", "NWldOLAbqk");
        setField(term39166, term39166.getClass(), "outputDir", ".");
        setBooleanField(term39166, term39166.getClass(), "verbose", true);
        setBooleanField(term39166, term39166.getClass(), "skipOverwrite", false);
        setBooleanField(term39166, term39166.getClass(), "removeOperationIdPrefix", false);
        setBooleanField(term39166, term39166.getClass(), "skipOperationExample", false);
        setBooleanField(term39166, term39166.getClass(), "logToStderr", false);
        setBooleanField(term39166, term39166.getClass(), "validateSpec", true);
        setBooleanField(term39166, term39166.getClass(), "enablePostProcessFile", true);
        setBooleanField(term39166, term39166.getClass(), "enableMinimalUpdate", true);
        setBooleanField(term39166, term39166.getClass(), "strictSpecBehavior", true);
        setField(term39166, term39166.getClass(), "templateDir", "qnYaYSpDwO");
        setField(term39166, term39166.getClass(), "templatingEngineName", "handlebars");
        setField(term39166, term39166.getClass(), "ignoreFileOverride", "dgbFDCdHtj");
        setField(term39227, term39227.getClass(), "m", term39228);
        setField(term39227, term39227.getClass(), "keySet", null);
        setField(term39227, term39227.getClass(), "entrySet", null);
        setField(term39227, term39227.getClass(), "values", null);
        setField(term39166, term39166.getClass(), "globalProperties", term39227);
        setBooleanField(term39166, term39166.getClass(), "removeEnumValuePrefix", false);
        setField(term39166, term39166.getClass(), "hideGenerationTimestamp", term39234);
        setField(term39166, term39166.getClass(), "intsAllowedForFloatDoubleFormats", term39236);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGlobalProperties", argTypes, term39166, args);
    }

};


