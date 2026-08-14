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

public class SHA512_hash_6497760951 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4207;
     Object term4217;

    public SHA512_hash_6497760951() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4207 = (byte[]) newByteArray(9);
        setByteElement(term4207, 0, (byte) 113);
        setByteElement(term4207, 1, (byte) -75);
        setByteElement(term4207, 2, (byte) -92);
        setByteElement(term4207, 3, (byte) 52);
        setByteElement(term4207, 4, (byte) -101);
        setByteElement(term4207, 5, (byte) -64);
        setByteElement(term4207, 6, (byte) 107);
        setByteElement(term4207, 7, (byte) 91);
        setByteElement(term4207, 8, (byte) -24);
        term4217 = new Integer(933028652);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.SHA512");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term4207;
        args[1] = term4217;
        callMethod(klass, "hash", argTypes, null, args);
    }

};


