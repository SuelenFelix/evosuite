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

public class CryptoBox_init_79877409011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1327;

    public CryptoBox_init_79877409011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1327 = newInstance(Class.forName("software.pando.crypto.nacl.SecretBox"));
        byte[] term1328 = (byte[]) newByteArray(0);
        byte[] term1329 = (byte[]) newByteArray(6);
        setField(term1327, term1327.getClass(), "nonce", term1328);
        setByteElement(term1329, 0, (byte) -113);
        setByteElement(term1329, 1, (byte) 90);
        setByteElement(term1329, 2, (byte) 10);
        setByteElement(term1329, 3, (byte) 87);
        setByteElement(term1329, 4, (byte) -35);
        setByteElement(term1329, 5, (byte) -14);
        setField(term1327, term1327.getClass(), "ciphertext", term1329);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.CryptoBox");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("software.pando.crypto.nacl.SecretBox");
        Object[] args = new Object[1];
        args[0] = term1327;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


