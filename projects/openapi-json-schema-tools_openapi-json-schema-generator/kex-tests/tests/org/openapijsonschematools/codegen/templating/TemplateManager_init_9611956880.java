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

public class TemplateManager_init_9611956880 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3758;
     Object term3761;

    public TemplateManager_init_9611956880() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3758 = newInstance(Class.forName("org.openapijsonschematools.codegen.templating.TemplateManagerOptions"));
        setBooleanField(term3758, term3758.getClass(), "minimalUpdate", true);
        setBooleanField(term3758, term3758.getClass(), "skipOverwrite", false);
        term3761 = (Object[]) newArray("org.openapijsonschematools.codegen.templating.TemplatePathLocator", 5);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.templating.TemplateManager");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.openapijsonschematools.codegen.templating.TemplateManagerOptions");
        argTypes[1] = Class.forName("org.openapijsonschematools.codegen.templating.TemplatingEngineAdapter");
        argTypes[2] = Array.newInstance(Class.forName("org.openapijsonschematools.codegen.templating.TemplatePathLocator"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term3758;
        args[1] = null;
        args[2] = term3761;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


