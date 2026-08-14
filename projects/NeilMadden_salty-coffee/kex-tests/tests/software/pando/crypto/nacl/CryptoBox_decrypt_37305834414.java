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

public class CryptoBox_decrypt_37305834414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1371;

    public CryptoBox_decrypt_37305834414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1371 = newInstance(Class.forName("software.pando.crypto.nacl.CryptoBox"));
        Object term1372 = newInstance(Class.forName("software.pando.crypto.nacl.SecretBox"));
        byte[] term1373 = (byte[]) newByteArray(6);
        byte[] term1380 = (byte[]) newByteArray(7);
        setByteElement(term1373, 0, (byte) -24);
        setByteElement(term1373, 1, (byte) -89);
        setByteElement(term1373, 2, (byte) -35);
        setByteElement(term1373, 3, (byte) -59);
        setByteElement(term1373, 4, (byte) 73);
        setByteElement(term1373, 5, (byte) 94);
        setField(term1372, term1372.getClass(), "nonce", term1373);
        setByteElement(term1380, 0, (byte) 114);
        setByteElement(term1380, 1, (byte) 110);
        setByteElement(term1380, 2, (byte) 70);
        setByteElement(term1380, 3, (byte) -46);
        setByteElement(term1380, 4, (byte) -78);
        setByteElement(term1380, 5, (byte) 109);
        setByteElement(term1380, 6, (byte) 17);
        setField(term1372, term1372.getClass(), "ciphertext", term1380);
        setField(term1371, term1371.getClass(), "box", term1372);
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
        callMethod(klass, "decrypt", argTypes, term1371, args);
    }

};


