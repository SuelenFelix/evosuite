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
import java.lang.Boolean;
import java.util.HashMap;

public class WorkflowSettings_Builder_withOutputDir_14635600623 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31295;

    public WorkflowSettings_Builder_withOutputDir_14635600623() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term31311 = new Boolean(false);
        Boolean term31313 = new Boolean(false);
        Boolean term31315 = new Boolean(false);
        Boolean term31317 = new Boolean(false);
        Boolean term31319 = new Boolean(false);
        Boolean term31321 = new Boolean(false);
        Boolean term31323 = new Boolean(true);
        Boolean term31325 = new Boolean(false);
        Boolean term31327 = new Boolean(false);
        Boolean term31329 = new Boolean(true);
        Boolean term31367 = new Boolean(true);
        Boolean term31369 = new Boolean(false);
        HashMap term31371 = new HashMap();
        term31295 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings$Builder"));
        setField(term31295, term31295.getClass(), "inputSpec", "mLwibAPEsa");
        setField(term31295, term31295.getClass(), "outputDir", ".");
        setField(term31295, term31295.getClass(), "verbose", term31311);
        setField(term31295, term31295.getClass(), "skipOverwrite", term31313);
        setField(term31295, term31295.getClass(), "removeOperationIdPrefix", term31315);
        setField(term31295, term31295.getClass(), "removeEnumValuePrefix", term31317);
        setField(term31295, term31295.getClass(), "skipOperationExample", term31319);
        setField(term31295, term31295.getClass(), "logToStderr", term31321);
        setField(term31295, term31295.getClass(), "validateSpec", term31323);
        setField(term31295, term31295.getClass(), "enablePostProcessFile", term31325);
        setField(term31295, term31295.getClass(), "enableMinimalUpdate", term31327);
        setField(term31295, term31295.getClass(), "strictSpecBehavior", term31329);
        setField(term31295, term31295.getClass(), "templateDir", "zsWKWiTFuo");
        setField(term31295, term31295.getClass(), "templatingEngineName", "handlebars");
        setField(term31295, term31295.getClass(), "ignoreFileOverride", "UPUbwyHQKN");
        setField(term31295, term31295.getClass(), "hideGenerationTimestamp", term31367);
        setField(term31295, term31295.getClass(), "intsAllowedForFloatDoubleFormats", term31369);
        setField(term31295, term31295.getClass(), "globalProperties", term31371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "lgQkrXANyI";
        callMethod(klass, "withOutputDir", argTypes, term31295, args);
    }

};


