package net.jaggerwang.sbip.adapter.api.controller.dto;

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
import static net.jaggerwang.sbip.adapter.api.controller.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class RoleDTO_RoleDTOBuilder_build_12792180995 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58740;

    public RoleDTO_RoleDTOBuilder_build_12792180995() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term58741 = new Long(-470660852193401098L);
        term58740 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.RoleDTO$RoleDTOBuilder"));
        Object term58755 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58756 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58760 = newInstance(Class.forName("java.time.LocalTime"));
        Object term58765 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58766 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58770 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term58740, term58740.getClass(), "id", term58741);
        setField(term58740, term58740.getClass(), "name", "MvDMzQBWME");
        setIntField(term58756, term58756.getClass(), "year", 2019);
        setShortField(term58756, term58756.getClass(), "month", (short) 3);
        setShortField(term58756, term58756.getClass(), "day", (short) 14);
        setField(term58755, term58755.getClass(), "date", term58756);
        setByteField(term58760, term58760.getClass(), "hour", (byte) 21);
        setByteField(term58760, term58760.getClass(), "minute", (byte) 1);
        setByteField(term58760, term58760.getClass(), "second", (byte) 27);
        setIntField(term58760, term58760.getClass(), "nano", 855781320);
        setField(term58755, term58755.getClass(), "time", term58760);
        setField(term58740, term58740.getClass(), "createdAt", term58755);
        setIntField(term58766, term58766.getClass(), "year", 2010);
        setShortField(term58766, term58766.getClass(), "month", (short) 2);
        setShortField(term58766, term58766.getClass(), "day", (short) 1);
        setField(term58765, term58765.getClass(), "date", term58766);
        setByteField(term58770, term58770.getClass(), "hour", (byte) 15);
        setByteField(term58770, term58770.getClass(), "minute", (byte) 12);
        setByteField(term58770, term58770.getClass(), "second", (byte) 8);
        setIntField(term58770, term58770.getClass(), "nano", 722621943);
        setField(term58765, term58765.getClass(), "time", term58770);
        setField(term58740, term58740.getClass(), "updatedAt", term58765);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.RoleDTO$RoleDTOBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term58740, args);
    }

};


