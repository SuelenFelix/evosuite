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
import java.lang.Long;

public class XSalsa20_encrypt_1626380162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4442;
     Object term4446;
     Object term4456;
     Object term4458;
     Object term4467;

    public XSalsa20_encrypt_1626380162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4442 = (byte[]) newByteArray(3);
        setByteElement(term4442, 0, (byte) -81);
        setByteElement(term4442, 1, (byte) 122);
        setByteElement(term4442, 2, (byte) 27);
        term4446 = (byte[]) newByteArray(9);
        setByteElement(term4446, 0, (byte) -118);
        setByteElement(term4446, 1, (byte) 37);
        setByteElement(term4446, 2, (byte) -9);
        setByteElement(term4446, 3, (byte) -3);
        setByteElement(term4446, 4, (byte) 68);
        setByteElement(term4446, 5, (byte) 108);
        setByteElement(term4446, 6, (byte) 118);
        setByteElement(term4446, 7, (byte) 111);
        setByteElement(term4446, 8, (byte) -122);
        term4456 = new Long(-4043093655001688454L);
        term4458 = newInstance(Class.forName("software.pando.crypto.nacl.ByteSlice"));
        byte[] term4459 = (byte[]) newByteArray(5);
        setByteElement(term4459, 0, (byte) -76);
        setByteElement(term4459, 1, (byte) -97);
        setByteElement(term4459, 2, (byte) 101);
        setByteElement(term4459, 3, (byte) 111);
        setByteElement(term4459, 4, (byte) -38);
        setField(term4458, term4458.getClass(), "array", term4459);
        setIntField(term4458, term4458.getClass(), "offset", 962840079);
        setIntField(term4458, term4458.getClass(), "length", 1540719661);
        term4467 = newInstance(Class.forName("software.pando.crypto.nacl.ByteSlice"));
        byte[] term4468 = (byte[]) newByteArray(5);
        setByteElement(term4468, 0, (byte) 24);
        setByteElement(term4468, 1, (byte) 43);
        setByteElement(term4468, 2, (byte) -126);
        setByteElement(term4468, 3, (byte) -59);
        setByteElement(term4468, 4, (byte) 27);
        setField(term4467, term4467.getClass(), "array", term4468);
        setIntField(term4467, term4467.getClass(), "offset", 1265463001);
        setIntField(term4467, term4467.getClass(), "length", 335112684);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.XSalsa20");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        argTypes[2] = long.class;
        argTypes[3] = Class.forName("software.pando.crypto.nacl.ByteSlice");
        argTypes[4] = Class.forName("software.pando.crypto.nacl.ByteSlice");
        Object[] args = new Object[5];
        args[0] = term4442;
        args[1] = term4446;
        args[2] = term4456;
        args[3] = term4458;
        args[4] = term4467;
        callMethod(klass, "encrypt", argTypes, null, args);
    }

};


