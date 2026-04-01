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

public class TemplateManager_getInputStream_11678499637 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3919;

    public TemplateManager_getInputStream_11678499637() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3919 = newInstance(Class.forName("org.openapijsonschematools.codegen.templating.TemplateManager"));
        Object term3920 = newInstance(Class.forName("org.openapijsonschematools.codegen.templating.TemplateManagerOptions"));
        Object[] term3923 = (Object[]) newArray("org.openapijsonschematools.codegen.templating.TemplatePathLocator", 2);
        setBooleanField(term3920, term3920.getClass(), "minimalUpdate", false);
        setBooleanField(term3920, term3920.getClass(), "skipOverwrite", true);
        setField(term3919, term3919.getClass(), "options", term3920);
        setField(term3919, term3919.getClass(), "engineAdapter", null);
        setField(term3919, term3919.getClass(), "templateLoaders", term3923);
        setField(term3919, term3919.getClass(), "LOGGER", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.templating.TemplateManager");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "Ghbwtircqb";
        callMethod(klass, "getInputStream", argTypes, term3919, args);
    }

};


