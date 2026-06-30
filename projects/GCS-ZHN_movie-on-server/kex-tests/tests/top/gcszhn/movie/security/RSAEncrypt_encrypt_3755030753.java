package top.gcszhn.movie.security;

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
import static top.gcszhn.movie.security.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class RSAEncrypt_encrypt_3755030753 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2682;

    public RSAEncrypt_encrypt_3755030753() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2682 = (byte[]) newByteArray(5);
        setByteElement(term2682, 0, (byte) 47);
        setByteElement(term2682, 1, (byte) 48);
        setByteElement(term2682, 2, (byte) 89);
        setByteElement(term2682, 3, (byte) 75);
        setByteElement(term2682, 4, (byte) 18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("top.gcszhn.movie.security.RSAEncrypt");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term2682;
        args[1] = "NRdvgJlhkX";
        callMethod(klass, "encrypt", argTypes, null, args);
    }

};


