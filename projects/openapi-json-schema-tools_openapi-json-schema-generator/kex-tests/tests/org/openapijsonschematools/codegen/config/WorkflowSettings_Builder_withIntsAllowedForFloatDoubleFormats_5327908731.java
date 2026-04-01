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

public class WorkflowSettings_Builder_withIntsAllowedForFloatDoubleFormats_5327908731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31027;
     Object term31108;

    public WorkflowSettings_Builder_withIntsAllowedForFloatDoubleFormats_5327908731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term31043 = new Boolean(false);
        Boolean term31045 = new Boolean(false);
        Boolean term31047 = new Boolean(false);
        Boolean term31049 = new Boolean(false);
        Boolean term31051 = new Boolean(false);
        Boolean term31053 = new Boolean(false);
        Boolean term31055 = new Boolean(true);
        Boolean term31057 = new Boolean(false);
        Boolean term31059 = new Boolean(false);
        Boolean term31061 = new Boolean(true);
        Boolean term31099 = new Boolean(true);
        Boolean term31101 = new Boolean(false);
        HashMap term31103 = new HashMap();
        term31027 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings$Builder"));
        setField(term31027, term31027.getClass(), "inputSpec", "VDokbsCuqq");
        setField(term31027, term31027.getClass(), "outputDir", ".");
        setField(term31027, term31027.getClass(), "verbose", term31043);
        setField(term31027, term31027.getClass(), "skipOverwrite", term31045);
        setField(term31027, term31027.getClass(), "removeOperationIdPrefix", term31047);
        setField(term31027, term31027.getClass(), "removeEnumValuePrefix", term31049);
        setField(term31027, term31027.getClass(), "skipOperationExample", term31051);
        setField(term31027, term31027.getClass(), "logToStderr", term31053);
        setField(term31027, term31027.getClass(), "validateSpec", term31055);
        setField(term31027, term31027.getClass(), "enablePostProcessFile", term31057);
        setField(term31027, term31027.getClass(), "enableMinimalUpdate", term31059);
        setField(term31027, term31027.getClass(), "strictSpecBehavior", term31061);
        setField(term31027, term31027.getClass(), "templateDir", "xClUIcPECX");
        setField(term31027, term31027.getClass(), "templatingEngineName", "handlebars");
        setField(term31027, term31027.getClass(), "ignoreFileOverride", "avhRaGZaBF");
        setField(term31027, term31027.getClass(), "hideGenerationTimestamp", term31099);
        setField(term31027, term31027.getClass(), "intsAllowedForFloatDoubleFormats", term31101);
        setField(term31027, term31027.getClass(), "globalProperties", term31103);
        term31108 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term31108;
        callMethod(klass, "withIntsAllowedForFloatDoubleFormats", argTypes, term31027, args);
    }

};


