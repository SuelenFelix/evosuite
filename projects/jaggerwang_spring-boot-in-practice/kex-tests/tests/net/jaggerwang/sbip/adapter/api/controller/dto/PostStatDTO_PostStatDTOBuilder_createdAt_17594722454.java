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

public class PostStatDTO_PostStatDTOBuilder_createdAt_17594722454 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58381;
     Object term58408;

    public PostStatDTO_PostStatDTOBuilder_createdAt_17594722454() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term58382 = new Long(-259683062954031772L);
        Long term58384 = new Long(5446921500259357484L);
        Long term58386 = new Long(-2887572667974552998L);
        term58381 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.PostStatDTO$PostStatDTOBuilder"));
        Object term58388 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58389 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58393 = newInstance(Class.forName("java.time.LocalTime"));
        Object term58398 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58399 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58403 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term58381, term58381.getClass(), "id", term58382);
        setField(term58381, term58381.getClass(), "postId", term58384);
        setField(term58381, term58381.getClass(), "likeCount", term58386);
        setIntField(term58389, term58389.getClass(), "year", 2012);
        setShortField(term58389, term58389.getClass(), "month", (short) 3);
        setShortField(term58389, term58389.getClass(), "day", (short) 6);
        setField(term58388, term58388.getClass(), "date", term58389);
        setByteField(term58393, term58393.getClass(), "hour", (byte) 8);
        setByteField(term58393, term58393.getClass(), "minute", (byte) 53);
        setByteField(term58393, term58393.getClass(), "second", (byte) 27);
        setIntField(term58393, term58393.getClass(), "nano", 49638302);
        setField(term58388, term58388.getClass(), "time", term58393);
        setField(term58381, term58381.getClass(), "createdAt", term58388);
        setIntField(term58399, term58399.getClass(), "year", 2026);
        setShortField(term58399, term58399.getClass(), "month", (short) 5);
        setShortField(term58399, term58399.getClass(), "day", (short) 4);
        setField(term58398, term58398.getClass(), "date", term58399);
        setByteField(term58403, term58403.getClass(), "hour", (byte) 4);
        setByteField(term58403, term58403.getClass(), "minute", (byte) 39);
        setByteField(term58403, term58403.getClass(), "second", (byte) 57);
        setIntField(term58403, term58403.getClass(), "nano", 807455541);
        setField(term58398, term58398.getClass(), "time", term58403);
        setField(term58381, term58381.getClass(), "updatedAt", term58398);
        term58408 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58409 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58413 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term58409, term58409.getClass(), "year", 2021);
        setShortField(term58409, term58409.getClass(), "month", (short) 4);
        setShortField(term58409, term58409.getClass(), "day", (short) 17);
        setField(term58408, term58408.getClass(), "date", term58409);
        setByteField(term58413, term58413.getClass(), "hour", (byte) 22);
        setByteField(term58413, term58413.getClass(), "minute", (byte) 34);
        setByteField(term58413, term58413.getClass(), "second", (byte) 19);
        setIntField(term58413, term58413.getClass(), "nano", 565497804);
        setField(term58408, term58408.getClass(), "time", term58413);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.PostStatDTO$PostStatDTOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term58408;
        callMethod(klass, "createdAt", argTypes, term58381, args);
    }

};


