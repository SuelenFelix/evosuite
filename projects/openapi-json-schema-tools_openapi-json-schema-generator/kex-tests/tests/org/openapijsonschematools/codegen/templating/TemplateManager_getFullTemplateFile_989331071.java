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

public class TemplateManager_getFullTemplateFile_989331071 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3762;

    public TemplateManager_getFullTemplateFile_989331071() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3762 = newInstance(Class.forName("org.openapijsonschematools.codegen.templating.TemplateManager"));
        Object term3763 = newInstance(Class.forName("org.openapijsonschematools.codegen.templating.TemplateManagerOptions"));
        Object[] term3766 = (Object[]) newArray("org.openapijsonschematools.codegen.templating.TemplatePathLocator", 4);
        setBooleanField(term3763, term3763.getClass(), "minimalUpdate", true);
        setBooleanField(term3763, term3763.getClass(), "skipOverwrite", false);
        setField(term3762, term3762.getClass(), "options", term3763);
        setField(term3762, term3762.getClass(), "engineAdapter", null);
        setField(term3762, term3762.getClass(), "templateLoaders", term3766);
        setField(term3762, term3762.getClass(), "LOGGER", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.templating.TemplateManager");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "TEParAifyi";
        callMethod(klass, "getFullTemplateFile", argTypes, term3762, args);
    }

};


