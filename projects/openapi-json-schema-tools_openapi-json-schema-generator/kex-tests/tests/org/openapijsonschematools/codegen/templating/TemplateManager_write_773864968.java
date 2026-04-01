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
import java.util.LinkedHashMap;
import java.lang.String;

public class TemplateManager_write_773864968 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3946;
     Object term3951;
     Object term4016;

    public TemplateManager_write_773864968() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3946 = newInstance(Class.forName("org.openapijsonschematools.codegen.templating.TemplateManager"));
        Object term3947 = newInstance(Class.forName("org.openapijsonschematools.codegen.templating.TemplateManagerOptions"));
        Object[] term3950 = (Object[]) newArray("org.openapijsonschematools.codegen.templating.TemplatePathLocator", 6);
        setBooleanField(term3947, term3947.getClass(), "minimalUpdate", true);
        setBooleanField(term3947, term3947.getClass(), "skipOverwrite", true);
        setField(term3946, term3946.getClass(), "options", term3947);
        setField(term3946, term3946.getClass(), "engineAdapter", null);
        setField(term3946, term3946.getClass(), "templateLoaders", term3950);
        setField(term3946, term3946.getClass(), "LOGGER", null);
        term3951 = new LinkedHashMap();
        Class<? extends Object> term4084 = Class.forName((String) "java.io.File$PathStatus");
        Field term4083 = ((Class) term4084).getDeclaredField((String) "INVALID");
        ((Field) term4083).setAccessible(true);
        Object enum8 = ((Field) term4083).get((Object) null);
        term4016 = newInstance(Class.forName("java.io.File"));
        setField(term4016, term4016.getClass(), "path", "GzFkzHGYFt");
        setField(term4016, term4016.getClass(), "status", enum8);
        setIntField(term4016, term4016.getClass(), "prefixLength", 568599855);
        setField(term4016, term4016.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.templating.TemplateManager");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.util.Map");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.io.File");
        Object[] args = new Object[3];
        args[0] = term3951;
        args[1] = "BndsHwAFMv";
        args[2] = term4016;
        callMethod(klass, "write", argTypes, term3946, args);
    }

};


