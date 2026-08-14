package net.alenzen.a2l.validation;

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
import static net.alenzen.a2l.validation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Asap2StringValidator_validateStringField_19506218022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27295;
     Object term27296;

    public Asap2StringValidator_validateStringField_19506218022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27295 = newInstance(Class.forName("net.alenzen.a2l.validation.Asap2StringValidator"));
        Class<? extends Object> term27419 = Class.forName((String) "java.lang.Error");
        term27296 = ((Class) term27419).getDeclaredField((String) "serialVersionUID");
        ((Field) term27296).setAccessible(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.validation.Asap2StringValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.reflect.Field");
        argTypes[1] = Class.forName("net.alenzen.a2l.IAsap2TreeElement");
        Object[] args = new Object[2];
        args[0] = term27296;
        args[1] = null;
        callMethod(klass, "validateStringField", argTypes, term27295, args);
    }

};


