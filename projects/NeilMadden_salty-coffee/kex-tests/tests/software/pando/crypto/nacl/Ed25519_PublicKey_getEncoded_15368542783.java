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

public class Ed25519_PublicKey_getEncoded_15368542783 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term462;

    public Ed25519_PublicKey_getEncoded_15368542783() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term462 = newInstance(Class.forName("software.pando.crypto.nacl.Ed25519$PublicKey"));
        byte[] term463 = (byte[]) newByteArray(4);
        setByteElement(term463, 0, (byte) -120);
        setByteElement(term463, 1, (byte) 96);
        setByteElement(term463, 2, (byte) -41);
        setByteElement(term463, 3, (byte) -88);
        setField(term462, term462.getClass(), "keyBytes", term463);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Ed25519$PublicKey");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEncoded", argTypes, term462, args);
    }

};


