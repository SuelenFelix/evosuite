package de.wyraz.sml;

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
import static de.wyraz.sml.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class SMLPublicOpenResponse_setSmlVersion_147535977412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term647;
     Object term674;

    public SMLPublicOpenResponse_setSmlVersion_147535977412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term672 = new Integer(679763016);
        term647 = newInstance(Class.forName("de.wyraz.sml.SMLPublicOpenResponse"));
        byte[] term648 = (byte[]) newByteArray(2);
        byte[] term651 = (byte[]) newByteArray(7);
        byte[] term659 = (byte[]) newByteArray(2);
        byte[] term662 = (byte[]) newByteArray(9);
        setByteElement(term648, 0, (byte) 87);
        setByteElement(term648, 1, (byte) -35);
        setField(term647, term647.getClass(), "codepage", term648);
        setByteElement(term651, 0, (byte) -14);
        setByteElement(term651, 1, (byte) 10);
        setByteElement(term651, 2, (byte) 65);
        setByteElement(term651, 3, (byte) -44);
        setByteElement(term651, 4, (byte) 115);
        setByteElement(term651, 5, (byte) -32);
        setByteElement(term651, 6, (byte) -52);
        setField(term647, term647.getClass(), "clientId", term651);
        setByteElement(term659, 0, (byte) 53);
        setByteElement(term659, 1, (byte) 44);
        setField(term647, term647.getClass(), "reqFileId", term659);
        setByteElement(term662, 0, (byte) 49);
        setByteElement(term662, 1, (byte) 114);
        setByteElement(term662, 2, (byte) -81);
        setByteElement(term662, 3, (byte) 127);
        setByteElement(term662, 4, (byte) -24);
        setByteElement(term662, 5, (byte) -89);
        setByteElement(term662, 6, (byte) -35);
        setByteElement(term662, 7, (byte) -59);
        setByteElement(term662, 8, (byte) 73);
        setField(term647, term647.getClass(), "serverId", term662);
        setField(term647, term647.getClass(), "refTime", null);
        setField(term647, term647.getClass(), "smlVersion", term672);
        term674 = new Integer(1962444399);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.sml.SMLPublicOpenResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term674;
        callMethod(klass, "setSmlVersion", argTypes, term647, args);
    }

};


