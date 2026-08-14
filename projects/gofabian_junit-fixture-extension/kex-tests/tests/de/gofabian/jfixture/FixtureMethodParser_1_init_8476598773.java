package de.gofabian.jfixture;

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
import static de.gofabian.jfixture.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class FixtureMethodParser_1_init_8476598773 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3696;

    public FixtureMethodParser_1_init_8476598773() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3696 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.gofabian.jfixture.FixtureMethodParser$1");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = Class.forName("de.gofabian.jfixture.FixtureMethodParser");
        argTypes[1] = Class.forName("de.gofabian.jfixture.Scope");
        argTypes[2] = Class.forName("de.gofabian.jfixture.api.FixtureId");
        argTypes[3] = Class.forName("java.util.List");
        argTypes[4] = boolean.class;
        argTypes[5] = Array.newInstance(Class.forName("java.lang.Class"), 0).getClass();
        argTypes[6] = Class.forName("java.lang.reflect.Method");
        argTypes[7] = Class.forName("java.lang.Object");
        Object[] args = new Object[8];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = term3696;
        args[5] = null;
        args[6] = null;
        args[7] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


