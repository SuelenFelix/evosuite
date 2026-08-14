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

public class Field25519_squareInner_10663990648 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2410;
     Object term2417;

    public Field25519_squareInner_10663990648() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2410 = (long[]) newLongArray(6);
        setLongElement(term2410, 0, 1195529027276497124L);
        setLongElement(term2410, 1, -2783999800714825789L);
        setLongElement(term2410, 2, 4266570509071948633L);
        setLongElement(term2410, 3, -7291742736502427077L);
        setLongElement(term2410, 4, -8121849829073967555L);
        setLongElement(term2410, 5, 5219030281405653303L);
        term2417 = (long[]) newLongArray(1);
        setLongElement(term2417, 0, -8471550651709805183L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Field25519");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(long.class, 0).getClass();
        argTypes[1] = Array.newInstance(long.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term2410;
        args[1] = term2417;
        callMethod(klass, "squareInner", argTypes, null, args);
    }

};


