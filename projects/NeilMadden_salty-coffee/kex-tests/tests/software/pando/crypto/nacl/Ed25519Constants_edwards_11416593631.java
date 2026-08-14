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

public class Ed25519Constants_edwards_11416593631 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4264;
     Object term4287;

    public Ed25519Constants_edwards_11416593631() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4264 = newInstance(Class.forName("software.pando.crypto.nacl.Ed25519Constants$Point"));
        Object term4265 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4267 = (int[]) newIntArray(4);
        Object term4276 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4278 = (int[]) newIntArray(4);
        setIntField(term4265, term4265.getClass(), "signum", 1);
        setIntElement(term4267, 0, 313747341);
        setIntElement(term4267, 1, -964936229);
        setIntElement(term4267, 2, -478647413);
        setIntElement(term4267, 3, -898923898);
        setField(term4265, term4265.getClass(), "mag", term4267);
        setIntField(term4265, term4265.getClass(), "bitCountPlusOne", 0);
        setIntField(term4265, term4265.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4265, term4265.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4265, term4265.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4264, term4264.getClass(), "x", term4265);
        setIntField(term4276, term4276.getClass(), "signum", 1);
        setIntElement(term4278, 0, -165862327);
        setIntElement(term4278, 1, 1335502000);
        setIntElement(term4278, 2, -1994335642);
        setIntElement(term4278, 3, -1099245088);
        setField(term4276, term4276.getClass(), "mag", term4278);
        setIntField(term4276, term4276.getClass(), "bitCountPlusOne", 0);
        setIntField(term4276, term4276.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4276, term4276.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4276, term4276.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4264, term4264.getClass(), "y", term4276);
        term4287 = newInstance(Class.forName("software.pando.crypto.nacl.Ed25519Constants$Point"));
        Object term4288 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4290 = (int[]) newIntArray(4);
        Object term4299 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4301 = (int[]) newIntArray(4);
        setIntField(term4288, term4288.getClass(), "signum", 1);
        setIntElement(term4290, 0, 1397923395);
        setIntElement(term4290, 1, 1257594315);
        setIntElement(term4290, 2, -1189378466);
        setIntElement(term4290, 3, 834705699);
        setField(term4288, term4288.getClass(), "mag", term4290);
        setIntField(term4288, term4288.getClass(), "bitCountPlusOne", 0);
        setIntField(term4288, term4288.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4288, term4288.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4288, term4288.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4287, term4287.getClass(), "x", term4288);
        setIntField(term4299, term4299.getClass(), "signum", 1);
        setIntElement(term4301, 0, -890532197);
        setIntElement(term4301, 1, 1140403369);
        setIntElement(term4301, 2, 1309324128);
        setIntElement(term4301, 3, 1465941822);
        setField(term4299, term4299.getClass(), "mag", term4301);
        setIntField(term4299, term4299.getClass(), "bitCountPlusOne", 0);
        setIntField(term4299, term4299.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4299, term4299.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4299, term4299.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4287, term4287.getClass(), "y", term4299);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Ed25519Constants");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("software.pando.crypto.nacl.Ed25519Constants$Point");
        argTypes[1] = Class.forName("software.pando.crypto.nacl.Ed25519Constants$Point");
        Object[] args = new Object[2];
        args[0] = term4264;
        args[1] = term4287;
        callMethod(klass, "edwards", argTypes, null, args);
    }

};


