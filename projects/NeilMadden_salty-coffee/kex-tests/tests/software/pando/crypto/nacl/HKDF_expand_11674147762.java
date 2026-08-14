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

public class HKDF_expand_11674147762 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9707;
     Object term9722;
     Object term9732;

    public HKDF_expand_11674147762() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9707 = newInstance(Class.forName("software.pando.crypto.nacl.HKDF"));
        setIntField(term9707, term9707.getClass(), "saltLenBytes", -506958186);
        setIntField(term9707, term9707.getClass(), "tagLenBytes", -507387516);
        setField(term9707, term9707.getClass(), "hmacAlgorithm", "uWHnvSvaPl");
        term9722 = (byte[]) newByteArray(9);
        setByteElement(term9722, 0, (byte) 88);
        setByteElement(term9722, 1, (byte) 10);
        setByteElement(term9722, 2, (byte) 77);
        setByteElement(term9722, 3, (byte) 91);
        setByteElement(term9722, 4, (byte) 75);
        setByteElement(term9722, 5, (byte) 96);
        setByteElement(term9722, 6, (byte) 67);
        setByteElement(term9722, 7, (byte) 37);
        setByteElement(term9722, 8, (byte) -6);
        term9732 = new Integer(-1970452551);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.HKDF");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("javax.crypto.SecretKey");
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term9722;
        args[2] = term9732;
        callMethod(klass, "expand", argTypes, term9707, args);
    }

};


