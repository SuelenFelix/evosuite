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

public class Field25519_mult_28056477 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2377;
     Object term2386;
     Object term2392;

    public Field25519_mult_28056477() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2377 = (long[]) newLongArray(8);
        setLongElement(term2377, 0, -6301101997917060727L);
        setLongElement(term2377, 1, 8166095254618543564L);
        setLongElement(term2377, 2, -4598158870068953328L);
        setLongElement(term2377, 3, 138235087558060686L);
        setLongElement(term2377, 4, 5381386339318883012L);
        setLongElement(term2377, 5, -1333707622307134180L);
        setLongElement(term2377, 6, -4360569253593381888L);
        setLongElement(term2377, 7, 1457594663983990440L);
        term2386 = (long[]) newLongArray(5);
        setLongElement(term2386, 0, 3452833434644634217L);
        setLongElement(term2386, 1, -8603648071751666348L);
        setLongElement(term2386, 2, -7884871963229073324L);
        setLongElement(term2386, 3, -8649738738252714180L);
        setLongElement(term2386, 4, -7278883608542636188L);
        term2392 = (long[]) newLongArray(2);
        setLongElement(term2392, 0, -1539859611880912454L);
        setLongElement(term2392, 1, 4100236067313034103L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Field25519");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(long.class, 0).getClass();
        argTypes[1] = Array.newInstance(long.class, 0).getClass();
        argTypes[2] = Array.newInstance(long.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term2377;
        args[1] = term2386;
        args[2] = term2392;
        callMethod(klass, "mult", argTypes, null, args);
    }

};


