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

public class WorkflowSettings_init_9305358860 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37010;

    public WorkflowSettings_init_9305358860() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term37026 = new Boolean(false);
        Boolean term37028 = new Boolean(false);
        Boolean term37030 = new Boolean(false);
        Boolean term37032 = new Boolean(false);
        Boolean term37034 = new Boolean(false);
        Boolean term37036 = new Boolean(false);
        Boolean term37038 = new Boolean(true);
        Boolean term37040 = new Boolean(false);
        Boolean term37042 = new Boolean(false);
        Boolean term37044 = new Boolean(true);
        Boolean term37082 = new Boolean(true);
        Boolean term37084 = new Boolean(false);
        HashMap term37086 = new HashMap();
        term37010 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings$Builder"));
        setField(term37010, term37010.getClass(), "inputSpec", "ckQLZGFjMX");
        setField(term37010, term37010.getClass(), "outputDir", ".");
        setField(term37010, term37010.getClass(), "verbose", term37026);
        setField(term37010, term37010.getClass(), "skipOverwrite", term37028);
        setField(term37010, term37010.getClass(), "removeOperationIdPrefix", term37030);
        setField(term37010, term37010.getClass(), "removeEnumValuePrefix", term37032);
        setField(term37010, term37010.getClass(), "skipOperationExample", term37034);
        setField(term37010, term37010.getClass(), "logToStderr", term37036);
        setField(term37010, term37010.getClass(), "validateSpec", term37038);
        setField(term37010, term37010.getClass(), "enablePostProcessFile", term37040);
        setField(term37010, term37010.getClass(), "enableMinimalUpdate", term37042);
        setField(term37010, term37010.getClass(), "strictSpecBehavior", term37044);
        setField(term37010, term37010.getClass(), "templateDir", "qphdrqUtNx");
        setField(term37010, term37010.getClass(), "templatingEngineName", "handlebars");
        setField(term37010, term37010.getClass(), "ignoreFileOverride", "bwlLFAfNWx");
        setField(term37010, term37010.getClass(), "hideGenerationTimestamp", term37082);
        setField(term37010, term37010.getClass(), "intsAllowedForFloatDoubleFormats", term37084);
        setField(term37010, term37010.getClass(), "globalProperties", term37086);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings$Builder");
        Object[] args = new Object[1];
        args[0] = term37010;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


