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

public class Measurement_LayoutIndexMode_writeTo_17744702503 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum33;
     Object term55606;

    public Measurement_LayoutIndexMode_writeTo_17744702503() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term55649 = Class.forName((String) "net.alenzen.a2l.Measurement$LayoutIndexMode");
        Field term55648 = ((Class) term55649).getDeclaredField((String) "ROW_DIR");
        ((Field) term55648).setAccessible(true);
        enum33 = ((Field) term55648).get((Object) null);
        term55606 = newInstance(Class.forName("net.alenzen.a2l.A2LWriter"));
        byte[] term55607 = (byte[]) newByteArray(7);
        byte[] term55615 = (byte[]) newByteArray(6);
        setByteElement(term55607, 0, (byte) 49);
        setByteElement(term55607, 1, (byte) 74);
        setByteElement(term55607, 2, (byte) 37);
        setByteElement(term55607, 3, (byte) -78);
        setByteElement(term55607, 4, (byte) 3);
        setByteElement(term55607, 5, (byte) -30);
        setByteElement(term55607, 6, (byte) -67);
        setField(term55606, term55606.getClass(), "lineBreak", term55607);
        setByteElement(term55615, 0, (byte) -67);
        setByteElement(term55615, 1, (byte) -94);
        setByteElement(term55615, 2, (byte) 78);
        setByteElement(term55615, 3, (byte) 8);
        setByteElement(term55615, 4, (byte) 25);
        setByteElement(term55615, 5, (byte) 103);
        setField(term55606, term55606.getClass(), "indentation", term55615);
        setField(term55606, term55606.getClass(), "charset", null);
        setField(term55606, term55606.getClass(), "os", null);
        setIntField(term55606, term55606.getClass(), "indentationDepth", 306847454);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.Measurement$LayoutIndexMode");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.alenzen.a2l.A2LWriter");
        Object[] args = new Object[1];
        args[0] = term55606;
        callMethod(klass, "writeTo", argTypes, enum33, args);
    }

};


