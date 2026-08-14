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

public class DryRunTemplateManager_skip_12591911565 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5001;

    public DryRunTemplateManager_skip_12591911565() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5005 = new HashMap();
        term5001 = newInstance(Class.forName("org.openapijsonschematools.codegen.templating.DryRunTemplateManager"));
        Object term5002 = newInstance(Class.forName("org.openapijsonschematools.codegen.templating.TemplateManagerOptions"));
        setBooleanField(term5002, term5002.getClass(), "minimalUpdate", true);
        setBooleanField(term5002, term5002.getClass(), "skipOverwrite", true);
        setField(term5001, term5001.getClass(), "options", term5002);
        setField(term5001, term5001.getClass(), "dryRunStatusMap", term5005);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.templating.DryRunTemplateManager");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.nio.file.Path");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = "HqBOwkVqjD";
        callMethod(klass, "skip", argTypes, term5001, args);
    }

};


