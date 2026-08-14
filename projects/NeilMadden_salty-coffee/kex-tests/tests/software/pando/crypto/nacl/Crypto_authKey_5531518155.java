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

public class Crypto_authKey_5531518155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1808;

    public Crypto_authKey_5531518155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1808 = newInstance(Class.forName("software.pando.crypto.nacl.ByteSlice"));
        byte[] term1809 = (byte[]) newByteArray(0);
        setField(term1808, term1808.getClass(), "array", term1809);
        setIntField(term1808, term1808.getClass(), "offset", 2055867847);
        setIntField(term1808, term1808.getClass(), "length", -1048298087);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Crypto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("software.pando.crypto.nacl.ByteSlice");
        Object[] args = new Object[1];
        args[0] = term1808;
        callMethod(klass, "authKey", argTypes, null, args);
    }

};


