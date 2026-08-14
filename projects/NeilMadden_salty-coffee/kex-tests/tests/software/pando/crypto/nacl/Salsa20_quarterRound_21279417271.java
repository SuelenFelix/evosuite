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
import java.lang.Integer;

public class Salsa20_quarterRound_21279417271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198;
     Object term201;
     Object term203;
     Object term205;
     Object term207;

    public Salsa20_quarterRound_21279417271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term198 = (int[]) newIntArray(2);
        setIntElement(term198, 0, 1227103734);
        setIntElement(term198, 1, -1339778481);
        term201 = new Integer(1725571209);
        term203 = new Integer(-522618178);
        term205 = new Integer(1134449235);
        term207 = new Integer(-883034806);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Salsa20");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        Object[] args = new Object[5];
        args[0] = term198;
        args[1] = term201;
        args[2] = term203;
        args[3] = term205;
        args[4] = term207;
        callMethod(klass, "quarterRound", argTypes, null, args);
    }

};


