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

public class RoleDTO_setId_7726307887 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17178;
     Object term17213;

    public RoleDTO_setId_7726307887() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term17179 = new Long(-7001094993638840490L);
        term17178 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.RoleDTO"));
        Object term17193 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17194 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17198 = newInstance(Class.forName("java.time.LocalTime"));
        Object term17203 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17204 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17208 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term17178, term17178.getClass(), "id", term17179);
        setField(term17178, term17178.getClass(), "name", "UPUbwyHQKN");
        setIntField(term17194, term17194.getClass(), "year", 2017);
        setShortField(term17194, term17194.getClass(), "month", (short) 8);
        setShortField(term17194, term17194.getClass(), "day", (short) 6);
        setField(term17193, term17193.getClass(), "date", term17194);
        setByteField(term17198, term17198.getClass(), "hour", (byte) 22);
        setByteField(term17198, term17198.getClass(), "minute", (byte) 46);
        setByteField(term17198, term17198.getClass(), "second", (byte) 47);
        setIntField(term17198, term17198.getClass(), "nano", 782967389);
        setField(term17193, term17193.getClass(), "time", term17198);
        setField(term17178, term17178.getClass(), "createdAt", term17193);
        setIntField(term17204, term17204.getClass(), "year", 2029);
        setShortField(term17204, term17204.getClass(), "month", (short) 3);
        setShortField(term17204, term17204.getClass(), "day", (short) 3);
        setField(term17203, term17203.getClass(), "date", term17204);
        setByteField(term17208, term17208.getClass(), "hour", (byte) 2);
        setByteField(term17208, term17208.getClass(), "minute", (byte) 29);
        setByteField(term17208, term17208.getClass(), "second", (byte) 54);
        setIntField(term17208, term17208.getClass(), "nano", 846675209);
        setField(term17203, term17203.getClass(), "time", term17208);
        setField(term17178, term17178.getClass(), "updatedAt", term17203);
        term17213 = new Long(3077284143733577490L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.RoleDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term17213;
        callMethod(klass, "setId", argTypes, term17178, args);
    }

};


