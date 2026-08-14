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

public class Salsa20_blockFunction_10557073443 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term228;

    public Salsa20_blockFunction_10557073443() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term228 = (int[]) newIntArray(6);
        setIntElement(term228, 0, -2068769794);
        setIntElement(term228, 1, -117576464);
        setIntElement(term228, 2, -1007160944);
        setIntElement(term228, 3, 1135664017);
        setIntElement(term228, 4, 590364439);
        setIntElement(term228, 5, 865208305);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Salsa20");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term228;
        callMethod(klass, "blockFunction", argTypes, null, args);
    }

};


