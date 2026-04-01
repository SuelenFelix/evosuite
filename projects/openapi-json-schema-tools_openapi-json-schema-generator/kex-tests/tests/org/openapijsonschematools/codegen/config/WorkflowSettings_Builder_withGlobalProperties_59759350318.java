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
import java.util.LinkedHashMap;

public class WorkflowSettings_Builder_withGlobalProperties_59759350318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33235;
     Object term33316;

    public WorkflowSettings_Builder_withGlobalProperties_59759350318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term33251 = new Boolean(false);
        Boolean term33253 = new Boolean(false);
        Boolean term33255 = new Boolean(false);
        Boolean term33257 = new Boolean(false);
        Boolean term33259 = new Boolean(false);
        Boolean term33261 = new Boolean(false);
        Boolean term33263 = new Boolean(true);
        Boolean term33265 = new Boolean(false);
        Boolean term33267 = new Boolean(false);
        Boolean term33269 = new Boolean(true);
        Boolean term33307 = new Boolean(true);
        Boolean term33309 = new Boolean(false);
        HashMap term33311 = new HashMap();
        term33235 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings$Builder"));
        setField(term33235, term33235.getClass(), "inputSpec", "oKwCDqywym");
        setField(term33235, term33235.getClass(), "outputDir", ".");
        setField(term33235, term33235.getClass(), "verbose", term33251);
        setField(term33235, term33235.getClass(), "skipOverwrite", term33253);
        setField(term33235, term33235.getClass(), "removeOperationIdPrefix", term33255);
        setField(term33235, term33235.getClass(), "removeEnumValuePrefix", term33257);
        setField(term33235, term33235.getClass(), "skipOperationExample", term33259);
        setField(term33235, term33235.getClass(), "logToStderr", term33261);
        setField(term33235, term33235.getClass(), "validateSpec", term33263);
        setField(term33235, term33235.getClass(), "enablePostProcessFile", term33265);
        setField(term33235, term33235.getClass(), "enableMinimalUpdate", term33267);
        setField(term33235, term33235.getClass(), "strictSpecBehavior", term33269);
        setField(term33235, term33235.getClass(), "templateDir", "zjZYTddemL");
        setField(term33235, term33235.getClass(), "templatingEngineName", "handlebars");
        setField(term33235, term33235.getClass(), "ignoreFileOverride", "QtrylgCLiF");
        setField(term33235, term33235.getClass(), "hideGenerationTimestamp", term33307);
        setField(term33235, term33235.getClass(), "intsAllowedForFloatDoubleFormats", term33309);
        setField(term33235, term33235.getClass(), "globalProperties", term33311);
        term33316 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term33316;
        callMethod(klass, "withGlobalProperties", argTypes, term33235, args);
    }

};


