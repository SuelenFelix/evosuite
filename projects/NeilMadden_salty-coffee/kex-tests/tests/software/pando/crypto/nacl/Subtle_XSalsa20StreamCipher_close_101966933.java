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

public class Subtle_XSalsa20StreamCipher_close_101966933 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9488;

    public Subtle_XSalsa20StreamCipher_close_101966933() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9488 = newInstance(Class.forName("software.pando.crypto.nacl.Subtle$XSalsa20StreamCipher"));
        byte[] term9489 = (byte[]) newByteArray(4);
        byte[] term9494 = (byte[]) newByteArray(2);
        setByteElement(term9489, 0, (byte) 111);
        setByteElement(term9489, 1, (byte) 106);
        setByteElement(term9489, 2, (byte) -8);
        setByteElement(term9489, 3, (byte) 106);
        setField(term9488, term9488.getClass(), "key", term9489);
        setByteElement(term9494, 0, (byte) -105);
        setByteElement(term9494, 1, (byte) -27);
        setField(term9488, term9488.getClass(), "nonce", term9494);
        setLongField(term9488, term9488.getClass(), "blockCounter", 1044883697493326351L);
        setBooleanField(term9488, term9488.getClass(), "closed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Subtle$XSalsa20StreamCipher");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term9488, args);
    }

};


