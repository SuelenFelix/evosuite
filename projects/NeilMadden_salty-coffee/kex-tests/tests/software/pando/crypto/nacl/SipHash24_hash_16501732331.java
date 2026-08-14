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

public class SipHash24_hash_16501732331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public SipHash24_hash_16501732331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = (byte[]) newByteArray(5);
        setByteElement(term1, 0, (byte) 47);
        setByteElement(term1, 1, (byte) 48);
        setByteElement(term1, 2, (byte) 89);
        setByteElement(term1, 3, (byte) 75);
        setByteElement(term1, 4, (byte) 18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.SipHash24");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("javax.crypto.SecretKey");
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1;
        callMethod(klass, "hash", argTypes, null, args);
    }

};


