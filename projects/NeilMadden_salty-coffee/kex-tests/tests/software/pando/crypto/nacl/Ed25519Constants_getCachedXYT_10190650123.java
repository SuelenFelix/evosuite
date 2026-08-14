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
import java.lang.Object;

public class Ed25519Constants_getCachedXYT_10190650123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4341;

    public Ed25519Constants_getCachedXYT_10190650123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4341 = newInstance(Class.forName("software.pando.crypto.nacl.Ed25519Constants$Point"));
        Object term4342 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4344 = (int[]) newIntArray(4);
        Object term4353 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4355 = (int[]) newIntArray(4);
        setIntField(term4342, term4342.getClass(), "signum", 1);
        setIntElement(term4344, 0, -1863190589);
        setIntElement(term4344, 1, -1847873469);
        setIntElement(term4344, 2, 390017059);
        setIntElement(term4344, 3, -251162061);
        setField(term4342, term4342.getClass(), "mag", term4344);
        setIntField(term4342, term4342.getClass(), "bitCountPlusOne", 0);
        setIntField(term4342, term4342.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4342, term4342.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4342, term4342.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4341, term4341.getClass(), "x", term4342);
        setIntField(term4353, term4353.getClass(), "signum", 1);
        setIntElement(term4355, 0, 610795187);
        setIntElement(term4355, 1, 1979806705);
        setIntElement(term4355, 2, 1795089907);
        setIntElement(term4355, 3, 1645000889);
        setField(term4353, term4353.getClass(), "mag", term4355);
        setIntField(term4353, term4353.getClass(), "bitCountPlusOne", 0);
        setIntField(term4353, term4353.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4353, term4353.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4353, term4353.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4341, term4341.getClass(), "y", term4353);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Ed25519Constants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("software.pando.crypto.nacl.Ed25519Constants$Point");
        Object[] args = new Object[1];
        args[0] = term4341;
        callMethod(klass, "getCachedXYT", argTypes, null, args);
    }

};


