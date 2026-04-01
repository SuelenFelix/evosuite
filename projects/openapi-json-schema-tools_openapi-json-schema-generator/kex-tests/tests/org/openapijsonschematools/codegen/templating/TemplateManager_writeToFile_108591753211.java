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

public class TemplateManager_writeToFile_108591753211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4280;

    public TemplateManager_writeToFile_108591753211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4280 = newInstance(Class.forName("org.openapijsonschematools.codegen.templating.TemplateManager"));
        Object term4281 = newInstance(Class.forName("org.openapijsonschematools.codegen.templating.TemplateManagerOptions"));
        Object[] term4284 = (Object[]) newArray("org.openapijsonschematools.codegen.templating.TemplatePathLocator", 0);
        setBooleanField(term4281, term4281.getClass(), "minimalUpdate", false);
        setBooleanField(term4281, term4281.getClass(), "skipOverwrite", true);
        setField(term4280, term4280.getClass(), "options", term4281);
        setField(term4280, term4280.getClass(), "engineAdapter", null);
        setField(term4280, term4280.getClass(), "templateLoaders", term4284);
        setField(term4280, term4280.getClass(), "LOGGER", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.templating.TemplateManager");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "xLbjWUgOIL";
        args[1] = "jDtqGUpnZN";
        callMethod(klass, "writeToFile", argTypes, term4280, args);
    }

};


