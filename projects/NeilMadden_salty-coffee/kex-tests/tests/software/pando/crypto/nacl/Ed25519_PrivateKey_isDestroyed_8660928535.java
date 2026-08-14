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

public class Ed25519_PrivateKey_isDestroyed_8660928535 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1726;

    public Ed25519_PrivateKey_isDestroyed_8660928535() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1726 = newInstance(Class.forName("software.pando.crypto.nacl.Ed25519$PrivateKey"));
        byte[] term1727 = (byte[]) newByteArray(1);
        byte[] term1729 = (byte[]) newByteArray(0);
        setByteElement(term1727, 0, (byte) -44);
        setField(term1726, term1726.getClass(), "keyBytes", term1727);
        setField(term1726, term1726.getClass(), "publicKey", term1729);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Ed25519$PrivateKey");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isDestroyed", argTypes, term1726, args);
    }

};


