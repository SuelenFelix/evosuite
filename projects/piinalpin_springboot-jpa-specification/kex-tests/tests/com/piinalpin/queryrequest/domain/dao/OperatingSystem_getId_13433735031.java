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

public class OperatingSystem_getId_13433735031 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term737;

    public OperatingSystem_getId_13433735031() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term738 = new Long(6967924379644551255L);
        Integer term786 = new Integer(-1339778481);
        term737 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.dao.OperatingSystem"));
        Object term776 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term777 = newInstance(Class.forName("java.time.LocalDate"));
        Object term781 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term737, term737.getClass(), "id", term738);
        setField(term737, term737.getClass(), "name", "OclPbYPkcH");
        setField(term737, term737.getClass(), "version", "IoAlmYsBwc");
        setField(term737, term737.getClass(), "kernel", "TEParAifyi");
        setIntField(term777, term777.getClass(), "year", 2022);
        setShortField(term777, term777.getClass(), "month", (short) 11);
        setShortField(term777, term777.getClass(), "day", (short) 16);
        setField(term776, term776.getClass(), "date", term777);
        setByteField(term781, term781.getClass(), "hour", (byte) 15);
        setByteField(term781, term781.getClass(), "minute", (byte) 54);
        setByteField(term781, term781.getClass(), "second", (byte) 2);
        setIntField(term781, term781.getClass(), "nano", 733274103);
        setField(term776, term776.getClass(), "time", term781);
        setField(term737, term737.getClass(), "releaseDate", term776);
        setField(term737, term737.getClass(), "usages", term786);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.piinalpin.queryrequest.domain.dao.OperatingSystem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term737, args);
    }

};


