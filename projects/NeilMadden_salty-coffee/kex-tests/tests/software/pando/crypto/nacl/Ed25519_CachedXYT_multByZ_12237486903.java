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

public class Ed25519_CachedXYT_multByZ_12237486903 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term971;
     Object term1005;
     Object term1013;

    public Ed25519_CachedXYT_multByZ_12237486903() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term971 = newInstance(Class.forName("software.pando.crypto.nacl.Ed25519$CachedXYT"));
        long[] term972 = (long[]) newLongArray(10);
        long[] term983 = (long[]) newLongArray(10);
        long[] term994 = (long[]) newLongArray(10);
        setField(term971, term971.getClass(), "yPlusX", term972);
        setField(term971, term971.getClass(), "yMinusX", term983);
        setField(term971, term971.getClass(), "t2d", term994);
        term1005 = (long[]) newLongArray(7);
        setLongElement(term1005, 0, 5907001541142728739L);
        setLongElement(term1005, 1, 4178434741742309755L);
        setLongElement(term1005, 2, -2068172595987555756L);
        setLongElement(term1005, 3, -6292278961887936280L);
        setLongElement(term1005, 4, -6645965768855543712L);
        setLongElement(term1005, 5, 4784595517102746672L);
        setLongElement(term1005, 6, -7612550318181586304L);
        term1013 = (long[]) newLongArray(6);
        setLongElement(term1013, 0, -2170847986967241072L);
        setLongElement(term1013, 1, 4044358158040652353L);
        setLongElement(term1013, 2, -4443169559037975007L);
        setLongElement(term1013, 3, -3842548265506930260L);
        setLongElement(term1013, 4, -5788180182343976541L);
        setLongElement(term1013, 5, 2936323121573284007L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Ed25519$CachedXYT");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(long.class, 0).getClass();
        argTypes[1] = Array.newInstance(long.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term1005;
        args[1] = term1013;
        callMethod(klass, "multByZ", argTypes, term971, args);
    }

};


