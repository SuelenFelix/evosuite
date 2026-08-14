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

public class UserRole_getId_14972311612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13668;

    public UserRole_getId_14972311612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term13669 = new Long(6273670659288205855L);
        Long term13671 = new Long(-4776514981294468834L);
        Long term13673 = new Long(-7273680182770718108L);
        term13668 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserRole"));
        Object term13675 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13676 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13680 = newInstance(Class.forName("java.time.LocalTime"));
        Object term13685 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13686 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13690 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term13668, term13668.getClass(), "id", term13669);
        setField(term13668, term13668.getClass(), "userId", term13671);
        setField(term13668, term13668.getClass(), "roleId", term13673);
        setIntField(term13676, term13676.getClass(), "year", 2017);
        setShortField(term13676, term13676.getClass(), "month", (short) 6);
        setShortField(term13676, term13676.getClass(), "day", (short) 7);
        setField(term13675, term13675.getClass(), "date", term13676);
        setByteField(term13680, term13680.getClass(), "hour", (byte) 13);
        setByteField(term13680, term13680.getClass(), "minute", (byte) 52);
        setByteField(term13680, term13680.getClass(), "second", (byte) 17);
        setIntField(term13680, term13680.getClass(), "nano", 78180039);
        setField(term13675, term13675.getClass(), "time", term13680);
        setField(term13668, term13668.getClass(), "createdAt", term13675);
        setIntField(term13686, term13686.getClass(), "year", 2017);
        setShortField(term13686, term13686.getClass(), "month", (short) 6);
        setShortField(term13686, term13686.getClass(), "day", (short) 23);
        setField(term13685, term13685.getClass(), "date", term13686);
        setByteField(term13690, term13690.getClass(), "hour", (byte) 23);
        setByteField(term13690, term13690.getClass(), "minute", (byte) 29);
        setByteField(term13690, term13690.getClass(), "second", (byte) 17);
        setIntField(term13690, term13690.getClass(), "nano", 491252353);
        setField(term13685, term13685.getClass(), "time", term13690);
        setField(term13668, term13668.getClass(), "updatedAt", term13685);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserRole");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term13668, args);
    }

};


