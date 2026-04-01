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

public class TemplateManager_skip_211271218010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4253;

    public TemplateManager_skip_211271218010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4253 = newInstance(Class.forName("org.openapijsonschematools.codegen.templating.TemplateManager"));
        Object term4254 = newInstance(Class.forName("org.openapijsonschematools.codegen.templating.TemplateManagerOptions"));
        Object[] term4257 = (Object[]) newArray("org.openapijsonschematools.codegen.templating.TemplatePathLocator", 7);
        setBooleanField(term4254, term4254.getClass(), "minimalUpdate", false);
        setBooleanField(term4254, term4254.getClass(), "skipOverwrite", false);
        setField(term4253, term4253.getClass(), "options", term4254);
        setField(term4253, term4253.getClass(), "engineAdapter", null);
        setField(term4253, term4253.getClass(), "templateLoaders", term4257);
        setField(term4253, term4253.getClass(), "LOGGER", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.templating.TemplateManager");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.nio.file.Path");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = "LvtrsXUliU";
        callMethod(klass, "skip", argTypes, term4253, args);
    }

};


