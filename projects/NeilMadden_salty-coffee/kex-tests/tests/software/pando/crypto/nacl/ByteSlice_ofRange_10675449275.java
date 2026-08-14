package software.pando.crypto.nacl;

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
import static software.pando.crypto.nacl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class ByteSlice_ofRange_10675449275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term566;
     Object term575;
     Object term577;

    public ByteSlice_ofRange_10675449275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term566 = (byte[]) newByteArray(8);
        setByteElement(term566, 0, (byte) -54);
        setByteElement(term566, 1, (byte) -25);
        setByteElement(term566, 2, (byte) -35);
        setByteElement(term566, 3, (byte) 3);
        setByteElement(term566, 4, (byte) -10);
        setByteElement(term566, 5, (byte) -106);
        setByteElement(term566, 6, (byte) -124);
        setByteElement(term566, 7, (byte) -71);
        term575 = new Integer(579005622);
        term577 = new Integer(-14890619);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.ByteSlice");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term566;
        args[1] = term575;
        args[2] = term577;
        callMethod(klass, "ofRange", argTypes, null, args);
    }

};


