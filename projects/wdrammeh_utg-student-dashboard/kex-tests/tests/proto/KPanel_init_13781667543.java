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

public class KPanel_init_13781667543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36956;

    public KPanel_init_13781667543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36956 = newInstance(Class.forName("java.awt.Dimension"));
        setIntField(term36956, term36956.getClass(), "width", 1209799204);
        setIntField(term36956, term36956.getClass(), "height", 1094107751);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KPanel");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.awt.LayoutManager");
        argTypes[1] = Class.forName("java.awt.Dimension");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term36956;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


