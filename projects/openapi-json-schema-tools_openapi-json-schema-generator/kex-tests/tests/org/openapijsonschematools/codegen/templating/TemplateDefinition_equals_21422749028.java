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

public class TemplateDefinition_equals_21422749028 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7649;
     Object term7692;

    public TemplateDefinition_equals_21422749028() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7694 = Class.forName((String) "org.openapijsonschematools.codegen.templating.TemplateFileType");
        Field term7693 = ((Class) term7694).getDeclaredField((String) "SupportingFiles");
        ((Field) term7693).setAccessible(true);
        Object enum17 = ((Field) term7693).get((Object) null);
        term7649 = newInstance(Class.forName("org.openapijsonschematools.codegen.templating.TemplateDefinition"));
        setField(term7649, term7649.getClass(), "templateFile", "");
        setField(term7649, term7649.getClass(), "folder", "");
        setField(term7649, term7649.getClass(), "destinationFilename", "");
        setField(term7649, term7649.getClass(), "templateType", enum17);
        term7692 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.templating.TemplateDefinition");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term7692;
        callMethod(klass, "equals", argTypes, term7649, args);
    }

};


