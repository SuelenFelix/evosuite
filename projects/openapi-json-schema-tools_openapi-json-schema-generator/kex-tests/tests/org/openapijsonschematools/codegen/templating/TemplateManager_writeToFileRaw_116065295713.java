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

public class TemplateManager_writeToFileRaw_116065295713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4357;
     Object term4374;

    public TemplateManager_writeToFileRaw_116065295713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4357 = newInstance(Class.forName("org.openapijsonschematools.codegen.templating.TemplateManager"));
        Object term4358 = newInstance(Class.forName("org.openapijsonschematools.codegen.templating.TemplateManagerOptions"));
        Object[] term4361 = (Object[]) newArray("org.openapijsonschematools.codegen.templating.TemplatePathLocator", 2);
        setBooleanField(term4358, term4358.getClass(), "minimalUpdate", true);
        setBooleanField(term4358, term4358.getClass(), "skipOverwrite", true);
        setField(term4357, term4357.getClass(), "options", term4358);
        setField(term4357, term4357.getClass(), "engineAdapter", null);
        setField(term4357, term4357.getClass(), "templateLoaders", term4361);
        setField(term4357, term4357.getClass(), "LOGGER", null);
        term4374 = (byte[]) newByteArray(7);
        setByteElement(term4374, 0, (byte) 47);
        setByteElement(term4374, 1, (byte) 48);
        setByteElement(term4374, 2, (byte) 89);
        setByteElement(term4374, 3, (byte) 75);
        setByteElement(term4374, 4, (byte) 18);
        setByteElement(term4374, 5, (byte) -58);
        setByteElement(term4374, 6, (byte) -29);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.templating.TemplateManager");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = "UiUYnPrcCi";
        args[1] = term4374;
        callMethod(klass, "writeToFileRaw", argTypes, term4357, args);
    }

};


