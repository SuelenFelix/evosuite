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

public class WorkflowSettings_isStrictSpecBehavior_67730950217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38714;

    public WorkflowSettings_isStrictSpecBehavior_67730950217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term38776 = new HashMap();
        Boolean term38782 = new Boolean(true);
        Boolean term38784 = new Boolean(false);
        term38714 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings"));
        Object term38775 = newInstance(Class.forName("java.util.Collections$UnmodifiableMap"));
        setField(term38714, term38714.getClass(), "inputSpec", "CAMnvfDLJL");
        setField(term38714, term38714.getClass(), "outputDir", ".");
        setBooleanField(term38714, term38714.getClass(), "verbose", true);
        setBooleanField(term38714, term38714.getClass(), "skipOverwrite", false);
        setBooleanField(term38714, term38714.getClass(), "removeOperationIdPrefix", false);
        setBooleanField(term38714, term38714.getClass(), "skipOperationExample", false);
        setBooleanField(term38714, term38714.getClass(), "logToStderr", true);
        setBooleanField(term38714, term38714.getClass(), "validateSpec", true);
        setBooleanField(term38714, term38714.getClass(), "enablePostProcessFile", true);
        setBooleanField(term38714, term38714.getClass(), "enableMinimalUpdate", false);
        setBooleanField(term38714, term38714.getClass(), "strictSpecBehavior", true);
        setField(term38714, term38714.getClass(), "templateDir", "mfHtgSbdjD");
        setField(term38714, term38714.getClass(), "templatingEngineName", "handlebars");
        setField(term38714, term38714.getClass(), "ignoreFileOverride", "cmuaUiHMVL");
        setField(term38775, term38775.getClass(), "m", term38776);
        setField(term38775, term38775.getClass(), "keySet", null);
        setField(term38775, term38775.getClass(), "entrySet", null);
        setField(term38775, term38775.getClass(), "values", null);
        setField(term38714, term38714.getClass(), "globalProperties", term38775);
        setBooleanField(term38714, term38714.getClass(), "removeEnumValuePrefix", true);
        setField(term38714, term38714.getClass(), "hideGenerationTimestamp", term38782);
        setField(term38714, term38714.getClass(), "intsAllowedForFloatDoubleFormats", term38784);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isStrictSpecBehavior", argTypes, term38714, args);
    }

};


