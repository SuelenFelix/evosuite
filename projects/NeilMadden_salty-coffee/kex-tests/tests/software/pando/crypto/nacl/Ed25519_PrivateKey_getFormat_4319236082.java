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

public class Ed25519_PrivateKey_getFormat_4319236082 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1669;

    public Ed25519_PrivateKey_getFormat_4319236082() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1669 = newInstance(Class.forName("software.pando.crypto.nacl.Ed25519$PrivateKey"));
        byte[] term1670 = (byte[]) newByteArray(5);
        byte[] term1676 = (byte[]) newByteArray(3);
        setByteElement(term1670, 0, (byte) -107);
        setByteElement(term1670, 1, (byte) 119);
        setByteElement(term1670, 2, (byte) -109);
        setByteElement(term1670, 3, (byte) 87);
        setByteElement(term1670, 4, (byte) 97);
        setField(term1669, term1669.getClass(), "keyBytes", term1670);
        setByteElement(term1676, 0, (byte) 51);
        setByteElement(term1676, 1, (byte) 24);
        setByteElement(term1676, 2, (byte) -14);
        setField(term1669, term1669.getClass(), "publicKey", term1676);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Ed25519$PrivateKey");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFormat", argTypes, term1669, args);
    }

};


