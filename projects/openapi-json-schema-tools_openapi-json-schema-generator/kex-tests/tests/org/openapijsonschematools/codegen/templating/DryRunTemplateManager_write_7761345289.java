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

public class DryRunTemplateManager_write_7761345289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5074;

    public DryRunTemplateManager_write_7761345289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5074 = newInstance(Class.forName("org.openapijsonschematools.codegen.templating.DryRunTemplateManager"));
        setField(term5074, term5074.getClass(), "options", null);
        setField(term5074, term5074.getClass(), "dryRunStatusMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.templating.DryRunTemplateManager");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.util.Map");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.io.File");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "write", argTypes, term5074, args);
    }

};


