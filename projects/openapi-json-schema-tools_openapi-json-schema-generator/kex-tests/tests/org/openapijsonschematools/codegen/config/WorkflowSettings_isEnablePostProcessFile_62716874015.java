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

public class WorkflowSettings_isEnablePostProcessFile_62716874015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38488;

    public WorkflowSettings_isEnablePostProcessFile_62716874015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term38550 = new HashMap();
        Boolean term38556 = new Boolean(true);
        Boolean term38558 = new Boolean(false);
        term38488 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings"));
        Object term38549 = newInstance(Class.forName("java.util.Collections$UnmodifiableMap"));
        setField(term38488, term38488.getClass(), "inputSpec", "EULDrUNQvw");
        setField(term38488, term38488.getClass(), "outputDir", ".");
        setBooleanField(term38488, term38488.getClass(), "verbose", true);
        setBooleanField(term38488, term38488.getClass(), "skipOverwrite", false);
        setBooleanField(term38488, term38488.getClass(), "removeOperationIdPrefix", false);
        setBooleanField(term38488, term38488.getClass(), "skipOperationExample", true);
        setBooleanField(term38488, term38488.getClass(), "logToStderr", true);
        setBooleanField(term38488, term38488.getClass(), "validateSpec", true);
        setBooleanField(term38488, term38488.getClass(), "enablePostProcessFile", true);
        setBooleanField(term38488, term38488.getClass(), "enableMinimalUpdate", true);
        setBooleanField(term38488, term38488.getClass(), "strictSpecBehavior", true);
        setField(term38488, term38488.getClass(), "templateDir", "BtvAvsJSei");
        setField(term38488, term38488.getClass(), "templatingEngineName", "handlebars");
        setField(term38488, term38488.getClass(), "ignoreFileOverride", "vqnBkkxoIa");
        setField(term38549, term38549.getClass(), "m", term38550);
        setField(term38549, term38549.getClass(), "keySet", null);
        setField(term38549, term38549.getClass(), "entrySet", null);
        setField(term38549, term38549.getClass(), "values", null);
        setField(term38488, term38488.getClass(), "globalProperties", term38549);
        setBooleanField(term38488, term38488.getClass(), "removeEnumValuePrefix", true);
        setField(term38488, term38488.getClass(), "hideGenerationTimestamp", term38556);
        setField(term38488, term38488.getClass(), "intsAllowedForFloatDoubleFormats", term38558);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isEnablePostProcessFile", argTypes, term38488, args);
    }

};


