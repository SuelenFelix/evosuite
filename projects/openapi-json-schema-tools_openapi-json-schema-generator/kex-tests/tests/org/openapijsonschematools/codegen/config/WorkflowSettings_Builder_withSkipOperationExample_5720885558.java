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

public class WorkflowSettings_Builder_withSkipOperationExample_5720885558 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31935;
     Object term32016;

    public WorkflowSettings_Builder_withSkipOperationExample_5720885558() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term31951 = new Boolean(false);
        Boolean term31953 = new Boolean(false);
        Boolean term31955 = new Boolean(false);
        Boolean term31957 = new Boolean(false);
        Boolean term31959 = new Boolean(false);
        Boolean term31961 = new Boolean(false);
        Boolean term31963 = new Boolean(true);
        Boolean term31965 = new Boolean(false);
        Boolean term31967 = new Boolean(false);
        Boolean term31969 = new Boolean(true);
        Boolean term32007 = new Boolean(true);
        Boolean term32009 = new Boolean(false);
        HashMap term32011 = new HashMap();
        term31935 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings$Builder"));
        setField(term31935, term31935.getClass(), "inputSpec", "nKZKnxWYCK");
        setField(term31935, term31935.getClass(), "outputDir", ".");
        setField(term31935, term31935.getClass(), "verbose", term31951);
        setField(term31935, term31935.getClass(), "skipOverwrite", term31953);
        setField(term31935, term31935.getClass(), "removeOperationIdPrefix", term31955);
        setField(term31935, term31935.getClass(), "removeEnumValuePrefix", term31957);
        setField(term31935, term31935.getClass(), "skipOperationExample", term31959);
        setField(term31935, term31935.getClass(), "logToStderr", term31961);
        setField(term31935, term31935.getClass(), "validateSpec", term31963);
        setField(term31935, term31935.getClass(), "enablePostProcessFile", term31965);
        setField(term31935, term31935.getClass(), "enableMinimalUpdate", term31967);
        setField(term31935, term31935.getClass(), "strictSpecBehavior", term31969);
        setField(term31935, term31935.getClass(), "templateDir", "JOqQxuzRuZ");
        setField(term31935, term31935.getClass(), "templatingEngineName", "handlebars");
        setField(term31935, term31935.getClass(), "ignoreFileOverride", "RSaoipUlsg");
        setField(term31935, term31935.getClass(), "hideGenerationTimestamp", term32007);
        setField(term31935, term31935.getClass(), "intsAllowedForFloatDoubleFormats", term32009);
        setField(term31935, term31935.getClass(), "globalProperties", term32011);
        term32016 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term32016;
        callMethod(klass, "withSkipOperationExample", argTypes, term31935, args);
    }

};


