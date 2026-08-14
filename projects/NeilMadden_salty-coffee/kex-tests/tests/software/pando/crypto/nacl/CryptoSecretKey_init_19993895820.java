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

public class CryptoSecretKey_init_19993895820 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5049;
     Object term5056;
     Object term5058;

    public CryptoSecretKey_init_19993895820() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5049 = (byte[]) newByteArray(6);
        setByteElement(term5049, 0, (byte) -72);
        setByteElement(term5049, 1, (byte) 18);
        setByteElement(term5049, 2, (byte) -80);
        setByteElement(term5049, 3, (byte) 120);
        setByteElement(term5049, 4, (byte) -22);
        setByteElement(term5049, 5, (byte) 73);
        term5056 = new Integer(-481533957);
        term5058 = new Integer(1240914516);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.CryptoSecretKey");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("java.lang.String");
        Object[] args = new Object[4];
        args[0] = term5049;
        args[1] = term5056;
        args[2] = term5058;
        args[3] = "MuLcgQHgqz";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


