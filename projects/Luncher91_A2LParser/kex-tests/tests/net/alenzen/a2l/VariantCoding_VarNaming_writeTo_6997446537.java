package net.alenzen.a2l;

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
import static net.alenzen.a2l.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class VariantCoding_VarNaming_writeTo_6997446537 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum16;

    public VariantCoding_VarNaming_writeTo_6997446537() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term22068 = Class.forName((String) "net.alenzen.a2l.VariantCoding$VarNaming");
        Field term22067 = ((Class) term22068).getDeclaredField((String) "NUMERIC");
        ((Field) term22067).setAccessible(true);
        enum16 = ((Field) term22067).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.VariantCoding$VarNaming");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.alenzen.a2l.A2LWriter");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "writeTo", argTypes, enum16, args);
    }

};


