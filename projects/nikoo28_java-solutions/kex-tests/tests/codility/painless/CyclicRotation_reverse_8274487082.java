package codility.painless;

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
import static codility.painless.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class CyclicRotation_reverse_8274487082 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21;
     Object term22;
     Object term27;
     Object term29;

    public CyclicRotation_reverse_8274487082() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21 = newInstance(Class.forName("codility.painless.CyclicRotation"));
        term22 = (int[]) newIntArray(4);
        setIntElement(term22, 0, -2038273078);
        setIntElement(term22, 1, 1227103734);
        setIntElement(term22, 2, -1339778481);
        setIntElement(term22, 3, 1725571209);
        term27 = new Integer(-522618178);
        term29 = new Integer(1134449235);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codility.painless.CyclicRotation");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term22;
        args[1] = term27;
        args[2] = term29;
        callMethod(klass, "reverse", argTypes, term21, args);
    }

};


