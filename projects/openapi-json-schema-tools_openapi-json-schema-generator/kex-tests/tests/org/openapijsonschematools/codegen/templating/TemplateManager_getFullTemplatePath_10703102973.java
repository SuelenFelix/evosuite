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

public class TemplateManager_getFullTemplatePath_10703102973 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3816;

    public TemplateManager_getFullTemplatePath_10703102973() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3816 = newInstance(Class.forName("org.openapijsonschematools.codegen.templating.TemplateManager"));
        Object term3817 = newInstance(Class.forName("org.openapijsonschematools.codegen.templating.TemplateManagerOptions"));
        Object[] term3820 = (Object[]) newArray("org.openapijsonschematools.codegen.templating.TemplatePathLocator", 4);
        setBooleanField(term3817, term3817.getClass(), "minimalUpdate", true);
        setBooleanField(term3817, term3817.getClass(), "skipOverwrite", false);
        setField(term3816, term3816.getClass(), "options", term3817);
        setField(term3816, term3816.getClass(), "engineAdapter", null);
        setField(term3816, term3816.getClass(), "templateLoaders", term3820);
        setField(term3816, term3816.getClass(), "LOGGER", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.templating.TemplateManager");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "dWRymuLBtr";
        callMethod(klass, "getFullTemplatePath", argTypes, term3816, args);
    }

};


