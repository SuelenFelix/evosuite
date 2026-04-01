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

public class WorkflowSettings_Builder_build_19478226220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33582;

    public WorkflowSettings_Builder_build_19478226220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term33598 = new Boolean(false);
        Boolean term33600 = new Boolean(false);
        Boolean term33602 = new Boolean(false);
        Boolean term33604 = new Boolean(false);
        Boolean term33606 = new Boolean(false);
        Boolean term33608 = new Boolean(false);
        Boolean term33610 = new Boolean(true);
        Boolean term33612 = new Boolean(false);
        Boolean term33614 = new Boolean(false);
        Boolean term33616 = new Boolean(true);
        Boolean term33654 = new Boolean(true);
        Boolean term33656 = new Boolean(false);
        HashMap term33658 = new HashMap();
        term33582 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings$Builder"));
        setField(term33582, term33582.getClass(), "inputSpec", "yeSXGqQExb");
        setField(term33582, term33582.getClass(), "outputDir", ".");
        setField(term33582, term33582.getClass(), "verbose", term33598);
        setField(term33582, term33582.getClass(), "skipOverwrite", term33600);
        setField(term33582, term33582.getClass(), "removeOperationIdPrefix", term33602);
        setField(term33582, term33582.getClass(), "removeEnumValuePrefix", term33604);
        setField(term33582, term33582.getClass(), "skipOperationExample", term33606);
        setField(term33582, term33582.getClass(), "logToStderr", term33608);
        setField(term33582, term33582.getClass(), "validateSpec", term33610);
        setField(term33582, term33582.getClass(), "enablePostProcessFile", term33612);
        setField(term33582, term33582.getClass(), "enableMinimalUpdate", term33614);
        setField(term33582, term33582.getClass(), "strictSpecBehavior", term33616);
        setField(term33582, term33582.getClass(), "templateDir", "uXYcXVYJZM");
        setField(term33582, term33582.getClass(), "templatingEngineName", "handlebars");
        setField(term33582, term33582.getClass(), "ignoreFileOverride", "BJhjdJUhkz");
        setField(term33582, term33582.getClass(), "hideGenerationTimestamp", term33654);
        setField(term33582, term33582.getClass(), "intsAllowedForFloatDoubleFormats", term33656);
        setField(term33582, term33582.getClass(), "globalProperties", term33658);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings$Builder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term33582, args);
    }

};


