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

public class CryptoBox_getCiphertextWithoutTag_141699966519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1479;

    public CryptoBox_getCiphertextWithoutTag_141699966519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1479 = newInstance(Class.forName("software.pando.crypto.nacl.CryptoBox"));
        Object term1480 = newInstance(Class.forName("software.pando.crypto.nacl.SecretBox"));
        byte[] term1481 = (byte[]) newByteArray(9);
        byte[] term1491 = (byte[]) newByteArray(6);
        setByteElement(term1481, 0, (byte) 20);
        setByteElement(term1481, 1, (byte) -114);
        setByteElement(term1481, 2, (byte) 93);
        setByteElement(term1481, 3, (byte) -60);
        setByteElement(term1481, 4, (byte) -4);
        setByteElement(term1481, 5, (byte) 28);
        setByteElement(term1481, 6, (byte) 94);
        setByteElement(term1481, 8, (byte) -96);
        setField(term1480, term1480.getClass(), "nonce", term1481);
        setByteElement(term1491, 0, (byte) -88);
        setByteElement(term1491, 1, (byte) -73);
        setByteElement(term1491, 2, (byte) 105);
        setByteElement(term1491, 3, (byte) -86);
        setByteElement(term1491, 4, (byte) 84);
        setByteElement(term1491, 5, (byte) -70);
        setField(term1480, term1480.getClass(), "ciphertext", term1491);
        setField(term1479, term1479.getClass(), "box", term1480);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.CryptoBox");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCiphertextWithoutTag", argTypes, term1479, args);
    }

};


