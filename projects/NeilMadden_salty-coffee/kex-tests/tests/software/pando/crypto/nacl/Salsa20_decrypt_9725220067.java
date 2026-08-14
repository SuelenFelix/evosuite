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

public class Salsa20_decrypt_9725220067 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term323;
     Object term331;
     Object term334;
     Object term344;

    public Salsa20_decrypt_9725220067() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term323 = (byte[]) newByteArray(7);
        setByteElement(term323, 0, (byte) -128);
        setByteElement(term323, 1, (byte) 66);
        setByteElement(term323, 2, (byte) -112);
        setByteElement(term323, 3, (byte) 81);
        setByteElement(term323, 4, (byte) 65);
        setByteElement(term323, 5, (byte) -44);
        setByteElement(term323, 6, (byte) 33);
        term331 = (byte[]) newByteArray(2);
        setByteElement(term331, 0, (byte) -74);
        setByteElement(term331, 1, (byte) -84);
        term334 = newInstance(Class.forName("software.pando.crypto.nacl.ByteSlice"));
        byte[] term335 = (byte[]) newByteArray(6);
        setByteElement(term335, 0, (byte) -53);
        setByteElement(term335, 1, (byte) -93);
        setByteElement(term335, 2, (byte) 82);
        setByteElement(term335, 3, (byte) -89);
        setByteElement(term335, 4, (byte) 24);
        setByteElement(term335, 5, (byte) 123);
        setField(term334, term334.getClass(), "array", term335);
        setIntField(term334, term334.getClass(), "offset", 1193880199);
        setIntField(term334, term334.getClass(), "length", -1087774327);
        term344 = newInstance(Class.forName("software.pando.crypto.nacl.ByteSlice"));
        byte[] term345 = (byte[]) newByteArray(6);
        setByteElement(term345, 0, (byte) -101);
        setByteElement(term345, 1, (byte) -102);
        setByteElement(term345, 2, (byte) -95);
        setByteElement(term345, 3, (byte) -2);
        setByteElement(term345, 4, (byte) 28);
        setByteElement(term345, 5, (byte) 84);
        setField(term344, term344.getClass(), "array", term345);
        setIntField(term344, term344.getClass(), "offset", -1530420153);
        setIntField(term344, term344.getClass(), "length", -469968304);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Salsa20");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        argTypes[2] = Class.forName("software.pando.crypto.nacl.ByteSlice");
        argTypes[3] = Class.forName("software.pando.crypto.nacl.ByteSlice");
        Object[] args = new Object[4];
        args[0] = term323;
        args[1] = term331;
        args[2] = term334;
        args[3] = term344;
        callMethod(klass, "decrypt", argTypes, null, args);
    }

};


