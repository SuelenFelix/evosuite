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

public class Ed25519_PrivateKey_getPublicKey_17761752507 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1746;

    public Ed25519_PrivateKey_getPublicKey_17761752507() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1746 = newInstance(Class.forName("software.pando.crypto.nacl.Ed25519$PrivateKey"));
        byte[] term1747 = (byte[]) newByteArray(3);
        byte[] term1751 = (byte[]) newByteArray(2);
        setByteElement(term1747, 0, (byte) 73);
        setByteElement(term1747, 1, (byte) 109);
        setByteElement(term1747, 2, (byte) 76);
        setField(term1746, term1746.getClass(), "keyBytes", term1747);
        setByteElement(term1751, 0, (byte) -34);
        setByteElement(term1751, 1, (byte) -92);
        setField(term1746, term1746.getClass(), "publicKey", term1751);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Ed25519$PrivateKey");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPublicKey", argTypes, term1746, args);
    }

};


