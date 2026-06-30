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
import java.lang.Integer;

public class KComboBox_init_13057080231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9870;
     Object term9881;

    public KComboBox_init_13057080231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9870 = (Object[]) newArray("java.lang.Object", 10);
        Object term9871 = newInstance(Class.forName("java.lang.Object"));
        Object term9872 = newInstance(Class.forName("java.lang.Object"));
        Object term9873 = newInstance(Class.forName("java.lang.Object"));
        Object term9874 = newInstance(Class.forName("java.lang.Object"));
        Object term9875 = newInstance(Class.forName("java.lang.Object"));
        Object term9876 = newInstance(Class.forName("java.lang.Object"));
        Object term9877 = newInstance(Class.forName("java.lang.Object"));
        Object term9878 = newInstance(Class.forName("java.lang.Object"));
        Object term9879 = newInstance(Class.forName("java.lang.Object"));
        Object term9880 = newInstance(Class.forName("java.lang.Object"));
        setElement(term9870, 0, term9871);
        setElement(term9870, 1, term9872);
        setElement(term9870, 2, term9873);
        setElement(term9870, 3, term9874);
        setElement(term9870, 4, term9875);
        setElement(term9870, 5, term9876);
        setElement(term9870, 6, term9877);
        setElement(term9870, 7, term9878);
        setElement(term9870, 8, term9879);
        setElement(term9870, 9, term9880);
        term9881 = new Integer(-1048298087);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KComboBox");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term9870;
        args[1] = term9881;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


