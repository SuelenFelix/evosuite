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

public class Ed25519_CachedXYT_init_16111714111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term868;
     Object term876;
     Object term879;

    public Ed25519_CachedXYT_init_16111714111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term868 = (long[]) newLongArray(7);
        setLongElement(term868, 0, -2585684163342970173L);
        setLongElement(term868, 1, 8059786003080744426L);
        setLongElement(term868, 2, -4365849114644724155L);
        setLongElement(term868, 3, 2486810210675247493L);
        setLongElement(term868, 4, 7009926388951271268L);
        setLongElement(term868, 5, -7672528020740371001L);
        setLongElement(term868, 6, -4502405999831680926L);
        term876 = (long[]) newLongArray(2);
        setLongElement(term876, 0, 1967728129628047933L);
        setLongElement(term876, 1, 2120084523938730454L);
        term879 = (long[]) newLongArray(9);
        setLongElement(term879, 0, 6855071767938501807L);
        setLongElement(term879, 1, -5892135042702373494L);
        setLongElement(term879, 2, 5262507301787091109L);
        setLongElement(term879, 3, -6823727938421990489L);
        setLongElement(term879, 4, -484994522244390100L);
        setLongElement(term879, 5, 1233889271256172047L);
        setLongElement(term879, 6, 6617340557564669657L);
        setLongElement(term879, 7, 1439298019805881866L);
        setLongElement(term879, 8, -8708192233349544946L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Ed25519$CachedXYT");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(long.class, 0).getClass();
        argTypes[1] = Array.newInstance(long.class, 0).getClass();
        argTypes[2] = Array.newInstance(long.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term868;
        args[1] = term876;
        args[2] = term879;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


