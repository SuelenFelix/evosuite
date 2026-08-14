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

public class TemplateManager_readTemplate_3530926965 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3865;

    public TemplateManager_readTemplate_3530926965() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3865 = newInstance(Class.forName("org.openapijsonschematools.codegen.templating.TemplateManager"));
        Object term3866 = newInstance(Class.forName("org.openapijsonschematools.codegen.templating.TemplateManagerOptions"));
        Object[] term3869 = (Object[]) newArray("org.openapijsonschematools.codegen.templating.TemplatePathLocator", 1);
        setBooleanField(term3866, term3866.getClass(), "minimalUpdate", false);
        setBooleanField(term3866, term3866.getClass(), "skipOverwrite", true);
        setField(term3865, term3865.getClass(), "options", term3866);
        setField(term3865, term3865.getClass(), "engineAdapter", null);
        setField(term3865, term3865.getClass(), "templateLoaders", term3869);
        setField(term3865, term3865.getClass(), "LOGGER", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.templating.TemplateManager");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SbAoxhfrkn";
        callMethod(klass, "readTemplate", argTypes, term3865, args);
    }

};


