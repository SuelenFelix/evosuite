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
     Object term277576;
     Object term277578;

    public MDate_getDifference_162918997918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term277576 = newInstance(Class.forName("java.util.Date"));
        setLongField(term277576, term277576.getClass(), "fastTime", 1678177615298L);
        setField(term277576, term277576.getClass(), "cdate", null);
        term277578 = newInstance(Class.forName("java.util.Date"));
        setLongField(term277578, term277578.getClass(), "fastTime", 1666076287186L);
        setField(term277578, term277578.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.utils.MDate");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Date");
        argTypes[1] = Class.forName("java.util.Date");
        Object[] args = new Object[2];
        args[0] = term277576;
        args[1] = term277578;
        callMethod(klass, "getDifference", argTypes, null, args);
    }

};


