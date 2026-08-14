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

public class Ed25519_PrivateKey_getHashedScalar_4403205416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1731;

    public Ed25519_PrivateKey_getHashedScalar_4403205416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1731 = newInstance(Class.forName("software.pando.crypto.nacl.Ed25519$PrivateKey"));
        byte[] term1732 = (byte[]) newByteArray(1);
        byte[] term1734 = (byte[]) newByteArray(5);
        setByteElement(term1732, 0, (byte) 100);
        setField(term1731, term1731.getClass(), "keyBytes", term1732);
        setByteElement(term1734, 0, (byte) -90);
        setByteElement(term1734, 1, (byte) -49);
        setByteElement(term1734, 2, (byte) -102);
        setByteElement(term1734, 3, (byte) -74);
        setByteElement(term1734, 4, (byte) 40);
        setField(term1731, term1731.getClass(), "publicKey", term1734);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Ed25519$PrivateKey");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHashedScalar", argTypes, term1731, args);
    }

};


