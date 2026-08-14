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

public class Ed25519_PrivateKey_getEncoded_14616089023 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1688;

    public Ed25519_PrivateKey_getEncoded_14616089023() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1688 = newInstance(Class.forName("software.pando.crypto.nacl.Ed25519$PrivateKey"));
        byte[] term1689 = (byte[]) newByteArray(4);
        byte[] term1694 = (byte[]) newByteArray(8);
        setByteElement(term1689, 0, (byte) 74);
        setByteElement(term1689, 1, (byte) 56);
        setByteElement(term1689, 2, (byte) -76);
        setByteElement(term1689, 3, (byte) -29);
        setField(term1688, term1688.getClass(), "keyBytes", term1689);
        setByteElement(term1694, 0, (byte) 121);
        setByteElement(term1694, 1, (byte) -17);
        setByteElement(term1694, 2, (byte) -123);
        setByteElement(term1694, 3, (byte) -76);
        setByteElement(term1694, 4, (byte) -46);
        setByteElement(term1694, 5, (byte) -82);
        setByteElement(term1694, 6, (byte) -105);
        setByteElement(term1694, 7, (byte) 35);
        setField(term1688, term1688.getClass(), "publicKey", term1694);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Ed25519$PrivateKey");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEncoded", argTypes, term1688, args);
    }

};


