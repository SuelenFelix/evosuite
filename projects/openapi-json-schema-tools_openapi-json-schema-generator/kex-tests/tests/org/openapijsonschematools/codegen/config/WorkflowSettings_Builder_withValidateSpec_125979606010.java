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

public class WorkflowSettings_Builder_withValidateSpec_125979606010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32183;
     Object term32264;

    public WorkflowSettings_Builder_withValidateSpec_125979606010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term32199 = new Boolean(false);
        Boolean term32201 = new Boolean(false);
        Boolean term32203 = new Boolean(false);
        Boolean term32205 = new Boolean(false);
        Boolean term32207 = new Boolean(false);
        Boolean term32209 = new Boolean(false);
        Boolean term32211 = new Boolean(true);
        Boolean term32213 = new Boolean(false);
        Boolean term32215 = new Boolean(false);
        Boolean term32217 = new Boolean(true);
        Boolean term32255 = new Boolean(true);
        Boolean term32257 = new Boolean(false);
        HashMap term32259 = new HashMap();
        term32183 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings$Builder"));
        setField(term32183, term32183.getClass(), "inputSpec", "mhQDwIyrRi");
        setField(term32183, term32183.getClass(), "outputDir", ".");
        setField(term32183, term32183.getClass(), "verbose", term32199);
        setField(term32183, term32183.getClass(), "skipOverwrite", term32201);
        setField(term32183, term32183.getClass(), "removeOperationIdPrefix", term32203);
        setField(term32183, term32183.getClass(), "removeEnumValuePrefix", term32205);
        setField(term32183, term32183.getClass(), "skipOperationExample", term32207);
        setField(term32183, term32183.getClass(), "logToStderr", term32209);
        setField(term32183, term32183.getClass(), "validateSpec", term32211);
        setField(term32183, term32183.getClass(), "enablePostProcessFile", term32213);
        setField(term32183, term32183.getClass(), "enableMinimalUpdate", term32215);
        setField(term32183, term32183.getClass(), "strictSpecBehavior", term32217);
        setField(term32183, term32183.getClass(), "templateDir", "HpZXWDPhlg");
        setField(term32183, term32183.getClass(), "templatingEngineName", "handlebars");
        setField(term32183, term32183.getClass(), "ignoreFileOverride", "lBOokzEPfe");
        setField(term32183, term32183.getClass(), "hideGenerationTimestamp", term32255);
        setField(term32183, term32183.getClass(), "intsAllowedForFloatDoubleFormats", term32257);
        setField(term32183, term32183.getClass(), "globalProperties", term32259);
        term32264 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term32264;
        callMethod(klass, "withValidateSpec", argTypes, term32183, args);
    }

};


