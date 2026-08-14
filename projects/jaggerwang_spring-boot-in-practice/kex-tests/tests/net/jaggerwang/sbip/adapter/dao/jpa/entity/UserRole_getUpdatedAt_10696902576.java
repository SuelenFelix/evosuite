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

public class UserRole_getUpdatedAt_10696902576 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13776;

    public UserRole_getUpdatedAt_10696902576() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term13777 = new Long(4012955251407483889L);
        Long term13779 = new Long(-4058686252500969842L);
        Long term13781 = new Long(6077991958696417121L);
        term13776 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserRole"));
        Object term13783 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13784 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13788 = newInstance(Class.forName("java.time.LocalTime"));
        Object term13793 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13794 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13798 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term13776, term13776.getClass(), "id", term13777);
        setField(term13776, term13776.getClass(), "userId", term13779);
        setField(term13776, term13776.getClass(), "roleId", term13781);
        setIntField(term13784, term13784.getClass(), "year", 2017);
        setShortField(term13784, term13784.getClass(), "month", (short) 8);
        setShortField(term13784, term13784.getClass(), "day", (short) 6);
        setField(term13783, term13783.getClass(), "date", term13784);
        setByteField(term13788, term13788.getClass(), "hour", (byte) 22);
        setByteField(term13788, term13788.getClass(), "minute", (byte) 46);
        setByteField(term13788, term13788.getClass(), "second", (byte) 47);
        setIntField(term13788, term13788.getClass(), "nano", 782967389);
        setField(term13783, term13783.getClass(), "time", term13788);
        setField(term13776, term13776.getClass(), "createdAt", term13783);
        setIntField(term13794, term13794.getClass(), "year", 2029);
        setShortField(term13794, term13794.getClass(), "month", (short) 3);
        setShortField(term13794, term13794.getClass(), "day", (short) 3);
        setField(term13793, term13793.getClass(), "date", term13794);
        setByteField(term13798, term13798.getClass(), "hour", (byte) 2);
        setByteField(term13798, term13798.getClass(), "minute", (byte) 29);
        setByteField(term13798, term13798.getClass(), "second", (byte) 54);
        setIntField(term13798, term13798.getClass(), "nano", 846675209);
        setField(term13793, term13793.getClass(), "time", term13798);
        setField(term13776, term13776.getClass(), "updatedAt", term13793);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserRole");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUpdatedAt", argTypes, term13776, args);
    }

};


