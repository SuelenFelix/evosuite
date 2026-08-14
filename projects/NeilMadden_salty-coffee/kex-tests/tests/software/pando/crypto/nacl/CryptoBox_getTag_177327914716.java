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

public class CryptoBox_getTag_177327914716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1419;

    public CryptoBox_getTag_177327914716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1419 = newInstance(Class.forName("software.pando.crypto.nacl.CryptoBox"));
        Object term1420 = newInstance(Class.forName("software.pando.crypto.nacl.SecretBox"));
        byte[] term1421 = (byte[]) newByteArray(1);
        byte[] term1423 = (byte[]) newByteArray(6);
        setByteElement(term1421, 0, (byte) 90);
        setField(term1420, term1420.getClass(), "nonce", term1421);
        setByteElement(term1423, 0, (byte) -34);
        setByteElement(term1423, 1, (byte) -2);
        setByteElement(term1423, 2, (byte) 96);
        setByteElement(term1423, 3, (byte) 55);
        setByteElement(term1423, 4, (byte) -103);
        setByteElement(term1423, 5, (byte) -103);
        setField(term1420, term1420.getClass(), "ciphertext", term1423);
        setField(term1419, term1419.getClass(), "box", term1420);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.CryptoBox");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTag", argTypes, term1419, args);
    }

};


