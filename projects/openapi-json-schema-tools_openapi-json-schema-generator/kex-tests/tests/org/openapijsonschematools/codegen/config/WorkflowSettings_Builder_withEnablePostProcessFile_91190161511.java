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

public class WorkflowSettings_Builder_withEnablePostProcessFile_91190161511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32307;
     Object term32388;

    public WorkflowSettings_Builder_withEnablePostProcessFile_91190161511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term32323 = new Boolean(false);
        Boolean term32325 = new Boolean(false);
        Boolean term32327 = new Boolean(false);
        Boolean term32329 = new Boolean(false);
        Boolean term32331 = new Boolean(false);
        Boolean term32333 = new Boolean(false);
        Boolean term32335 = new Boolean(true);
        Boolean term32337 = new Boolean(false);
        Boolean term32339 = new Boolean(false);
        Boolean term32341 = new Boolean(true);
        Boolean term32379 = new Boolean(true);
        Boolean term32381 = new Boolean(false);
        HashMap term32383 = new HashMap();
        term32307 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings$Builder"));
        setField(term32307, term32307.getClass(), "inputSpec", "dtGZCsKXbW");
        setField(term32307, term32307.getClass(), "outputDir", ".");
        setField(term32307, term32307.getClass(), "verbose", term32323);
        setField(term32307, term32307.getClass(), "skipOverwrite", term32325);
        setField(term32307, term32307.getClass(), "removeOperationIdPrefix", term32327);
        setField(term32307, term32307.getClass(), "removeEnumValuePrefix", term32329);
        setField(term32307, term32307.getClass(), "skipOperationExample", term32331);
        setField(term32307, term32307.getClass(), "logToStderr", term32333);
        setField(term32307, term32307.getClass(), "validateSpec", term32335);
        setField(term32307, term32307.getClass(), "enablePostProcessFile", term32337);
        setField(term32307, term32307.getClass(), "enableMinimalUpdate", term32339);
        setField(term32307, term32307.getClass(), "strictSpecBehavior", term32341);
        setField(term32307, term32307.getClass(), "templateDir", "bdyhHbDAmJ");
        setField(term32307, term32307.getClass(), "templatingEngineName", "handlebars");
        setField(term32307, term32307.getClass(), "ignoreFileOverride", "BBXiTNHqGE");
        setField(term32307, term32307.getClass(), "hideGenerationTimestamp", term32379);
        setField(term32307, term32307.getClass(), "intsAllowedForFloatDoubleFormats", term32381);
        setField(term32307, term32307.getClass(), "globalProperties", term32383);
        term32388 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term32388;
        callMethod(klass, "withEnablePostProcessFile", argTypes, term32307, args);
    }

};


