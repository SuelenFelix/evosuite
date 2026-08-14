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
import java.lang.Object;

public class CryptoBox_decryptToString_113277934315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1401;

    public CryptoBox_decryptToString_113277934315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1401 = newInstance(Class.forName("software.pando.crypto.nacl.CryptoBox"));
        Object term1402 = newInstance(Class.forName("software.pando.crypto.nacl.SecretBox"));
        byte[] term1403 = (byte[]) newByteArray(0);
        byte[] term1404 = (byte[]) newByteArray(7);
        setField(term1402, term1402.getClass(), "nonce", term1403);
        setByteElement(term1404, 0, (byte) -126);
        setByteElement(term1404, 1, (byte) 35);
        setByteElement(term1404, 2, (byte) -46);
        setByteElement(term1404, 3, (byte) -14);
        setByteElement(term1404, 4, (byte) 124);
        setByteElement(term1404, 5, (byte) -124);
        setByteElement(term1404, 6, (byte) -72);
        setField(term1402, term1402.getClass(), "ciphertext", term1404);
        setField(term1401, term1401.getClass(), "box", term1402);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.CryptoBox");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.security.PrivateKey");
        argTypes[1] = Class.forName("java.security.PublicKey");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "decryptToString", argTypes, term1401, args);
    }

};


