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

public class BaseModel_setUpdatedAt_20595033873 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11;

    public BaseModel_setUpdatedAt_20595033873() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term12, term12.getClass(), "year", 2021);
        setShortField(term12, term12.getClass(), "month", (short) 1);
        setShortField(term12, term12.getClass(), "day", (short) 18);
        setField(term11, term11.getClass(), "date", term12);
        setByteField(term16, term16.getClass(), "hour", (byte) 13);
        setByteField(term16, term16.getClass(), "minute", (byte) 38);
        setByteField(term16, term16.getClass(), "second", (byte) 26);
        setIntField(term16, term16.getClass(), "nano", 544608644);
        setField(term11, term11.getClass(), "time", term16);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.base.domain.BaseModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term11;
        callMethod(klass, "setUpdatedAt", argTypes, null, args);
    }

};


