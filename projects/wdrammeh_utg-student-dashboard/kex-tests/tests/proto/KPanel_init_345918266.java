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

public class KPanel_init_345918266 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36994;
     Object term36997;

    public KPanel_init_345918266() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36994 = newInstance(Class.forName("java.awt.Dimension"));
        setIntField(term36994, term36994.getClass(), "width", 844222656);
        setIntField(term36994, term36994.getClass(), "height", -18216811);
        term36997 = (Object[]) newArray("java.awt.Component", 6);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KPanel");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.awt.Dimension");
        argTypes[1] = Array.newInstance(Class.forName("java.awt.Component"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term36994;
        args[1] = term36997;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


