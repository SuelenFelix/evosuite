package proto;

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
import static proto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class KComboBox_init_7900108290 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9865;

    public KComboBox_init_7900108290() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9865 = (Object[]) newArray("java.lang.Object", 4);
        Object term9866 = newInstance(Class.forName("java.lang.Object"));
        Object term9867 = newInstance(Class.forName("java.lang.Object"));
        Object term9868 = newInstance(Class.forName("java.lang.Object"));
        Object term9869 = newInstance(Class.forName("java.lang.Object"));
        setElement(term9865, 0, term9866);
        setElement(term9865, 1, term9867);
        setElement(term9865, 2, term9868);
        setElement(term9865, 3, term9869);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KComboBox");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term9865;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


