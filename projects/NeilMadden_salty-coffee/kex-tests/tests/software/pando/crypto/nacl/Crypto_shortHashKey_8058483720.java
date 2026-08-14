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

public class Crypto_shortHashKey_8058483720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1946;

    public Crypto_shortHashKey_8058483720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1946 = newInstance(Class.forName("software.pando.crypto.nacl.ByteSlice"));
        byte[] term1947 = (byte[]) newByteArray(5);
        setByteElement(term1947, 0, (byte) 127);
        setByteElement(term1947, 1, (byte) 58);
        setByteElement(term1947, 2, (byte) -98);
        setByteElement(term1947, 3, (byte) 48);
        setByteElement(term1947, 4, (byte) 15);
        setField(term1946, term1946.getClass(), "array", term1947);
        setIntField(term1946, term1946.getClass(), "offset", -184153539);
        setIntField(term1946, term1946.getClass(), "length", 493620644);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Crypto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("software.pando.crypto.nacl.ByteSlice");
        Object[] args = new Object[1];
        args[0] = term1946;
        callMethod(klass, "shortHashKey", argTypes, null, args);
    }

};


