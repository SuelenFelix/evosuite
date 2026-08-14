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
import java.lang.Integer;

public class A2LWriter_setIndentationDepth_19528015119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23759;
     Object term23773;

    public A2LWriter_setIndentationDepth_19528015119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23759 = newInstance(Class.forName("net.alenzen.a2l.A2LWriter"));
        byte[] term23760 = (byte[]) newByteArray(4);
        byte[] term23765 = (byte[]) newByteArray(6);
        setByteElement(term23760, 0, (byte) 20);
        setByteElement(term23760, 1, (byte) -114);
        setByteElement(term23760, 2, (byte) 93);
        setByteElement(term23760, 3, (byte) -60);
        setField(term23759, term23759.getClass(), "lineBreak", term23760);
        setByteElement(term23765, 0, (byte) -4);
        setByteElement(term23765, 1, (byte) 28);
        setByteElement(term23765, 2, (byte) 94);
        setByteElement(term23765, 4, (byte) -96);
        setByteElement(term23765, 5, (byte) -88);
        setField(term23759, term23759.getClass(), "indentation", term23765);
        setField(term23759, term23759.getClass(), "charset", null);
        setField(term23759, term23759.getClass(), "os", null);
        setIntField(term23759, term23759.getClass(), "indentationDepth", 1532716628);
        term23773 = new Integer(-1801760683);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.A2LWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term23773;
        callMethod(klass, "setIndentationDepth", argTypes, term23759, args);
    }

};


