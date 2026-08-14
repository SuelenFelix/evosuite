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

public class Field25519_inverse_95954545712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2460;
     Object term2465;

    public Field25519_inverse_95954545712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2460 = (long[]) newLongArray(4);
        setLongElement(term2460, 0, -78240609295693193L);
        setLongElement(term2460, 1, 3090901538358721367L);
        setLongElement(term2460, 2, -1677189124507026637L);
        setLongElement(term2460, 3, 4795660804170399986L);
        term2465 = (long[]) newLongArray(6);
        setLongElement(term2465, 0, -4030863184426321096L);
        setLongElement(term2465, 1, -8010214112439224349L);
        setLongElement(term2465, 2, -6673920710396545553L);
        setLongElement(term2465, 3, 3412644969878030772L);
        setLongElement(term2465, 4, 6698455537431331246L);
        setLongElement(term2465, 5, -8327432141027603933L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Field25519");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(long.class, 0).getClass();
        argTypes[1] = Array.newInstance(long.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term2460;
        args[1] = term2465;
        callMethod(klass, "inverse", argTypes, null, args);
    }

};


