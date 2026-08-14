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
import java.lang.Integer;

public class SHA512_hmac_7595845792 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4228;
     Object term4234;

    public SHA512_hmac_7595845792() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4228 = (byte[]) newByteArray(5);
        setByteElement(term4228, 0, (byte) -68);
        setByteElement(term4228, 1, (byte) -75);
        setByteElement(term4228, 2, (byte) 82);
        setByteElement(term4228, 3, (byte) -127);
        setByteElement(term4228, 4, (byte) 23);
        term4234 = new Integer(287287233);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.SHA512");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.security.Key");
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term4228;
        args[2] = term4234;
        callMethod(klass, "hmac", argTypes, null, args);
    }

};


