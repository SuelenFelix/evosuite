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

public class Subtle_streamXSalsa20_1480772965 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9900;

    public Subtle_streamXSalsa20_1480772965() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9900 = (byte[]) newByteArray(3);
        setByteElement(term9900, 0, (byte) -39);
        setByteElement(term9900, 1, (byte) -6);
        setByteElement(term9900, 2, (byte) 27);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Subtle");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("javax.crypto.SecretKey");
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term9900;
        callMethod(klass, "streamXSalsa20", argTypes, null, args);
    }

};


