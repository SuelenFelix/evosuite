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

public class CryptoBox_SeedSecureRandom_engineSetSeed_15710798671 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2008;
     Object term2011;

    public CryptoBox_SeedSecureRandom_engineSetSeed_15710798671() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2008 = newInstance(Class.forName("software.pando.crypto.nacl.CryptoBox$SeedSecureRandom"));
        byte[] term2009 = (byte[]) newByteArray(1);
        setByteElement(term2009, 0, (byte) -128);
        setField(term2008, term2008.getClass(), "seed", term2009);
        term2011 = (byte[]) newByteArray(9);
        setByteElement(term2011, 0, (byte) -55);
        setByteElement(term2011, 1, (byte) -83);
        setByteElement(term2011, 2, (byte) -48);
        setByteElement(term2011, 3, (byte) -113);
        setByteElement(term2011, 4, (byte) 15);
        setByteElement(term2011, 5, (byte) 38);
        setByteElement(term2011, 6, (byte) -54);
        setByteElement(term2011, 7, (byte) -51);
        setByteElement(term2011, 8, (byte) 101);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.CryptoBox$SeedSecureRandom");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term2011;
        callMethod(klass, "engineSetSeed", argTypes, term2008, args);
    }

};


