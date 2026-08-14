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

public class VariantCoding_VarNaming_writeTo_6997446533 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum13;
     Object term21353;

    public VariantCoding_VarNaming_writeTo_6997446533() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term21380 = Class.forName((String) "net.alenzen.a2l.VariantCoding$VarNaming");
        Field term21379 = ((Class) term21380).getDeclaredField((String) "NUMERIC");
        ((Field) term21379).setAccessible(true);
        enum13 = ((Field) term21379).get((Object) null);
        term21353 = newInstance(Class.forName("net.alenzen.a2l.A2LWriter"));
        byte[] term21354 = (byte[]) newByteArray(5);
        byte[] term21360 = (byte[]) newByteArray(6);
        setByteElement(term21354, 0, (byte) 122);
        setByteElement(term21354, 1, (byte) 83);
        setByteElement(term21354, 2, (byte) -123);
        setByteElement(term21354, 3, (byte) -76);
        setByteElement(term21354, 4, (byte) -115);
        setField(term21353, term21353.getClass(), "lineBreak", term21354);
        setByteElement(term21360, 0, (byte) -48);
        setByteElement(term21360, 1, (byte) 126);
        setByteElement(term21360, 2, (byte) -2);
        setByteElement(term21360, 3, (byte) 103);
        setByteElement(term21360, 4, (byte) 23);
        setByteElement(term21360, 5, (byte) 96);
        setField(term21353, term21353.getClass(), "indentation", term21360);
        setField(term21353, term21353.getClass(), "charset", null);
        setField(term21353, term21353.getClass(), "os", null);
        setIntField(term21353, term21353.getClass(), "indentationDepth", 444029505);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.VariantCoding$VarNaming");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.alenzen.a2l.A2LWriter");
        Object[] args = new Object[1];
        args[0] = term21353;
        callMethod(klass, "writeTo", argTypes, enum13, args);
    }

};


