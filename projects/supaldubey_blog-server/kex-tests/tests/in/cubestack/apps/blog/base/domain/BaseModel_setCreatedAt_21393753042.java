package in.cubestack.apps.blog.base.domain;

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
import static in.cubestack.apps.blog.base.domain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BaseModel_setCreatedAt_21393753042 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public BaseModel_setCreatedAt_21393753042() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term2, term2.getClass(), "year", 2012);
        setShortField(term2, term2.getClass(), "month", (short) 8);
        setShortField(term2, term2.getClass(), "day", (short) 25);
        setField(term1, term1.getClass(), "date", term2);
        setByteField(term6, term6.getClass(), "hour", (byte) 5);
        setByteField(term6, term6.getClass(), "minute", (byte) 20);
        setByteField(term6, term6.getClass(), "second", (byte) 50);
        setIntField(term6, term6.getClass(), "nano", 345595912);
        setField(term1, term1.getClass(), "time", term6);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.base.domain.BaseModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term1;
        callMethod(klass, "setCreatedAt", argTypes, null, args);
    }

};


