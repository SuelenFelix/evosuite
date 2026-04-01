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

public class DryRunTemplateManager_error_6807658856 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5037;

    public DryRunTemplateManager_error_6807658856() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5041 = new HashMap();
        term5037 = newInstance(Class.forName("org.openapijsonschematools.codegen.templating.DryRunTemplateManager"));
        Object term5038 = newInstance(Class.forName("org.openapijsonschematools.codegen.templating.TemplateManagerOptions"));
        setBooleanField(term5038, term5038.getClass(), "minimalUpdate", true);
        setBooleanField(term5038, term5038.getClass(), "skipOverwrite", false);
        setField(term5037, term5037.getClass(), "options", term5038);
        setField(term5037, term5037.getClass(), "dryRunStatusMap", term5041);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.templating.DryRunTemplateManager");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.nio.file.Path");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = "vQVyKLdtaz";
        callMethod(klass, "error", argTypes, term5037, args);
    }

};


