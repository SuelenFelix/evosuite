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

public class WorkflowSettings_Builder_withTemplateDir_208365008914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32679;

    public WorkflowSettings_Builder_withTemplateDir_208365008914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term32695 = new Boolean(false);
        Boolean term32697 = new Boolean(false);
        Boolean term32699 = new Boolean(false);
        Boolean term32701 = new Boolean(false);
        Boolean term32703 = new Boolean(false);
        Boolean term32705 = new Boolean(false);
        Boolean term32707 = new Boolean(true);
        Boolean term32709 = new Boolean(false);
        Boolean term32711 = new Boolean(false);
        Boolean term32713 = new Boolean(true);
        Boolean term32751 = new Boolean(true);
        Boolean term32753 = new Boolean(false);
        HashMap term32755 = new HashMap();
        term32679 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings$Builder"));
        setField(term32679, term32679.getClass(), "inputSpec", "jiUSjqwSIQ");
        setField(term32679, term32679.getClass(), "outputDir", ".");
        setField(term32679, term32679.getClass(), "verbose", term32695);
        setField(term32679, term32679.getClass(), "skipOverwrite", term32697);
        setField(term32679, term32679.getClass(), "removeOperationIdPrefix", term32699);
        setField(term32679, term32679.getClass(), "removeEnumValuePrefix", term32701);
        setField(term32679, term32679.getClass(), "skipOperationExample", term32703);
        setField(term32679, term32679.getClass(), "logToStderr", term32705);
        setField(term32679, term32679.getClass(), "validateSpec", term32707);
        setField(term32679, term32679.getClass(), "enablePostProcessFile", term32709);
        setField(term32679, term32679.getClass(), "enableMinimalUpdate", term32711);
        setField(term32679, term32679.getClass(), "strictSpecBehavior", term32713);
        setField(term32679, term32679.getClass(), "templateDir", "MgLCedQfoj");
        setField(term32679, term32679.getClass(), "templatingEngineName", "handlebars");
        setField(term32679, term32679.getClass(), "ignoreFileOverride", "zgKiINdgNu");
        setField(term32679, term32679.getClass(), "hideGenerationTimestamp", term32751);
        setField(term32679, term32679.getClass(), "intsAllowedForFloatDoubleFormats", term32753);
        setField(term32679, term32679.getClass(), "globalProperties", term32755);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "zLMTXDQHYH";
        callMethod(klass, "withTemplateDir", argTypes, term32679, args);
    }

};


