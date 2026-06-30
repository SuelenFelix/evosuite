package core.module;

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
import static core.module.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SummerHandler_2_mousePressed_13060044603 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101080;

    public SummerHandler_2_mousePressed_13060044603() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101080 = newInstance(Class.forName("core.module.SummerHandler$2"));
        setField(term101080, term101080.getClass(), "val$summerScrollPane", null);
        setField(term101080, term101080.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.SummerHandler$2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "mousePressed", argTypes, term101080, args);
    }

};


