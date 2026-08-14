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

public class SecretBox_decryptToString_137219500312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9181;

    public SecretBox_decryptToString_137219500312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9181 = newInstance(Class.forName("software.pando.crypto.nacl.SecretBox"));
        byte[] term9182 = (byte[]) newByteArray(0);
        byte[] term9183 = (byte[]) newByteArray(3);
        setField(term9181, term9181.getClass(), "nonce", term9182);
        setByteElement(term9183, 0, (byte) 5);
        setByteElement(term9183, 1, (byte) -4);
        setByteElement(term9183, 2, (byte) -91);
        setField(term9181, term9181.getClass(), "ciphertext", term9183);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.SecretBox");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.security.Key");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "decryptToString", argTypes, term9181, args);
    }

};


