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

public class Ed25519_PublicKey_getKeyBytes_4709110884 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term472;

    public Ed25519_PublicKey_getKeyBytes_4709110884() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term472 = newInstance(Class.forName("software.pando.crypto.nacl.Ed25519$PublicKey"));
        byte[] term473 = (byte[]) newByteArray(8);
        setByteElement(term473, 0, (byte) 39);
        setByteElement(term473, 1, (byte) -1);
        setByteElement(term473, 2, (byte) 117);
        setByteElement(term473, 3, (byte) 43);
        setByteElement(term473, 4, (byte) -27);
        setByteElement(term473, 5, (byte) 34);
        setByteElement(term473, 6, (byte) -126);
        setByteElement(term473, 7, (byte) 12);
        setField(term472, term472.getClass(), "keyBytes", term473);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Ed25519$PublicKey");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getKeyBytes", argTypes, term472, args);
    }

};


