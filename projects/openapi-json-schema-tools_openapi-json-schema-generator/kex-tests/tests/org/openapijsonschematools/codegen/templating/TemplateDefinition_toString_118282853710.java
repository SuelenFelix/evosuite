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

public class TemplateDefinition_toString_118282853710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8460;

    public TemplateDefinition_toString_118282853710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8504 = Class.forName((String) "org.openapijsonschematools.codegen.templating.TemplateFileType");
        Field term8503 = ((Class) term8504).getDeclaredField((String) "SupportingFiles");
        ((Field) term8503).setAccessible(true);
        Object enum19 = ((Field) term8503).get((Object) null);
        term8460 = newInstance(Class.forName("org.openapijsonschematools.codegen.templating.TemplateDefinition"));
        setField(term8460, term8460.getClass(), "templateFile", "");
        setField(term8460, term8460.getClass(), "folder", "");
        setField(term8460, term8460.getClass(), "destinationFilename", "");
        setField(term8460, term8460.getClass(), "templateType", enum19);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.templating.TemplateDefinition");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term8460, args);
    }

};


