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

public class WorkflowSettings_isSkipOperationExample_18832071412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38149;

    public WorkflowSettings_isSkipOperationExample_18832071412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term38211 = new HashMap();
        Boolean term38217 = new Boolean(true);
        Boolean term38219 = new Boolean(false);
        term38149 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings"));
        Object term38210 = newInstance(Class.forName("java.util.Collections$UnmodifiableMap"));
        setField(term38149, term38149.getClass(), "inputSpec", "VoghngXfsK");
        setField(term38149, term38149.getClass(), "outputDir", ".");
        setBooleanField(term38149, term38149.getClass(), "verbose", true);
        setBooleanField(term38149, term38149.getClass(), "skipOverwrite", true);
        setBooleanField(term38149, term38149.getClass(), "removeOperationIdPrefix", true);
        setBooleanField(term38149, term38149.getClass(), "skipOperationExample", false);
        setBooleanField(term38149, term38149.getClass(), "logToStderr", true);
        setBooleanField(term38149, term38149.getClass(), "validateSpec", true);
        setBooleanField(term38149, term38149.getClass(), "enablePostProcessFile", false);
        setBooleanField(term38149, term38149.getClass(), "enableMinimalUpdate", true);
        setBooleanField(term38149, term38149.getClass(), "strictSpecBehavior", true);
        setField(term38149, term38149.getClass(), "templateDir", "GbahCBMvct");
        setField(term38149, term38149.getClass(), "templatingEngineName", "handlebars");
        setField(term38149, term38149.getClass(), "ignoreFileOverride", "iiHBhsNFgk");
        setField(term38210, term38210.getClass(), "m", term38211);
        setField(term38210, term38210.getClass(), "keySet", null);
        setField(term38210, term38210.getClass(), "entrySet", null);
        setField(term38210, term38210.getClass(), "values", null);
        setField(term38149, term38149.getClass(), "globalProperties", term38210);
        setBooleanField(term38149, term38149.getClass(), "removeEnumValuePrefix", false);
        setField(term38149, term38149.getClass(), "hideGenerationTimestamp", term38217);
        setField(term38149, term38149.getClass(), "intsAllowedForFloatDoubleFormats", term38219);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isSkipOperationExample", argTypes, term38149, args);
    }

};


