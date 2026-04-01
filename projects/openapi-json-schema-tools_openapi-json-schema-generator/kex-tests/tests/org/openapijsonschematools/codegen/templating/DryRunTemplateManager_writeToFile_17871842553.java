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

public class DryRunTemplateManager_writeToFile_17871842553 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4924;
     Object term4950;

    public DryRunTemplateManager_writeToFile_17871842553() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4928 = new HashMap();
        term4924 = newInstance(Class.forName("org.openapijsonschematools.codegen.templating.DryRunTemplateManager"));
        Object term4925 = newInstance(Class.forName("org.openapijsonschematools.codegen.templating.TemplateManagerOptions"));
        setBooleanField(term4925, term4925.getClass(), "minimalUpdate", false);
        setBooleanField(term4925, term4925.getClass(), "skipOverwrite", true);
        setField(term4924, term4924.getClass(), "options", term4925);
        setField(term4924, term4924.getClass(), "dryRunStatusMap", term4928);
        term4950 = (byte[]) newByteArray(2);
        setByteElement(term4950, 0, (byte) -54);
        setByteElement(term4950, 1, (byte) -10);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.templating.DryRunTemplateManager");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = "tPlsykYBqO";
        args[1] = term4950;
        callMethod(klass, "writeToFile", argTypes, term4924, args);
    }

};


