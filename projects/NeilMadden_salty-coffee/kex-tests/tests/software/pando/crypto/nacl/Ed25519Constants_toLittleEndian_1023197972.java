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

public class Ed25519Constants_toLittleEndian_1023197972 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4326;

    public Ed25519Constants_toLittleEndian_1023197972() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4326 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4328 = (int[]) newIntArray(4);
        setIntField(term4326, term4326.getClass(), "signum", 1);
        setIntElement(term4328, 0, 2037839064);
        setIntElement(term4328, 1, -1644256257);
        setIntElement(term4328, 2, -32263804);
        setIntElement(term4328, 3, -252903944);
        setField(term4326, term4326.getClass(), "mag", term4328);
        setIntField(term4326, term4326.getClass(), "bitCountPlusOne", 0);
        setIntField(term4326, term4326.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4326, term4326.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4326, term4326.getClass(), "firstNonzeroIntNumPlusTwo", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Ed25519Constants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.math.BigInteger");
        Object[] args = new Object[1];
        args[0] = term4326;
        callMethod(klass, "toLittleEndian", argTypes, null, args);
    }

};


