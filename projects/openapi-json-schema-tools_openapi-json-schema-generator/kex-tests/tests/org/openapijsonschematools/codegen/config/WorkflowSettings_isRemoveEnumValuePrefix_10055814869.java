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

public class WorkflowSettings_isRemoveEnumValuePrefix_10055814869 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37810;

    public WorkflowSettings_isRemoveEnumValuePrefix_10055814869() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term37872 = new HashMap();
        Boolean term37878 = new Boolean(true);
        Boolean term37880 = new Boolean(false);
        term37810 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings"));
        Object term37871 = newInstance(Class.forName("java.util.Collections$UnmodifiableMap"));
        setField(term37810, term37810.getClass(), "inputSpec", "mNHyqmOAFy");
        setField(term37810, term37810.getClass(), "outputDir", ".");
        setBooleanField(term37810, term37810.getClass(), "verbose", true);
        setBooleanField(term37810, term37810.getClass(), "skipOverwrite", true);
        setBooleanField(term37810, term37810.getClass(), "removeOperationIdPrefix", true);
        setBooleanField(term37810, term37810.getClass(), "skipOperationExample", true);
        setBooleanField(term37810, term37810.getClass(), "logToStderr", true);
        setBooleanField(term37810, term37810.getClass(), "validateSpec", true);
        setBooleanField(term37810, term37810.getClass(), "enablePostProcessFile", false);
        setBooleanField(term37810, term37810.getClass(), "enableMinimalUpdate", true);
        setBooleanField(term37810, term37810.getClass(), "strictSpecBehavior", true);
        setField(term37810, term37810.getClass(), "templateDir", "UxgSdhxPCH");
        setField(term37810, term37810.getClass(), "templatingEngineName", "handlebars");
        setField(term37810, term37810.getClass(), "ignoreFileOverride", "DAujxZPHJC");
        setField(term37871, term37871.getClass(), "m", term37872);
        setField(term37871, term37871.getClass(), "keySet", null);
        setField(term37871, term37871.getClass(), "entrySet", null);
        setField(term37871, term37871.getClass(), "values", null);
        setField(term37810, term37810.getClass(), "globalProperties", term37871);
        setBooleanField(term37810, term37810.getClass(), "removeEnumValuePrefix", true);
        setField(term37810, term37810.getClass(), "hideGenerationTimestamp", term37878);
        setField(term37810, term37810.getClass(), "intsAllowedForFloatDoubleFormats", term37880);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isRemoveEnumValuePrefix", argTypes, term37810, args);
    }

};


