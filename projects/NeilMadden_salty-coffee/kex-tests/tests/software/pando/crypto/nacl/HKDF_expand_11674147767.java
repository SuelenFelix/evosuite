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

public class HKDF_expand_11674147767 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9838;
     Object term9841;

    public HKDF_expand_11674147767() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9838 = newInstance(Class.forName("software.pando.crypto.nacl.HKDF"));
        setIntField(term9838, term9838.getClass(), "saltLenBytes", 0);
        setIntField(term9838, term9838.getClass(), "tagLenBytes", 0);
        setField(term9838, term9838.getClass(), "hmacAlgorithm", null);
        term9841 = new Integer(0);
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
        args[1] = null;
        args[2] = term9841;
        callMethod(klass, "expand", argTypes, term9838, args);
    }

};


