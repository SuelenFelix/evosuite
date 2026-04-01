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

public class WorkflowSettings_Builder_withStrictSpecBehavior_32748096913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32555;
     Object term32636;

    public WorkflowSettings_Builder_withStrictSpecBehavior_32748096913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term32571 = new Boolean(false);
        Boolean term32573 = new Boolean(false);
        Boolean term32575 = new Boolean(false);
        Boolean term32577 = new Boolean(false);
        Boolean term32579 = new Boolean(false);
        Boolean term32581 = new Boolean(false);
        Boolean term32583 = new Boolean(true);
        Boolean term32585 = new Boolean(false);
        Boolean term32587 = new Boolean(false);
        Boolean term32589 = new Boolean(true);
        Boolean term32627 = new Boolean(true);
        Boolean term32629 = new Boolean(false);
        HashMap term32631 = new HashMap();
        term32555 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings$Builder"));
        setField(term32555, term32555.getClass(), "inputSpec", "mGRiYhnMcR");
        setField(term32555, term32555.getClass(), "outputDir", ".");
        setField(term32555, term32555.getClass(), "verbose", term32571);
        setField(term32555, term32555.getClass(), "skipOverwrite", term32573);
        setField(term32555, term32555.getClass(), "removeOperationIdPrefix", term32575);
        setField(term32555, term32555.getClass(), "removeEnumValuePrefix", term32577);
        setField(term32555, term32555.getClass(), "skipOperationExample", term32579);
        setField(term32555, term32555.getClass(), "logToStderr", term32581);
        setField(term32555, term32555.getClass(), "validateSpec", term32583);
        setField(term32555, term32555.getClass(), "enablePostProcessFile", term32585);
        setField(term32555, term32555.getClass(), "enableMinimalUpdate", term32587);
        setField(term32555, term32555.getClass(), "strictSpecBehavior", term32589);
        setField(term32555, term32555.getClass(), "templateDir", "NFlvfJCVPO");
        setField(term32555, term32555.getClass(), "templatingEngineName", "handlebars");
        setField(term32555, term32555.getClass(), "ignoreFileOverride", "KarbTXFmUU");
        setField(term32555, term32555.getClass(), "hideGenerationTimestamp", term32627);
        setField(term32555, term32555.getClass(), "intsAllowedForFloatDoubleFormats", term32629);
        setField(term32555, term32555.getClass(), "globalProperties", term32631);
        term32636 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term32636;
        callMethod(klass, "withStrictSpecBehavior", argTypes, term32555, args);
    }

};


