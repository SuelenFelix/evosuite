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

public class Field25519_sum_11699985400 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2218;
     Object term2220;
     Object term2229;

    public Field25519_sum_11699985400() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2218 = (long[]) newLongArray(1);
        setLongElement(term2218, 0, 6682528376118987775L);
        term2220 = (long[]) newLongArray(8);
        setLongElement(term2220, 0, 682356318767179819L);
        setLongElement(term2220, 1, -7291743527973326814L);
        setLongElement(term2220, 2, -5963439350418910964L);
        setLongElement(term2220, 3, 9013624480170062917L);
        setLongElement(term2220, 4, 7862575738391801707L);
        setLongElement(term2220, 5, 50358265865610362L);
        setLongElement(term2220, 6, 5510783420697225605L);
        setLongElement(term2220, 7, 6005241913654469005L);
        term2229 = (long[]) newLongArray(7);
        setLongElement(term2229, 0, -1983291584002806658L);
        setLongElement(term2229, 1, 5946780097489996391L);
        setLongElement(term2229, 2, -8652538484981166496L);
        setLongElement(term2229, 3, 2701184207686293431L);
        setLongElement(term2229, 4, 4474998035090263139L);
        setLongElement(term2229, 5, 2848819812340321742L);
        setLongElement(term2229, 6, -8876856890348836498L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Field25519");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(long.class, 0).getClass();
        argTypes[1] = Array.newInstance(long.class, 0).getClass();
        argTypes[2] = Array.newInstance(long.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term2218;
        args[1] = term2220;
        args[2] = term2229;
        callMethod(klass, "sum", argTypes, null, args);
    }

};


