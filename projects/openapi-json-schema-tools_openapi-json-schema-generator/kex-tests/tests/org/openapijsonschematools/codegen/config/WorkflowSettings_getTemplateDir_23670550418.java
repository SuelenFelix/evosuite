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

public class WorkflowSettings_getTemplateDir_23670550418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38827;

    public WorkflowSettings_getTemplateDir_23670550418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term38889 = new HashMap();
        Boolean term38895 = new Boolean(true);
        Boolean term38897 = new Boolean(false);
        term38827 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings"));
        Object term38888 = newInstance(Class.forName("java.util.Collections$UnmodifiableMap"));
        setField(term38827, term38827.getClass(), "inputSpec", "xjoSGPWUgu");
        setField(term38827, term38827.getClass(), "outputDir", ".");
        setBooleanField(term38827, term38827.getClass(), "verbose", false);
        setBooleanField(term38827, term38827.getClass(), "skipOverwrite", false);
        setBooleanField(term38827, term38827.getClass(), "removeOperationIdPrefix", true);
        setBooleanField(term38827, term38827.getClass(), "skipOperationExample", true);
        setBooleanField(term38827, term38827.getClass(), "logToStderr", false);
        setBooleanField(term38827, term38827.getClass(), "validateSpec", true);
        setBooleanField(term38827, term38827.getClass(), "enablePostProcessFile", true);
        setBooleanField(term38827, term38827.getClass(), "enableMinimalUpdate", true);
        setBooleanField(term38827, term38827.getClass(), "strictSpecBehavior", true);
        setField(term38827, term38827.getClass(), "templateDir", "uzmqjnOUXu");
        setField(term38827, term38827.getClass(), "templatingEngineName", "handlebars");
        setField(term38827, term38827.getClass(), "ignoreFileOverride", "xeyjTOCOJb");
        setField(term38888, term38888.getClass(), "m", term38889);
        setField(term38888, term38888.getClass(), "keySet", null);
        setField(term38888, term38888.getClass(), "entrySet", null);
        setField(term38888, term38888.getClass(), "values", null);
        setField(term38827, term38827.getClass(), "globalProperties", term38888);
        setBooleanField(term38827, term38827.getClass(), "removeEnumValuePrefix", true);
        setField(term38827, term38827.getClass(), "hideGenerationTimestamp", term38895);
        setField(term38827, term38827.getClass(), "intsAllowedForFloatDoubleFormats", term38897);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTemplateDir", argTypes, term38827, args);
    }

};


