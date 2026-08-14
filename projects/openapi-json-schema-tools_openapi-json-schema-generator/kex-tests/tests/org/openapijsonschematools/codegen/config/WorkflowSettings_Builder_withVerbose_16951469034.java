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

public class WorkflowSettings_Builder_withVerbose_16951469034 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31439;
     Object term31520;

    public WorkflowSettings_Builder_withVerbose_16951469034() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term31455 = new Boolean(false);
        Boolean term31457 = new Boolean(false);
        Boolean term31459 = new Boolean(false);
        Boolean term31461 = new Boolean(false);
        Boolean term31463 = new Boolean(false);
        Boolean term31465 = new Boolean(false);
        Boolean term31467 = new Boolean(true);
        Boolean term31469 = new Boolean(false);
        Boolean term31471 = new Boolean(false);
        Boolean term31473 = new Boolean(true);
        Boolean term31511 = new Boolean(true);
        Boolean term31513 = new Boolean(false);
        HashMap term31515 = new HashMap();
        term31439 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings$Builder"));
        setField(term31439, term31439.getClass(), "inputSpec", "MeTmRZXErV");
        setField(term31439, term31439.getClass(), "outputDir", ".");
        setField(term31439, term31439.getClass(), "verbose", term31455);
        setField(term31439, term31439.getClass(), "skipOverwrite", term31457);
        setField(term31439, term31439.getClass(), "removeOperationIdPrefix", term31459);
        setField(term31439, term31439.getClass(), "removeEnumValuePrefix", term31461);
        setField(term31439, term31439.getClass(), "skipOperationExample", term31463);
        setField(term31439, term31439.getClass(), "logToStderr", term31465);
        setField(term31439, term31439.getClass(), "validateSpec", term31467);
        setField(term31439, term31439.getClass(), "enablePostProcessFile", term31469);
        setField(term31439, term31439.getClass(), "enableMinimalUpdate", term31471);
        setField(term31439, term31439.getClass(), "strictSpecBehavior", term31473);
        setField(term31439, term31439.getClass(), "templateDir", "jNxbVmoZgq");
        setField(term31439, term31439.getClass(), "templatingEngineName", "handlebars");
        setField(term31439, term31439.getClass(), "ignoreFileOverride", "PvmBHIXaMY");
        setField(term31439, term31439.getClass(), "hideGenerationTimestamp", term31511);
        setField(term31439, term31439.getClass(), "intsAllowedForFloatDoubleFormats", term31513);
        setField(term31439, term31439.getClass(), "globalProperties", term31515);
        term31520 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term31520;
        callMethod(klass, "withVerbose", argTypes, term31439, args);
    }

};


