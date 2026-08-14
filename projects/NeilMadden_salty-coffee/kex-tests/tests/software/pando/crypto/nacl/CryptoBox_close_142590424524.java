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

public class CryptoBox_close_142590424524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1577;

    public CryptoBox_close_142590424524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1577 = newInstance(Class.forName("software.pando.crypto.nacl.CryptoBox"));
        Object term1578 = newInstance(Class.forName("software.pando.crypto.nacl.SecretBox"));
        byte[] term1579 = (byte[]) newByteArray(5);
        byte[] term1585 = (byte[]) newByteArray(3);
        setByteElement(term1579, 0, (byte) -99);
        setByteElement(term1579, 1, (byte) 61);
        setByteElement(term1579, 2, (byte) 100);
        setByteElement(term1579, 3, (byte) 55);
        setByteElement(term1579, 4, (byte) -111);
        setField(term1578, term1578.getClass(), "nonce", term1579);
        setByteElement(term1585, 0, (byte) -127);
        setByteElement(term1585, 1, (byte) 19);
        setByteElement(term1585, 2, (byte) 83);
        setField(term1578, term1578.getClass(), "ciphertext", term1585);
        setField(term1577, term1577.getClass(), "box", term1578);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.CryptoBox");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term1577, args);
    }

};


