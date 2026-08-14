package net.jaggerwang.sbip.adapter.dao.jpa.entity;

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
import static net.jaggerwang.sbip.adapter.dao.jpa.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class Role_setId_9347192848 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23663;
     Object term23698;

    public Role_setId_9347192848() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term23664 = new Long(-1009485425289165749L);
        term23663 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Role"));
        Object term23678 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23679 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23683 = newInstance(Class.forName("java.time.LocalTime"));
        Object term23688 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23689 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23693 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term23663, term23663.getClass(), "id", term23664);
        setField(term23663, term23663.getClass(), "name", "PqtVXXZMqK");
        setIntField(term23679, term23679.getClass(), "year", 2019);
        setShortField(term23679, term23679.getClass(), "month", (short) 3);
        setShortField(term23679, term23679.getClass(), "day", (short) 23);
        setField(term23678, term23678.getClass(), "date", term23679);
        setByteField(term23683, term23683.getClass(), "hour", (byte) 13);
        setByteField(term23683, term23683.getClass(), "minute", (byte) 19);
        setByteField(term23683, term23683.getClass(), "second", (byte) 44);
        setIntField(term23683, term23683.getClass(), "nano", 912714703);
        setField(term23678, term23678.getClass(), "time", term23683);
        setField(term23663, term23663.getClass(), "createdAt", term23678);
        setIntField(term23689, term23689.getClass(), "year", 2027);
        setShortField(term23689, term23689.getClass(), "month", (short) 3);
        setShortField(term23689, term23689.getClass(), "day", (short) 4);
        setField(term23688, term23688.getClass(), "date", term23689);
        setByteField(term23693, term23693.getClass(), "hour", (byte) 2);
        setByteField(term23693, term23693.getClass(), "minute", (byte) 3);
        setByteField(term23693, term23693.getClass(), "second", (byte) 31);
        setIntField(term23693, term23693.getClass(), "nano", 652064220);
        setField(term23688, term23688.getClass(), "time", term23693);
        setField(term23663, term23663.getClass(), "updatedAt", term23688);
        term23698 = new Long(-5044181804110715069L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Role");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term23698;
        callMethod(klass, "setId", argTypes, term23663, args);
    }

};


