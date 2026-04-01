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

public class TemplateManager_ignore_15035754319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4226;

    public TemplateManager_ignore_15035754319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4226 = newInstance(Class.forName("org.openapijsonschematools.codegen.templating.TemplateManager"));
        Object term4227 = newInstance(Class.forName("org.openapijsonschematools.codegen.templating.TemplateManagerOptions"));
        Object[] term4230 = (Object[]) newArray("org.openapijsonschematools.codegen.templating.TemplatePathLocator", 3);
        setBooleanField(term4227, term4227.getClass(), "minimalUpdate", true);
        setBooleanField(term4227, term4227.getClass(), "skipOverwrite", true);
        setField(term4226, term4226.getClass(), "options", term4227);
        setField(term4226, term4226.getClass(), "engineAdapter", null);
        setField(term4226, term4226.getClass(), "templateLoaders", term4230);
        setField(term4226, term4226.getClass(), "LOGGER", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.templating.TemplateManager");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.nio.file.Path");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = "tShwQLRGNe";
        callMethod(klass, "ignore", argTypes, term4226, args);
    }

};


