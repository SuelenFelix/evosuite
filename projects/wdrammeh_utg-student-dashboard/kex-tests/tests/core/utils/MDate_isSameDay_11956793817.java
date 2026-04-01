package core.utils;

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
import static core.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class MDate_isSameDay_11956793817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277572;
     Object term277574;

    public MDate_isSameDay_11956793817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term277572 = newInstance(Class.forName("java.util.Date"));
        setLongField(term277572, term277572.getClass(), "fastTime", 1405279189488L);
        setField(term277572, term277572.getClass(), "cdate", null);
        term277574 = newInstance(Class.forName("java.util.Date"));
        setLongField(term277574, term277574.getClass(), "fastTime", 1822704644050L);
        setField(term277574, term277574.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.utils.MDate");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Date");
        argTypes[1] = Class.forName("java.util.Date");
        Object[] args = new Object[2];
        args[0] = term277572;
        args[1] = term277574;
        callMethod(klass, "isSameDay", argTypes, null, args);
    }

};


