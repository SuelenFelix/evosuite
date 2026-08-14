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

public class Ed25519_XYZT_fromPartialXYZT_2496000869 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4942;

    public Ed25519_XYZT_fromPartialXYZT_2496000869() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4942 = newInstance(Class.forName("software.pando.crypto.nacl.Ed25519$XYZT"));
        setField(term4942, term4942.getClass(), "xyz", null);
        setField(term4942, term4942.getClass(), "t", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Ed25519$XYZT");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("software.pando.crypto.nacl.Ed25519$XYZT");
        argTypes[1] = Class.forName("software.pando.crypto.nacl.Ed25519$PartialXYZT");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "fromPartialXYZT", argTypes, term4942, args);
    }

};


