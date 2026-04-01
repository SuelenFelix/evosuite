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
import java.lang.Object;

public class RSAEncrypt_generateKeyPair_13801680111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2505;

    public RSAEncrypt_generateKeyPair_13801680111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2505 = (Object[]) newArray("java.lang.String", 6);
        setElement(term2505, 0, "MuLcgQHgqz");
        setElement(term2505, 1, "xxtlPwDYFs");
        setElement(term2505, 2, "jJCZpVmanW");
        setElement(term2505, 3, "EGtDIRbSSb");
        setElement(term2505, 4, "SzjVpOQTyS");
        setElement(term2505, 5, "MjGYSRKTNF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("top.gcszhn.movie.security.RSAEncrypt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term2505;
        callMethod(klass, "generateKeyPair", argTypes, null, args);
    }

};


