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

public class WorkflowSettings_getIgnoreFileOverride_149374407720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39053;

    public WorkflowSettings_getIgnoreFileOverride_149374407720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term39115 = new HashMap();
        Boolean term39121 = new Boolean(true);
        Boolean term39123 = new Boolean(false);
        term39053 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings"));
        Object term39114 = newInstance(Class.forName("java.util.Collections$UnmodifiableMap"));
        setField(term39053, term39053.getClass(), "inputSpec", "bHHjfDCntT");
        setField(term39053, term39053.getClass(), "outputDir", ".");
        setBooleanField(term39053, term39053.getClass(), "verbose", true);
        setBooleanField(term39053, term39053.getClass(), "skipOverwrite", true);
        setBooleanField(term39053, term39053.getClass(), "removeOperationIdPrefix", false);
        setBooleanField(term39053, term39053.getClass(), "skipOperationExample", false);
        setBooleanField(term39053, term39053.getClass(), "logToStderr", false);
        setBooleanField(term39053, term39053.getClass(), "validateSpec", true);
        setBooleanField(term39053, term39053.getClass(), "enablePostProcessFile", false);
        setBooleanField(term39053, term39053.getClass(), "enableMinimalUpdate", false);
        setBooleanField(term39053, term39053.getClass(), "strictSpecBehavior", true);
        setField(term39053, term39053.getClass(), "templateDir", "sEphiduvkv");
        setField(term39053, term39053.getClass(), "templatingEngineName", "handlebars");
        setField(term39053, term39053.getClass(), "ignoreFileOverride", "PbLgCSAHce");
        setField(term39114, term39114.getClass(), "m", term39115);
        setField(term39114, term39114.getClass(), "keySet", null);
        setField(term39114, term39114.getClass(), "entrySet", null);
        setField(term39114, term39114.getClass(), "values", null);
        setField(term39053, term39053.getClass(), "globalProperties", term39114);
        setBooleanField(term39053, term39053.getClass(), "removeEnumValuePrefix", false);
        setField(term39053, term39053.getClass(), "hideGenerationTimestamp", term39121);
        setField(term39053, term39053.getClass(), "intsAllowedForFloatDoubleFormats", term39123);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIgnoreFileOverride", argTypes, term39053, args);
    }

};


