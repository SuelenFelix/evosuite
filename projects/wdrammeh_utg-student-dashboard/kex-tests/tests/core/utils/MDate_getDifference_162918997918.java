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

public class MDate_getDifference_162918997918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9652;
     Object term9654;

    public MDate_getDifference_162918997918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9652 = newInstance(Class.forName("java.util.Date"));
        setLongField(term9652, term9652.getClass(), "fastTime", 1645834034896L);
        setField(term9652, term9652.getClass(), "cdate", null);
        term9654 = newInstance(Class.forName("java.util.Date"));
        setLongField(term9654, term9654.getClass(), "fastTime", 1500721068023L);
        setField(term9654, term9654.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.utils.MDate");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Date");
        argTypes[1] = Class.forName("java.util.Date");
        Object[] args = new Object[2];
        args[0] = term9652;
        args[1] = term9654;
        callMethod(klass, "getDifference", argTypes, null, args);
    }

};


