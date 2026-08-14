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

public class SecretBox_fromCombined_7600325908 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9081;
     Object term9082;

    public SecretBox_fromCombined_7600325908() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9081 = (byte[]) newByteArray(0);
        term9082 = (byte[]) newByteArray(6);
        setByteElement(term9082, 0, (byte) 126);
        setByteElement(term9082, 1, (byte) 123);
        setByteElement(term9082, 2, (byte) -113);
        setByteElement(term9082, 3, (byte) -116);
        setByteElement(term9082, 4, (byte) -76);
        setByteElement(term9082, 5, (byte) -32);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.SecretBox");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term9081;
        args[1] = term9082;
        callMethod(klass, "fromCombined", argTypes, null, args);
    }

};


