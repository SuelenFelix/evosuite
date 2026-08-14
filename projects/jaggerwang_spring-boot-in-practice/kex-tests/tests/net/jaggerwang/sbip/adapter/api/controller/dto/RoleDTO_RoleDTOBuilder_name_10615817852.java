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

public class RoleDTO_RoleDTOBuilder_name_10615817852 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58563;

    public RoleDTO_RoleDTOBuilder_name_10615817852() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term58564 = new Long(3151699339436192337L);
        term58563 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.RoleDTO$RoleDTOBuilder"));
        Object term58578 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58579 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58583 = newInstance(Class.forName("java.time.LocalTime"));
        Object term58588 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58589 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58593 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term58563, term58563.getClass(), "id", term58564);
        setField(term58563, term58563.getClass(), "name", "PEUfeJaZTk");
        setIntField(term58579, term58579.getClass(), "year", 2020);
        setShortField(term58579, term58579.getClass(), "month", (short) 6);
        setShortField(term58579, term58579.getClass(), "day", (short) 2);
        setField(term58578, term58578.getClass(), "date", term58579);
        setByteField(term58583, term58583.getClass(), "hour", (byte) 10);
        setByteField(term58583, term58583.getClass(), "minute", (byte) 4);
        setByteField(term58583, term58583.getClass(), "second", (byte) 37);
        setIntField(term58583, term58583.getClass(), "nano", 482860495);
        setField(term58578, term58578.getClass(), "time", term58583);
        setField(term58563, term58563.getClass(), "createdAt", term58578);
        setIntField(term58589, term58589.getClass(), "year", 2027);
        setShortField(term58589, term58589.getClass(), "month", (short) 1);
        setShortField(term58589, term58589.getClass(), "day", (short) 9);
        setField(term58588, term58588.getClass(), "date", term58589);
        setByteField(term58593, term58593.getClass(), "hour", (byte) 3);
        setByteField(term58593, term58593.getClass(), "minute", (byte) 52);
        setByteField(term58593, term58593.getClass(), "second", (byte) 13);
        setIntField(term58593, term58593.getClass(), "nano", 357829313);
        setField(term58588, term58588.getClass(), "time", term58593);
        setField(term58563, term58563.getClass(), "updatedAt", term58588);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.RoleDTO$RoleDTOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "AIvyeIdskz";
        callMethod(klass, "name", argTypes, term58563, args);
    }

};


