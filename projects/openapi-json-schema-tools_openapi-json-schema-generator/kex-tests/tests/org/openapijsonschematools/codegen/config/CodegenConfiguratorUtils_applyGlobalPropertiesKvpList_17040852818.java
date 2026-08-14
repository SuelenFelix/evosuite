package org.openapijsonschematools.codegen.config;

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
import static org.openapijsonschematools.codegen.config.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CodegenConfiguratorUtils_applyGlobalPropertiesKvpList_17040852818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39966;

    public CodegenConfiguratorUtils_applyGlobalPropertiesKvpList_17040852818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39966 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.CodegenConfiguratorUtils"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.CodegenConfiguratorUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("org.openapijsonschematools.codegen.config.CodegenConfigurator");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "applyGlobalPropertiesKvpList", argTypes, term39966, args);
    }

};


