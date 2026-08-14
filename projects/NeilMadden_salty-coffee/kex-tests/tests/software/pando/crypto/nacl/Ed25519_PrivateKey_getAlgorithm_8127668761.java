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

public class Ed25519_PrivateKey_getAlgorithm_8127668761 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1640;

    public Ed25519_PrivateKey_getAlgorithm_8127668761() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1640 = newInstance(Class.forName("software.pando.crypto.nacl.Ed25519$PrivateKey"));
        byte[] term1641 = (byte[]) newByteArray(7);
        byte[] term1649 = (byte[]) newByteArray(6);
        setByteElement(term1641, 0, (byte) -120);
        setByteElement(term1641, 1, (byte) -55);
        setByteElement(term1641, 2, (byte) 91);
        setByteElement(term1641, 3, (byte) 55);
        setByteElement(term1641, 4, (byte) -5);
        setByteElement(term1641, 5, (byte) -4);
        setByteElement(term1641, 6, (byte) -61);
        setField(term1640, term1640.getClass(), "keyBytes", term1641);
        setByteElement(term1649, 0, (byte) -34);
        setByteElement(term1649, 1, (byte) 73);
        setByteElement(term1649, 2, (byte) 10);
        setByteElement(term1649, 3, (byte) 36);
        setByteElement(term1649, 4, (byte) 103);
        setByteElement(term1649, 5, (byte) -64);
        setField(term1640, term1640.getClass(), "publicKey", term1649);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Ed25519$PrivateKey");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAlgorithm", argTypes, term1640, args);
    }

};


