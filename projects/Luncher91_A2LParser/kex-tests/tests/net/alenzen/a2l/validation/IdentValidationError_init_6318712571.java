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

public class IdentValidationError_init_6318712571 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30570;

    public IdentValidationError_init_6318712571() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term30705 = Class.forName((String) "net.alenzen.a2l.antlr.a2lParser$S_rec_layout_expContext");
        term30570 = ((Class) term30705).getDeclaredField((String) "Name");
        ((Field) term30570).setAccessible(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.validation.IdentValidationError");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.reflect.Field");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("net.alenzen.a2l.IAsap2TreeElement");
        Object[] args = new Object[3];
        args[0] = term30570;
        args[1] = "PqywFWJlpE";
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


