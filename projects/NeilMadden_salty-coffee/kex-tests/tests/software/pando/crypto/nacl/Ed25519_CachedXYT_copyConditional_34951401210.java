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

public class Ed25519_CachedXYT_copyConditional_34951401210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1230;
     Object term1231;

    public Ed25519_CachedXYT_copyConditional_34951401210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1230 = newInstance(Class.forName("software.pando.crypto.nacl.Ed25519$CachedXYT"));
        setField(term1230, term1230.getClass(), "yPlusX", null);
        setField(term1230, term1230.getClass(), "yMinusX", null);
        setField(term1230, term1230.getClass(), "t2d", null);
        term1231 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Ed25519$CachedXYT");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("software.pando.crypto.nacl.Ed25519$CachedXYT");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1231;
        callMethod(klass, "copyConditional", argTypes, term1230, args);
    }

};


