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
import java.lang.Byte;

public class Ed25519_select_14374914105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3751;
     Object term3785;
     Object term3787;

    public Ed25519_select_14374914105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3751 = newInstance(Class.forName("software.pando.crypto.nacl.Ed25519$CachedXYT"));
        long[] term3752 = (long[]) newLongArray(10);
        long[] term3763 = (long[]) newLongArray(10);
        long[] term3774 = (long[]) newLongArray(10);
        setField(term3751, term3751.getClass(), "yPlusX", term3752);
        setField(term3751, term3751.getClass(), "yMinusX", term3763);
        setField(term3751, term3751.getClass(), "t2d", term3774);
        term3785 = new Integer(-1588772968);
        term3787 = new Byte((byte) 69);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Ed25519");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("software.pando.crypto.nacl.Ed25519$CachedXYT");
        argTypes[1] = int.class;
        argTypes[2] = byte.class;
        Object[] args = new Object[3];
        args[0] = term3751;
        args[1] = term3785;
        args[2] = term3787;
        callMethod(klass, "select", argTypes, null, args);
    }

};


