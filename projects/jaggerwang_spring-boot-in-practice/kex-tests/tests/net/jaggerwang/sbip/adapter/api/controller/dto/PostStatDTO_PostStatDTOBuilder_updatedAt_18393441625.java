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

public class PostStatDTO_PostStatDTOBuilder_updatedAt_18393441625 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58418;
     Object term58445;

    public PostStatDTO_PostStatDTOBuilder_updatedAt_18393441625() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term58419 = new Long(38900113635378049L);
        Long term58421 = new Long(2167389818358075653L);
        Long term58423 = new Long(2371696206810185880L);
        term58418 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.PostStatDTO$PostStatDTOBuilder"));
        Object term58425 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58426 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58430 = newInstance(Class.forName("java.time.LocalTime"));
        Object term58435 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58436 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58440 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term58418, term58418.getClass(), "id", term58419);
        setField(term58418, term58418.getClass(), "postId", term58421);
        setField(term58418, term58418.getClass(), "likeCount", term58423);
        setIntField(term58426, term58426.getClass(), "year", 2019);
        setShortField(term58426, term58426.getClass(), "month", (short) 11);
        setShortField(term58426, term58426.getClass(), "day", (short) 26);
        setField(term58425, term58425.getClass(), "date", term58426);
        setByteField(term58430, term58430.getClass(), "hour", (byte) 21);
        setByteField(term58430, term58430.getClass(), "minute", (byte) 16);
        setByteField(term58430, term58430.getClass(), "second", (byte) 42);
        setIntField(term58430, term58430.getClass(), "nano", 559995047);
        setField(term58425, term58425.getClass(), "time", term58430);
        setField(term58418, term58418.getClass(), "createdAt", term58425);
        setIntField(term58436, term58436.getClass(), "year", 2019);
        setShortField(term58436, term58436.getClass(), "month", (short) 3);
        setShortField(term58436, term58436.getClass(), "day", (short) 15);
        setField(term58435, term58435.getClass(), "date", term58436);
        setByteField(term58440, term58440.getClass(), "hour", (byte) 19);
        setByteField(term58440, term58440.getClass(), "minute", (byte) 20);
        setByteField(term58440, term58440.getClass(), "second", (byte) 17);
        setIntField(term58440, term58440.getClass(), "nano", 872983779);
        setField(term58435, term58435.getClass(), "time", term58440);
        setField(term58418, term58418.getClass(), "updatedAt", term58435);
        term58445 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58446 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58450 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term58446, term58446.getClass(), "year", 2028);
        setShortField(term58446, term58446.getClass(), "month", (short) 10);
        setShortField(term58446, term58446.getClass(), "day", (short) 1);
        setField(term58445, term58445.getClass(), "date", term58446);
        setByteField(term58450, term58450.getClass(), "hour", (byte) 12);
        setByteField(term58450, term58450.getClass(), "minute", (byte) 47);
        setByteField(term58450, term58450.getClass(), "second", (byte) 33);
        setIntField(term58450, term58450.getClass(), "nano", 170475636);
        setField(term58445, term58445.getClass(), "time", term58450);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.PostStatDTO$PostStatDTOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term58445;
        callMethod(klass, "updatedAt", argTypes, term58418, args);
    }

};


