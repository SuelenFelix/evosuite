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

public class Ed25519_PublicKey_getFormat_5071689842 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term442;

    public Ed25519_PublicKey_getFormat_5071689842() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term442 = newInstance(Class.forName("software.pando.crypto.nacl.Ed25519$PublicKey"));
        byte[] term443 = (byte[]) newByteArray(9);
        setByteElement(term443, 0, (byte) -5);
        setByteElement(term443, 1, (byte) -124);
        setByteElement(term443, 2, (byte) -105);
        setByteElement(term443, 3, (byte) 25);
        setByteElement(term443, 4, (byte) 16);
        setByteElement(term443, 5, (byte) 39);
        setByteElement(term443, 6, (byte) 123);
        setByteElement(term443, 7, (byte) 16);
        setByteElement(term443, 8, (byte) 2);
        setField(term442, term442.getClass(), "keyBytes", term443);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Ed25519$PublicKey");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFormat", argTypes, term442, args);
    }

};


