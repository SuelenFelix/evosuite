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

public class Ed25519Constants_recoverX_20327914370 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4249;

    public Ed25519Constants_recoverX_20327914370() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4249 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4251 = (int[]) newIntArray(4);
        setIntField(term4249, term4249.getClass(), "signum", 1);
        setIntElement(term4251, 0, 791012385);
        setIntElement(term4251, 1, 819285061);
        setIntElement(term4251, 2, 1509521496);
        setIntElement(term4251, 3, 1264343831);
        setField(term4249, term4249.getClass(), "mag", term4251);
        setIntField(term4249, term4249.getClass(), "bitCountPlusOne", 0);
        setIntField(term4249, term4249.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4249, term4249.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4249, term4249.getClass(), "firstNonzeroIntNumPlusTwo", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Ed25519Constants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.math.BigInteger");
        Object[] args = new Object[1];
        args[0] = term4249;
        callMethod(klass, "recoverX", argTypes, null, args);
    }

};


