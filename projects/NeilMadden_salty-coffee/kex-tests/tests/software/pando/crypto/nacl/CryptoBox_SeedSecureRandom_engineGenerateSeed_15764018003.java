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

public class CryptoBox_SeedSecureRandom_engineGenerateSeed_15764018003 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2044;
     Object term2048;

    public CryptoBox_SeedSecureRandom_engineGenerateSeed_15764018003() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2044 = newInstance(Class.forName("software.pando.crypto.nacl.CryptoBox$SeedSecureRandom"));
        byte[] term2045 = (byte[]) newByteArray(2);
        setByteElement(term2045, 0, (byte) 111);
        setByteElement(term2045, 1, (byte) -4);
        setField(term2044, term2044.getClass(), "seed", term2045);
        term2048 = new Integer(1328271830);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.CryptoBox$SeedSecureRandom");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2048;
        callMethod(klass, "engineGenerateSeed", argTypes, term2044, args);
    }

};


