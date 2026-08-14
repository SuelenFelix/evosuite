package org.openapijsonschematools.codegen.templating;

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
import static org.openapijsonschematools.codegen.templating.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class TemplateDefinition_setTemplateType_9808985987 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6871;
     Object enum16;

    public TemplateDefinition_setTemplateType_9808985987() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6941 = Class.forName((String) "org.openapijsonschematools.codegen.templating.TemplateFileType");
        Field term6940 = ((Class) term6941).getDeclaredField((String) "SupportingFiles");
        ((Field) term6940).setAccessible(true);
        Object enum15 = ((Field) term6940).get((Object) null);
        term6871 = newInstance(Class.forName("org.openapijsonschematools.codegen.templating.TemplateDefinition"));
        setField(term6871, term6871.getClass(), "templateFile", "");
        setField(term6871, term6871.getClass(), "folder", "");
        setField(term6871, term6871.getClass(), "destinationFilename", "");
        setField(term6871, term6871.getClass(), "templateType", enum15);
        Class<? extends Object> term7303 = Class.forName((String) "org.openapijsonschematools.codegen.templating.TemplateFileType");
        Field term7302 = ((Class) term7303).getDeclaredField((String) "ModelTests");
        ((Field) term7302).setAccessible(true);
        enum16 = ((Field) term7302).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.templating.TemplateDefinition");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openapijsonschematools.codegen.templating.TemplateFileType");
        Object[] args = new Object[1];
        args[0] = enum16;
        callMethod(klass, "setTemplateType", argTypes, term6871, args);
    }

};


