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

public class SecretBox_encrypt_8073204464 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9007;
     Object term9013;
     Object term9023;

    public SecretBox_encrypt_8073204464() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9007 = (byte[]) newByteArray(5);
        setByteElement(term9007, 0, (byte) 29);
        setByteElement(term9007, 1, (byte) -120);
        setByteElement(term9007, 2, (byte) -15);
        setByteElement(term9007, 3, (byte) 30);
        setByteElement(term9007, 4, (byte) 77);
        term9013 = (byte[]) newByteArray(9);
        setByteElement(term9013, 0, (byte) -27);
        setByteElement(term9013, 1, (byte) -78);
        setByteElement(term9013, 2, (byte) 76);
        setByteElement(term9013, 3, (byte) 15);
        setByteElement(term9013, 4, (byte) 68);
        setByteElement(term9013, 5, (byte) 60);
        setByteElement(term9013, 6, (byte) 118);
        setByteElement(term9013, 7, (byte) -90);
        setByteElement(term9013, 8, (byte) -117);
        term9023 = (byte[]) newByteArray(3);
        setByteElement(term9023, 0, (byte) 124);
        setByteElement(term9023, 1, (byte) -61);
        setByteElement(term9023, 2, (byte) 13);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.SecretBox");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term9007;
        args[1] = term9013;
        args[2] = term9023;
        callMethod(klass, "encrypt", argTypes, null, args);
    }

};


