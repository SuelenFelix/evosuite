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

public class SummerHandler_add_5404649287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33393;

    public SummerHandler_add_5404649287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33393 = newInstance(Class.forName("core.module.SummerHandler"));
        setField(term33393, term33393.getClass(), "detailsItem", null);
        setField(term33393, term33393.getClass(), "editItem", null);
        setField(term33393, term33393.getClass(), "removeItem", null);
        setField(term33393, term33393.getClass(), "confirmItem", null);
        setField(term33393, term33393.getClass(), "newItem", null);
        setField(term33393, term33393.getClass(), "popupMenu", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.SummerHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("core.module.Course");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "add", argTypes, term33393, args);
    }

};


