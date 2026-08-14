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

public class Field25519_product_83702883 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2304;
     Object term2311;
     Object term2319;

    public Field25519_product_83702883() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2304 = (long[]) newLongArray(6);
        setLongElement(term2304, 0, -6950146046121430355L);
        setLongElement(term2304, 1, 1667122142089513324L);
        setLongElement(term2304, 2, -6342139649364011743L);
        setLongElement(term2304, 3, -4924950707540628022L);
        setLongElement(term2304, 4, -4393710401270724527L);
        setLongElement(term2304, 5, -4822736661741380518L);
        term2311 = (long[]) newLongArray(7);
        setLongElement(term2311, 0, -5386201758403679145L);
        setLongElement(term2311, 1, -7268507582722666254L);
        setLongElement(term2311, 2, 5671808784468963649L);
        setLongElement(term2311, 3, 2297097306706899827L);
        setLongElement(term2311, 4, -900457279156388404L);
        setLongElement(term2311, 5, 1084801489398441516L);
        setLongElement(term2311, 6, 6273754186658578034L);
        term2319 = (long[]) newLongArray(5);
        setLongElement(term2319, 0, 3620247240684476031L);
        setLongElement(term2319, 1, 8313800941204938919L);
        setLongElement(term2319, 2, -1214968196781083707L);
        setLongElement(term2319, 3, -1804015692891701666L);
        setLongElement(term2319, 4, -6432617521836576658L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Field25519");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(long.class, 0).getClass();
        argTypes[1] = Array.newInstance(long.class, 0).getClass();
        argTypes[2] = Array.newInstance(long.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term2304;
        args[1] = term2311;
        args[2] = term2319;
        callMethod(klass, "product", argTypes, null, args);
    }

};


