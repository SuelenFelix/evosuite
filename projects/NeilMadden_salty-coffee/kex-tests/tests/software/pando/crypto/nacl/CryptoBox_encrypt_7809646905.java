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

public class CryptoBox_encrypt_7809646905 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1278;
     Object term1285;

    public CryptoBox_encrypt_7809646905() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1278 = (byte[]) newByteArray(6);
        setByteElement(term1278, 0, (byte) 112);
        setByteElement(term1278, 1, (byte) 77);
        setByteElement(term1278, 2, (byte) -1);
        setByteElement(term1278, 3, (byte) -83);
        setByteElement(term1278, 4, (byte) -63);
        setByteElement(term1278, 5, (byte) 108);
        term1285 = (byte[]) newByteArray(5);
        setByteElement(term1285, 0, (byte) -105);
        setByteElement(term1285, 1, (byte) 33);
        setByteElement(term1285, 2, (byte) 109);
        setByteElement(term1285, 3, (byte) -54);
        setByteElement(term1285, 4, (byte) -85);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.CryptoBox");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.security.PrivateKey");
        argTypes[1] = Class.forName("java.security.PublicKey");
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        argTypes[3] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = term1278;
        args[3] = term1285;
        callMethod(klass, "encrypt", argTypes, null, args);
    }

};


