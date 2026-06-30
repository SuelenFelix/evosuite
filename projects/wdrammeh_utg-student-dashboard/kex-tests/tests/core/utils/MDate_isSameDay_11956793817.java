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
     Object term9648;
     Object term9650;

    public MDate_isSameDay_11956793817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9648 = newInstance(Class.forName("java.util.Date"));
        setLongField(term9648, term9648.getClass(), "fastTime", 1429023851389L);
        setField(term9648, term9648.getClass(), "cdate", null);
        term9650 = newInstance(Class.forName("java.util.Date"));
        setLongField(term9650, term9650.getClass(), "fastTime", 1495357463288L);
        setField(term9650, term9650.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.utils.MDate");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Date");
        argTypes[1] = Class.forName("java.util.Date");
        Object[] args = new Object[2];
        args[0] = term9648;
        args[1] = term9650;
        callMethod(klass, "isSameDay", argTypes, null, args);
    }

};


