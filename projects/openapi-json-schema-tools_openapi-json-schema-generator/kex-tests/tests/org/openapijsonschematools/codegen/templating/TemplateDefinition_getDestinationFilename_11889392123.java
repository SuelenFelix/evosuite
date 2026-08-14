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

public class TemplateDefinition_getDestinationFilename_11889392123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5251;

    public TemplateDefinition_getDestinationFilename_11889392123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5295 = Class.forName((String) "org.openapijsonschematools.codegen.templating.TemplateFileType");
        Field term5294 = ((Class) term5295).getDeclaredField((String) "SupportingFiles");
        ((Field) term5294).setAccessible(true);
        Object enum11 = ((Field) term5294).get((Object) null);
        term5251 = newInstance(Class.forName("org.openapijsonschematools.codegen.templating.TemplateDefinition"));
        setField(term5251, term5251.getClass(), "templateFile", "");
        setField(term5251, term5251.getClass(), "folder", "");
        setField(term5251, term5251.getClass(), "destinationFilename", "");
        setField(term5251, term5251.getClass(), "templateType", enum11);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.templating.TemplateDefinition");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDestinationFilename", argTypes, term5251, args);
    }

};


