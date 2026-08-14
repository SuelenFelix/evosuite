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

public class Salsa20_encrypt_204146586 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term275;
     Object term281;
     Object term288;
     Object term297;

    public Salsa20_encrypt_204146586() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term275 = (byte[]) newByteArray(5);
        setByteElement(term275, 0, (byte) 45);
        setByteElement(term275, 1, (byte) -39);
        setByteElement(term275, 2, (byte) -20);
        setByteElement(term275, 3, (byte) 10);
        setByteElement(term275, 4, (byte) 77);
        term281 = (byte[]) newByteArray(6);
        setByteElement(term281, 0, (byte) 14);
        setByteElement(term281, 1, (byte) -101);
        setByteElement(term281, 2, (byte) 35);
        setByteElement(term281, 3, (byte) 66);
        setByteElement(term281, 4, (byte) 123);
        setByteElement(term281, 5, (byte) -5);
        term288 = newInstance(Class.forName("software.pando.crypto.nacl.ByteSlice"));
        byte[] term289 = (byte[]) newByteArray(5);
        setByteElement(term289, 0, (byte) 84);
        setByteElement(term289, 1, (byte) -97);
        setByteElement(term289, 2, (byte) -24);
        setByteElement(term289, 3, (byte) 88);
        setByteElement(term289, 4, (byte) 96);
        setField(term288, term288.getClass(), "array", term289);
        setIntField(term288, term288.getClass(), "offset", -203030934);
        setIntField(term288, term288.getClass(), "length", -1179120542);
        term297 = newInstance(Class.forName("software.pando.crypto.nacl.ByteSlice"));
        byte[] term298 = (byte[]) newByteArray(3);
        setByteElement(term298, 0, (byte) 70);
        setByteElement(term298, 1, (byte) 48);
        setByteElement(term298, 2, (byte) -46);
        setField(term297, term297.getClass(), "array", term298);
        setIntField(term297, term297.getClass(), "offset", -73683645);
        setIntField(term297, term297.getClass(), "length", -226514366);
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
        args[0] = term275;
        args[1] = term281;
        args[2] = term288;
        args[3] = term297;
        callMethod(klass, "encrypt", argTypes, null, args);
    }

};


