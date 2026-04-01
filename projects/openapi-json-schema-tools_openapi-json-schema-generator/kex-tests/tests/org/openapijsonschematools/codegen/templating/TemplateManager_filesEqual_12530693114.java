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
import java.lang.String;

public class TemplateManager_filesEqual_12530693114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4399;
     Object term4404;
     Object term4429;

    public TemplateManager_filesEqual_12530693114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4399 = newInstance(Class.forName("org.openapijsonschematools.codegen.templating.TemplateManager"));
        Object term4400 = newInstance(Class.forName("org.openapijsonschematools.codegen.templating.TemplateManagerOptions"));
        Object[] term4403 = (Object[]) newArray("org.openapijsonschematools.codegen.templating.TemplatePathLocator", 1);
        setBooleanField(term4400, term4400.getClass(), "minimalUpdate", true);
        setBooleanField(term4400, term4400.getClass(), "skipOverwrite", false);
        setField(term4399, term4399.getClass(), "options", term4400);
        setField(term4399, term4399.getClass(), "engineAdapter", null);
        setField(term4399, term4399.getClass(), "templateLoaders", term4403);
        setField(term4399, term4399.getClass(), "LOGGER", null);
        Class<? extends Object> term4454 = Class.forName((String) "java.io.File$PathStatus");
        Field term4453 = ((Class) term4454).getDeclaredField((String) "INVALID");
        ((Field) term4453).setAccessible(true);
        Object enum9 = ((Field) term4453).get((Object) null);
        term4404 = newInstance(Class.forName("java.io.File"));
        setField(term4404, term4404.getClass(), "path", "UoYtihxVaS");
        setField(term4404, term4404.getClass(), "status", enum9);
        setIntField(term4404, term4404.getClass(), "prefixLength", 1162663216);
        setField(term4404, term4404.getClass(), "filePath", null);
        term4429 = newInstance(Class.forName("java.io.File"));
        setField(term4429, term4429.getClass(), "path", "JDswTTCZHV");
        setField(term4429, term4429.getClass(), "status", enum9);
        setIntField(term4429, term4429.getClass(), "prefixLength", 1484323161);
        setField(term4429, term4429.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.templating.TemplateManager");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.File");
        argTypes[1] = Class.forName("java.io.File");
        Object[] args = new Object[2];
        args[0] = term4404;
        args[1] = term4429;
        callMethod(klass, "filesEqual", argTypes, term4399, args);
    }

};


