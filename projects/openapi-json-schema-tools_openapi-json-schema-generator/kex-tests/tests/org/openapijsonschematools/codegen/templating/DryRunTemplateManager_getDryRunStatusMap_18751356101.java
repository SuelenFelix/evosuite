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

public class DryRunTemplateManager_getDryRunStatusMap_18751356101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4623;

    public DryRunTemplateManager_getDryRunStatusMap_18751356101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4627 = new HashMap();
        term4623 = newInstance(Class.forName("org.openapijsonschematools.codegen.templating.DryRunTemplateManager"));
        Object term4624 = newInstance(Class.forName("org.openapijsonschematools.codegen.templating.TemplateManagerOptions"));
        setBooleanField(term4624, term4624.getClass(), "minimalUpdate", true);
        setBooleanField(term4624, term4624.getClass(), "skipOverwrite", true);
        setField(term4623, term4623.getClass(), "options", term4624);
        setField(term4623, term4623.getClass(), "dryRunStatusMap", term4627);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.templating.DryRunTemplateManager");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDryRunStatusMap", argTypes, term4623, args);
    }

};


