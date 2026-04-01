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

public class WorkflowSettings_isRemoveOperationIdPrefix_20617930848 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37697;

    public WorkflowSettings_isRemoveOperationIdPrefix_20617930848() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term37759 = new HashMap();
        Boolean term37765 = new Boolean(true);
        Boolean term37767 = new Boolean(false);
        term37697 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings"));
        Object term37758 = newInstance(Class.forName("java.util.Collections$UnmodifiableMap"));
        setField(term37697, term37697.getClass(), "inputSpec", "vLTbaoAxBm");
        setField(term37697, term37697.getClass(), "outputDir", ".");
        setBooleanField(term37697, term37697.getClass(), "verbose", true);
        setBooleanField(term37697, term37697.getClass(), "skipOverwrite", true);
        setBooleanField(term37697, term37697.getClass(), "removeOperationIdPrefix", false);
        setBooleanField(term37697, term37697.getClass(), "skipOperationExample", false);
        setBooleanField(term37697, term37697.getClass(), "logToStderr", false);
        setBooleanField(term37697, term37697.getClass(), "validateSpec", true);
        setBooleanField(term37697, term37697.getClass(), "enablePostProcessFile", false);
        setBooleanField(term37697, term37697.getClass(), "enableMinimalUpdate", false);
        setBooleanField(term37697, term37697.getClass(), "strictSpecBehavior", true);
        setField(term37697, term37697.getClass(), "templateDir", "BXTjEyEZxD");
        setField(term37697, term37697.getClass(), "templatingEngineName", "handlebars");
        setField(term37697, term37697.getClass(), "ignoreFileOverride", "oKhVzOKUFW");
        setField(term37758, term37758.getClass(), "m", term37759);
        setField(term37758, term37758.getClass(), "keySet", null);
        setField(term37758, term37758.getClass(), "entrySet", null);
        setField(term37758, term37758.getClass(), "values", null);
        setField(term37697, term37697.getClass(), "globalProperties", term37758);
        setBooleanField(term37697, term37697.getClass(), "removeEnumValuePrefix", true);
        setField(term37697, term37697.getClass(), "hideGenerationTimestamp", term37765);
        setField(term37697, term37697.getClass(), "intsAllowedForFloatDoubleFormats", term37767);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isRemoveOperationIdPrefix", argTypes, term37697, args);
    }

};


