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

public class Salsa20_rounds_244137562 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term211;

    public Salsa20_rounds_244137562() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term211 = (int[]) newIntArray(8);
        setIntElement(term211, 0, 1585847225);
        setIntElement(term211, 1, 597278769);
        setIntElement(term211, 2, -1685132342);
        setIntElement(term211, 3, -1456670397);
        setIntElement(term211, 4, 1622346318);
        setIntElement(term211, 5, 1048535127);
        setIntElement(term211, 6, -655067527);
        setIntElement(term211, 7, -6029667);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Salsa20");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term211;
        callMethod(klass, "rounds", argTypes, null, args);
    }

};


