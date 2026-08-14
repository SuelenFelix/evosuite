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

public class ByteSlice_of_1868889306 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term587;
     Object term597;

    public ByteSlice_of_1868889306() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term587 = (byte[]) newByteArray(9);
        setByteElement(term587, 0, (byte) 113);
        setByteElement(term587, 1, (byte) -77);
        setByteElement(term587, 2, (byte) -12);
        setByteElement(term587, 3, (byte) 58);
        setByteElement(term587, 4, (byte) 12);
        setByteElement(term587, 5, (byte) 79);
        setByteElement(term587, 6, (byte) -4);
        setByteElement(term587, 7, (byte) -27);
        setByteElement(term587, 8, (byte) 120);
        term597 = new Integer(1632125673);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.ByteSlice");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term587;
        args[1] = term597;
        callMethod(klass, "of", argTypes, null, args);
    }

};


