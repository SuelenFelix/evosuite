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

public class CryptoBox_getNonce_57873487017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1437;

    public CryptoBox_getNonce_57873487017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1437 = newInstance(Class.forName("software.pando.crypto.nacl.CryptoBox"));
        Object term1438 = newInstance(Class.forName("software.pando.crypto.nacl.SecretBox"));
        byte[] term1439 = (byte[]) newByteArray(4);
        byte[] term1444 = (byte[]) newByteArray(6);
        setByteElement(term1439, 0, (byte) -98);
        setByteElement(term1439, 1, (byte) -119);
        setByteElement(term1439, 2, (byte) 120);
        setByteElement(term1439, 3, (byte) -15);
        setField(term1438, term1438.getClass(), "nonce", term1439);
        setByteElement(term1444, 0, (byte) 115);
        setByteElement(term1444, 1, (byte) 52);
        setByteElement(term1444, 2, (byte) 96);
        setByteElement(term1444, 3, (byte) 40);
        setByteElement(term1444, 4, (byte) -5);
        setByteElement(term1444, 5, (byte) 24);
        setField(term1438, term1438.getClass(), "ciphertext", term1444);
        setField(term1437, term1437.getClass(), "box", term1438);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.CryptoBox");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNonce", argTypes, term1437, args);
    }

};


