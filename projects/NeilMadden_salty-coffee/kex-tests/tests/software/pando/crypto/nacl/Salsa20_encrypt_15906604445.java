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

public class Salsa20_encrypt_15906604445 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term246;
     Object term248;
     Object term258;

    public Salsa20_encrypt_15906604445() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term246 = (byte[]) newByteArray(1);
        setByteElement(term246, 0, (byte) -42);
        term248 = (byte[]) newByteArray(9);
        setByteElement(term248, 0, (byte) 116);
        setByteElement(term248, 1, (byte) -81);
        setByteElement(term248, 2, (byte) 102);
        setByteElement(term248, 3, (byte) -118);
        setByteElement(term248, 4, (byte) -126);
        setByteElement(term248, 5, (byte) -91);
        setByteElement(term248, 6, (byte) -104);
        setByteElement(term248, 7, (byte) -89);
        setByteElement(term248, 8, (byte) 13);
        term258 = (byte[]) newByteArray(3);
        setByteElement(term258, 0, (byte) 44);
        setByteElement(term258, 1, (byte) -63);
        setByteElement(term258, 2, (byte) 15);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Salsa20");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term246;
        args[1] = term248;
        args[2] = term258;
        callMethod(klass, "encrypt", argTypes, null, args);
    }

};


