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

public class WorkflowSettings_getInputSpec_1360425144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37245;

    public WorkflowSettings_getInputSpec_1360425144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term37307 = new HashMap();
        Boolean term37313 = new Boolean(true);
        Boolean term37315 = new Boolean(false);
        term37245 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings"));
        Object term37306 = newInstance(Class.forName("java.util.Collections$UnmodifiableMap"));
        setField(term37245, term37245.getClass(), "inputSpec", "BWxJSgKHRT");
        setField(term37245, term37245.getClass(), "outputDir", ".");
        setBooleanField(term37245, term37245.getClass(), "verbose", false);
        setBooleanField(term37245, term37245.getClass(), "skipOverwrite", false);
        setBooleanField(term37245, term37245.getClass(), "removeOperationIdPrefix", false);
        setBooleanField(term37245, term37245.getClass(), "skipOperationExample", false);
        setBooleanField(term37245, term37245.getClass(), "logToStderr", false);
        setBooleanField(term37245, term37245.getClass(), "validateSpec", true);
        setBooleanField(term37245, term37245.getClass(), "enablePostProcessFile", false);
        setBooleanField(term37245, term37245.getClass(), "enableMinimalUpdate", false);
        setBooleanField(term37245, term37245.getClass(), "strictSpecBehavior", true);
        setField(term37245, term37245.getClass(), "templateDir", "AGXoIndFnm");
        setField(term37245, term37245.getClass(), "templatingEngineName", "handlebars");
        setField(term37245, term37245.getClass(), "ignoreFileOverride", "mwmFMNEzkK");
        setField(term37306, term37306.getClass(), "m", term37307);
        setField(term37306, term37306.getClass(), "keySet", null);
        setField(term37306, term37306.getClass(), "entrySet", null);
        setField(term37306, term37306.getClass(), "values", null);
        setField(term37245, term37245.getClass(), "globalProperties", term37306);
        setBooleanField(term37245, term37245.getClass(), "removeEnumValuePrefix", false);
        setField(term37245, term37245.getClass(), "hideGenerationTimestamp", term37313);
        setField(term37245, term37245.getClass(), "intsAllowedForFloatDoubleFormats", term37315);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getInputSpec", argTypes, term37245, args);
    }

};


