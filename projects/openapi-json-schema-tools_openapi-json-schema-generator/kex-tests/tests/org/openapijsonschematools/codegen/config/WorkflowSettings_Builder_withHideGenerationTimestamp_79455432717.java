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

public class WorkflowSettings_Builder_withHideGenerationTimestamp_79455432717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33111;
     Object term33192;

    public WorkflowSettings_Builder_withHideGenerationTimestamp_79455432717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term33127 = new Boolean(false);
        Boolean term33129 = new Boolean(false);
        Boolean term33131 = new Boolean(false);
        Boolean term33133 = new Boolean(false);
        Boolean term33135 = new Boolean(false);
        Boolean term33137 = new Boolean(false);
        Boolean term33139 = new Boolean(true);
        Boolean term33141 = new Boolean(false);
        Boolean term33143 = new Boolean(false);
        Boolean term33145 = new Boolean(true);
        Boolean term33183 = new Boolean(true);
        Boolean term33185 = new Boolean(false);
        HashMap term33187 = new HashMap();
        term33111 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings$Builder"));
        setField(term33111, term33111.getClass(), "inputSpec", "gltJarNuUk");
        setField(term33111, term33111.getClass(), "outputDir", ".");
        setField(term33111, term33111.getClass(), "verbose", term33127);
        setField(term33111, term33111.getClass(), "skipOverwrite", term33129);
        setField(term33111, term33111.getClass(), "removeOperationIdPrefix", term33131);
        setField(term33111, term33111.getClass(), "removeEnumValuePrefix", term33133);
        setField(term33111, term33111.getClass(), "skipOperationExample", term33135);
        setField(term33111, term33111.getClass(), "logToStderr", term33137);
        setField(term33111, term33111.getClass(), "validateSpec", term33139);
        setField(term33111, term33111.getClass(), "enablePostProcessFile", term33141);
        setField(term33111, term33111.getClass(), "enableMinimalUpdate", term33143);
        setField(term33111, term33111.getClass(), "strictSpecBehavior", term33145);
        setField(term33111, term33111.getClass(), "templateDir", "ZwZIDwYcSW");
        setField(term33111, term33111.getClass(), "templatingEngineName", "handlebars");
        setField(term33111, term33111.getClass(), "ignoreFileOverride", "sOdkipUKRu");
        setField(term33111, term33111.getClass(), "hideGenerationTimestamp", term33183);
        setField(term33111, term33111.getClass(), "intsAllowedForFloatDoubleFormats", term33185);
        setField(term33111, term33111.getClass(), "globalProperties", term33187);
        term33192 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term33192;
        callMethod(klass, "withHideGenerationTimestamp", argTypes, term33111, args);
    }

};


