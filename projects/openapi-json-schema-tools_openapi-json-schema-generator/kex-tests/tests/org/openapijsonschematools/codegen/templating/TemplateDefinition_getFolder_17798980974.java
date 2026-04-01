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

public class TemplateDefinition_getFolder_17798980974 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5656;

    public TemplateDefinition_getFolder_17798980974() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5700 = Class.forName((String) "org.openapijsonschematools.codegen.templating.TemplateFileType");
        Field term5699 = ((Class) term5700).getDeclaredField((String) "SupportingFiles");
        ((Field) term5699).setAccessible(true);
        Object enum12 = ((Field) term5699).get((Object) null);
        term5656 = newInstance(Class.forName("org.openapijsonschematools.codegen.templating.TemplateDefinition"));
        setField(term5656, term5656.getClass(), "templateFile", "");
        setField(term5656, term5656.getClass(), "folder", "");
        setField(term5656, term5656.getClass(), "destinationFilename", "");
        setField(term5656, term5656.getClass(), "templateType", enum12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.templating.TemplateDefinition");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFolder", argTypes, term5656, args);
    }

};


