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

public class WorkflowSettings_Builder_withRemoveOperationIdPrefix_665698976 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31687;
     Object term31768;

    public WorkflowSettings_Builder_withRemoveOperationIdPrefix_665698976() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term31703 = new Boolean(false);
        Boolean term31705 = new Boolean(false);
        Boolean term31707 = new Boolean(false);
        Boolean term31709 = new Boolean(false);
        Boolean term31711 = new Boolean(false);
        Boolean term31713 = new Boolean(false);
        Boolean term31715 = new Boolean(true);
        Boolean term31717 = new Boolean(false);
        Boolean term31719 = new Boolean(false);
        Boolean term31721 = new Boolean(true);
        Boolean term31759 = new Boolean(true);
        Boolean term31761 = new Boolean(false);
        HashMap term31763 = new HashMap();
        term31687 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings$Builder"));
        setField(term31687, term31687.getClass(), "inputSpec", "AWYyZiNfsm");
        setField(term31687, term31687.getClass(), "outputDir", ".");
        setField(term31687, term31687.getClass(), "verbose", term31703);
        setField(term31687, term31687.getClass(), "skipOverwrite", term31705);
        setField(term31687, term31687.getClass(), "removeOperationIdPrefix", term31707);
        setField(term31687, term31687.getClass(), "removeEnumValuePrefix", term31709);
        setField(term31687, term31687.getClass(), "skipOperationExample", term31711);
        setField(term31687, term31687.getClass(), "logToStderr", term31713);
        setField(term31687, term31687.getClass(), "validateSpec", term31715);
        setField(term31687, term31687.getClass(), "enablePostProcessFile", term31717);
        setField(term31687, term31687.getClass(), "enableMinimalUpdate", term31719);
        setField(term31687, term31687.getClass(), "strictSpecBehavior", term31721);
        setField(term31687, term31687.getClass(), "templateDir", "ITRRYiuDwH");
        setField(term31687, term31687.getClass(), "templatingEngineName", "handlebars");
        setField(term31687, term31687.getClass(), "ignoreFileOverride", "llRfwANcVF");
        setField(term31687, term31687.getClass(), "hideGenerationTimestamp", term31759);
        setField(term31687, term31687.getClass(), "intsAllowedForFloatDoubleFormats", term31761);
        setField(term31687, term31687.getClass(), "globalProperties", term31763);
        term31768 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term31768;
        callMethod(klass, "withRemoveOperationIdPrefix", argTypes, term31687, args);
    }

};


