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

public class KTableModel_init_15221856431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67775;

    public KTableModel_init_15221856431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67775 = (Object[]) newArray("java.lang.Object", 4);
        Object term67776 = newInstance(Class.forName("java.lang.Object"));
        Object term67777 = newInstance(Class.forName("java.lang.Object"));
        Object term67778 = newInstance(Class.forName("java.lang.Object"));
        Object term67779 = newInstance(Class.forName("java.lang.Object"));
        setElement(term67775, 0, term67776);
        setElement(term67775, 1, term67777);
        setElement(term67775, 2, term67778);
        setElement(term67775, 3, term67779);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KTableModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term67775;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


