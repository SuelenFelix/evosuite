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

public class XSalsa20Poly1305_decrypt_2115162132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5024;
     Object term5025;
     Object term5033;

    public XSalsa20Poly1305_decrypt_2115162132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5024 = (byte[]) newByteArray(0);
        term5025 = (byte[]) newByteArray(7);
        setByteElement(term5025, 0, (byte) -111);
        setByteElement(term5025, 1, (byte) 3);
        setByteElement(term5025, 2, (byte) 85);
        setByteElement(term5025, 3, (byte) 31);
        setByteElement(term5025, 4, (byte) 71);
        setByteElement(term5025, 5, (byte) -95);
        setByteElement(term5025, 6, (byte) 1);
        term5033 = (byte[]) newByteArray(3);
        setByteElement(term5033, 0, (byte) 112);
        setByteElement(term5033, 1, (byte) -79);
        setByteElement(term5033, 2, (byte) 83);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.XSalsa20Poly1305");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term5024;
        args[1] = term5025;
        args[2] = term5033;
        callMethod(klass, "decrypt", argTypes, null, args);
    }

};


