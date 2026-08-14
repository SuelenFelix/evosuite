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

public class SecretBox_encrypt_6137134953 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8991;
     Object term8996;

    public SecretBox_encrypt_6137134953() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8991 = (byte[]) newByteArray(4);
        setByteElement(term8991, 0, (byte) -121);
        setByteElement(term8991, 1, (byte) 43);
        setByteElement(term8991, 2, (byte) 18);
        setByteElement(term8991, 3, (byte) -43);
        term8996 = (byte[]) newByteArray(3);
        setByteElement(term8996, 0, (byte) -64);
        setByteElement(term8996, 1, (byte) 42);
        setByteElement(term8996, 2, (byte) 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.SecretBox");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.security.Key");
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term8991;
        args[2] = term8996;
        callMethod(klass, "encrypt", argTypes, null, args);
    }

};


