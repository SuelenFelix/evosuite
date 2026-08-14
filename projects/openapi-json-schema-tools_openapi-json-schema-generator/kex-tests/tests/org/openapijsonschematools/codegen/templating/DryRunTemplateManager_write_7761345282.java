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
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.lang.String;

public class DryRunTemplateManager_write_7761345282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4637;
     Object term4651;
     Object term4736;

    public DryRunTemplateManager_write_7761345282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4641 = new HashMap();
        term4637 = newInstance(Class.forName("org.openapijsonschematools.codegen.templating.DryRunTemplateManager"));
        Object term4638 = newInstance(Class.forName("org.openapijsonschematools.codegen.templating.TemplateManagerOptions"));
        setBooleanField(term4638, term4638.getClass(), "minimalUpdate", false);
        setBooleanField(term4638, term4638.getClass(), "skipOverwrite", false);
        setField(term4637, term4637.getClass(), "options", term4638);
        setField(term4637, term4637.getClass(), "dryRunStatusMap", term4641);
        term4651 = new LinkedHashMap();
        Class<? extends Object> term4782 = Class.forName((String) "java.io.File$PathStatus");
        Field term4781 = ((Class) term4782).getDeclaredField((String) "INVALID");
        ((Field) term4781).setAccessible(true);
        Object enum10 = ((Field) term4781).get((Object) null);
        term4736 = newInstance(Class.forName("java.io.File"));
        setField(term4736, term4736.getClass(), "path", "uWHnvSvaPl");
        setField(term4736, term4736.getClass(), "status", enum10);
        setIntField(term4736, term4736.getClass(), "prefixLength", 391863371);
        setField(term4736, term4736.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.templating.DryRunTemplateManager");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.util.Map");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.io.File");
        Object[] args = new Object[3];
        args[0] = term4651;
        args[1] = "fhkbdRViHi";
        args[2] = term4736;
        callMethod(klass, "write", argTypes, term4637, args);
    }

};


