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

public class WorkflowSettings_Builder_withEnableMinimalUpdate_80507179012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32431;
     Object term32512;

    public WorkflowSettings_Builder_withEnableMinimalUpdate_80507179012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term32447 = new Boolean(false);
        Boolean term32449 = new Boolean(false);
        Boolean term32451 = new Boolean(false);
        Boolean term32453 = new Boolean(false);
        Boolean term32455 = new Boolean(false);
        Boolean term32457 = new Boolean(false);
        Boolean term32459 = new Boolean(true);
        Boolean term32461 = new Boolean(false);
        Boolean term32463 = new Boolean(false);
        Boolean term32465 = new Boolean(true);
        Boolean term32503 = new Boolean(true);
        Boolean term32505 = new Boolean(false);
        HashMap term32507 = new HashMap();
        term32431 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings$Builder"));
        setField(term32431, term32431.getClass(), "inputSpec", "IEYhJmgCVd");
        setField(term32431, term32431.getClass(), "outputDir", ".");
        setField(term32431, term32431.getClass(), "verbose", term32447);
        setField(term32431, term32431.getClass(), "skipOverwrite", term32449);
        setField(term32431, term32431.getClass(), "removeOperationIdPrefix", term32451);
        setField(term32431, term32431.getClass(), "removeEnumValuePrefix", term32453);
        setField(term32431, term32431.getClass(), "skipOperationExample", term32455);
        setField(term32431, term32431.getClass(), "logToStderr", term32457);
        setField(term32431, term32431.getClass(), "validateSpec", term32459);
        setField(term32431, term32431.getClass(), "enablePostProcessFile", term32461);
        setField(term32431, term32431.getClass(), "enableMinimalUpdate", term32463);
        setField(term32431, term32431.getClass(), "strictSpecBehavior", term32465);
        setField(term32431, term32431.getClass(), "templateDir", "KSJeYkkvpk");
        setField(term32431, term32431.getClass(), "templatingEngineName", "handlebars");
        setField(term32431, term32431.getClass(), "ignoreFileOverride", "qUtkFGMNUV");
        setField(term32431, term32431.getClass(), "hideGenerationTimestamp", term32503);
        setField(term32431, term32431.getClass(), "intsAllowedForFloatDoubleFormats", term32505);
        setField(term32431, term32431.getClass(), "globalProperties", term32507);
        term32512 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term32512;
        callMethod(klass, "withEnableMinimalUpdate", argTypes, term32431, args);
    }

};


