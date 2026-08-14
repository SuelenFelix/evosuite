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

public class Field25519_square_2685148769 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2426;
     Object term2429;

    public Field25519_square_2685148769() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2426 = (long[]) newLongArray(2);
        setLongElement(term2426, 0, -948292411727204525L);
        setLongElement(term2426, 1, -8892586408602479513L);
        term2429 = (long[]) newLongArray(7);
        setLongElement(term2429, 0, 4616440478358528406L);
        setLongElement(term2429, 1, 3427570961451840069L);
        setLongElement(term2429, 2, 4502292577098212311L);
        setLongElement(term2429, 3, -3730936709704460408L);
        setLongElement(term2429, 4, -8614778293741404325L);
        setLongElement(term2429, 5, -5447369594017685765L);
        setLongElement(term2429, 6, -5724112525188606013L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Field25519");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(long.class, 0).getClass();
        argTypes[1] = Array.newInstance(long.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term2426;
        args[1] = term2429;
        callMethod(klass, "square", argTypes, null, args);
    }

};


