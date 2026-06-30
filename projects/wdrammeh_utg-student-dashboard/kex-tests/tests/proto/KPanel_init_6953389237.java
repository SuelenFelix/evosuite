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

public class KPanel_init_6953389237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36965;
     Object term36968;

    public KPanel_init_6953389237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36965 = newInstance(Class.forName("java.awt.Dimension"));
        setIntField(term36965, term36965.getClass(), "width", -1813280137);
        setIntField(term36965, term36965.getClass(), "height", 719656595);
        term36968 = (Object[]) newArray("java.awt.Component", 8);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KPanel");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.awt.LayoutManager");
        argTypes[1] = Class.forName("java.awt.Dimension");
        argTypes[2] = Array.newInstance(Class.forName("java.awt.Component"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term36965;
        args[2] = term36968;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


