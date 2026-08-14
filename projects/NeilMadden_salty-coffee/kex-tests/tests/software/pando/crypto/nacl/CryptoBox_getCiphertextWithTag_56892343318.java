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

public class CryptoBox_getCiphertextWithTag_56892343318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1461;

    public CryptoBox_getCiphertextWithTag_56892343318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1461 = newInstance(Class.forName("software.pando.crypto.nacl.CryptoBox"));
        Object term1462 = newInstance(Class.forName("software.pando.crypto.nacl.SecretBox"));
        byte[] term1463 = (byte[]) newByteArray(7);
        byte[] term1471 = (byte[]) newByteArray(0);
        setByteElement(term1463, 0, (byte) -39);
        setByteElement(term1463, 1, (byte) 30);
        setByteElement(term1463, 2, (byte) -119);
        setByteElement(term1463, 3, (byte) 94);
        setByteElement(term1463, 4, (byte) -52);
        setByteElement(term1463, 5, (byte) -33);
        setByteElement(term1463, 6, (byte) 16);
        setField(term1462, term1462.getClass(), "nonce", term1463);
        setField(term1462, term1462.getClass(), "ciphertext", term1471);
        setField(term1461, term1461.getClass(), "box", term1462);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.CryptoBox");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCiphertextWithTag", argTypes, term1461, args);
    }

};


