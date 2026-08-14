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

public class Ed25519_XYZ_fromPartialXYZT_108168017811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2950;

    public Ed25519_XYZ_fromPartialXYZT_108168017811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2950 = newInstance(Class.forName("software.pando.crypto.nacl.Ed25519$XYZ"));
        setField(term2950, term2950.getClass(), "x", null);
        setField(term2950, term2950.getClass(), "y", null);
        setField(term2950, term2950.getClass(), "z", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Ed25519$XYZ");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("software.pando.crypto.nacl.Ed25519$XYZ");
        argTypes[1] = Class.forName("software.pando.crypto.nacl.Ed25519$PartialXYZT");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "fromPartialXYZT", argTypes, term2950, args);
    }

};


