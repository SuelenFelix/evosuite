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

public class TemplateDefinition_setTemplateType_98089859818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8869;

    public TemplateDefinition_setTemplateType_98089859818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8869 = newInstance(Class.forName("org.openapijsonschematools.codegen.templating.TemplateDefinition"));
        setField(term8869, term8869.getClass(), "templateFile", null);
        setField(term8869, term8869.getClass(), "folder", null);
        setField(term8869, term8869.getClass(), "destinationFilename", null);
        setField(term8869, term8869.getClass(), "templateType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.templating.TemplateDefinition");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openapijsonschematools.codegen.templating.TemplateFileType");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setTemplateType", argTypes, term8869, args);
    }

};


