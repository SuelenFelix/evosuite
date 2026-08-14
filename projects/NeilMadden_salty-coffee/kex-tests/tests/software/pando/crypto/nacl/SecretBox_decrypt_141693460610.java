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

public class SecretBox_decrypt_141693460610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9138;

    public SecretBox_decrypt_141693460610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9138 = newInstance(Class.forName("software.pando.crypto.nacl.SecretBox"));
        byte[] term9139 = (byte[]) newByteArray(2);
        byte[] term9142 = (byte[]) newByteArray(4);
        setByteElement(term9139, 0, (byte) -19);
        setByteElement(term9139, 1, (byte) 75);
        setField(term9138, term9138.getClass(), "nonce", term9139);
        setByteElement(term9142, 0, (byte) -25);
        setByteElement(term9142, 1, (byte) -57);
        setByteElement(term9142, 2, (byte) 69);
        setByteElement(term9142, 3, (byte) -49);
        setField(term9138, term9138.getClass(), "ciphertext", term9142);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.SecretBox");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.security.Key");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "decrypt", argTypes, term9138, args);
    }

};


