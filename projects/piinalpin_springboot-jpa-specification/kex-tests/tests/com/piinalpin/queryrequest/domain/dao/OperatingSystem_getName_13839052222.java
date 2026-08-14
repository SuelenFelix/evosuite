package com.piinalpin.queryrequest.domain.dao;

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
import static com.piinalpin.queryrequest.domain.dao.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.lang.Integer;

public class OperatingSystem_getName_13839052222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term818;

    public OperatingSystem_getName_13839052222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term819 = new Long(-2813493605142626659L);
        Integer term867 = new Integer(1725571209);
        term818 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.dao.OperatingSystem"));
        Object term857 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term858 = newInstance(Class.forName("java.time.LocalDate"));
        Object term862 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term818, term818.getClass(), "id", term819);
        setField(term818, term818.getClass(), "name", "OWDIEULEFu");
        setField(term818, term818.getClass(), "version", "dWRymuLBtr");
        setField(term818, term818.getClass(), "kernel", "AijpHYOFuy");
        setIntField(term858, term858.getClass(), "year", 2019);
        setShortField(term858, term858.getClass(), "month", (short) 2);
        setShortField(term858, term858.getClass(), "day", (short) 21);
        setField(term857, term857.getClass(), "date", term858);
        setByteField(term862, term862.getClass(), "hour", (byte) 5);
        setByteField(term862, term862.getClass(), "minute", (byte) 41);
        setByteField(term862, term862.getClass(), "second", (byte) 11);
        setIntField(term862, term862.getClass(), "nano", 859829782);
        setField(term857, term857.getClass(), "time", term862);
        setField(term818, term818.getClass(), "releaseDate", term857);
        setField(term818, term818.getClass(), "usages", term867);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.piinalpin.queryrequest.domain.dao.OperatingSystem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term818, args);
    }

};


