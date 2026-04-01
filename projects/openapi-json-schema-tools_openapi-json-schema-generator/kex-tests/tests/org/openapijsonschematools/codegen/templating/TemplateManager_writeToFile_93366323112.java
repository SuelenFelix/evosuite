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
import java.lang.Object;

public class TemplateManager_writeToFile_93366323112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4329;
     Object term4346;

    public TemplateManager_writeToFile_93366323112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4329 = newInstance(Class.forName("org.openapijsonschematools.codegen.templating.TemplateManager"));
        Object term4330 = newInstance(Class.forName("org.openapijsonschematools.codegen.templating.TemplateManagerOptions"));
        Object[] term4333 = (Object[]) newArray("org.openapijsonschematools.codegen.templating.TemplatePathLocator", 1);
        setBooleanField(term4330, term4330.getClass(), "minimalUpdate", true);
        setBooleanField(term4330, term4330.getClass(), "skipOverwrite", true);
        setField(term4329, term4329.getClass(), "options", term4330);
        setField(term4329, term4329.getClass(), "engineAdapter", null);
        setField(term4329, term4329.getClass(), "templateLoaders", term4333);
        setField(term4329, term4329.getClass(), "LOGGER", null);
        term4346 = (byte[]) newByteArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.templating.TemplateManager");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = "nGKItKLYNC";
        args[1] = term4346;
        callMethod(klass, "writeToFile", argTypes, term4329, args);
    }

};


