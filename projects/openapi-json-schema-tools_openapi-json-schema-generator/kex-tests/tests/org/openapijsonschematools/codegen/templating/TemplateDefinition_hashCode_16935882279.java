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

public class TemplateDefinition_hashCode_16935882279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8055;

    public TemplateDefinition_hashCode_16935882279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8099 = Class.forName((String) "org.openapijsonschematools.codegen.templating.TemplateFileType");
        Field term8098 = ((Class) term8099).getDeclaredField((String) "SupportingFiles");
        ((Field) term8098).setAccessible(true);
        Object enum18 = ((Field) term8098).get((Object) null);
        term8055 = newInstance(Class.forName("org.openapijsonschematools.codegen.templating.TemplateDefinition"));
        setField(term8055, term8055.getClass(), "templateFile", "");
        setField(term8055, term8055.getClass(), "folder", "");
        setField(term8055, term8055.getClass(), "destinationFilename", "");
        setField(term8055, term8055.getClass(), "templateType", enum18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.templating.TemplateDefinition");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term8055, args);
    }

};


